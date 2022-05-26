package cn.leithda.wework.sdk.po.external.contact;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 获取规则组详情响应
 *
 * @author leithda
 * @since 2022/5/26
 */
public class GetStrategyResponse extends BaseResponse {
    /**
     * 规则组详情
     */
    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
