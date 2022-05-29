package cn.leithda.wework.sdk.po.callback.contact;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 删除部门回调实体
 *
 * @author leithda
 * @since 2022/5/29
 */
public class DeletePartCallbackEntity extends BaseCallbackEntity {
    /**
     * 部门Id
     */
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
