package cn.leithda.wework.sdk.po.external.contact.transfer;

import java.util.List;

/**
 * 分配在职成员的客户请求
 *
 * @author leithda
 * @since 2022/5/30
 */
public class TransferCustomerRequest {
    /**
     * 原跟进成员的userid
     */
    private String handover_userid;
    /**
     * 接替成员的userid
     */
    private String takeover_userid;
    /**
     * 客户的external_userid列表，每次最多分配100个客户
     */
    private List<String> external_userid;
    /**
     * 转移成功后发给客户的消息，最多200个字符，不填则使用默认文案
     */
    private String transfer_success_msg;

    public String getHandover_userid() {
        return handover_userid;
    }

    public void setHandover_userid(String handover_userid) {
        this.handover_userid = handover_userid;
    }

    public String getTakeover_userid() {
        return takeover_userid;
    }

    public void setTakeover_userid(String takeover_userid) {
        this.takeover_userid = takeover_userid;
    }

    public List<String> getExternal_userid() {
        return external_userid;
    }

    public void setExternal_userid(List<String> external_userid) {
        this.external_userid = external_userid;
    }

    public String getTransfer_success_msg() {
        return transfer_success_msg;
    }

    public void setTransfer_success_msg(String transfer_success_msg) {
        this.transfer_success_msg = transfer_success_msg;
    }
}
