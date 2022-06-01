package cn.leithda.wework.sdk.po.external.strategy;

/**
 * 获取规则组管理范围请求
 *
 * @author leithda
 * @since 2022/5/26
 */
public class GetStrategyRangeRequest {
    /**
     * 规则组id
     */
    private Long strategy_id;
    /**
     * 分页游标
     */
    private String cursor;
    /**
     * 每个分页的成员/部门节点数，默认为1000，最大为1000
     */
    private Integer limit;

    public Long getStrategy_id() {
        return strategy_id;
    }

    public void setStrategy_id(Long strategy_id) {
        this.strategy_id = strategy_id;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
