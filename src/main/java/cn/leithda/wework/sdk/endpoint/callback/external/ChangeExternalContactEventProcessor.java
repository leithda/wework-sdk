package cn.leithda.wework.sdk.endpoint.callback.external;

import cn.leithda.wework.sdk.endpoint.callback.ChangeTypeCallbackProcessor;
import cn.leithda.wework.sdk.endpoint.callback.EventCallbackProcessor;
import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 客户联系变更回调
 *
 * @author leithda
 * @since 2022/6/2
 */
@Service
public class ChangeExternalContactEventProcessor implements EventCallbackProcessor {

    private final List<ChangeExternalContactCallbackProcessorBase<? extends BaseCallbackEntity>> processors;

    @Autowired(required = false)
    public ChangeExternalContactEventProcessor(List<ChangeExternalContactCallbackProcessorBase<? extends BaseCallbackEntity>> processors) {
        this.processors = processors;
    }

    @Override
    public List<? extends ChangeTypeCallbackProcessor<? extends BaseCallbackEntity>> getChangeTypeProcessors() {
        return processors;
    }

    @Override
    public String getEvent() {
        return "change_external_contact";
    }
}
