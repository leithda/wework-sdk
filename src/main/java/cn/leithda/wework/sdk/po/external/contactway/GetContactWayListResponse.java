package cn.leithda.wework.sdk.po.external.contactway;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 获取企业已配置的「联系我」列表响应
 *
 * @author leithda
 * @since 2022/6/1
 */
public class GetContactWayListResponse extends BaseResponse {
    /**
     * 联系方式的配置id
     */
    private List<ContactWayList> contact_way;
    /**
     * 分页参数，用于查询下一个分页的数据，为空时表示没有更多的分页
     */
    private String next_cursor;

    public List<ContactWayList> getContact_way() {
        return contact_way;
    }

    public void setContact_way(List<ContactWayList> contact_way) {
        this.contact_way = contact_way;
    }

    public String getNext_cursor() {
        return next_cursor;
    }

    public void setNext_cursor(String next_cursor) {
        this.next_cursor = next_cursor;
    }

    /**
     * 「联系我」方式列表
     */
    public static class ContactWayList {
        private String config_id;

        public String getConfig_id() {
            return config_id;
        }

        public void setConfig_id(String config_id) {
            this.config_id = config_id;
        }
    }
}
