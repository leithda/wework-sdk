package cn.leithda.wework.sdk.po.contact.dept;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 创建部门响应
 *
 * @author leithda
 */
public class CreateDeptResponse extends BaseResponse {
    /**
     * 创建的部门id
     */
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
