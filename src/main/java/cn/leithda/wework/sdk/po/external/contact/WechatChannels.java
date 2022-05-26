package cn.leithda.wework.sdk.po.external.contact;

public class WechatChannels {
    /**
     * 视频号名称
     */
    private String nickname;
    /**
     * 视频号添加场景，0-未知 1-视频号主页 2-视频号直播间（微信版本要求：iOS ≥ 8.0.20，Android ≥ 8.0.21，且添加时间不早于2022年4月21日。否则添加场景值为0）
     */
    private Long source;
}
