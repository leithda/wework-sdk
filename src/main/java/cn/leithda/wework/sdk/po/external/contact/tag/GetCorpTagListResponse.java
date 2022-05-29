package cn.leithda.wework.sdk.po.external.contact.tag;

import cn.leithda.wework.sdk.po.BaseResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * 获取企业标签库响应
 *
 * @author leithda
 * @since 2022/5/29
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class GetCorpTagListResponse extends BaseResponse {
    /**
     * 标签组列表
     */
    private List<CorpTagGroup> tag_group;

    public List<CorpTagGroup> getTag_group() {
        return tag_group;
    }

    public void setTag_group(List<CorpTagGroup> tag_group) {
        this.tag_group = tag_group;
    }
}
