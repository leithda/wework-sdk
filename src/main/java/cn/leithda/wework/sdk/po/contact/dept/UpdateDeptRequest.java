package cn.leithda.wework.sdk.po.contact.dept;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 更新部门请求
 *
 * @author leithda
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class UpdateDeptRequest {
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
