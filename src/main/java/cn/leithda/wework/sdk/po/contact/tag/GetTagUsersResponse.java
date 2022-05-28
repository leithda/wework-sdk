package cn.leithda.wework.sdk.po.contact.tag;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 获取标签成员响应
 *
 * @author leithda
 * @since 2022/5/28
 */
public class GetTagUsersResponse extends BaseResponse {
    /**
     * 标签名
     */
    private String tagname;
    /**
     * 	标签中包含的成员列表
     */
    private List<TagUser> userlist;
    /**
     * 标签中包含的部门id列表
     */
    private List<Long> partylist;

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public List<TagUser> getUserlist() {
        return userlist;
    }

    public void setUserlist(List<TagUser> userlist) {
        this.userlist = userlist;
    }

    public List<Long> getPartylist() {
        return partylist;
    }

    public void setPartylist(List<Long> partylist) {
        this.partylist = partylist;
    }
}
