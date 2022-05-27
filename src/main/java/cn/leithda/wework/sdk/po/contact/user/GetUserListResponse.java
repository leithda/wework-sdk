package cn.leithda.wework.sdk.po.contact.user;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 获取部门成员详情响应
 *
 * @author leithda
 * @since 2022/5/27
 */
public class GetUserListResponse extends BaseResponse {
    /**
     * 成员列表
     */
    private List<User> userlist;

    public List<User> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<User> userlist) {
        this.userlist = userlist;
    }
}
