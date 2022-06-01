package cn.leithda.wework.sdk.po.external.group;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 客户群 openid 转换响应
 *
 * @author leithda
 * @since 2022/5/31
 */
public class OpenIdToChatIdResponse extends BaseResponse {
    /**
     * 客户群ID，可以用来调用获取客户群详情
     */
    private String chat_id;

    public String getChat_id() {
        return chat_id;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }
}
