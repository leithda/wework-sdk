package cn.leithda.wework.sdk.po.contact.dept;

import java.util.List;

/**
 * 企业微信部门信息
 */
public class WeworkDepartment {
    /**
     * 部门id
     */
    private Long id;
    /**
     * 部门名称，代开发自建应用需要管理员授权才返回；第三方不可获取，需要通过通讯录展示组件来展示部门名称
     */
    private String name;
    /**
     * 部门英文名称，代开发自建应用需要管理员授权才返回；第三方不可获取，需要通过通讯录展示组件来展示部门名称
     */
    private String name_en;
    /**
     * 部门负责人的UserID，返回在应用可见范围内的部门负责人列表；第三方仅通讯录应用或者授权了“组织架构信息-应用可获取企业的部门组织架构信息-部门负责人”的第三方应用可获取
     */
    private List<String> department_leader;
    /**
     * 父部门id。根部门为1。
     */
    private Long parentid;
    /**
     * 在父部门中的次序值。order值大的排序靠前。值范围是[0, 2^32)
     */
    private Long order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName_en() {
        return name_en;
    }

    public void setName_en(String name_en) {
        this.name_en = name_en;
    }

    public List<String> getDepartment_leader() {
        return department_leader;
    }

    public void setDepartment_leader(List<String> department_leader) {
        this.department_leader = department_leader;
    }

    public Long getParentid() {
        return parentid;
    }

    public void setParentid(Long parentid) {
        this.parentid = parentid;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }
}
