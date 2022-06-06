package cn.leithda.wework.sdk.po.callback.external;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 删除跟进成员事件实体
 *
 * @author leithda
 * @since 2022/6/2
 */
public class DelFollowUserCallbackEntity extends BaseCallbackEntity {
    /**
     * 企业服务人员的UserID
     */
    private String userId;
    /**
     * 外部联系人的userid，注意不是企业成员的帐号
     */
    private String externalUserId;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExternalUserId() {
        return externalUserId;
    }

    public void setExternalUserId(String externalUserId) {
        this.externalUserId = externalUserId;
    }
}
