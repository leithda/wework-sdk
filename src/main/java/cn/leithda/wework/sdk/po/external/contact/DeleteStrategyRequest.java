package cn.leithda.wework.sdk.po.external.contact;

/**
 * 删除规则组请求
 *
 * @author leithda
 * @since 2022/5/26
 */
public class DeleteStrategyRequest {
    /**
     * 规则组id
     */
    private Long strategy_id;

    public Long getStrategy_id() {
        return strategy_id;
    }

    public void setStrategy_id(Long strategy_id) {
        this.strategy_id = strategy_id;
    }
}
