package cn.leithda.wework.sdk.po.external.contactway;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 获取企业已配置的「联系我」方式响应
 *
 * @author leithda
 * @since 2022/6/1
 */
public class GetContactWayResponse extends BaseResponse {
    /**
     * 「联系我」方式
     */
    private ContactWay contactWay;

    public ContactWay getContactWay() {
        return contactWay;
    }

    public void setContactWay(ContactWay contactWay) {
        this.contactWay = contactWay;
    }
}
