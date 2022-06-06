package cn.leithda.wework.sdk.endpoint.callback.external.chat;

import cn.leithda.wework.sdk.po.callback.external.chat.UpdateChatCallbackEntity;

/**
 * 客户群变更事件
 *
 * @author leithda
 * @since 2022/6/6
 * @see <a href="https://developer.work.weixin.qq.com/document/path/92130#%E5%AE%A2%E6%88%B7%E7%BE%A4%E5%8F%98%E6%9B%B4%E4%BA%8B%E4%BB%B6">客户群变更事件</a>
 */
public interface UpdateChatCallbackProcessor extends ChangeExternalChatCallbackProcessorBase<UpdateChatCallbackEntity> {

    @Override
    default String getChangeType() {
        return "update";
    }

    @Override
    default Class<UpdateChatCallbackEntity> getEntityClass() {
        return UpdateChatCallbackEntity.class;
    }
}
