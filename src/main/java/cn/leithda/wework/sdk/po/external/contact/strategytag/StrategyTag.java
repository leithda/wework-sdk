package cn.leithda.wework.sdk.po.external.contact.strategytag;

/**
 * 指定规则组下的企业客户标签
 *
 * @author leithda
 * @since 2022/5/29
 */
public class StrategyTag {
    /**
     * 标签id
     */
    private String id;
    /**
     * 标签名称
     */
    private String name;
    /**
     * 标签创建时间
     */
    private Integer create_time;
    /**
     * 标签排序的次序值，order值大的排序靠前。有效的值范围是[0, 2^32)
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

    public Integer getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Integer create_time) {
        this.create_time = create_time;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }
}
