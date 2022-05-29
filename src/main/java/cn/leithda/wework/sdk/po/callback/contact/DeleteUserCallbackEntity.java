package cn.leithda.wework.sdk.po.callback.contact;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 删除成员回调实体
 *
 * @author leithda
 * @since 2022/5/29
 */
public class DeleteUserCallbackEntity extends BaseCallbackEntity {
    /**
     * 变更信息的成员UserID
     */
    private String userID;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }
}
