package cn.leithda.wework.sdk.po.callback.contact;

import java.util.List;

/**
 * 扩展属性
 *
 * @author leithda
 * @since 2022/5/28
 */
public class ExtAttr {
    private List<Item> item;

    public List<cn.leithda.wework.sdk.po.callback.contact.Item> getItem() {
        return item;
    }

    public void setItem(List<cn.leithda.wework.sdk.po.callback.contact.Item> item) {
        this.item = item;
    }
}
