package cn.leithda.wework.sdk.endpoint.callback.contact;

import cn.leithda.wework.sdk.po.callback.contact.UpdateUserCallbackEntity;

/**
 * 更新成员回调
 *
 * @author leithda
 * @since 2022/5/29
 */
public interface UpdateUserCallbackProcessor extends ChangeContactCallbackProcessorBase<UpdateUserCallbackEntity> {
    @Override
    default String getChangeType() {
        return "update_user";
    }

    @Override
    default Class<UpdateUserCallbackEntity> getEntityClass() {
        return UpdateUserCallbackEntity.class;
    }
}
