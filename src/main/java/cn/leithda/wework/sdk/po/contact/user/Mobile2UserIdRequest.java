package cn.leithda.wework.sdk.po.contact.user;

/**
 * 手机号获取 userid 请求
 *
 * @author leithda
 * @since 2022/5/27
 */
public class Mobile2UserIdRequest {
    /**
     * 用户在企业微信通讯录中的手机号码。长度为5~32个字节
     */
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
