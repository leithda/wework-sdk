package cn.leithda.wework.sdk.endpoint.callback.external.tag;

import cn.leithda.wework.sdk.po.callback.external.tag.CreateTagCallbackEntity;

/**
 * 企业客户标签创建事件
 *
 * @author leithda
 * @since 2022/6/6
 * @see <a href="https://developer.work.weixin.qq.com/document/path/92130#%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E6%A0%87%E7%AD%BE%E5%88%9B%E5%BB%BA%E4%BA%8B%E4%BB%B6">企业客户标签创建事件</a>
 */
public interface CreateTagCallbackProcessor extends ChangeExternalTagCallbackProcessorBase<CreateTagCallbackEntity> {

    @Override
    default String getChangeType() {
        return "create";
    }

    @Override
    default Class<CreateTagCallbackEntity> getEntityClass() {
        return CreateTagCallbackEntity.class;
    }
}
