package cn.leithda.wework.sdk.service;

import cn.leithda.wework.sdk.endpoint.WeworkSecret;
import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.utils.HttpUtils;
import cn.leithda.wework.sdk.utils.JsonUtils;
import cn.leithda.wework.sdk.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 * 企业微信基础服务抽象类
 *
 * @author leithda
 */
public abstract class BaseWeworkService {

    private static final Logger LOGGER = LoggerFactory.getLogger(BaseWeworkService.class);

    /**
     * Token 失效返回码
     */
    private static final int TOKEN_EXPIRED_ERR_CODE = 42001;

    /**
     * 通讯录凭证
     */
    protected static final int CONTACT = 1;
    /**
     * 客户联系凭证
     */
    protected static final int EXTERNAL = 2;
    /**
     * 应用凭证
     */
    protected static final int APPLICATION = 3;
    /**
     * 客服凭证
     */
    protected static final int CUSTOMER_SERVICE = 4;

    @Resource
    AccessTokenService accessTokenService;

    @Resource
    WeworkSecret weworkSecret;

    /**
     * 设置当前凭证类型
     *
     * @return 凭证类型：1=通讯录，2=客户联系，3=应用凭证（需传入agentid）4=客服
     */
    protected abstract int getSecretType();

    /**
     * 获取Token
     *
     * @param accessTokenType 凭证类型：凭证类型：1=通讯录，2=客户联系，3=应用凭证（需传入agentid）4=客服
     * @param corpId          企业ID
     * @param agentId         应用ID
     * @param fresh           是否强制刷新
     */
    protected String getAccessToken(int accessTokenType, String corpId, String agentId, boolean fresh) {
        String secret;
        switch (accessTokenType) {
            case CONTACT:
                secret = weworkSecret.getContactSecret(corpId);
                break;
            case EXTERNAL:
                secret = weworkSecret.getExternalContactSecret(corpId);
                break;
            case APPLICATION:
                secret = weworkSecret.getAgentIdSecret(corpId, agentId);
                break;
            case CUSTOMER_SERVICE:
                secret = weworkSecret.getKfSecret(corpId);
                break;
            default:
                secret = "";
        }

        if (StringUtils.isEmpty(secret)) {
            return "";
        }
        return accessTokenService.getAccessToken(corpId, secret, fresh);
    }

    /**
     * 执行Get请求（使用默认凭证类型）
     *
     * @param <T>         响应类类型
     * @param corpId      企业ID
     * @param agentId     应用ID(指定时，通过指定应用秘钥访问接口)
     * @param returnClass 返回类类型
     * @param url         请求链接（含占位符）
     * @param param       参数
     * @return 响应
     */
    protected <T extends BaseResponse> T executeGet(String corpId, String agentId, Class<T> returnClass, String url, Object... param) {
        if (StringUtils.isNotEmpty(agentId)) {
            return executeGet(APPLICATION, corpId, agentId, false, returnClass, url, param);
        }
        return executeGet(getSecretType(), corpId, agentId, false, returnClass, url, param);
    }

    /**
     * 执行Get请求
     *
     * @param accessTokenType secret类型，凭证类型：1=通讯录，2=客户联系，3=应用凭证（需传入agentid）4=客服
     * @param corpId          企业ID
     * @param agentId         应用ID
     * @param fresh           是否强制刷新token
     * @param returnClass     返回类类型
     * @param url             请求链接（含占位符）
     * @param param           参数
     * @param <T>             响应类类型
     * @return 响应
     */
    private <T extends BaseResponse> T executeGet(int accessTokenType, String corpId, String agentId, boolean fresh, Class<T> returnClass, String url, Object... param) {
        String accessToken = getAccessToken(accessTokenType, corpId, agentId, fresh);
        try {
            T response = returnClass.newInstance();
            if (StringUtils.isEmpty(accessToken)) {
                response.setErrcode(-1);
                response.setErrmsg("accessToken is empty");
                return response;
            }
            List<Object> paramList = new ArrayList<>(param.length + 1);
            paramList.add(accessToken);
            paramList.addAll(Arrays.asList(param));
            String executeUrl = String.format(url, paramList.toArray());
            LOGGER.debug("executeUrl: {}", executeUrl);
            String responseText = HttpUtils.get(executeUrl);
            LOGGER.debug("responseText: {}", responseText);
            if (StringUtils.isEmpty(responseText)) {
                response.setErrcode(-2);
                response.setErrmsg("response is empty");
                return response;
            }

            response = JsonUtils.toObject(responseText, returnClass);
            // token 失效则重新获取
            if (Objects.nonNull(response) && Objects.equals(response.getErrcode(), TOKEN_EXPIRED_ERR_CODE)) {
                return executeGet(accessTokenType, corpId, agentId, true, returnClass, url, param);
            }
            return response;
        } catch (Exception e) {
            LOGGER.error("executeGet", e);
        }
        return null;
    }

    /**
     * 执行Post请求(使用默认凭证类型)
     *
     * @param <T>         响应类类型
     * @param corpId      企业ID
     * @param agentId     应用ID(指定时，通过指定应用秘钥访问接口)
     * @param returnClass 返回类类型
     * @param url         请求链接（含占位符）
     * @param request     请求对象
     * @return 响应
     */
    protected <T extends BaseResponse> T executePost(String corpId, String agentId, Class<T> returnClass, String url, Object request) {
        if (StringUtils.isNotEmpty(agentId)) {
            return executePost(APPLICATION, corpId, agentId, false, returnClass, url, request);
        }
        return executePost(getSecretType(), corpId, agentId, false, returnClass, url, request);
    }


    /**
     * 执行Post请求
     *
     * @param accessTokenType secret类型，凭证类型：1=通讯录，2=客户联系，3=应用凭证（需传入agentid）
     * @param corpId          企业ID
     * @param agentId         应用ID
     * @param fresh           是否强制刷新token
     * @param returnClass     返回类类型
     * @param url             请求链接（含占位符）
     * @param request         请求对象
     * @param <T>             响应类类型
     * @return 响应
     */
    private <T extends BaseResponse> T executePost(int accessTokenType, String corpId, String agentId, boolean fresh, Class<T> returnClass, String url, Object request) {
        String accessToken = getAccessToken(accessTokenType, corpId, agentId, fresh);
        try {
            T response = returnClass.newInstance();
            if (StringUtils.isEmpty(accessToken)) {
                response.setErrcode(-1);
                response.setErrmsg("accessToken is empty");
                return response;
            }
            String executeUrl = String.format(url, accessToken);
            LOGGER.debug("executeUrl: {}", executeUrl);
            String requestText = JsonUtils.toJson(request);
            LOGGER.debug("requestText: {}", requestText);
            String responseText = HttpUtils.post(executeUrl, requestText);
            LOGGER.debug("responseText: {}", responseText);
            if (StringUtils.isEmpty(responseText)) {
                response.setErrcode(-2);
                response.setErrmsg("response is empty");
                return response;
            }
            response = JsonUtils.toObject(responseText, returnClass);

            // token 失效则重新获取
            if (Objects.nonNull(response) && Objects.equals(response.getErrcode(), TOKEN_EXPIRED_ERR_CODE)) {
                return executePost(accessTokenType, corpId, agentId, true, returnClass, url, request);
            }
            return response;
        } catch (Exception e) {
            LOGGER.error("executePost", e);
        }
        return null;
    }

}
