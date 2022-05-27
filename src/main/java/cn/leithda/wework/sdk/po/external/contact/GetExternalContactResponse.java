package cn.leithda.wework.sdk.po.external.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * 获取客户详情响应
 *
 * @author leithda
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class GetExternalContactResponse extends BaseResponse {
    /**
     * 客户详情
     */
    private ExternalContact external_contact;
    /**
     * 添加该联系人的成员
     */
    private List<FollowInfo> follow_user;
    /**
     * 分页的cursor，当跟进人多于500人时返回
     */
    private String next_cursor;

    public ExternalContact getExternal_contact() {
        return external_contact;
    }

    public void setExternal_contact(ExternalContact external_contact) {
        this.external_contact = external_contact;
    }

    public List<FollowInfo> getFollow_user() {
        return follow_user;
    }

    public void setFollow_user(List<FollowInfo> follow_user) {
        this.follow_user = follow_user;
    }

    public String getNext_cursor() {
        return next_cursor;
    }

    public void setNext_cursor(String next_cursor) {
        this.next_cursor = next_cursor;
    }
}
