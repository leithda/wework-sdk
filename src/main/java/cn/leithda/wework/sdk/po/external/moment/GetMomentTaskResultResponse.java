package cn.leithda.wework.sdk.po.external.moment;

import cn.leithda.wework.sdk.po.BaseResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 获取任务创建结果
 *
 * @author leithda
 * @since 2022/6/7
 */
public class GetMomentTaskResultResponse extends BaseResponse {
    /**
     * 任务状态，整型，1表示开始创建任务，2表示正在创建任务中，3表示创建任务已完成
     */
    private Integer status;
    /**
     * 操作类型，字节串，此处固定为add_moment_task
     */
    private String type;
    /**
     * 详细的处理结果。当任务完成后此字段有效
     */
    private Result result;

    @JsonProperty("status")
    public Integer getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(Integer value) {
        this.status = value;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String value) {
        this.type = value;
    }

    @JsonProperty("result")
    public Result getResult() {
        return result;
    }

    @JsonProperty("result")
    public void setResult(Result value) {
        this.result = value;
    }

    /**
     * 详细的处理结果。当任务完成后此字段有效
     */
    public static class Result {
        /**
         * 返回码
         */
        private Long errcode;
        /**
         * 对返回码的文本描述内容
         */
        private String errmsg;
        /**
         * 朋友圈id，可通过获取客户朋友圈企业发表的列表接口获取朋友圈企业发表的列表
         */
        private String momentID;
        /**
         * 不合法的执行者列表，包括不存在的id以及不在应用可见范围内的部门或者成员
         */
        private InvalidSenderList invalidSenderList;
        /**
         * 不合法的发表范围，包括不存在的id以及不在应用可见范围内的客户
         */
        private InvalidExternalContactList invalidExternalContactList;

        @JsonProperty("errcode")
        public Long getErrcode() {
            return errcode;
        }

        @JsonProperty("errcode")
        public void setErrcode(Long value) {
            this.errcode = value;
        }

        @JsonProperty("errmsg")
        public String getErrmsg() {
            return errmsg;
        }

        @JsonProperty("errmsg")
        public void setErrmsg(String value) {
            this.errmsg = value;
        }

        @JsonProperty("moment_id")
        public String getMomentID() {
            return momentID;
        }

        @JsonProperty("moment_id")
        public void setMomentID(String value) {
            this.momentID = value;
        }

        @JsonProperty("invalid_sender_list")
        public InvalidSenderList getInvalidSenderList() {
            return invalidSenderList;
        }

        @JsonProperty("invalid_sender_list")
        public void setInvalidSenderList(InvalidSenderList value) {
            this.invalidSenderList = value;
        }

        @JsonProperty("invalid_external_contact_list")
        public InvalidExternalContactList getInvalidExternalContactList() {
            return invalidExternalContactList;
        }

        @JsonProperty("invalid_external_contact_list")
        public void setInvalidExternalContactList(InvalidExternalContactList value) {
            this.invalidExternalContactList = value;
        }
    }

    public static class InvalidExternalContactList {
        private List<String> tagList;

        @JsonProperty("tag_list")
        public List<String> getTagList() {
            return tagList;
        }

        @JsonProperty("tag_list")
        public void setTagList(List<String> value) {
            this.tagList = value;
        }
    }


    public static class InvalidSenderList {
        private List<String> userList;
        private List<Long> departmentList;

        @JsonProperty("user_list")
        public List<String> getUserList() {
            return userList;
        }

        @JsonProperty("user_list")
        public void setUserList(List<String> value) {
            this.userList = value;
        }

        @JsonProperty("department_list")
        public List<Long> getDepartmentList() {
            return departmentList;
        }

        @JsonProperty("department_list")
        public void setDepartmentList(List<Long> value) {
            this.departmentList = value;
        }
    }
}
