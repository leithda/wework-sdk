package cn.leithda.wework.sdk.po.external.contact;

/**
 * 属性，目前支持文本、网页、小程序三种类型
 *
 * @author leithda
 */
public class ExternalAttr {
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
}
