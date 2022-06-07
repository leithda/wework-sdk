package cn.leithda.wework.sdk.po.external.moment;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 创建发表任务请求
 *
 * @author leithda
 * @since 2022/6/7
 */
public class AddMomentTaskRequest {
    /**
     * 文本消息
     */
    private Text text;
    /**
     * 附件，不能与text.content同时为空，最多支持9个图片类型，或者1个视频，或者1个链接。类型只能三选一，若传了不同类型，报错'invalid attachments msgtype'
     */
    private List<Attachment> attachments;
    /**
     * 指定的发表范围；若未指定，则表示执行者为应用可见范围内所有成员
     */
    private VisibleRange visibleRange;

    @JsonProperty("text")
    public Text getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(Text value) {
        this.text = value;
    }

    @JsonProperty("attachments")
    public List<Attachment> getAttachments() {
        return attachments;
    }

    @JsonProperty("attachments")
    public void setAttachments(List<Attachment> value) {
        this.attachments = value;
    }

    @JsonProperty("visible_range")
    public VisibleRange getVisibleRange() {
        return visibleRange;
    }

    @JsonProperty("visible_range")
    public void setVisibleRange(VisibleRange value) {
        this.visibleRange = value;
    }


    /**
     * 附件，不能与text.content同时为空，最多支持9个图片类型，或者1个视频，或者1个链接。类型只能三选一，若传了不同类型，报错'invalid attachments msgtype'
     */
    public static class Attachment {
        /**
         * 附件类型，可选image、link或者video
         */
        private String msgtype;
        /**
         * 图片消息附件
         */
        private Image image;
        /**
         * 视频消息附件
         */
        private Vedio video;
        /**
         * 图文消息附件
         */
        private Link link;

        @JsonProperty("msgtype")
        public String getMsgtype() {
            return msgtype;
        }

        @JsonProperty("msgtype")
        public void setMsgtype(String value) {
            this.msgtype = value;
        }

        @JsonProperty("image")
        public Image getImage() {
            return image;
        }

        @JsonProperty("image")
        public void setImage(Image value) {
            this.image = value;
        }

        @JsonProperty("video")
        public Vedio getVideo() {
            return video;
        }

        @JsonProperty("video")
        public void setVideo(Vedio value) {
            this.video = value;
        }

        @JsonProperty("link")
        public Link getLink() {
            return link;
        }

        @JsonProperty("link")
        public void setLink(Link value) {
            this.link = value;
        }
    }

    /**
     * 文本消息
     */
    public static class Text {
        /**
         * 消息文本内容，不能与附件同时为空，最多支持传入2000个字符，若超出长度报错'invalid text size'
         */
        private String content;

        @JsonProperty("content")
        public String getContent() {
            return content;
        }

        @JsonProperty("content")
        public void setContent(String value) {
            this.content = value;
        }
    }

    /**
     * 图片消息附件。普通图片：总像素不超过1555200。图片大小不超过10M。最多支持传入9个；超过9个报错'invalid attachments size'
     */
    public static class Image {
        /**
         * 图片的素材id。可通过上传附件资源接口获得
         */
        private String mediaID;

        @JsonProperty("media_id")
        public String getMediaID() {
            return mediaID;
        }

        @JsonProperty("media_id")
        public void setMediaID(String value) {
            this.mediaID = value;
        }
    }


    /**
     * 图文消息附件。只支持1个；若超过1个报错'invalid attachments size'
     */
    public static class Link {
        /**
         * 图文消息标题，最多64个字节
         */
        private String title;
        /**
         * 图文消息链接
         */
        private String url;
        /**
         * 图片链接封面，普通图片：总像素不超过1555200。可通过上传附件资源接口获得
         */
        private String mediaID;

        @JsonProperty("title")
        public String getTitle() {
            return title;
        }

        @JsonProperty("title")
        public void setTitle(String value) {
            this.title = value;
        }

        @JsonProperty("url")
        public String getURL() {
            return url;
        }

        @JsonProperty("url")
        public void setURL(String value) {
            this.url = value;
        }

        @JsonProperty("media_id")
        public String getMediaID() {
            return mediaID;
        }

        @JsonProperty("media_id")
        public void setMediaID(String value) {
            this.mediaID = value;
        }
    }


    /**
     * 视频消息附件。最长不超过30S，最大不超过10MB。只支持1个；若超过1个报错'invalid attachments size'
     */
    public static class Vedio {
        /**
         * 视频的素材id，未填写报错"invalid msg"。可通过上传附件资源接口获得
         */
        private String mediaID;

        @JsonProperty("media_id")
        public String getMediaID() {
            return mediaID;
        }

        @JsonProperty("media_id")
        public void setMediaID(String value) {
            this.mediaID = value;
        }
    }

    /**
     * 指定的发表范围；若未指定，则表示执行者为应用可见范围内所有成员
     */
    public static class VisibleRange {
        /**
         * 发表任务的执行者列表
         */
        private SenderList senderList;
        /**
         * 可见到该朋友圈的客户列表
         */
        private ExternalContactList externalContactList;

        @JsonProperty("sender_list")
        public SenderList getSenderList() {
            return senderList;
        }

        @JsonProperty("sender_list")
        public void setSenderList(SenderList value) {
            this.senderList = value;
        }

        @JsonProperty("external_contact_list")
        public ExternalContactList getExternalContactList() {
            return externalContactList;
        }

        @JsonProperty("external_contact_list")
        public void setExternalContactList(ExternalContactList value) {
            this.externalContactList = value;
        }
    }

    /**
     * 可见到该朋友圈的客户
     */
    public static class ExternalContactList {
        /**
         * 可见到该朋友圈的客户标签列表
         */
        private List<String> tagList;

        @JsonProperty("tag_list")
        public List<String> getTagList() {
            return tagList;
        }

        @JsonProperty("tag_list")
        public void setTagList(List<String> value) {
            this.tagList = value;
        }
    }

    /**
     * 发表任务的执行者
     */
    public static class SenderList {
        /**
         * 发表任务的执行者用户列表，最多支持10万个
         */
        private List<String> userList;
        /**
         * 发表任务的执行者部门列表
         */
        private List<Long> departmentList;

        @JsonProperty("user_list")
        public List<String> getUserList() {
            return userList;
        }

        @JsonProperty("user_list")
        public void setUserList(List<String> value) {
            this.userList = value;
        }

        @JsonProperty("department_list")
        public List<Long> getDepartmentList() {
            return departmentList;
        }

        @JsonProperty("department_list")
        public void setDepartmentList(List<Long> value) {
            this.departmentList = value;
        }
    }
}
