package cn.leithda.wework.sdk.po.callback.job;

/**
 * 异步批量任务
 *
 * @author leithda
 * @since 2022/5/29
 */
public class BatchJob {
    /**
     * 异步任务id，最大长度为64字符
     */
    private String jobId;
    /**
     * 操作类型，字符串，目前分别有：sync_user(增量更新成员)、 replace_user(全量覆盖成员）、invite_user(邀请成员关注）、replace_party(全量覆盖部门)
     */
    private String jobType;
    /**
     * 返回码
     */
    private Integer errCode;
    /**
     * 	对返回码的文本描述内容
     */
    private String errMsg;
}
