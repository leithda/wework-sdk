package cn.leithda.wework.sdk.po.external.contact.strategytag;

/**
 * 编辑指定规则组下的企业客户标签请求
 *
 * @author leithda
 * @since 2022/5/29
 */
public class EditStrategyTagRequest {
    /**
     * 标签或标签组的id
     */
    private String id;
    /**
     * 新的标签或标签组名称，最长为30个字符
     */
    private String name;
    /**
     * 标签/标签组的次序值。order值大的排序靠前。有效的值范围是[0, 2^32)
     */
    private Long order;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }
}
