package cn.leithda.wework.sdk.po.external.group;

import java.util.List;

/**
 * 获取客户群列表请求
 *
 * @author leithda
 * @since 2022/5/31
 */
public class GetGroupListRequest {
    /**
     * 客户群跟进状态过滤。
     * 0 - 所有列表(即不过滤)
     * 1 - 离职待继承
     * 2 - 离职继承中
     * 3 - 离职继承完成
     * <p>
     * 默认为0
     */
    private Integer status_filter;
    /**
     * 群主过滤。
     * 如果不填，表示获取应用可见范围内全部群主的数据（但是不建议这么用，如果可见范围人数超过1000人，为了防止数据包过大，会报错 81017）
     */
    private OwnerFilter owner_filter;
    /**
     * 用于分页查询的游标，字符串类型，由上一次调用返回，首次调用不填
     */
    private String cursor;
    /**
     * 分页，预期请求的数据量，取值范围 1 ~ 1000
     */
    private Integer limit;

    public Integer getStatus_filter() {
        return status_filter;
    }

    public void setStatus_filter(Integer status_filter) {
        this.status_filter = status_filter;
    }

    public OwnerFilter getOwner_filter() {
        return owner_filter;
    }

    public void setOwner_filter(OwnerFilter owner_filter) {
        this.owner_filter = owner_filter;
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

    /**
     * 群主过滤
     */
    public static class OwnerFilter {
        /**
         * 用户ID列表。最多100个
         */
        private List<String> userid_list;

        public List<String> getUserid_list() {
            return userid_list;
        }

        public void setUserid_list(List<String> userid_list) {
            this.userid_list = userid_list;
        }
    }
}
