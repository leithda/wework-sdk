package cn.leithda.wework.sdk.po.contact.user;

public class Miniprogram {
    /**
     * 小程序id
     */
    private String appid;
    /**
     * 小程序链接
     */
    private String pagepath;
    /**
     * 标题
     */
    private String title;

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
}
