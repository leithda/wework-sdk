package cn.leithda.wework.sdk.po.contact.user;

/**
 * 小程序类型的属性，appid和title字段要么同时为空表示清除该属性，要么同时不为空
 *
 * @author leithda
 */
public class Miniprogram {
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
