package cn.leithda.wework.sdk.endpoint.callback;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

import java.util.List;
import java.util.Objects;

/**
 * 事件类型处理器接口
 */
public interface EventCallbackProcessor {

    /**
     * 获取变更类型处理器
     *
     * @return 变更类型处理器
     */
    List<? extends ChangeTypeCallbackProcessor<? extends BaseCallbackEntity>> getChangeTypeProcessors();

    /**
     * 获取事件类型
     *
     * @return 事件类型
     */
    String getEvent();

    /**
     * 处理事件
     */
    default void execute(BaseCallbackEntity entity, String msg) {
        if (!Objects.equals(entity.getEvent(), getEvent())) {
            return;
        }
        List<? extends ChangeTypeCallbackProcessor<? extends BaseCallbackEntity>> processors = getChangeTypeProcessors();
        if(Objects.nonNull(processors) && processors.size() > 0) {
            processors.forEach(processor -> processor.execute(entity, msg));
        }
    }
}
