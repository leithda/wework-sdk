package cn.leithda.wework.sdk.po.external.contact;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 创建规则组响应
 *
 * @author leithda
 * @since 2022/5/26
 */
public class CreateStrategyResponse extends BaseResponse {
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
