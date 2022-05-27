package cn.leithda.wework.sdk.po.contact.user;

/**
 * userid 与 openid 互换请求
 *
 * @author leithda
 * @since 2022/5/27
 */
public class UserId2OpenIdRequest {
    /**
     * 企业内的成员id
     */
    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
