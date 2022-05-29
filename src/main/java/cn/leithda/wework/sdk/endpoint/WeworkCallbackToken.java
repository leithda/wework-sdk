package cn.leithda.wework.sdk.endpoint;

/**
 * 回调Token配置
 */
public interface WeworkCallbackToken {
    /**
     * 获取回调解密Token
     *
     * @param corpId       企业ID
     * @param callbackType 回调类型
     * @return 回调Token
     */
    String getCallbackToken(String corpId, Integer callbackType);

    /**
     * 获取回调解密 AesKey
     *
     * @param corpId       企业ID
     * @param callbackType 回调类型
     * @return 回调 AesKey
     */
    String getCallbackAesKey(String corpId, Integer callbackType);
}
