package cn.leithda.wework.sdk.endpoint.callback.external;

import cn.leithda.wework.sdk.po.callback.external.TransferFailCallbackEntity;

/**
 * 客户接替失败事件
 *
 * @author leithda
 * @see <a href="https://developer.work.weixin.qq.com/document/path/92130#%E5%AE%A2%E6%88%B7%E6%8E%A5%E6%9B%BF%E5%A4%B1%E8%B4%A5%E4%BA%8B%E4%BB%B6">客户接替失败事件</a>
 * @since 2022/6/2
 */
public interface TransferFailCallbackProcessor extends ChangeExternalContactCallbackProcessorBase<TransferFailCallbackEntity> {
    @Override
    default String getChangeType() {
        return "transfer_fail";
    }

    @Override
    default Class<TransferFailCallbackEntity> getEntityClass() {
        return TransferFailCallbackEntity.class;
    }
}
