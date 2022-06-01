package cn.leithda.wework.sdk.po.external.tag;

import java.util.List;

/**
 * 删除企业客户标签请求
 *
 * @author leithda
 * @since 2022/5/29
 */
public class DeleteCorpTagRequest {
    /**
     * 标签的id列表
     */
    private List<String> tag_id;
    /**
     * 标签组的id列表
     */
    private List<String> group_id;
    /**
     * 授权方安装的应用agentid。仅旧的第三方多应用套件需要填此参数
     */
    private Long agentid;

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

    public Long getAgentid() {
        return agentid;
    }

    public void setAgentid(Long agentid) {
        this.agentid = agentid;
    }
}
