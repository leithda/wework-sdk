package cn.leithda.wework.sdk.po.external.contact;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 客户的基本信息
 *
 * @author leithda
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class ExternalContact {
    /**
     * 外部联系人的userid
     */
    private String external_userid;
    /**
     * 外部联系人的名称: 如果是微信用户，则返回其微信昵称。如果是企业微信联系人，则返回其设置对外展示的别名或实名
     */
    private String name;
    /**
     * 外部联系人的职位，如果外部企业或用户选择隐藏职位，则不返回，仅当联系人类型是企业微信用户时有此字段
     */
    private String position;
    /**
     * 外部联系人头像，代开发自建应用需要管理员授权才可以获取，第三方不可获取，上游企业不可获取下游企业客户该字段
     */
    private String avatar;
    /**
     * 外部联系人所在企业的简称，仅当联系人类型是企业微信用户时有此字段
     */
    private String corp_name;
    /**
     * 外部联系人所在企业的主体名称，仅当联系人类型是企业微信用户时有此字段。仅企业自建应用可获取；第三方应用、代开发应用、上下游应用不可获取，返回内容为企业名称，即corp_name。
     */
    private String corp_full_name;
    /**
     * 外部联系人的类型，1表示该外部联系人是微信用户，2表示该外部联系人是企业微信用户
     */
    private long type;
    /**
     * 外部联系人性别 0-未知 1-男性 2-女性。第三方不可获取，上游企业不可获取下游企业客户该字段，返回值为0，表示未定义
     */
    private long gender;
    /**
     * 外部联系人在微信开放平台的唯一身份标识（微信unionid），通过此字段企业可将外部联系人与公众号/小程序用户关联起来。仅当联系人类型是微信用户，且企业绑定了微信开发者ID有此字段。查看绑定方法。第三方不可获取，上游企业不可获取下游企业客户的unionid字段
     */
    private String unionid;
    /**
     * 外部联系人的自定义展示信息，可以有多个字段和多种类型，包括文本，网页和小程序，仅当联系人类型是企业微信用户时有此字段，字段详情见对外属性；
     */
    private ExternalProfile external_profile;

    public String getExternal_userid() {
        return external_userid;
    }

    public void setExternal_userid(String external_userid) {
        this.external_userid = external_userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getCorp_name() {
        return corp_name;
    }

    public void setCorp_name(String corp_name) {
        this.corp_name = corp_name;
    }

    public String getCorp_full_name() {
        return corp_full_name;
    }

    public void setCorp_full_name(String corp_full_name) {
        this.corp_full_name = corp_full_name;
    }

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    public long getGender() {
        return gender;
    }

    public void setGender(long gender) {
        this.gender = gender;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public ExternalProfile getExternal_profile() {
        return external_profile;
    }

    public void setExternal_profile(ExternalProfile external_profile) {
        this.external_profile = external_profile;
    }
}
