package cn.leithda.wework.sdk.po.external.strategytag;

/**
 * 指定规则组下的标签组
 *
 * @author leithda
 * @since 2022/5/29
 */
public class StrategyTagGroup {
    /**
     * 标签组id
     */
    private String group_id;
    /**
     * 标签组名称
     */
    private String group_name;
    /**
     * 标签组创建时间
     */
    private Integer create_time;
    /**
     * 标签组排序的次序值，order值大的排序靠前。有效的值范围是[0, 2^32)
     */
    private Long order;
    /**
     * 标签组所属的规则组id
     */
    private Long strategy_id;

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
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

    public Long getStrategy_id() {
        return strategy_id;
    }

    public void setStrategy_id(Long strategy_id) {
        this.strategy_id = strategy_id;
    }
}
