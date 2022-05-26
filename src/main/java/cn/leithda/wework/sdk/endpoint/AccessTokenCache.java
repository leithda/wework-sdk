package cn.leithda.wework.sdk.endpoint;

/**
 * Token 缓存扩展
 *
 * @author leithda
 */
public interface AccessTokenCache {

    /**
     * 设置 accessToken
     *
     * @param corpId      企业微信主体ID
     * @param secret      企业微信秘钥
     * @param accessToken accessToken
     * @param expired     过期时间
     */
    void setAccessToken(String corpId, String secret, String accessToken, Integer expired);

    /**
     * 获取 accessToken
     *
     * @param corpId 企业微信主体ID
     * @param secret 企业微信秘钥
     * @return accessToken，失效返回空
     */
    String getAccessToken(String corpId, String secret);
}
