package cn.leithda.wework.sdk.po.contact.user;

import java.util.List;

/**
 * 属性列表，目前支持文本、网页、小程序三种类型
 *
 * @author leithda
 */
public class Extattr {
    /**
     * 自定义字段。自定义字段需要先在WEB管理端添加，见扩展属性添加方法，否则忽略未知属性的赋值。
     */
    private List<Attr> attrs;

    public List<Attr> getAttrs() {
        return attrs;
    }

    public void setAttrs(List<Attr> attrs) {
        this.attrs = attrs;
    }
}
