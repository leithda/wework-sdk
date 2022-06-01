package cn.leithda.wework.sdk.po.external.contactway;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 配置客户联系「联系我」方式响应
 *
 * @author leithda
 * @since 2022/6/1
 */
public class AddContactWayResponse extends BaseResponse {
    /**
     * 新增联系方式的配置id
     */
    private String config_id;
    /**
     * 联系我二维码链接，仅在scene为2时返回
     */
    private String qr_code;

    public String getConfig_id() {
        return config_id;
    }

    public void setConfig_id(String config_id) {
        this.config_id = config_id;
    }

    public String getQr_code() {
        return qr_code;
    }

    public void setQr_code(String qr_code) {
        this.qr_code = qr_code;
    }
}
