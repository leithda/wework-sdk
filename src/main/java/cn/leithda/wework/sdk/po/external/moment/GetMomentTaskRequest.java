package cn.leithda.wework.sdk.po.external.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * 获取客户朋友圈企业发表的列表请求
 *
 * @author leithda
 * @since 2022/6/8
 */
public class GetMomentTaskRequest {
    /**
     * 朋友圈id,仅支持企业发表的朋友圈id
     */
    private String momentID;
    /**
     * 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填
     */
    private String cursor;
    /**
     * 返回的最大记录数，整型，最大值1000，默认值500，超过最大值时取默认值
     */
    private Integer limit;

    @JsonProperty("moment_id")
    public String getMomentID() { return momentID; }
    @JsonProperty("moment_id")
    public void setMomentID(String value) { this.momentID = value; }

    @JsonProperty("cursor")
    public String getCursor() { return cursor; }
    @JsonProperty("cursor")
    public void setCursor(String value) { this.cursor = value; }

    @JsonProperty("limit")
    public Integer getLimit() { return limit; }
    @JsonProperty("limit")
    public void setLimit(Integer value) { this.limit = value; }
}
