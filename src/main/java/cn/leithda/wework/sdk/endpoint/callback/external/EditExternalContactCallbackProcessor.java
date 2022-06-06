package cn.leithda.wework.sdk.endpoint.callback.external;

import cn.leithda.wework.sdk.po.callback.external.EditExternalContactCallbackEntity;


/**
 * 编辑企业客户事件
 *
 * @author leithda
 * @see <a href="https://developer.work.weixin.qq.com/document/path/92130#%E7%BC%96%E8%BE%91%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E4%BA%8B%E4%BB%B6">编辑企业客户事件</a>
 * @since 2022/6/2
 */
public interface EditExternalContactCallbackProcessor extends ChangeExternalContactCallbackProcessorBase<EditExternalContactCallbackEntity> {
    @Override
    default String getChangeType() {
        return "edit_external_contact";
    }

    @Override
    default Class<EditExternalContactCallbackEntity> getEntityClass() {
        return EditExternalContactCallbackEntity.class;
    }
}
