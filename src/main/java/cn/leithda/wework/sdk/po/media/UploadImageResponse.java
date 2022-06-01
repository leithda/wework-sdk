package cn.leithda.wework.sdk.po.media;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 上传图片响应
 *
 * @author leithda
 * @since 2022/6/1
 */
public class UploadImageResponse extends BaseResponse {
    /**
     * 上传后得到的图片URL。永久有效
     */
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
