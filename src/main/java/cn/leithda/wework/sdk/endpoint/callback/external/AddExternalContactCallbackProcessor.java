package cn.leithda.wework.sdk.endpoint.callback.external;

import cn.leithda.wework.sdk.po.callback.external.AddExternalContactCallbackEntity;

/**
 * 添加企业客户事件
 *
 * @author leithda
 * @see <a href="https://developer.work.weixin.qq.com/document/path/92130#%E6%B7%BB%E5%8A%A0%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E4%BA%8B%E4%BB%B6">添加企业客户事件</a>
 * @since 2022/6/2
 */
public interface AddExternalContactCallbackProcessor extends ChangeExternalContactCallbackProcessorBase<AddExternalContactCallbackEntity> {
    @Override
    default String getChangeType() {
        return "add_external_contact";
    }

    @Override
    default Class<AddExternalContactCallbackEntity> getEntityClass() {
        return AddExternalContactCallbackEntity.class;
    }
}
