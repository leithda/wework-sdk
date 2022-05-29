package cn.leithda.wework.sdk.po.external.contact.strategytag;

import java.util.List;

/**
 * 删除指定规则组下的企业客户标签请求
 *
 * @author leithda
 * @since 2022/5/29
 */
public class DelStrategyTagRequest {
    /**
     * 标签的id列表
     */
    private List<String> tag_id;
    /**
     * 标签组的id列表
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
