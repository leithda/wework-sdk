package cn.leithda.wework.sdk.po.external.moment;

import cn.leithda.wework.sdk.po.BaseResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 获取客户朋友圈企业发表的列表响应
 *
 * @author leithda
 * @since 2022/6/8
 */
public class GetMomentTaskResponse extends BaseResponse {
    /**
     * 分页游标，再下次请求时填写以获取之后分页的记录，如果已经没有更多的数据则返回空
     */
    private String nextCursor;
    /**
     * 发表任务列表
     */
    private List<Task> taskList;

    @JsonProperty("next_cursor")
    public String getNextCursor() { return nextCursor; }
    @JsonProperty("next_cursor")
    public void setNextCursor(String value) { this.nextCursor = value; }

    @JsonProperty("task_list")
    public List<Task> getTaskList() { return taskList; }
    @JsonProperty("task_list")
    public void setTaskList(List<Task> value) { this.taskList = value; }

    /**
     * 发表任务
     */
    public static class Task {
        /**
         * 发表成员用户userid
         */
        private String userid;
        /**
         * 成员发表状态。0:未发表 1：已发表
         */
        private long publishStatus;

        @JsonProperty("userid")
        public String getUserid() { return userid; }
        @JsonProperty("userid")
        public void setUserid(String value) { this.userid = value; }

        @JsonProperty("publish_status")
        public long getPublishStatus() { return publishStatus; }
        @JsonProperty("publish_status")
        public void setPublishStatus(long value) { this.publishStatus = value; }
    }
}
