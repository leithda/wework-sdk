package cn.leithda.wework.sdk.po.callback.external.tag;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 企业客户标签删除事件回调实体
 *
 * @author leithda
 * @since 2022/6/6
 */
public class DeleteTagCallbackEntity extends BaseCallbackEntity {
    /**
     * 标签或标签组的ID
     */
    private String id;
    /**
     * 删除标签时，此项为tag，删除标签组时，此项为tag_group
     */
    private String tagType;
    /**
     * 标签或标签组所属的规则组id，只回调给“客户联系”应用
     */
    private Long strategyId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTagType() {
        return tagType;
    }

    public void setTagType(String tagType) {
        this.tagType = tagType;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }
}
