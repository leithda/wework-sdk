package cn.leithda.wework.sdk.po.external.moment;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 创建发表任务响应
 *
 * @author leithda
 * @since 2022/6/7
 */
public class AddMomentTaskResponse extends BaseResponse {
    /**
     * 异步任务id，最大长度为64字节，24小时有效；可使用获取发表朋友圈任务结果查询任务状态
     */
    private String jobid;

    public String getJobid() {
        return jobid;
    }

    public void setJobid(String jobid) {
        this.jobid = jobid;
    }
}
