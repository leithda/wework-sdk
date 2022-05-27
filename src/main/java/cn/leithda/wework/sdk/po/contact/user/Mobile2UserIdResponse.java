package cn.leithda.wework.sdk.po.contact.user;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 手机号获取 userid 响应
 *
 * @author leithda
 * @since 2022/5/27
 */
public class Mobile2UserIdResponse extends BaseResponse {
    /**
     * 成员UserID。对应管理端的帐号，企业内必须唯一。不区分大小写，长度为1~64个字节
     */
    private String userid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }
}
