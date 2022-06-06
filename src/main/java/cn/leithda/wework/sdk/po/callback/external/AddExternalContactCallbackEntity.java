package cn.leithda.wework.sdk.po.callback.external;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 添加企业客户事件回调实体
 *
 * @author leithda
 * @since 2022/6/2
 */
public class AddExternalContactCallbackEntity extends BaseCallbackEntity {
    /**
     * 企业服务人员的UserID
     */
    private String userId;
    /**
     * 外部联系人的userid，注意不是企业成员的帐号
     */
    private String externalUserID;
    /**
     * 添加此用户的「联系我」方式配置的state参数，可用于识别添加此用户的渠道
     */
    private String state;
    /**
     * 欢迎语code，可用于发送欢迎语
     */
    private String welcomeCode;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getExternalUserID() {
        return externalUserID;
    }

    public void setExternalUserID(String externalUserID) {
        this.externalUserID = externalUserID;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getWelcomeCode() {
        return welcomeCode;
    }

    public void setWelcomeCode(String welcomeCode) {
        this.welcomeCode = welcomeCode;
    }
}
