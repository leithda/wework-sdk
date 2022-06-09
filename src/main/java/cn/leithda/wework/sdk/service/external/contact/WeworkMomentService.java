package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.external.moment.*;
import cn.leithda.wework.sdk.service.BaseWeworkService;
import cn.leithda.wework.sdk.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 客户朋友圈
 *
 * @author leithda
 * @see <a href="https://developer.work.weixin.qq.com/document/path/93506">客户朋友圈</a>
 * @since 2022/6/7
 */
public class WeworkMomentService extends BaseWeworkService {

    // region 企业发表内容到客户的朋友圈
    /**
     * 创建发表任务
     */
    public static final String ADD_MOMENT_TASK_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/add_moment_task?access_token=%s";
    /**
     * 获取任务创建结果
     */
    public static final String GET_MOMENT_TASK_RESULT = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_moment_task_result?access_token=%s&jobid=%s";
    // endregion

    // region 获取客户朋友圈全部的发表记录
    /**
     * 获取企业全部的发表列表
     */
    public static final String GET_MOMENT_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_moment_list?access_token=%s";
    /**
     * 获取客户朋友圈企业发表的列表
     */
    public static final String GET_MOMENT_TASK_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_moment_task?access_token=%s";
    /**
     * 获取客户朋友圈发表时选择的可见范围
     */
    public static final String GET_MOMENT_CUSTOMER_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_moment_customer_list?access_token=%s";
    /**
     * 获取客户朋友圈发表后的可见客户列表
     */
    public static final String GET_MOMENT_SEND_RESULT_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_moment_send_result?access_token=%s";
    /**
     * 获取客户朋友圈的互动数据
     */
    public static final String GET_MOMENT_COMMENTS_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_moment_comments?access_token=%s";

    // endregion


    // region 企业发表内容到客户的朋友圈

    /**
     * 创建发表任务
     *
     * @param corpId  企业ID
     * @param agentId 应用ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/95094">创建发表任务</a>
     */
    public AddMomentTaskResponse addMomentTask(String corpId, String agentId, AddMomentTaskRequest request) {
        return executePost(corpId, agentId, AddMomentTaskResponse.class, ADD_MOMENT_TASK_URL, request);
    }

    /**
     * 获取任务创建结果
     *
     * @param corpId  企业ID
     * @param agentId 应用ID
     * @param jobId   异步任务id，最大长度为64字节，由创建发表内容到客户朋友圈任务接口获取
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/95094#%E8%8E%B7%E5%8F%96%E4%BB%BB%E5%8A%A1%E5%88%9B%E5%BB%BA%E7%BB%93%E6%9E%9C">获取任务创建结果</a>
     */
    public GetMomentTaskResultResponse getMomentTaskResult(String corpId, String agentId, String jobId) {
        return executeGet(corpId, agentId, GetMomentTaskResultResponse.class, GET_MOMENT_TASK_RESULT, agentId);
    }
    // endregion

    // region 获取客户朋友圈全部的发表记录

    /**
     * 获取企业全部的发表列表
     *
     * @param corpId  企业ID
     * @param agentId 应用ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/93333#%E8%8E%B7%E5%8F%96%E4%BC%81%E4%B8%9A%E5%85%A8%E9%83%A8%E7%9A%84%E5%8F%91%E8%A1%A8%E5%88%97%E8%A1%A8">获取企业全部的发表列表</a>
     */
    public GetMomentListResponse getMomentList(String corpId, String agentId, GetMomentListRequest request) {
        String cursor = "";
        GetMomentListResponse response = null;
        List<GetMomentListResponse.Moment> momentList = new ArrayList<>();
        do {
            request.setCursor(cursor);
            GetMomentListResponse getMomentListResponse = executePost(corpId, agentId, GetMomentListResponse.class, GET_MOMENT_LIST_URL, request);
            response = Objects.isNull(response) ? getMomentListResponse : response;
            momentList.addAll(getMomentListResponse.getMomentList());
            cursor = getMomentListResponse.getNextCursor();
        } while (StringUtils.isNotEmpty(cursor));
        response.setMomentList(momentList);
        return response;
    }

    /**
     * 获取客户朋友圈企业发表的列表
     *
     * @param corpId  企业ID
     * @param agentId 应用ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/93333#%E8%8E%B7%E5%8F%96%E5%AE%A2%E6%88%B7%E6%9C%8B%E5%8F%8B%E5%9C%88%E4%BC%81%E4%B8%9A%E5%8F%91%E8%A1%A8%E7%9A%84%E5%88%97%E8%A1%A8">获取客户朋友圈企业发表的列表</a>
     */
    public GetMomentTaskResponse getMomentTaskResponse(String corpId, String agentId, GetMomentTaskRequest request) {
        String cursor = "";
        GetMomentTaskResponse response = null;
        List<GetMomentTaskResponse.Task> taskList = new ArrayList<>();
        do {
            request.setCursor(cursor);
            GetMomentTaskResponse getMomentTaskResponse = executePost(corpId, agentId, GetMomentTaskResponse.class, GET_MOMENT_TASK_URL, request);
            response = Objects.isNull(response) ? getMomentTaskResponse : response;
            taskList.addAll(getMomentTaskResponse.getTaskList());
            cursor = getMomentTaskResponse.getNextCursor();
        } while (StringUtils.isNotEmpty(cursor));
        response.setTaskList(taskList);
        return response;
    }


    // endregion


    @Override
    protected int getSecretType() {
        return EXTERNAL;
    }
}
