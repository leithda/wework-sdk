package cn.leithda.wework.sdk.po.contact.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 属性，目前支持文本、网页、小程序三种类型
 *
 * @author leithda
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class Attr {
    /**
     * 属性类型: 0-文本 1-网页 2-小程序
     */
    private Long type;
    /**
     * 属性名称： 需要先确保在管理端有创建该属性，否则会忽略
     */
    private String name;
    /**
     * 文本类型的属性
     */
    private Text text;
    /**
     * 网页类型的属性，url和title字段要么同时为空表示清除该属性，要么同时不为空
     */
    private Web web;
    /**
     * 小程序类型的属性，appid和title字段要么同时为空表示清除该属性，要么同时不为空
     */
    private Miniprogram miniprogram;

    public long getType() {
        return type;
    }

    public void setType(long type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Web getWeb() {
        return web;
    }

    public void setWeb(Web web) {
        this.web = web;
    }

    public Miniprogram getMiniprogram() {
        return miniprogram;
    }

    public void setMiniprogram(Miniprogram miniprogram) {
        this.miniprogram = miniprogram;
    }
}
