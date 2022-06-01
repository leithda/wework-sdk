package cn.leithda.wework.sdk.po.external.joinway;

import java.util.List;

/**
 * 客户群「加入群聊」方式
 *
 * @author leithda
 * @since 2022/6/1
 */
public class JoinWay {
    /**
     * 	新增联系方式的配置id
     */
    private String config_id;
    /**
     * 场景。
     * 1 - 群的小程序插件
     * 2 - 群的二维码插件
     */
    private Integer scene;
    /**
     * 联系方式的备注信息，用于助记，超过30个字符将被截断
     */
    private String remark;
    /**
     * 当群满了后，是否自动新建群。0-否；1-是。 默认为1
     */
    private Integer auto_create_room;
    /**
     * 自动建群的群名前缀，当auto_create_room为1时有效。最长40个utf8字符
     */
    private String room_base_name;
    /**
     * 自动建群的群起始序号，当auto_create_room为1时有效
     */
    private Integer room_base_id;
    /**
     * 使用该配置的客户群ID列表。见客户群ID获取方法
     */
    private List<String> chat_id_list;
    /**
     * 联系二维码的URL，仅在配置为群二维码时返回
     */
    private String qr_code;
    /**
     * 企业自定义的state参数，用于区分不同的入群渠道。不超过30个UTF-8字符
     * 如果有设置此参数，在调用获取客户群详情接口时会返回每个群成员对应的该参数值，详见文末附录2
     */
    private String state;

    public String getConfig_id() {
        return config_id;
    }

    public void setConfig_id(String config_id) {
        this.config_id = config_id;
    }

    public Integer getScene() {
        return scene;
    }

    public void setScene(Integer scene) {
        this.scene = scene;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getAuto_create_room() {
        return auto_create_room;
    }

    public void setAuto_create_room(Integer auto_create_room) {
        this.auto_create_room = auto_create_room;
    }

    public String getRoom_base_name() {
        return room_base_name;
    }

    public void setRoom_base_name(String room_base_name) {
        this.room_base_name = room_base_name;
    }

    public Integer getRoom_base_id() {
        return room_base_id;
    }

    public void setRoom_base_id(Integer room_base_id) {
        this.room_base_id = room_base_id;
    }

    public List<String> getChat_id_list() {
        return chat_id_list;
    }

    public void setChat_id_list(List<String> chat_id_list) {
        this.chat_id_list = chat_id_list;
    }

    public String getQr_code() {
        return qr_code;
    }

    public void setQr_code(String qr_code) {
        this.qr_code = qr_code;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
