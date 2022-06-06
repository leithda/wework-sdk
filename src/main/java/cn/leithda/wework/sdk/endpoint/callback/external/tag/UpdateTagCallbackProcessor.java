package cn.leithda.wework.sdk.endpoint.callback.external.tag;

import cn.leithda.wework.sdk.po.callback.external.tag.UpdateTagCallbackEntity;

/**
 * 企业客户标签变更事件
 *
 * @author leithda
 * @see <a href="https://developer.work.weixin.qq.com/document/path/92130#%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E6%A0%87%E7%AD%BE%E5%8F%98%E6%9B%B4%E4%BA%8B%E4%BB%B6">企业客户标签变更事件</a>
 * @since 2022/6/6
 */
public interface UpdateTagCallbackProcessor extends ChangeExternalTagCallbackProcessorBase<UpdateTagCallbackEntity> {
    @Override
    default String getChangeType() {
        return "update";
    }

    @Override
    default Class<UpdateTagCallbackEntity> getEntityClass() {
        return UpdateTagCallbackEntity.class;
    }
}
