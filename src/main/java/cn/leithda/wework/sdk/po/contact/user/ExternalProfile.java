package cn.leithda.wework.sdk.po.contact.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * 成员对外属性
 *
 * @author leithda
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class ExternalProfile {
    /**
     * 企业简称
     */
    private String external_corp_name;
    /**
     * 视频号属性。须从企业绑定到企业微信的视频号中选择，可在“我的企业”页中查看绑定的视频号。第三方仅通讯录应用可获取；对于非第三方创建的成员，第三方通讯录应用也不可获取。注意：externalcontact/get
     */
    private WechatChannels wechat_channels;
    /**
     * 成员对外属性，字段详情见对外属性
     */
    private List<Attr> external_attr;

    public String getExternal_corp_name() {
        return external_corp_name;
    }

    public void setExternal_corp_name(String external_corp_name) {
        this.external_corp_name = external_corp_name;
    }

    public WechatChannels getWechat_channels() {
        return wechat_channels;
    }

    public void setWechat_channels(WechatChannels wechat_channels) {
        this.wechat_channels = wechat_channels;
    }

    public List<Attr> getExternal_attr() {
        return external_attr;
    }

    public void setExternal_attr(List<Attr> external_attr) {
        this.external_attr = external_attr;
    }
}
