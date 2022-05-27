package cn.leithda.wework.sdk.po.contact.dept;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 企业微信子部门信息
 *
 * @author leithda
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class SimpleDepartment {
    /**
     * 部门id
     */
    private Long id;
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
