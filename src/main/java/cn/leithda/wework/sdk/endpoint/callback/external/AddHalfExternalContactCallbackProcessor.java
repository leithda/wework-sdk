package cn.leithda.wework.sdk.endpoint.callback.external;

import cn.leithda.wework.sdk.po.callback.external.AddHalfExternalContactCallbackEntity;

/**
 * 外部联系人免验证添加成员事件
 *
 * @author leithda
 * @see <a href="https://developer.work.weixin.qq.com/document/path/92130#%E5%A4%96%E9%83%A8%E8%81%94%E7%B3%BB%E4%BA%BA%E5%85%8D%E9%AA%8C%E8%AF%81%E6%B7%BB%E5%8A%A0%E6%88%90%E5%91%98%E4%BA%8B%E4%BB%B6">外部联系人免验证添加成员事件</a>
 * @since 2022/6/2
 */
public interface AddHalfExternalContactCallbackProcessor extends ChangeExternalContactCallbackProcessorBase<AddHalfExternalContactCallbackEntity> {

    @Override
    default String getChangeType() {
        return "add_half_external_contact";
    }

    @Override
    default Class<AddHalfExternalContactCallbackEntity> getEntityClass() {
        return AddHalfExternalContactCallbackEntity.class;
    }
}
