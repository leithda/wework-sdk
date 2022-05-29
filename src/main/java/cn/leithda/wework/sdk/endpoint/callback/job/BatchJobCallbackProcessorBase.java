package cn.leithda.wework.sdk.endpoint.callback.job;

import cn.leithda.wework.sdk.endpoint.callback.ChangeTypeCallbackProcessor;
import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 异步任务完成通知
 *
 * @author leithda
 * @since 2022/5/29
 */
public interface BatchJobCallbackProcessorBase<T extends BaseCallbackEntity> extends ChangeTypeCallbackProcessor<T> {

}
