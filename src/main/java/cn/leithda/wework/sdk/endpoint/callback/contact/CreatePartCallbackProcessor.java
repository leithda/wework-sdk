package cn.leithda.wework.sdk.endpoint.callback.contact;

import cn.leithda.wework.sdk.po.callback.contact.CreatePartCallbackEntity;

/**
 * 新增部门回调
 *
 * @author leithda
 * @since 2022/5/29
 */
public interface CreatePartCallbackProcessor extends ChangeContactCallbackProcessorBase<CreatePartCallbackEntity> {
    @Override
    default String getChangeType() {
        return "create_party";
    }

    @Override
    default Class<CreatePartCallbackEntity> getEntityClass() {
        return CreatePartCallbackEntity.class;
    }
}
