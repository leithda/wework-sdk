package cn.leithda.wework.sdk.po.external.contact.strategytag;

import java.util.List;

/**
 * 为指定规则组创建企业客户标签请求
 *
 * @author leithda
 * @since 2022/5/29
 */
public class AddStrategyTagRequest {
    /**
     * 规则组id
     */
    private Long strategy_id;
    /**
     * 标签组id
     */
    private String group_id;
    /**
     * 标签组名称，最长为30个字符
     */
    private String group_name;
    /**
     * 标签组次序值。order值大的排序靠前。有效的值范围是[0, 2^32)
     */
    private Long order;
    /**
     * 添加的标签
     */
    private List<AddStrategyTag> tag;

    public Long getStrategy_id() {
        return strategy_id;
    }

    public void setStrategy_id(Long strategy_id) {
        this.strategy_id = strategy_id;
    }

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

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public List<AddStrategyTag> getTag() {
        return tag;
    }

    public void setTag(List<AddStrategyTag> tag) {
        this.tag = tag;
    }
}
