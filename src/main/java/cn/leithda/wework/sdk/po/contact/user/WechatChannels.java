package cn.leithda.wework.sdk.po.contact.user;

/**
 * 视频号属性。须从企业绑定到企业微信的视频号中选择，可在“我的企业”页中查看绑定的视频号。第三方仅通讯录应用可获取；对于非第三方创建的成员，第三方通讯录应用也不可获取。注意：externalcontact/get
 *
 * @author leithda
 */
public class WechatChannels {
    /**
     * 视频号名字（设置后，成员将对外展示该视频号）。须从企业绑定到企业微信的视频号中选择，可在“我的企业”页中查看绑定的视频号
     */
    private String nickname;

    /**
     * 对外展示视频号状态。0表示企业视频号已被确认，可正常使用，1表示企业视频号待确认
     */
    private Integer status;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}
