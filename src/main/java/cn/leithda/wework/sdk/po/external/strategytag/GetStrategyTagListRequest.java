package cn.leithda.wework.sdk.po.external.strategytag;

import java.util.List;

/**
 * 获取指定规则组下的企业客户标签请求
 *
 * @author leithda
 * @since 2022/5/29
 */
public class GetStrategyTagListRequest {
    /**
     * 	规则组id
     */
    private Long strategy_id;
    /**
     * 要查询的标签id
     */
    private List<String> tag_id;
    /**
     * 要查询的标签组id，返回该标签组以及其下的所有标签信息
     */
    private List<String> group_id;

    public Long getStrategy_id() {
        return strategy_id;
    }

    public void setStrategy_id(Long strategy_id) {
        this.strategy_id = strategy_id;
    }

    public List<String> getTag_id() {
        return tag_id;
    }

    public void setTag_id(List<String> tag_id) {
        this.tag_id = tag_id;
    }

    public List<String> getGroup_id() {
        return group_id;
    }

    public void setGroup_id(List<String> group_id) {
        this.group_id = group_id;
    }
}
