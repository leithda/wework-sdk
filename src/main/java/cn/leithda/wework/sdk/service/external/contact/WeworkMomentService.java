package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.external.moment.AddMomentTaskRequest;
import cn.leithda.wework.sdk.po.external.moment.AddMomentTaskResponse;
import cn.leithda.wework.sdk.po.external.moment.GetMomentTaskResultResponse;
import cn.leithda.wework.sdk.service.BaseWeworkService;

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

    @Override
    protected int getSecretType() {
        return EXTERNAL;
    }
}
