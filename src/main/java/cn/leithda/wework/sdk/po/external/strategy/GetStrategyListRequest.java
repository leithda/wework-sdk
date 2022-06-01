package cn.leithda.wework.sdk.po.external.strategy;

/**
 * 获取规则组列表请求
 *
 * @author leithda
 */
public class GetStrategyListRequest {

    /**
     * 分页查询游标，首次调用可不填
     */
    private String cursor;
    /**
     * 分页大小,默认为1000，最大不超过1000
     */
    private Integer limit;

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
