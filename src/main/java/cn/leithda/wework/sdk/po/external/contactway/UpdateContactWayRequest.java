package cn.leithda.wework.sdk.po.external.contactway;

import java.util.List;

/**
 * 更新企业已配置的「联系我」方式请求
 *
 * @author leithda
 * @since 2022/6/1
 */
public class UpdateContactWayRequest {
    /**
     * 新增联系方式的配置id
     */
    private String config_id;
    /**
     * 联系方式的备注信息，用于助记，不超过30个字符
     */
    private String remark;
    /**
     * 外部客户添加时是否无需验证，默认为true
     */
    private boolean skip_verify;
    /**
     * 在小程序中联系时使用的控件样式，详见附表
     */
    private Integer style;
    /**
     * 企业自定义的state参数，用于区分不同的添加渠道，在调用“获取外部联系人详情”时会返回该参数值，不超过30个字符
     */
    private String state;
    /**
     * 使用该联系方式的用户userID列表，在type为1时为必填，且只能有一个
     */
    private List<String> user;
    /**
     * 使用该联系方式的部门id列表，只在type为2时有效
     */
    private List<Long> party;
    /**
     * 临时会话二维码有效期，以秒为单位。该参数仅在is_temp为true时有效，默认7天，最多为14天
     */
    private Long expires_in;
    /**
     * 临时会话有效期，以秒为单位。该参数仅在is_temp为true时有效，默认为添加好友后24小时，最多为14天
     */
    private Long chat_expires_in;
    /**
     * 可进行临时会话的客户unionid，该参数仅在is_temp为true时有效，如不指定则不进行限制
     */
    private String unionid;
    /**
     * 结束语，会话结束时自动发送给客户，可参考<a href="https://developer.work.weixin.qq.com/document/path/92572#%E7%BB%93%E6%9D%9F%E8%AF%AD%E5%AE%9A%E4%B9%89">结束语定义</a>，仅在is_temp为true时有效
     */
    private Conclusions conclusions;

    public String getConfig_id() {
        return config_id;
    }

    public void setConfig_id(String config_id) {
        this.config_id = config_id;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public boolean isSkip_verify() {
        return skip_verify;
    }

    public void setSkip_verify(boolean skip_verify) {
        this.skip_verify = skip_verify;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public List<String> getUser() {
        return user;
    }

    public void setUser(List<String> user) {
        this.user = user;
    }

    public List<Long> getParty() {
        return party;
    }

    public void setParty(List<Long> party) {
        this.party = party;
    }

    public Long getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Long expires_in) {
        this.expires_in = expires_in;
    }

    public Long getChat_expires_in() {
        return chat_expires_in;
    }

    public void setChat_expires_in(Long chat_expires_in) {
        this.chat_expires_in = chat_expires_in;
    }

    public String getUnionid() {
        return unionid;
    }

    public void setUnionid(String unionid) {
        this.unionid = unionid;
    }

    public Conclusions getConclusions() {
        return conclusions;
    }

    public void setConclusions(Conclusions conclusions) {
        this.conclusions = conclusions;
    }
}
