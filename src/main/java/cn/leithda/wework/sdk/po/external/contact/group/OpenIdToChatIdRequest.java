package cn.leithda.wework.sdk.po.external.contact.group;

/**
 * 客户群 openid 转换请求
 *
 * @author leithda
 * @since 2022/5/31
 */
public class OpenIdToChatIdRequest {
    /**
     * 小程序在微信获取到的群ID，参见wx.getGroupEnterInfo
     */
    private String opengid;

    public String getOpengid() {
        return opengid;
    }

    public void setOpengid(String opengid) {
        this.opengid = opengid;
    }
}
