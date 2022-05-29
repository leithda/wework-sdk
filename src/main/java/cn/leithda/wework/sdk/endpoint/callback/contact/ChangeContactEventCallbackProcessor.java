package cn.leithda.wework.sdk.endpoint.callback.contact;

import cn.leithda.wework.sdk.endpoint.callback.ChangeTypeCallbackProcessor;
import cn.leithda.wework.sdk.endpoint.callback.EventCallbackProcessor;
import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 通讯录变更回调
 *
 * @author leithda
 * @since 2022/5/28
 */
@Service
public class ChangeContactEventCallbackProcessor implements EventCallbackProcessor {

    @Resource
    List<ChangeContactCallbackProcessor<? extends BaseCallbackEntity>> processors;

    @Override
    public List<? extends ChangeTypeCallbackProcessor<? extends BaseCallbackEntity>> getChangeTypeProcessors() {
        return processors;
    }

    @Override
    public String getEvent() {
        return "change_contact";
    }
}
