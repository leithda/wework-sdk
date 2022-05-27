package cn.leithda.wework.sdk.po.external.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * 批量获取客户详情响应
 *
 * @author leithda
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class BatchGetExternalContactResponse extends BaseResponse {
    /**
     * 客户详情列表
     */
    List<ExternalContactInfo> external_contact_list;
    /**
     * 分页游标，再下次请求时填写以获取之后分页的记录，如果已经没有更多的数据则返回空
     */
    private String next_cursor;

    public List<ExternalContactInfo> getExternal_contact_list() {
        return external_contact_list;
    }

    public void setExternal_contact_list(List<ExternalContactInfo> external_contact_list) {
        this.external_contact_list = external_contact_list;
    }

    public String getNext_cursor() {
        return next_cursor;
    }

    public void setNext_cursor(String next_cursor) {
        this.next_cursor = next_cursor;
    }

    public static class ExternalContactInfo {
        /**
         * 客户的基本信息，可以参考获取客户详情
         */
        private ExternalContact external_contact;
        /**
         * 企业成员客户跟进信息，可以参考获取客户详情，但标签信息只会返回企业标签和规则组标签的tag_id，个人标签将不再返回
         */
        private FollowInfo follow_info;

        public ExternalContact getExternal_contact() {
            return external_contact;
        }

        public void setExternal_contact(ExternalContact external_contact) {
            this.external_contact = external_contact;
        }

        public FollowInfo getFollow_info() {
            return follow_info;
        }

        public void setFollow_info(FollowInfo follow_info) {
            this.follow_info = follow_info;
        }
    }
}
