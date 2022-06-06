package cn.leithda.wework.sdk.endpoint.callback.external.tag;

import cn.leithda.wework.sdk.endpoint.callback.ChangeTypeCallbackProcessor;
import cn.leithda.wework.sdk.endpoint.callback.EventCallbackProcessor;
import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 客户联系标签变更
 *
 * @author leithda
 * @since 2022/6/6
 */
@Service
public class ChangeExternalTagEventProcessor implements EventCallbackProcessor {

    private final List<ChangeExternalTagCallbackProcessorBase<? extends BaseCallbackEntity>> processors;

    @Autowired(required = false)
    public ChangeExternalTagEventProcessor(List<ChangeExternalTagCallbackProcessorBase<? extends BaseCallbackEntity>> processors) {
        this.processors = processors;
    }

    @Override
    public List<? extends ChangeTypeCallbackProcessor<? extends BaseCallbackEntity>> getChangeTypeProcessors() {
        return processors;
    }

    @Override
    public String getEvent() {
        return "change_external_tag";
    }
}
