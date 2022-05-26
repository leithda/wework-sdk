package cn.leithda.wework.sdk.po.contact.dept;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 部门列表响应
 *
 * @author leithda
 */
public class GetDeptListResponse extends BaseResponse {
    List<WeworkDepartment> department;

    public List<WeworkDepartment> getDepartment() {
        return department;
    }

    public void setDepartment(List<WeworkDepartment> department) {
        this.department = department;
    }
}
