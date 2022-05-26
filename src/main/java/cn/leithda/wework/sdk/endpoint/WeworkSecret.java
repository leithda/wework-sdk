package cn.leithda.wework.sdk.endpoint;

/**
 * Secret 扩展
 *
 * @author leithda
 */
public interface WeworkSecret {

    /**
     * 获取通讯录凭证
     *
     * @param corpId 企业ID
     * @return 凭证
     */
    String getContactSecret(String corpId);

    /**
     * 获取客户联系凭证
     *
     * @param corpId 企业ID
     * @return 凭证
     */
    String getExternalContactSecret(String corpId);

    /**
     * 获取应用凭证
     *
     * @param corpId  企业ID
     * @param agentId 应用ID
     * @return 凭证
     */
    String getAgentIdSecret(String corpId, String agentId);

    /**
     * 获取客服凭证
     *
     * @param corpId 企业ID
     * @return 凭证
     */
    String getKfSecret(String corpId);
}
