package cn.leithda.wework.sdk.po.external.contact;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 获取客户列表响应
 *
 * @author leithda
 */
public class GetExternalContactListResponse extends BaseResponse {
    /**
     * 外部联系人的userid列表
     */
    List<String> external_userid;

    public List<String> getExternal_userid() {
        return external_userid;
    }

    public void setExternal_userid(List<String> external_userid) {
        this.external_userid = external_userid;
    }
}
