package cn.leithda.wework.sdk.endpoint.callback.external.chat;

import cn.leithda.wework.sdk.po.callback.external.chat.DismissChatCallbackEntity;

/**
 * 客户群解散事件
 *
 * @author leithda
 * @see <a href="https://developer.work.weixin.qq.com/document/path/92130#%E5%AE%A2%E6%88%B7%E7%BE%A4%E8%A7%A3%E6%95%A3%E4%BA%8B%E4%BB%B6">客户群解散事件</a>
 * @since 2022/6/6
 */
public interface DismissChatCallbackProcessor extends ChangeExternalChatCallbackProcessorBase<DismissChatCallbackEntity> {
    @Override
    default String getChangeType() {
        return "dismiss";
    }

    @Override
    default Class<DismissChatCallbackEntity> getEntityClass() {
        return DismissChatCallbackEntity.class;
    }
}
