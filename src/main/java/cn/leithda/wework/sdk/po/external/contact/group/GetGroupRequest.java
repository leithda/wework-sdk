package cn.leithda.wework.sdk.po.external.contact.group;

/**
 * 获取客户群详情请求
 *
 * @author leithda
 * @since 2022/5/31
 */
public class GetGroupRequest {
    /**
     * 客户群ID
     */
    private String chat_id;
    /**
     * 是否需要返回群成员的名字group_chat.member_list.name。0-不返回；1-返回。默认不返回
     */
    private Integer need_name;

    public String getChat_id() {
        return chat_id;
    }

    public void setChat_id(String chat_id) {
        this.chat_id = chat_id;
    }

    public Integer getNeed_name() {
        return need_name;
    }

    public void setNeed_name(Integer need_name) {
        this.need_name = need_name;
    }
}
