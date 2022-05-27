package cn.leithda.wework.sdk.po.contact.user;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 文本类型的属性
 *
 * @author leithda
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class Text {
    /**
     * 文本属性内容，长度限制32个UTF8字符
     */
    private String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
