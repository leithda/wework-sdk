package cn.leithda.wework.sdk.po.external.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取企业全部的发表列表请求
 *
 * @author leithda
 * @since 2022/6/8
 */
public class GetMomentListRequest {
    /**
     * 朋友圈记录开始时间。Unix时间戳
     */
    private Long startTime;
    /**
     * 朋友圈记录结束时间。Unix时间戳
     */
    private Long endTime;
    /**
     * 朋友圈创建人的userid
     */
    private String creator;
    /**
     * 朋友圈类型。0：企业发表 1：个人发表 2：所有，包括个人创建以及企业创建，默认情况下为所有类型
     */
    private Long filterType;
    /**
     * 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填
     */
    private String cursor;
    /**
     * 返回的最大记录数，整型，最大值20，默认值20，超过最大值时取默认值
     */
    private Integer limit;

    @JsonProperty("start_time")
    public Long getStartTime() {
        return startTime;
    }

    @JsonProperty("start_time")
    public void setStartTime(Long value) {
        this.startTime = value;
    }

    @JsonProperty("end_time")
    public Long getEndTime() {
        return endTime;
    }

    @JsonProperty("end_time")
    public void setEndTime(Long value) {
        this.endTime = value;
    }

    @JsonProperty("creator")
    public String getCreator() {
        return creator;
    }

    @JsonProperty("creator")
    public void setCreator(String value) {
        this.creator = value;
    }

    @JsonProperty("filter_type")
    public Long getFilterType() {
        return filterType;
    }

    @JsonProperty("filter_type")
    public void setFilterType(Long value) {
        this.filterType = value;
    }

    @JsonProperty("cursor")
    public String getCursor() {
        return cursor;
    }

    @JsonProperty("cursor")
    public void setCursor(String value) {
        this.cursor = value;
    }

    @JsonProperty("limit")
    public Integer getLimit() {
        return limit;
    }

    @JsonProperty("limit")
    public void setLimit(Integer value) {
        this.limit = value;
    }
}
