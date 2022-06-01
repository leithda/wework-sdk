package cn.leithda.wework.sdk.po.external.contactway;

/**
 * 文本消息
 *
 * @author leithda
 * @since 2022/6/1
 */
public class Text {
    /**
     * 消息文本内容,最长为4000字节
     */
    private String content;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
