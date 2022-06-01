package cn.leithda.wework.sdk.po.external.tag;

import java.util.List;

/**
 * 企业标签组
 *
 * @author leithda
 * @since 2022/5/29
 */
public class CorpTagGroup {
    /**
     * 标签组id
     */
    private String group_id;
    /**
     * 标签组名称
     */
    private String group_name;
    /**
     * 标签组创建时间
     */
    private Integer create_time;
    /**
     * 标签组排序的次序值，order值大的排序靠前。有效的值范围是[0, 2^32)
     */
    private Long order;
    /**
     * 标签组是否已经被删除，只在指定tag_id进行查询时返回
     */
    private Boolean deleted;
    /**
     * 标签组内的标签列表
     */
    private List<CorpTag> tag;

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public Integer getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Integer create_time) {
        this.create_time = create_time;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public List<CorpTag> getTag() {
        return tag;
    }

    public void setTag(List<CorpTag> tag) {
        this.tag = tag;
    }
}
