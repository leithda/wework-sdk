package cn.leithda.wework.sdk.po.callback.external;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 客户接替失败事件实体
 *
 * @author leithda
 * @since 2022/6/2
 */
public class TransferFailCallbackEntity extends BaseCallbackEntity {
    /**
     * 接替失败的原因, customer_refused-客户拒绝， customer_limit_exceed-接替成员的客户数达到上限
     */
    private String failReason;
    /**
     * 企业服务人员的UserID
     */
    private String userId;
    /**
     * 外部联系人的userid，注意不是企业成员的帐号
     */
    private String externalUserId;
}
