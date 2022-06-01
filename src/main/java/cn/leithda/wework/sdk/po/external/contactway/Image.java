package cn.leithda.wework.sdk.po.external.contactway;

/**
 * 图片消息
 *
 * @author leithda
 * @since 2022/6/1
 */
public class Image {
    /**
     * pic_url
     */
    private String media_id;
    /**
     * 图片的url
     */
    private String pic_url;

    public String getMedia_id() {
        return media_id;
    }

    public void setMedia_id(String media_id) {
        this.media_id = media_id;
    }

    public String getPic_url() {
        return pic_url;
    }

    public void setPic_url(String pic_url) {
        this.pic_url = pic_url;
    }
}
