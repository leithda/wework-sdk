package cn.leithda.wework.sdk.po.external.contact;

import java.util.List;

/**
 * 企业成员客户跟进信息
 *
 * @author leithda
 */
public class FollowInfo {
    /**
     * 添加了此外部联系人的企业成员userid
     */
    private String userid;
    /**
     * 该成员对此外部联系人的备注
     */
    private String remark;
    /**
     * 该成员对此外部联系人的描述
     */
    private String description;
    /**
     * 该成员添加此外部联系人的时间
     */
    private Long createtime;
    /**
     * 该成员给外部联系的标签
     */
    private List<Tag> tags;
    /**
     * 该成员对此微信客户备注的企业名称（仅微信客户有该字段）
     */
    private String remark_corp_name;
    /**
     * 该成员对此客户备注的手机号码，代开发自建应用需要管理员授权才可以获取，第三方不可获取，上游企业不可获取下游企业客户该字段
     */
    private List<String> remark_mobiles;
    /**
     * 发起添加的userid，如果成员主动添加，为成员的userid；如果是客户主动添加，则为客户的外部联系人userid；如果是内部成员共享/管理员分配，则为对应的成员/管理员userid
     */
    private String oper_userid;
    /**
     * 成员添加此客户的来源，具体含义详见<a href="https://developer.work.weixin.qq.com/document/path/92114#%E6%9D%A5%E6%BA%90%E5%AE%9A%E4%B9%89">来源定义</a>
     */
    private long add_way;
    /**
     * 该成员添加此客户的来源add_way为10时，对应的视频号信息
     */
    private WechatChannels wechat_channels;
    /**
     * 企业自定义的state参数，用于区分客户具体是通过哪个「联系我」添加，由企业通过<a href="https://developer.work.weixin.qq.com/document/path/92572#%E9%85%8D%E7%BD%AE%E5%AE%A2%E6%88%B7%E8%81%94%E7%B3%BB%E3%80%8C%E8%81%94%E7%B3%BB%E6%88%91%E3%80%8D%E6%96%B9%E5%BC%8F">创建「联系我」</a>方式指定
     */
    private String state;
}
