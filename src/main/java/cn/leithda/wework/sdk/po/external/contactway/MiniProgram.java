package cn.leithda.wework.sdk.po.external.contactway;

/**
 * 小程序消息
 *
 * @author leithda
 * @since 2022/6/1
 */
public class MiniProgram {
    /**
     * 小程序appid，必须是有在本企业安装授权的小程序，否则会被忽略
     */
    private String appid;
    /**
     * 小程序的页面路径
     */
    private String pagepath;
    /**
     * 小程序的展示标题，长度限制12个UTF8字符
     */
    private String title;
    /**
     * 小程序消息封面的mediaid，封面图建议尺寸为520*416
     */
    private String pic_media_id;

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getPagepath() {
        return pagepath;
    }

    public void setPagepath(String pagepath) {
        this.pagepath = pagepath;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPic_media_id() {
        return pic_media_id;
    }

    public void setPic_media_id(String pic_media_id) {
        this.pic_media_id = pic_media_id;
    }
}
