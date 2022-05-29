package cn.leithda.wework.sdk.service.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.po.contact.dept.*;
import cn.leithda.wework.sdk.service.contact.WeworkAddressListService;
import org.springframework.stereotype.Service;

/**
 * 部门服务
 *
 * @author leithda
 */
@Service
public class WeworkDepartmentService extends WeworkAddressListService {
    /**
     * 获取部门列表
     */
    private static final String GET_DEPT_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/department/list?access_token=%s&id=%s";
    /**
     * 获取子部门ID列表
     */
    private static final String GET_SIMPLE_DEPT_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/department/simplelist?access_token=%s&id=%s";
    /**
     * 获取部门详情
     */
    private static final String GET_DEPT_URL = "https://qyapi.weixin.qq.com/cgi-bin/department/get?access_token=%s&id=%s";
    /**
     * 创建部门
     */
    public static final String CREATE_DEPT_URL = "https://qyapi.weixin.qq.com/cgi-bin/department/create?access_token=%s";
    /**
     * 更新部门
     */
    public static final String UPDATE_DEPT_URL = "https://qyapi.weixin.qq.com/cgi-bin/department/update?access_token=%s";
    /**
     * 删除部门
     */
    public static final String DELETE_DEPT_URL = "https://qyapi.weixin.qq.com/cgi-bin/department/delete?access_token=%s&id=%s";

    /**
     * 获取部门列表
     *
     * @param corpId 企业ID
     * @param id     部门ID
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90208">获取部门列表</a>
     */
    public GetDeptListResponse getDeptList(String corpId, Long id) {
        return executeGet(CONTACT, corpId, null, false, GetDeptListResponse.class, GET_DEPT_LIST_URL, id);
    }

    /**
     * 获取子部门ID列表
     *
     * @param corpId 企业ID
     * @param id     部门ID
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/95350">获取子部门ID列表</a>
     */
    public GetSimpleDeptListResponse getSimpleDeptList(String corpId, Long id) {
        return executeGet(CONTACT, corpId, null, false, GetSimpleDeptListResponse.class, GET_SIMPLE_DEPT_LIST_URL, id);
    }

    /**
     * 获取部门详情
     *
     * @param corpId 企业ID
     * @param id     部门ID
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/95351">获取部门详情</a>
     */
    public GetDeptResponse getDept(String corpId, Long id) {
        return executeGet(CONTACT, corpId, null, false, GetDeptResponse.class, GET_DEPT_URL, id);
    }

    /**
     * 创建部门
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90205">创建部门</a>
     */
    public CreateDeptResponse createDept(String corpId, CreateDeptRequest request) {
        return executePost(CONTACT, corpId, null, false, CreateDeptResponse.class, CREATE_DEPT_URL, request);
    }

    /**
     * 更新部门
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90206">更新部门</a>
     */
    public BaseResponse updateDept(String corpId, UpdateDeptRequest request) {
        return executePost(CONTACT, corpId, null, false, BaseResponse.class, UPDATE_DEPT_URL, request);
    }

    /**
     * 删除部门
     *
     * @param corpId 企业ID
     * @param id     部门ID
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90207">删除部门</a>
     */
    public BaseResponse deleteDept(String corpId, Long id) {
        return executeGet(CONTACT, corpId, null, false, BaseResponse.class, DELETE_DEPT_URL, id);
    }

}
