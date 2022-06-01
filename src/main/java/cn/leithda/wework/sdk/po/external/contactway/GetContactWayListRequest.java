package cn.leithda.wework.sdk.po.external.contactway;

/**
 * 获取企业已配置的「联系我」列表请求
 *
 * @author leithda
 * @since 2022/6/1
 */
public class GetContactWayListRequest {
    /**
     * 「联系我」创建起始时间戳, 默认为90天前
     */
    private Long start_time;
    /**
     * 「联系我」创建结束时间戳, 默认为当前时间
     */
    private Long end_time;
    /**
     * 分页查询使用的游标，为上次请求返回的 next_cursor
     */
    private String cursor;
    /**
     * 每次查询的分页大小，默认为100条，最多支持1000条
     */
    private Integer limit;

    public Long getStart_time() {
        return start_time;
    }

    public void setStart_time(Long start_time) {
        this.start_time = start_time;
    }

    public Long getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Long end_time) {
        this.end_time = end_time;
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
