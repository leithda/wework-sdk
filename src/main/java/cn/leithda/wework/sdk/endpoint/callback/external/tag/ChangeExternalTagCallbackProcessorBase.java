package cn.leithda.wework.sdk.endpoint.callback.external.tag;

import cn.leithda.wework.sdk.endpoint.callback.ChangeTypeCallbackProcessor;
import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 客户联系标签变更
 *
 * @author leithda
 * @since 2022/6/6
 */
public interface ChangeExternalTagCallbackProcessorBase<T extends BaseCallbackEntity> extends ChangeTypeCallbackProcessor<T> {
}
