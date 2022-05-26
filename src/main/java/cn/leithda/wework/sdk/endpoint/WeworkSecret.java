package cn.leithda.wework.sdk.endpoint;

/**
 * Secret 扩展
 */
public interface WeworkSecret {

    /**
     * 获取通讯录秘钥
     * @param corpId 企业微信主体ID
     * @return 秘钥
     */
    String getContactSecret(String corpId);

    /**
     * 获取客户联系秘钥
     * @param corpId 企业微信主体ID
     * @return 秘钥
     */
    String getExternalContactSecret(String corpId);

    /**
     * 获取应用秘钥
     * @param corpId 企业微信主体ID
     * @param agentId 应用ID
     * @return 秘钥
     */
    String getAgentIdSecret(String corpId, String agentId);
}
