package cn.leithda.wework.sdk.endpoint.callback.job;

import cn.leithda.wework.sdk.endpoint.callback.ChangeTypeCallbackProcessor;
import cn.leithda.wework.sdk.endpoint.callback.EventCallbackProcessor;
import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class BatchJobEventCallbackProcessor implements EventCallbackProcessor {

    @Resource
    List<BatchJobCallbackProcessorBase<? extends BaseCallbackEntity>> processors;

    @Override
    public List<? extends ChangeTypeCallbackProcessor<? extends BaseCallbackEntity>> getChangeTypeProcessors() {
        return processors;
    }

    @Override
    public String getEvent() {
        return "batch_job_result";
    }

}
