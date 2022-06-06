package cn.leithda.wework.sdk.endpoint.callback.external.tag;

import cn.leithda.wework.sdk.po.callback.external.tag.ShuffleTagCallbackEntity;

/**
 * 企业客户标签重排事件
 *
 * @author leithda
 * @see <a href="https://developer.work.weixin.qq.com/document/path/92130#%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E6%A0%87%E7%AD%BE%E9%87%8D%E6%8E%92%E4%BA%8B%E4%BB%B6">企业客户标签重排事件</a>
 * @since 2022/6/6
 */
public interface ShuffleTagCallbackProcessor extends ChangeExternalTagCallbackProcessorBase<ShuffleTagCallbackEntity> {
    @Override
    default String getChangeType() {
        return "shuffle";
    }

    @Override
    default Class<ShuffleTagCallbackEntity> getEntityClass() {
        return ShuffleTagCallbackEntity.class;
    }
}
