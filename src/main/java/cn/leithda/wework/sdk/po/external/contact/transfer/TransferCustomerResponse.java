package cn.leithda.wework.sdk.po.external.contact.transfer;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 分配在职成员的客户响应
 *
 * @author leithda
 * @since 2022/5/30
 */
public class TransferCustomerResponse extends BaseResponse {

    /**
     *
     */
    private List<TransferCustomer> customer;

    public List<TransferCustomer> getCustomer() {
        return customer;
    }

    public void setCustomer(List<TransferCustomer> customer) {
        this.customer = customer;
    }

    public static class TransferCustomer{
        /**
         * 客户的external_userid
         */
        private String external_userid;
        /**
         * 对此客户进行分配的结果, 具体可参考全局错误码, 0表示成功发起接替,待24小时后自动接替,并不代表最终接替成功
         */
        private Integer errcode;

        public String getExternal_userid() {
            return external_userid;
        }

        public void setExternal_userid(String external_userid) {
            this.external_userid = external_userid;
        }

        public Integer getErrcode() {
            return errcode;
        }

        public void setErrcode(Integer errcode) {
            this.errcode = errcode;
        }
    }
}
