package cn.leithda.wework.sdk.po.external.contact;

/**
 * 标签信息
 *
 * @author leithda
 */
public class Tag {
    /**
     * 该成员添加此外部联系人所打标签的分组名称（标签功能需要企业微信升级到2.7.5及以上版本）
     */
    private String group_name;
    /**
     * 该成员添加此外部联系人所打标签名称
     */
    private String tag_name;
    /**
     * 该成员添加此外部联系人所打标签类型, 1-企业设置，2-用户自定义，3-规则组标签（仅系统应用返回）
     */
    private String tag_id;
    /**
     * 该成员添加此外部联系人所打企业标签的id，用户自定义类型标签（type=2）不返回
     */
    private Long type;

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getTag_name() {
        return tag_name;
    }

    public void setTag_name(String tag_name) {
        this.tag_name = tag_name;
    }

    public String getTag_id() {
        return tag_id;
    }

    public void setTag_id(String tag_id) {
        this.tag_id = tag_id;
    }

    public Long getType() {
        return type;
    }

    public void setType(Long type) {
        this.type = type;
    }
}
