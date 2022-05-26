package cn.leithda.wework.sdk.po.external.contact;

/**
 * 视频号属性。须从企业绑定到企业微信的视频号中选择，可在“我的企业”页中查看绑定的视频号。第三方仅通讯录应用可获取；对于非第三方创建的成员，第三方通讯录应用也不可获取。
 *
 * @author leithda
 */
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
