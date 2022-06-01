package cn.leithda.wework.sdk.po.external.transfer;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 查询客户接替状态响应
 *
 * @author leithda
 * @since 2022/5/30
 */
public class TransferResultResponse extends BaseResponse {

    /**
     * 转接客户列表
     */
    private List<TransferResult> customer;
    /**
     * 下个分页的起始cursor
     */
    private String next_cursor;

    public static class TransferResult {
        /**
         * 转接客户的外部联系人userid
         */
        private String external_userid;
        /**
         * 接替状态， 1-接替完毕 2-等待接替 3-客户拒绝 4-接替成员客户达到上限 5-无接替记录
         */
        private Integer status;
        /**
         * 接替客户的时间，如果是等待接替状态，则为未来的自动接替时间
         */
        private Integer takeover_time;

        public String getExternal_userid() {
            return external_userid;
        }

        public void setExternal_userid(String external_userid) {
            this.external_userid = external_userid;
        }

        public Integer getStatus() {
            return status;
        }

        public void setStatus(Integer status) {
            this.status = status;
        }

        public Integer getTakeover_time() {
            return takeover_time;
        }

        public void setTakeover_time(Integer takeover_time) {
            this.takeover_time = takeover_time;
        }
    }
}
