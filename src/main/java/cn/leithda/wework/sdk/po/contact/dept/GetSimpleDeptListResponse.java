package cn.leithda.wework.sdk.po.contact.dept;

import cn.leithda.wework.sdk.po.BaseResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * 子部门ID列表响应
 *
 * @author leithda
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class GetSimpleDeptListResponse extends BaseResponse {
    /**
     * 部门列表数据
     */
    List<SimpleDepartment> department_id;

    public List<SimpleDepartment> getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(List<SimpleDepartment> department_id) {
        this.department_id = department_id;
    }
}
