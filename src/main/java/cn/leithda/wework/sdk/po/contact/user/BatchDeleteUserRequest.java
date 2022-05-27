package cn.leithda.wework.sdk.po.contact.user;

import java.util.List;

/**
 * 批量删除成员请求
 *
 * @author leithda
 * @since 2022/5/27
 */
public class BatchDeleteUserRequest {
    /**
     * 成员UserID列表。对应管理端的帐号。最多支持200个。若存在无效UserID，直接返回错误
     */
    private List<String> useridlist;

    public List<String> getUseridlist() {
        return useridlist;
    }

    public void setUseridlist(List<String> useridlist) {
        this.useridlist = useridlist;
    }
}
