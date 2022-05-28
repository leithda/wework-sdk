package cn.leithda.wework.sdk.po.contact.tag;

import java.util.List;

/**
 * 删除标签成员请求
 *
 * @author leithda
 * @since 2022/5/28
 */
public class DelTagUsersRequest {
    /**
     * 标签ID
     */
    private Long tagid;
    /**
     * 企业成员ID列表，注意：userlist、partylist不能同时为空，单次请求个数不超过1000
     */
    private List<String> userlist;
    /**
     * 企业部门ID列表，注意：userlist、partylist不能同时为空，单次请求个数不超过100
     */
    private List<Long> partylist;

    public Long getTagid() {
        return tagid;
    }

    public void setTagid(Long tagid) {
        this.tagid = tagid;
    }

    public List<String> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<String> userlist) {
        this.userlist = userlist;
    }

    public List<Long> getPartylist() {
        return partylist;
    }

    public void setPartylist(List<Long> partylist) {
        this.partylist = partylist;
    }
}
