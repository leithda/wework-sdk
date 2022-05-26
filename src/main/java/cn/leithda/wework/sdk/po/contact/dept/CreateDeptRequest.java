package cn.leithda.wework.sdk.po.contact.dept;

/**
 * 创建部门请求
 *
 * @author leithda
 */
public class CreateDeptRequest {
    /**
     * 部门名称。同一个层级的部门名称不能重复。长度限制为1~32个字符，字符不能包括:*?"<>｜
     */
    private String name;
    /**
     * 英文名称。同一个层级的部门名称不能重复。需要在管理后台开启多语言支持才能生效。长度限制为1~32个字符，字符不能包括:*?"<>｜
     */
    private String name_en;
    /**
     * 父部门id，32位整型
     */
    private Long parentid;
    /**
     * 在父部门中的次序值。order值大的排序靠前。有效的值范围是[0, 2^32)
     */
    private Long order;
    /**
     * 部门id，32位整型，指定时必须大于1。若不填该参数，将自动生成id
     */
    private Long id;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
