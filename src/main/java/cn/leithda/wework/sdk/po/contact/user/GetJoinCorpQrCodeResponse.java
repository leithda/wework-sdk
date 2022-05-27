package cn.leithda.wework.sdk.po.contact.user;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 获取加入企业二维码
 *
 * @author leithda
 * @since 2022/5/27
 */
public class GetJoinCorpQrCodeResponse extends BaseResponse {
    /**
     * 二维码链接，有效期7天
     */
    private String join_qrcode;

    public String getJoin_qrcode() {
        return join_qrcode;
    }

    public void setJoin_qrcode(String join_qrcode) {
        this.join_qrcode = join_qrcode;
    }
}
