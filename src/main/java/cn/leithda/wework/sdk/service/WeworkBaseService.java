package cn.leithda.wework.sdk.service;

import cn.leithda.wework.sdk.endpoint.WeworkSecret;
import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.utils.HttpUtils;
import cn.leithda.wework.sdk.utils.JsonUtils;
import cn.leithda.wework.sdk.utils.StringUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class WeworkBaseService {

    /**
     * 通讯录秘钥
     */
    protected static final int CONTACT = 1;
    /**
     * 客户联系秘钥
     */
    protected static final int EXTERNAL = 2;
    /**
     * 应用秘钥
     */
    protected static final int APPLICATION = 3;

    @Resource
    AccessTokenService accessTokenService;

    @Resource
    WeworkSecret weworkSecret;

    /**
     * 获取Token
     *
     * @param accessTokenType 秘钥类型：1=通讯录，2=客户联系，3=应用秘钥（需传入agentid）
     * @param corpId          企业微信主体ID
     * @param agentId         应用ID
     * @param fresh           是否强制刷新
     */
    protected String getAccessToken(int accessTokenType, String corpId, String agentId, boolean fresh) {
        String secret = "";
        switch (accessTokenType) {
            case CONTACT:
                secret = weworkSecret.getContactSecret(corpId);
                break;
            case EXTERNAL:
                secret = weworkSecret.getExternalContactSecret(corpId);
                break;
            case APPLICATION:
                secret = weworkSecret.getAgentIdSecret(corpId, agentId);
            default:
        }

        if (StringUtils.isEmpty(secret)) {
            return "";
        }
        return accessTokenService.getAccessToken(fresh, corpId, secret);
    }

    /**
     * 执行Get请求
     *
     * @param accessTokenType secret类型，秘钥类型：1=通讯录，2=客户联系，3=应用秘钥（需传入agentid）
     * @param corpId          企业微信主体ID
     * @param agentId         应用ID
     * @param fresh           是否强制刷新token
     * @param returnClass     返回类类型
     * @param url             请求链接（含占位符）
     * @param param           参数
     * @param <T>             响应类类型
     * @return 响应
     */
    protected <T extends BaseResponse> T executeGet(int accessTokenType, String corpId, String agentId, boolean fresh, Class<T> returnClass, String url, Object... param) {
        String accessToken = getAccessToken(accessTokenType, corpId, null, false);

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
            String responseText = HttpUtils.get(executeUrl);
            return JsonUtils.toObject(responseText, returnClass);
        } catch (Exception e) {
            // TODO: 2022/5/26 接入日志
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 执行Post请求
     *
     * @param accessTokenType secret类型，秘钥类型：1=通讯录，2=客户联系，3=应用秘钥（需传入agentid）
     * @param corpId          企业微信主体ID
     * @param agentId         应用ID
     * @param fresh           是否强制刷新token
     * @param returnClass     返回类类型
     * @param url             请求链接（含占位符）
     * @param request         请求对象
     * @param <T>             响应类类型
     * @return 响应
     */
    protected <T extends BaseResponse> T executePost(int accessTokenType, String corpId, String agentId, boolean fresh, Class<T> returnClass, String url, Object request) {
        String accessToken = getAccessToken(CONTACT, corpId, null, false);
        try {
            T response = returnClass.newInstance();
            if (StringUtils.isEmpty(accessToken)) {
                response.setErrcode(-1);
                response.setErrmsg("accessToken is empty");
                return response;
            }
            String executeUrl = String.format(url, accessToken);
            String requestText = JsonUtils.toJson(request);
            String responseText = HttpUtils.post(executeUrl, requestText);
            return JsonUtils.toObject(responseText, returnClass);
        } catch (Exception e) {
            // TODO: 2022/5/26 接入日志
            e.printStackTrace();
        }
        return null;
    }

}
