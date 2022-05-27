package cn.leithda.wework.sdk.po.contact.user;

import java.util.List;

/**
 * 邀请成员请求
 *
 * @author leithda
 * @since 2022/5/27
 */
public class BatchInviteUserRequest {
    /**
     * 成员ID列表, 最多支持1000个。
     */
    private List<String> user;
    /**
     * 部门ID列表，最多支持100个。
     */
    private List<Long> party;
    /**
     * 标签ID列表，最多支持100个。
     */
    private List<Long> tag;

    public List<String> getUser() {
        return user;
    }

    public void setUser(List<String> user) {
        this.user = user;
    }

    public List<Long> getParty() {
        return party;
    }

    public void setParty(List<Long> party) {
        this.party = party;
    }

    public List<Long> getTag() {
        return tag;
    }

    public void setTag(List<Long> tag) {
        this.tag = tag;
    }
}
