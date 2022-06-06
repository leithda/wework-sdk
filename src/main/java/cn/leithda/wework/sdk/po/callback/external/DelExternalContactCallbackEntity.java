package cn.leithda.wework.sdk.po.callback.external;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 删除企业客户事件回调实体
 *
 * @author leithda
 * @since 2022/6/2
 */
public class DelExternalContactCallbackEntity extends BaseCallbackEntity {
    /**
     * 企业服务人员的UserID
     */
    private String userId;
    /**
     * 外部联系人的userid，注意不是企业成员的帐号
     */
    private String externalUserId;
    /**
     * 删除客户的操作来源，DELETE_BY_TRANSFER表示此客户是因在职继承自动被转接成员删除
     */
    private String source;
}
