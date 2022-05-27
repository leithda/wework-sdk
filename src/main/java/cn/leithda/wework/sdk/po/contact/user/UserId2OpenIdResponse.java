package cn.leithda.wework.sdk.po.contact.user;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * userid 与 openid 互换响应
 *
 * @author leithda
 * @since 2022/5/27
 */
public class UserId2OpenIdResponse extends BaseResponse {
    /**
     * 企业微信成员userid对应的openid
     */
    private String openid;

    public String getOpenid() {
        return openid;
    }

    public void setOpenid(String openid) {
        this.openid = openid;
    }
}
