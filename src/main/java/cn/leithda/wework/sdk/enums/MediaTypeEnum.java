package cn.leithda.wework.sdk.enums;

/**
 * 媒体文件类型枚举，分别有图片（image）、语音（voice）、视频（video），普通文件（file）
 */
public enum MediaTypeEnum {
    /**
     * 图片
     */
    IMAGE("image"),
    /**
     * 语音
     */
    VOICE("voice"),
    /**
     * 视频
     */
    VIDEO("video"),
    /**
     * 普通文件
     */
    FILE("file");
    /**
     * 媒体文件类型
     */
    private final String type;

    MediaTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
