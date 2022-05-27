package cn.leithda.wework.sdk.po.contact.user;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 获取部门成员响应
 *
 * @author leithda
 * @since 2022/5/27
 */
public class GetSimpleUserListResponse extends BaseResponse {
    /**
     * 成员列表
     */
    private List<SimpleUser> userlist;

    public List<SimpleUser> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<SimpleUser> userlist) {
        this.userlist = userlist;
    }
}
