package cn.leithda.wework.sdk.po.contact.user;

import java.util.List;

public class ExternalProfile {
    /**
     * 企业简称
     */
    private String external_corp_name;
    /**
     * 视频号
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
