package cn.leithda.wework.sdk.po.contact.tag;

/**
 * 更新标签请求
 *
 * @author leithda
 * @since 2022/5/28
 */
public class UpdateTagRequest {
    /**
     * 标签id，非负整型，指定此参数时新增的标签会生成对应的标签id，不指定时则以目前最大的id自增。
     */
    private Long tagid;
    /**
     * 标签名称，长度限制为32个字以内（汉字或英文字母），标签名不可与其他标签重名。
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
