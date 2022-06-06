package cn.leithda.wework.sdk.endpoint.callback.external.tag;

import cn.leithda.wework.sdk.po.callback.external.tag.DeleteTagCallbackEntity;

/**
 * 企业客户标签删除事件
 *
 * @author leithda
 * @since 2022/6/6
 * @see <a href="
 */
public interface DeleteTagCallbackProcessor extends ChangeExternalTagCallbackProcessorBase<DeleteTagCallbackEntity> {
    @Override
    default String getChangeType() {
        return "delete";
    }

    @Override
    default Class<DeleteTagCallbackEntity> getEntityClass() {
        return DeleteTagCallbackEntity.class;
    }

}
