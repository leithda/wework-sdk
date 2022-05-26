package cn.leithda.wework.sdk.po.contact.user;

public class Web {
    /**
     * 网页的url,必须包含http或者https头
     */
    private String url;
    /**
     * 网页的展示标题,长度限制12个UTF8字符
     */
    private String title;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
