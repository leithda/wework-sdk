package cn.leithda.wework.sdk.endpoint.callback.external;

import cn.leithda.wework.sdk.endpoint.callback.ChangeTypeCallbackProcessor;
import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 客户联系回调标记接口
 *
 * @param <T> 回调实体类类型
 */
public interface ChangeExternalContactCallbackProcessorBase<T extends BaseCallbackEntity> extends ChangeTypeCallbackProcessor<T> {

}
