package cn.leithda.wework.sdk.po.external.strategytag;

import cn.leithda.wework.sdk.po.BaseResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * 获取指定规则组下的企业客户标签响应
 *
 * @author leithda
 * @since 2022/5/29
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class GetStrategyTagListResponse extends BaseResponse {
    /**
     * 标签组列表
     */
    private List<StrategyTagGroup> tag_group;

    public List<StrategyTagGroup> getTag_group() {
        return tag_group;
    }

    public void setTag_group(List<StrategyTagGroup> tag_group) {
        this.tag_group = tag_group;
    }
}
