package cn.leithda.wework.sdk.po.callback.external.chat;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 客户群创建事件回调实体
 *
 * @author leithda
 * @since 2022/6/6
 */
public class CreateChatCallbackEntity extends BaseCallbackEntity {
    /**
     * 群ID
     */
    private String chatId;

    public String getChatId() {
        return chatId;
    }

    public void setChatId(String chatId) {
        this.chatId = chatId;
    }
}
