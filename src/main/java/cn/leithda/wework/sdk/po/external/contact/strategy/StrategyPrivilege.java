package cn.leithda.wework.sdk.po.external.contact.strategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 规则组权限配置
 *
 * @author leithda
 * @since 2022/5/26
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class StrategyPrivilege {
    /**
     * 查看客户列表，基础权限，不可取消
     */
    private Boolean view_customer_list;
    /**
     * 查看客户统计数据，基础权限，不可取消
     */
    private Boolean view_customer_data;
    /**
     * 查看群聊列表，基础权限，不可取消
     */
    private Boolean view_room_list;
    /**
     * 可使用联系我，基础权限，不可取消
     */
    private Boolean contact_me;
    /**
     * 可加入群聊，基础权限，不可取消
     */
    private Boolean join_room;
    /**
     * 允许分享客户给其他成员，默认为true
     */
    private Boolean share_customer;
    /**
     * 允许分配离职成员客户，默认为true
     */
    private Boolean oper_resign_customer;
    /**
     * 允许分配离职成员客户群，默认为true
     */
    private Boolean oper_resign_group;
    /**
     * 允许给企业客户发送消息，默认为true
     */
    private Boolean send_customer_msg;
    /**
     * 允许配置欢迎语，默认为true
     */
    private Boolean edit_welcome_msg;
    /**
     * 允许查看成员联系客户统计
     */
    private Boolean view_behavior_data;
    /**
     * 允许查看群聊数据统计，默认为true
     */
    private Boolean view_room_data;
    /**
     * 允许发送消息到企业的客户群，默认为true
     */
    private Boolean send_group_msg;
    /**
     * 允许对企业客户群进行去重，默认为true
     */
    private Boolean room_deduplication;
    /**
     * 配置快捷回复，默认为true
     */
    private Boolean rapid_reply;
    /**
     * 转接在职成员的客户，默认为true
     */
    private Boolean onjob_customer_transfer;
    /**
     * 编辑企业成员防骚扰规则，默认为true
     */
    private Boolean edit_anti_spam_rule;
    /**
     * 导出客户列表，默认为true
     */
    private Boolean export_customer_list;
    /**
     * 导出成员客户统计，默认为true
     */
    private Boolean export_customer_data;
    /**
     * 导出客户群列表，默认为true
     */
    private Boolean export_customer_group_list;
    /**
     * 配置企业客户标签，默认为true
     */
    private Boolean manage_customer_tag;

    public Boolean getView_customer_list() {
        return view_customer_list;
    }

    public void setView_customer_list(Boolean view_customer_list) {
        this.view_customer_list = view_customer_list;
    }

    public Boolean getView_customer_data() {
        return view_customer_data;
    }

    public void setView_customer_data(Boolean view_customer_data) {
        this.view_customer_data = view_customer_data;
    }

    public Boolean getView_room_list() {
        return view_room_list;
    }

    public void setView_room_list(Boolean view_room_list) {
        this.view_room_list = view_room_list;
    }

    public Boolean getContact_me() {
        return contact_me;
    }

    public void setContact_me(Boolean contact_me) {
        this.contact_me = contact_me;
    }

    public Boolean getJoin_room() {
        return join_room;
    }

    public void setJoin_room(Boolean join_room) {
        this.join_room = join_room;
    }

    public Boolean getShare_customer() {
        return share_customer;
    }

    public void setShare_customer(Boolean share_customer) {
        this.share_customer = share_customer;
    }

    public Boolean getOper_resign_customer() {
        return oper_resign_customer;
    }

    public void setOper_resign_customer(Boolean oper_resign_customer) {
        this.oper_resign_customer = oper_resign_customer;
    }

    public Boolean getOper_resign_group() {
        return oper_resign_group;
    }

    public void setOper_resign_group(Boolean oper_resign_group) {
        this.oper_resign_group = oper_resign_group;
    }

    public Boolean getSend_customer_msg() {
        return send_customer_msg;
    }

    public void setSend_customer_msg(Boolean send_customer_msg) {
        this.send_customer_msg = send_customer_msg;
    }

    public Boolean getEdit_welcome_msg() {
        return edit_welcome_msg;
    }

    public void setEdit_welcome_msg(Boolean edit_welcome_msg) {
        this.edit_welcome_msg = edit_welcome_msg;
    }

    public Boolean getView_behavior_data() {
        return view_behavior_data;
    }

    public void setView_behavior_data(Boolean view_behavior_data) {
        this.view_behavior_data = view_behavior_data;
    }

    public Boolean getView_room_data() {
        return view_room_data;
    }

    public void setView_room_data(Boolean view_room_data) {
        this.view_room_data = view_room_data;
    }

    public Boolean getSend_group_msg() {
        return send_group_msg;
    }

    public void setSend_group_msg(Boolean send_group_msg) {
        this.send_group_msg = send_group_msg;
    }

    public Boolean getRoom_deduplication() {
        return room_deduplication;
    }

    public void setRoom_deduplication(Boolean room_deduplication) {
        this.room_deduplication = room_deduplication;
    }

    public Boolean getRapid_reply() {
        return rapid_reply;
    }

    public void setRapid_reply(Boolean rapid_reply) {
        this.rapid_reply = rapid_reply;
    }

    public Boolean getOnjob_customer_transfer() {
        return onjob_customer_transfer;
    }

    public void setOnjob_customer_transfer(Boolean onjob_customer_transfer) {
        this.onjob_customer_transfer = onjob_customer_transfer;
    }

    public Boolean getEdit_anti_spam_rule() {
        return edit_anti_spam_rule;
    }

    public void setEdit_anti_spam_rule(Boolean edit_anti_spam_rule) {
        this.edit_anti_spam_rule = edit_anti_spam_rule;
    }

    public Boolean getExport_customer_list() {
        return export_customer_list;
    }

    public void setExport_customer_list(Boolean export_customer_list) {
        this.export_customer_list = export_customer_list;
    }

    public Boolean getExport_customer_data() {
        return export_customer_data;
    }

    public void setExport_customer_data(Boolean export_customer_data) {
        this.export_customer_data = export_customer_data;
    }

    public Boolean getExport_customer_group_list() {
        return export_customer_group_list;
    }

    public void setExport_customer_group_list(Boolean export_customer_group_list) {
        this.export_customer_group_list = export_customer_group_list;
    }

    public Boolean getManage_customer_tag() {
        return manage_customer_tag;
    }

    public void setManage_customer_tag(Boolean manage_customer_tag) {
        this.manage_customer_tag = manage_customer_tag;
    }
}
