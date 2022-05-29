package cn.leithda.wework.sdk.endpoint.callback.contact;

import cn.leithda.wework.sdk.po.callback.contact.UpdatePartCallbackEntity;

/**
 * 更新部门回调
 *
 * @author leithda
 * @since 2022/5/29
 */
public interface UpdatePartCallbackProcessor extends ChangeContactCallbackProcessorBase<UpdatePartCallbackEntity> {
    @Override
    default String getChangeType() {
        return "update_party";
    }

    @Override
    default Class<UpdatePartCallbackEntity> getEntityClass() {
        return UpdatePartCallbackEntity.class;
    }
}
