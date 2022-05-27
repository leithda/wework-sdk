package cn.leithda.wework.sdk.po.contact.user;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 邀请成员响应
 *
 * @author leithda
 * @since 2022/5/27
 */
public class BatchInviteUserResponse extends BaseResponse {
    /**
     * 非法成员列表
     */
    private List<String> invaliduser;
    /**
     * 非法部门列表
     */
    private List<Long> invalidparty;
    /**
     * 非法标签列表
     */
    private List<Long> invalidtag;

    public List<String> getInvaliduser() {
        return invaliduser;
    }

    public void setInvaliduser(List<String> invaliduser) {
        this.invaliduser = invaliduser;
    }

    public List<Long> getInvalidparty() {
        return invalidparty;
    }

    public void setInvalidparty(List<Long> invalidparty) {
        this.invalidparty = invalidparty;
    }

    public List<Long> getInvalidtag() {
        return invalidtag;
    }

    public void setInvalidtag(List<Long> invalidtag) {
        this.invalidtag = invalidtag;
    }
}
