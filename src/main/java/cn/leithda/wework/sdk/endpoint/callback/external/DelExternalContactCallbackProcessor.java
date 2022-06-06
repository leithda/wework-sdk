package cn.leithda.wework.sdk.endpoint.callback.external;

import cn.leithda.wework.sdk.po.callback.external.DelExternalContactCallbackEntity;

/**
 * 删除企业客户事件
 *
 * @author leithda
 * @see <a href="https://developer.work.weixin.qq.com/document/path/92130#%E5%88%A0%E9%99%A4%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E4%BA%8B%E4%BB%B6">删除企业客户事件</a>
 * @since 2022/6/2
 */
public interface DelExternalContactCallbackProcessor extends ChangeExternalContactCallbackProcessorBase<DelExternalContactCallbackEntity> {
    @Override
    default String getChangeType() {
        return "del_external_contact";
    }

    @Override
    default Class<DelExternalContactCallbackEntity> getEntityClass() {
        return DelExternalContactCallbackEntity.class;
    }
}
