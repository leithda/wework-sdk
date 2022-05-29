package cn.leithda.wework.sdk.po.external.contact.tag;

import java.util.List;

/**
 * 获取企业标签库请求
 *
 * @author leithda
 * @since 2022/5/29
 */
public class GetCorpTagListRequest {
    /**
     * 要查询的标签id
     */
    private List<String> tag_id;
    /**
     * 要查询的标签组id，返回该标签组以及其下的所有标签信息
     */
    private List<String> group_id;

    public List<String> getTag_id() {
        return tag_id;
    }

    public void setTag_id(List<String> tag_id) {
        this.tag_id = tag_id;
    }

    public List<String> getGroup_id() {
        return group_id;
    }

    public void setGroup_id(List<String> group_id) {
        this.group_id = group_id;
    }
}
