package cn.leithda.wework.sdk.po.external.contact.strategy;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 获取规则组管理范围响应
 *
 * @author leithda
 * @since 2022/5/26
 */

public class GetStrategyRangeResponse extends BaseResponse {
    /**
     * 规则组范围列表
     */
    private List<StrategyRange> range;
    /**
     * 分页游标，用于查询下一个分页的数据，无更多数据时不返回
     */
    private String next_cursor;

    public List<StrategyRange> getRange() {
        return range;
    }

    public void setRange(List<StrategyRange> range) {
        this.range = range;
    }

    public String getNext_cursor() {
        return next_cursor;
    }

    public void setNext_cursor(String next_cursor) {
        this.next_cursor = next_cursor;
    }
}
