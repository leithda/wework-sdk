package cn.leithda.wework.sdk.po.external.contact.tag;

/**
 * 企业客户标签添加
 *
 * @author leithda
 * @since 2022/5/29
 */
public class AddCorpTag {
    /**
     * 添加的标签名称，最长为30个字符
     */
    private String name;
    /**
     * 标签次序值。order值大的排序靠前。有效的值范围是[0, 2^32)
     */
    private Long order;

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
}
