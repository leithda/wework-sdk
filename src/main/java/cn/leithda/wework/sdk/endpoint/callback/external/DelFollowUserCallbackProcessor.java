package cn.leithda.wework.sdk.endpoint.callback.external;

import cn.leithda.wework.sdk.po.callback.external.DelFollowUserCallbackEntity;

/**
 * 删除跟进成员事件
 *
 * @author leithda
 * @see <a href="https://developer.work.weixin.qq.com/document/path/92130#%E5%88%A0%E9%99%A4%E8%B7%9F%E8%BF%9B%E6%88%90%E5%91%98%E4%BA%8B%E4%BB%B6">删除跟进成员事件</a>
 * @since 2022/6/2
 */
public interface DelFollowUserCallbackProcessor extends ChangeExternalContactCallbackProcessorBase<DelFollowUserCallbackEntity> {
    @Override
    default String getChangeType() {
        return "del_follow_user";
    }

    @Override
    default Class<DelFollowUserCallbackEntity> getEntityClass() {
        return DelFollowUserCallbackEntity.class;
    }
}
