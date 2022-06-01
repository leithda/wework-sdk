package cn.leithda.wework.sdk.po.external.tag;

/**
 * 编辑企业客户标签请求
 *
 * @author leithda
 * @since 2022/5/29
 */
public class UpdateCorpTagRequest {
    /**
     * 标签或标签组的id
     */
    private String id;
    /**
     * 新的标签或标签组名称，最长为30个字符
     */
    private String name;
    /**
     * 标签/标签组的次序值。order值大的排序靠前。有效的值范围是[0, 2^32)
     */
    private Long order;
    /**
     * 授权方安装的应用agentid。仅旧的第三方多应用套件需要填此参数
     */
    private Long agentid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }

    public Long getAgentid() {
        return agentid;
    }

    public void setAgentid(Long agentid) {
        this.agentid = agentid;
    }
}
