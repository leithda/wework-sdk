package cn.leithda.wework.sdk.po.contact.dept;


/**
 * 企业微信子部门信息
 */
public class WeworkSimpleDepartment {
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
