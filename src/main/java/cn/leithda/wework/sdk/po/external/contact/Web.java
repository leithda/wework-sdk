package cn.leithda.wework.sdk.po.external.contact;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 网页类型的属性，url和title字段要么同时为空表示清除该属性，要么同时不为空
 *
 * @author leithda
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class Web {
    /**
     * 网页的url，必须包含http或者https头
     */
    private String url;
    /**
     * 网页的展示标题，长度限制12个UTF8字符
     */
    private String title;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
