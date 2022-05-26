package cn.leithda.wework.sdk.po.external.contact;

import java.util.List;

/**
 * 批量获取客户详情请求
 *
 * @author leithda
 */
public class BatchGetExternalContactRequest {
    /**
     * 企业成员的userid列表，字符串类型，最多支持100个
     */
    private List<String> userid_list;
    /**
     * 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用可不填
     */
    private String cursor;
    /**
     * 返回的最大记录数，整型，最大值100，默认值50，超过最大值时取最大值
     */
    private Integer limit;

    public List<String> getUserid_list() {
        return userid_list;
    }

    public void setUserid_list(List<String> userid_list) {
        this.userid_list = userid_list;
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
