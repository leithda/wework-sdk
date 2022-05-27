package cn.leithda.wework.sdk.po.contact.user;

import java.util.List;

/**
 * 部门成员信息
 *
 * @author leithda
 * @since 2022/5/27
 */
public class SimpleUser {
    /**
     * 成员UserID。对应管理端的帐号
     */
    private String userid;
    /**
     * 成员名称，代开发自建应用需要管理员授权才返回；此字段从2019年12月30日起，对新创建第三方应用不再返回真实name，使用userid代替name，2020年6月30日起，对所有历史第三方应用不再返回真实name，使用userid代替name，后续第三方仅通讯录应用可获取，未返回名称的情况需要通过通讯录展示组件来展示名字
     */
    private String name;
    /**
     * 成员所属部门列表。列表项为部门ID，32位整型
     */
    private List<Long> department;
    /**
     * 全局唯一。对于同一个服务商，不同应用获取到企业内同一个成员的open_userid是相同的，最多64个字节。仅第三方应用可获取
     */
    private String open_userid;

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

    public List<Long> getDepartment() {
        return department;
    }

    public void setDepartment(List<Long> department) {
        this.department = department;
    }

    public String getOpen_userid() {
        return open_userid;
    }

    public void setOpen_userid(String open_userid) {
        this.open_userid = open_userid;
    }
}
