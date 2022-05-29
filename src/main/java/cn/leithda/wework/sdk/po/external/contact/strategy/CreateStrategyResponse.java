package cn.leithda.wework.sdk.po.external.contact.strategy;

import cn.leithda.wework.sdk.po.BaseResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 创建规则组响应
 *
 * @author leithda
 * @since 2022/5/26
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
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
