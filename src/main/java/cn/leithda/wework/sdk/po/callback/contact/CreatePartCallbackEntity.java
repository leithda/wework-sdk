package cn.leithda.wework.sdk.po.callback.contact;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 新增部门回调实体
 *
 * @author leithda
 * @since 2022/5/29
 */
public class CreatePartCallbackEntity extends BaseCallbackEntity {
    /**
     * 部门Id
     */
    private Long id;
    /**
     * 部门名称;代开发自建应用需要管理员授权才返回
     */
    private String name;
    /**
     * 父部门id
     */
    private Long parentId;
    /**
     * 部门排序
     */
    private Long order;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Long getOrder() {
        return order;
    }

    public void setOrder(Long order) {
        this.order = order;
    }
}
