package cn.leithda.wework.sdk.endpoint.callback.contact;

import cn.leithda.wework.sdk.po.callback.contact.DeleteUserCallbackEntity;

public interface DeleteUserCallbackProcessor extends ChangeContactCallbackProcessorBase<DeleteUserCallbackEntity> {


    @Override
    default String getChangeType() {
        return "delete_user";
    }

    @Override
    default Class<DeleteUserCallbackEntity> getEntityClass() {
        return DeleteUserCallbackEntity.class;
    }

}
