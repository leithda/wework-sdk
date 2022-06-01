package cn.leithda.wework.sdk.po.external.group;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 获取客户群列表响应
 *
 * @author leithda
 * @since 2022/5/31
 */
public class GetGroupListResponse extends BaseResponse {
    /**
     * 客户群列表
     */
    private List<GroupList> group_chat_list;
    /**
     * 分页游标，下次请求时填写以获取之后分页的记录。如果该字段返回空则表示已没有更多数据
     */
    private String next_cursor;

    public List<GroupList> getGroup_chat_list() {
        return group_chat_list;
    }

    public void setGroup_chat_list(List<GroupList> group_chat_list) {
        this.group_chat_list = group_chat_list;
    }

    public String getNext_cursor() {
        return next_cursor;
    }

    public void setNext_cursor(String next_cursor) {
        this.next_cursor = next_cursor;
    }

    /**
     * 客户群列表
     */
    public static class GroupList{
        /**
         * 客户群ID
         */
        private String chat_id;
        /**
         * 客户群跟进状态。
         * 0 - 跟进人正常
         * 1 - 跟进人离职
         * 2 - 离职继承中
         * 3 - 离职继承完成
         */
        private Integer status;

        public String getChat_id() {
            return chat_id;
        }

        public void setChat_id(String chat_id) {
            this.chat_id = chat_id;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }
    }
}
