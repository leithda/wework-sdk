package cn.leithda.wework.sdk.service.callback;

import cn.leithda.wework.sdk.crypt.WXBizMsgCrypt;
import cn.leithda.wework.sdk.endpoint.WeworkCallbackToken;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * 回调消息解析器
 *
 * @author leithda
 * @since 2022/5/28
 */
@Service
public class CallbackMsgParser {

    public static final Logger LOGGER = LoggerFactory.getLogger(CallbackMsgParser.class);

    @Resource
    WeworkCallbackToken weworkCallbackToken;

    /**
     * 回调验签
     *
     * @param corpId       企业ID
     * @param callbackType 回调类型，
     * @param msgSignature 企业微信加密签名，msg_signature计算结合了企业填写的token、请求中的timestamp、nonce、加密的消息体。签名计算方法参考<a href="https://developer.work.weixin.qq.com/document/path/90930#12976/%E6%B6%88%E6%81%AF%E4%BD%93%E7%AD%BE%E5%90%8D%E6%A0%A1%E9%AA%8C">消息体签名检验</a>
     * @param timestamp    时间戳。与nonce结合使用，用于防止请求重放攻击。
     * @param nonce        随机数。与timestamp结合使用，用于防止请求重放攻击.
     * @param echostr      加密的字符串。需要解密得到消息内容明文，解密后有random、msg_len、msg、receiveid四个字段，其中msg即为消息内容明文
     * @return 签名内容
     */
    public String checkSign(String corpId, Integer callbackType, String msgSignature, String timestamp, String nonce, String echostr) {
        try {
            String callbackToken = weworkCallbackToken.getCallbackToken(corpId, callbackType);
            String callbackAesKey = weworkCallbackToken.getCallbackAesKey(corpId, callbackType);
            WXBizMsgCrypt wxBizMsgCrypt = new WXBizMsgCrypt(callbackToken, callbackAesKey, corpId);
            return wxBizMsgCrypt.VerifyURL(msgSignature, timestamp, nonce, echostr);
        } catch (Exception e) {
            LOGGER.error("checkSign", e);
        }
        return "";
    }

    /**
     * 解密消息
     *
     * @param corpId       企业ID
     * @param callbackType 回调类型
     * @param msgSignature 企业微信加密签名，msg_signature计算结合了企业填写的token、请求中的timestamp、nonce、加密的消息体。签名计算方法参考<a href="https://developer.work.weixin.qq.com/document/path/90930#12976/%E6%B6%88%E6%81%AF%E4%BD%93%E7%AD%BE%E5%90%8D%E6%A0%A1%E9%AA%8C">消息体签名检验</a>
     * @param timestamp    时间戳。与nonce结合使用，用于防止请求重放攻击。
     * @param nonce        随机数。与timestamp结合使用，用于防止请求重放攻击.
     * @param content      回调内容
     * @return 消息
     */
    public String decryptMsg(String corpId, Integer callbackType, String msgSignature, String timestamp, String nonce, String content) {
        try {
            String callbackToken = weworkCallbackToken.getCallbackToken(corpId, callbackType);
            String callbackAesKey = weworkCallbackToken.getCallbackAesKey(corpId, callbackType);
            WXBizMsgCrypt wxBizMsgCrypt = new WXBizMsgCrypt(callbackToken, callbackAesKey, corpId);
            return wxBizMsgCrypt.DecryptMsg(msgSignature, timestamp, nonce, content);
        } catch (Exception e) {
            LOGGER.error("decryptMsg", e);
        }
        return "";
    }


}
