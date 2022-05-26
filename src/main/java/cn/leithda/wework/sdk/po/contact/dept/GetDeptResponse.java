package cn.leithda.wework.sdk.po.contact.dept;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 部门详情响应
 *
 * @author leithda
 */
public class GetDeptResponse extends BaseResponse {
    /**
     * 部门信息
     */
    WeworkDepartment department;

    public WeworkDepartment getDepartment() {
        return department;
    }

    public void setDepartment(WeworkDepartment department) {
        this.department = department;
    }
}
