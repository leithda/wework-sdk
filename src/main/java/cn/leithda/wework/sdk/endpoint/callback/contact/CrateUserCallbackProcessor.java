package cn.leithda.wework.sdk.endpoint.callback.contact;

import cn.leithda.wework.sdk.po.callback.contact.CreateUserCallbackEntity;

/**
 * 新增成员回调
 *
 * @author leithda
 * @since 2022/5/28
 */
public interface CrateUserCallbackProcessor extends ChangeContactCallbackProcessor<CreateUserCallbackEntity> {
    @Override
    default String getChangeType() {
        return "create_user";
    }

    @Override
    default Class<CreateUserCallbackEntity> getEntityClass() {
        return CreateUserCallbackEntity.class;
    }
}
