package cn.leithda.wework.sdk.endpoint.callback.external.chat;

import cn.leithda.wework.sdk.endpoint.callback.ChangeTypeCallbackProcessor;
import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 客户群变更回调标记接口
 *
 * @author leithda
 * @since 2022/6/6
 */
public interface ChangeExternalChatCallbackProcessorBase<T extends BaseCallbackEntity> extends ChangeTypeCallbackProcessor<T> {

}
