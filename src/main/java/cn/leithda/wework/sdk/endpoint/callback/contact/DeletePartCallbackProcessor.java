package cn.leithda.wework.sdk.endpoint.callback.contact;

import cn.leithda.wework.sdk.po.callback.contact.DeletePartCallbackEntity;

/**
 * 删除部门回调
 *
 * @author leithda
 * @since 2022/5/29
 */
public interface DeletePartCallbackProcessor extends ChangeContactCallbackProcessorBase<DeletePartCallbackEntity> {
    @Override
    default String getChangeType() {
        return "delete_party";
    }

    @Override
    default Class<DeletePartCallbackEntity> getEntityClass() {
        return DeletePartCallbackEntity.class;
    }
}
