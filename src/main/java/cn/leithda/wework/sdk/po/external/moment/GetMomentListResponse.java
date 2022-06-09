package cn.leithda.wework.sdk.po.external.moment;

import cn.leithda.wework.sdk.po.BaseResponse;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

/**
 * 获取企业全部的发表记录相应
 *
 * @author leithda
 * @since 2022/6/8
 */
public class GetMomentListResponse extends BaseResponse {
    /**
     * 分页游标，下次请求时填写以获取之后分页的记录，如果已经没有更多的数据则返回空
     */
    private String nextCursor;
    /**
     * 朋友圈列表
     */
    private List<Moment> momentList;

    @JsonProperty("next_cursor")
    public String getNextCursor() {
        return nextCursor;
    }

    @JsonProperty("next_cursor")
    public void setNextCursor(String value) {
        this.nextCursor = value;
    }

    @JsonProperty("moment_list")
    public List<Moment> getMomentList() {
        return momentList;
    }

    @JsonProperty("moment_list")
    public void setMomentList(List<Moment> value) {
        this.momentList = value;
    }

    /**
     * 朋友圈
     */
    public static class Moment {
        /**
         * 朋友圈id
         */
        private String momentID;
        /**
         * 朋友圈创建者userid，企业发表内容到客户的朋友圈接口创建的朋友圈不再返回该字段
         */
        private String creator;
        /**
         * 创建时间
         */
        private long createTime;
        /**
         * 朋友圈创建来源。0：企业 1：个人
         */
        private long createType;
        /**
         * 可见范围类型。0：部分可见 1：公开
         */
        private long visibleType;
        /**
         * 文本消息结构
         */
        private Text text;
        /**
         * 图片
         */
        private List<Image> image;
        /**
         * 视频
         */
        private Video video;
        /**
         * 网页链接
         */
        private Link link;
        /**
         * 地理位置
         */
        private Location location;

        @JsonProperty("moment_id")
        public String getMomentID() {
            return momentID;
        }

        @JsonProperty("moment_id")
        public void setMomentID(String value) {
            this.momentID = value;
        }

        @JsonProperty("creator")
        public String getCreator() {
            return creator;
        }

        @JsonProperty("creator")
        public void setCreator(String value) {
            this.creator = value;
        }

        @JsonProperty("create_time")
        public long getCreateTime() {
            return createTime;
        }

        @JsonProperty("create_time")
        public void setCreateTime(long value) {
            this.createTime = value;
        }

        @JsonProperty("create_type")
        public long getCreateType() {
            return createType;
        }

        @JsonProperty("create_type")
        public void setCreateType(long value) {
            this.createType = value;
        }

        @JsonProperty("visible_type")
        public long getVisibleType() {
            return visibleType;
        }

        @JsonProperty("visible_type")
        public void setVisibleType(long value) {
            this.visibleType = value;
        }

        @JsonProperty("text")
        public Text getText() {
            return text;
        }

        @JsonProperty("text")
        public void setText(Text value) {
            this.text = value;
        }

        @JsonProperty("image")
        public List<Image> getImage() {
            return image;
        }

        @JsonProperty("image")
        public void setImage(List<Image> value) {
            this.image = value;
        }

        @JsonProperty("video")
        public Video getVideo() {
            return video;
        }

        @JsonProperty("video")
        public void setVideo(Video value) {
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

        @JsonProperty("location")
        public Location getLocation() {
            return location;
        }

        @JsonProperty("location")
        public void setLocation(Location value) {
            this.location = value;
        }
    }

    /**
     * 文本消息结构
     */
    public static class Text {
        /**
         * 文本消息
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
     * 图片
     */
    public static class Image {
        /**
         * 图片的media_id
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
     * 网页链接
     */
    public static class Link {
        /**
         * 网页链接标题
         */
        private String title;
        /**
         * 网页链接url
         */
        private String url;

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
    }

    /**
     * 视频
     */
    public static class Video {
        /**
         * 视频media_id，可以通过获取临时素材下载资源
         */
        private String mediaID;
        /**
         * 视频封面media_id，可以通过获取临时素材下载资源
         */
        private String thumbMediaID;

        @JsonProperty("media_id")
        public String getMediaID() {
            return mediaID;
        }

        @JsonProperty("media_id")
        public void setMediaID(String value) {
            this.mediaID = value;
        }

        @JsonProperty("thumb_media_id")
        public String getThumbMediaID() {
            return thumbMediaID;
        }

        @JsonProperty("thumb_media_id")
        public void setThumbMediaID(String value) {
            this.thumbMediaID = value;
        }
    }

    /**
     * 地理位置
     */
    public static class Location {
        /**
         * 地理位置纬度
         */
        private String latitude;
        /**
         * 地理位置经度
         */
        private String longitude;
        /**
         * 地理位置名称
         */
        private String name;

        @JsonProperty("latitude")
        public String getLatitude() {
            return latitude;
        }

        @JsonProperty("latitude")
        public void setLatitude(String value) {
            this.latitude = value;
        }

        @JsonProperty("longitude")
        public String getLongitude() {
            return longitude;
        }

        @JsonProperty("longitude")
        public void setLongitude(String value) {
            this.longitude = value;
        }

        @JsonProperty("name")
        public String getName() {
            return name;
        }

        @JsonProperty("name")
        public void setName(String value) {
            this.name = value;
        }
    }


}
