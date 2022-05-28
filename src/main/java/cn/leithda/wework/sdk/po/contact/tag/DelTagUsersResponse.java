package cn.leithda.wework.sdk.po.contact.tag;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 删除标签成员响应
 *
 * @author leithda
 * @since 2022/5/28
 */
public class DelTagUsersResponse extends BaseResponse {
    /**
     * 非法的成员帐号列表，"usr1|usr2|usr3"
     */
    private String invalidlist;
    /**
     * 非法的部门id列表
     */
    private List<Long> invalidparty;

    public String getInvalidlist() {
        return invalidlist;
    }

    public void setInvalidlist(String invalidlist) {
        this.invalidlist = invalidlist;
    }
}
