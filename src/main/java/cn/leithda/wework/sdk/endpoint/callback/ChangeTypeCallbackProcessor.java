package cn.leithda.wework.sdk.endpoint.callback;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;
import cn.leithda.wework.sdk.utils.XmlUtils;

import java.util.Objects;

/**
 * 变更类型回调处理
 */
public interface ChangeTypeCallbackProcessor<T extends BaseCallbackEntity> {

    /**
     * 获取变更类型
     *
     * @return 变更类型
     */
    String getChangeType();

    /**
     * 获取实体类型
     * @return 实体类型
     */
    Class<T> getEntityClass();

    /**
     * 执行处理实际流程
     * @param entity 实体
     */
    void doExecute(T entity);

    /**
     * 执行处理
     * @param baseEntity 基础回调实体
     * @param msg 消息体
     */
    default void execute(BaseCallbackEntity baseEntity, String msg) {
        if (!Objects.equals(baseEntity.getChangeType(), getChangeType())) {
            return;
        }
        T entity = XmlUtils.xml2Entity(msg, getEntityClass());
        doExecute(entity);
    }
}
