package cn.leithda.wework.sdk.po.callback;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 基础回调实体
 *
 * @author leithda
 * @since 2022/5/28
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class BaseCallbackEntity {
    /**
     * 企业ID
     */
    private String ToUserName;
    /**
     * 回调消息来源
     */
    private String FromUserName;
    /**
     * 消息创建时间 （整型）
     */
    private Integer CreateTime;
    /**
     * 消息的类型
     */
    private String MsgType;
    /**
     * 事件的类型
     */
    private String Event;
    /**
     * 变更类型
     */
    private String ChangeType;

    public String getToUserName() {
        return ToUserName;
    }

    public void setToUserName(String toUserName) {
        ToUserName = toUserName;
    }

    public String getFromUserName() {
        return FromUserName;
    }

    public void setFromUserName(String fromUserName) {
        FromUserName = fromUserName;
    }

    public Integer getCreateTime() {
        return CreateTime;
    }

    public void setCreateTime(Integer createTime) {
        CreateTime = createTime;
    }

    public String getMsgType() {
        return MsgType;
    }

    public void setMsgType(String msgType) {
        MsgType = msgType;
    }

    public String getEvent() {
        return Event;
    }

    public void setEvent(String event) {
        Event = event;
    }

    public String getChangeType() {
        return ChangeType;
    }

    public void setChangeType(String changeType) {
        ChangeType = changeType;
    }
}
