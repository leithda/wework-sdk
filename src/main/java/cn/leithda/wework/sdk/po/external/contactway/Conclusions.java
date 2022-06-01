package cn.leithda.wework.sdk.po.external.contactway;

/**
 * 结束语，会话结束时自动发送给客户，可参考“结束语定义”，仅在is_temp为true时有效
 *
 * @author leithda
 * @since 2022/6/1
 */
public class Conclusions {
    /**
     * 文本消息
     */
    Text text;
    /**
     * 图片消息
     */
    Image image;
    /**
     * 图文消息
     */
    Link link;
    /**
     * 小程序消息
     */
    MiniProgram miniprogram;

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    public Image getImage() {
        return image;
    }

    public void setImage(Image image) {
        this.image = image;
    }

    public Link getLink() {
        return link;
    }

    public void setLink(Link link) {
        this.link = link;
    }

    public MiniProgram getMiniprogram() {
        return miniprogram;
    }

    public void setMiniprogram(MiniProgram miniprogram) {
        this.miniprogram = miniprogram;
    }
}
