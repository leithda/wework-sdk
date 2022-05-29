package cn.leithda.wework.sdk.po.external.contact.marktag;

import java.util.List;

/**
 * 编辑客户企业标签请求
 *
 * @author leithda
 * @since 2022/5/29
 */
public class MarkTagRequest {
    /**
     * 添加外部联系人的userid
     */
    private String userid;
    /**
     * 外部联系人userid
     */
    private String external_userid;
    /**
     * 要标记的标签列表
     */
    private List<String> add_tag;
    /**
     * 要移除的标签列表
     */
    private List<String> remove_tag;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getExternal_userid() {
        return external_userid;
    }

    public void setExternal_userid(String external_userid) {
        this.external_userid = external_userid;
    }

    public List<String> getAdd_tag() {
        return add_tag;
    }

    public void setAdd_tag(List<String> add_tag) {
        this.add_tag = add_tag;
    }

    public List<String> getRemove_tag() {
        return remove_tag;
    }

    public void setRemove_tag(List<String> remove_tag) {
        this.remove_tag = remove_tag;
    }
}
