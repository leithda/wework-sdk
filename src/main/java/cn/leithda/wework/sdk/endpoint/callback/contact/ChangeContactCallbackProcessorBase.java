package cn.leithda.wework.sdk.endpoint.callback.contact;

import cn.leithda.wework.sdk.endpoint.callback.ChangeTypeCallbackProcessor;
import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 通讯录变更回调标记接口
 *
 * @author leithda
 * @since 2022/5/28
 */
public interface ChangeContactCallbackProcessorBase<T extends BaseCallbackEntity> extends ChangeTypeCallbackProcessor<T> {
}
