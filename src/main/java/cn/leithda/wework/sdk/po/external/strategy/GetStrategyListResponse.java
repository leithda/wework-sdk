package cn.leithda.wework.sdk.po.external.strategy;

import cn.leithda.wework.sdk.po.BaseResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * 获取规则组列表响应
 *
 * @author leithda
 * @since 2022/5/26
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class GetStrategyListResponse extends BaseResponse {
    /**
     * 规则组id列表
     */
    private List<StrategyInline> strategy;
    /**
     * 分页游标，用于查询下一个分页的数据，无更多数据时不返回
     */
    private String next_cursor;

    public List<StrategyInline> getStrategy() {
        return strategy;
    }

    public void setStrategy(List<StrategyInline> strategy) {
        this.strategy = strategy;
    }

    public String getNext_cursor() {
        return next_cursor;
    }

    public void setNext_cursor(String next_cursor) {
        this.next_cursor = next_cursor;
    }

    /**
     * 规则组列表规则
     */
    public static class StrategyInline {
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
}
