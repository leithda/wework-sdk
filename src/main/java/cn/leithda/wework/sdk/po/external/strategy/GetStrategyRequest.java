package cn.leithda.wework.sdk.po.external.strategy;

/**
 * 获取规则组详情请求
 *
 * @author leithda
 * @since 2022/5/26
 */
public class GetStrategyRequest {
    /**
     * 规则组ID
     */
    private Long strategy_id;

    public Long getStrategy_id() {
        return strategy_id;
    }

    public void setStrategy_id(Long strategy_id) {
        this.strategy_id = strategy_id;
    }
}
