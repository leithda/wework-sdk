package cn.leithda.wework.sdk.po.contact.tag;

/**
 * 标签
 *
 * @author leithda
 * @since 2022/5/28
 */
public class Tag {
    /**
     * 标签id
     */
    private Long tagid;
    /**
     * 标签名
     */
    private String tagname;

    public Long getTagid() {
        return tagid;
    }

    public void setTagid(Long tagid) {
        this.tagid = tagid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }
}
