package cn.leithda.wework.sdk.po.contact.tag;

/**
 * 标签成员
 *
 * @author leithda
 * @since 2022/5/28
 */
public class TagUser {
    /**
     * 成员帐号
     */
    private String userid;
    /**
     * 成员名称，代开发自建应用需要管理员授权才返回该字段；此字段从2019年12月30日起，对新创建第三方应用不再返回，2020年6月30日起，对所有历史第三方应用不再返回，后续第三方仅通讯录应用可获取，未返回名称的情况需要通过通讯录展示组件来展示名字
     */
    private String name;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
