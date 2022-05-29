package cn.leithda.wework.sdk.service.callback;

import cn.leithda.wework.sdk.endpoint.callback.EventCallbackProcessor;
import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;
import cn.leithda.wework.sdk.utils.XmlUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Objects;

/**
 * 回调调度器
 *
 * @author leithda
 * @since 2022/5/28
 */
@Service
public class CallbackMsgDispatcher {

    @Resource
    List<EventCallbackProcessor> eventCallbackProcessorList;

    /**
     * 分发
     *
     * @param msg 回调消息内容
     */
    public void dispatch(String msg) {
        BaseCallbackEntity baseCallbackEntity = XmlUtils.xml2Entity(msg, BaseCallbackEntity.class);
        if (Objects.isNull(baseCallbackEntity)) {
            return;
        }
        for (EventCallbackProcessor eventCallbackProcessor : eventCallbackProcessorList) {
            eventCallbackProcessor.execute(baseCallbackEntity, msg);
        }
    }
}
