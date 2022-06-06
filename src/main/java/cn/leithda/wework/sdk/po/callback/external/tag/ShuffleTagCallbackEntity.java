package cn.leithda.wework.sdk.po.callback.external.tag;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 企业客户标签重排事件回调实体
 *
 * @author leithda
 * @since 2022/6/6
 */
public class ShuffleTagCallbackEntity extends BaseCallbackEntity {
    /**
     * 标签组的id，表示只有此标签组内的标签发生了重排，如果为空，则表示全部标签组顺序都发生了变化
     */
    private String id;
    /**
     * 规则组id，如果修改了规则组标签的顺序，则回调时会带上此标签所属规则组的id
     */
    private Long strategyId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getStrategyId() {
        return strategyId;
    }

    public void setStrategyId(Long strategyId) {
        this.strategyId = strategyId;
    }
}
