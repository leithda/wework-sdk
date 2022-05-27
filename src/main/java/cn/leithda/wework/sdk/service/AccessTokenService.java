package cn.leithda.wework.sdk.service;

import cn.leithda.wework.sdk.endpoint.AccessTokenCache;
import cn.leithda.wework.sdk.po.GetAccessTokenResponse;
import cn.leithda.wework.sdk.utils.HttpUtils;
import cn.leithda.wework.sdk.utils.JsonUtils;
import cn.leithda.wework.sdk.utils.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Objects;

/**
 * 企业微信Token服务
 */
@Service
public class AccessTokenService {

    private static final Logger LOGGER = LoggerFactory.getLogger(AccessTokenService.class);

    /**
     * 获取access_token
     */
    private static final String ACCESS_TOKEN_URL = "https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=%s&corpsecret=%s";

    @Resource
    AccessTokenCache accessTokenCache;

    /**
     * 获取access_token
     *
     * @param corpId 企业ID
     * @param secret 凭证
     * @param fresh  是否强制刷新
     * @return accessToken
     */
    public String getAccessToken(String corpId, String secret, boolean fresh) {
        String accessToken = accessTokenCache.getAccessToken(corpId, secret);
        if (StringUtils.isNotEmpty(accessToken) && !fresh) {
            return accessToken;
        }
        String url = String.format(ACCESS_TOKEN_URL, corpId, secret);
        try {
            String response = HttpUtils.get(url);
            GetAccessTokenResponse getAccessTokenResponse = JsonUtils.toObject(response, GetAccessTokenResponse.class);
            if (Objects.nonNull(getAccessTokenResponse) && Objects.equals(getAccessTokenResponse.getErrcode(), 0)) {
                accessTokenCache.setAccessToken(corpId, secret, getAccessTokenResponse.getAccess_token(), getAccessTokenResponse.getExpires_in());
                return getAccessTokenResponse.getAccess_token();
            }
        } catch (Exception e) {
            LOGGER.error("getAccessToken", e);
        }
        return null;
    }


}
