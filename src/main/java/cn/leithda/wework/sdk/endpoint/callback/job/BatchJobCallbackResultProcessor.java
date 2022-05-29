package cn.leithda.wework.sdk.endpoint.callback.job;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;
import cn.leithda.wework.sdk.po.callback.job.BatchJobResultCallbackEntity;
import cn.leithda.wework.sdk.utils.XmlUtils;

/**
 * 异步任务完成通知回调
 *
 * @author leithda
 * @since 2022/5/29
 */
public interface BatchJobCallbackResultProcessor extends BatchJobCallbackProcessorBase<BatchJobResultCallbackEntity> {
    @Override
    default String getChangeType() {
        return "";
    }

    @Override
    default Class<BatchJobResultCallbackEntity> getEntityClass() {
        return BatchJobResultCallbackEntity.class;
    }

    @Override
    default void execute(BaseCallbackEntity baseEntity, String msg) {
        BatchJobResultCallbackEntity entity = XmlUtils.xml2Entity(msg, getEntityClass());
        doExecute(entity);
    }
}
