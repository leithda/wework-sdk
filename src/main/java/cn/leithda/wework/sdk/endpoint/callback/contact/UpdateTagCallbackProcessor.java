package cn.leithda.wework.sdk.endpoint.callback.contact;

import cn.leithda.wework.sdk.po.callback.contact.UpdateTagCallbackEntity;

/**
 * 标签变更回调
 *
 * @author leithda
 * @since 2022/5/29
 */
public interface UpdateTagCallbackProcessor extends ChangeContactCallbackProcessorBase<UpdateTagCallbackEntity> {
    @Override
    default String getChangeType() {
        return "update_tag";
    }

    @Override
    default Class<UpdateTagCallbackEntity> getEntityClass() {
        return UpdateTagCallbackEntity.class;
    }
}
