package cn.leithda.wework.sdk.po.contact.dept;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 子部门ID列表响应
 *
 * @author leithda
 */
public class GetSimpleDeptListResponse extends BaseResponse {
    /**
     * 部门列表数据
     */
    List<WeworkSimpleDepartment> department_id;

    public List<WeworkSimpleDepartment> getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(List<WeworkSimpleDepartment> department_id) {
        this.department_id = department_id;
    }
}
