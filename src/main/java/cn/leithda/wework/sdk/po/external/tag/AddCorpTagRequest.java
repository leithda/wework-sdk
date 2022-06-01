package cn.leithda.wework.sdk.po.external.tag;

import java.util.List;

/**
 * 添加企业客户标签请求
 *
 * @author leithda
 * @since 2022/5/29
 */
public class AddCorpTagRequest {
    /**
     * 标签组id
     */
    private String group_id;
    /**
     * 标签组名称，最长为30个字符
     */
    private String group_name;
    /**
     * 标签组次序值。order值大的排序靠前。有效的值范围是[0, 2^32)
     */
    private Long order;
    /**
     * 添加的标签
     */
    private List<AddCorpTag> tag;
    /**
     * 授权方安装的应用agentid。仅旧的第三方多应用套件需要填此参数
     */
    private Long agentid;
}
