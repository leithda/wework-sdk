package cn.leithda.wework.sdk.endpoint.callback.external.chat;

import cn.leithda.wework.sdk.po.callback.external.chat.CreateChatCallbackEntity;

/**
 * 客户群创建事件回调
 *
 * @author leithda
 * @since 2022/6/6
 * @see <a href="https://developer.work.weixin.qq.com/document/path/92130#%E5%AE%A2%E6%88%B7%E7%BE%A4%E5%88%9B%E5%BB%BA%E4%BA%8B%E4%BB%B6">客户群创建事件</a>
 */
public interface CreateChatCallbackProcessor extends ChangeExternalChatCallbackProcessorBase<CreateChatCallbackEntity> {
    @Override
    default String getChangeType() {
        return "create";
    }

    @Override
    default Class<CreateChatCallbackEntity> getEntityClass() {
        return CreateChatCallbackEntity.class;
    }
}
