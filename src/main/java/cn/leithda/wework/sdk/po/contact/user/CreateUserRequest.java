package cn.leithda.wework.sdk.po.contact.user;

import java.util.List;

/**
 * 创建成员请求
 *
 * @author leithda
 */
public class CreateUserRequest {
    /**
     * 成员UserID。对应管理端的帐号，企业内必须唯一。长度为1~64个字节。只能由数字、字母和“_-@.”四种字符组成，且第一个字符必须是数字或字母。系统进行唯一性检查时会忽略大小写。
     */
    private String userid;
    /**
     * 成员名称。长度为1~64个utf8字符
     */
    private String name;
    /**
     * 成员别名。长度1~64个utf8字符
     */
    private String alias;
    /**
     * 手机号码。企业内必须唯一，mobile/email二者不能同时为空
     */
    private String mobile;
    /**
     * 成员所属部门id列表，不超过100个
     */
    private List<Long> department;
    /**
     * 部门内的排序值，默认为0，成员次序以创建时间从小到大排列。个数必须和参数department的个数一致，数值越大排序越前面。有效的值范围是[0, 2^32)
     */
    private List<Long> order;
    /**
     * 职务信息。长度为0~128个字符
     */
    private String position;
    /**
     * 性别。1表示男性，2表示女性
     */
    private String gender;
    /**
     * 邮箱。长度6~64个字节，且为有效的email格式。企业内必须唯一，mobile/email二者不能同时为空
     */
    private String email;
    /**
     * 企业邮箱。仅对开通企业邮箱的企业有效。长度6~64个字节，且为有效的企业邮箱格式。企业内必须唯一。未填写则系统会为用户生成默认企业邮箱（可修改一次，2022年4月25日之后创建的成员需通过企业管理后台-协作-邮件-邮箱管理-成员邮箱修改）
     */
    private String biz_mail;
    /**
     * 座机。32字节以内，由纯数字、“-”、“+”或“,”组成。
     */
    private String telephone;
    /**
     * 个数必须和参数department的个数一致，表示在所在的部门内是否为部门负责人。1表示为部门负责人，0表示非部门负责人。在审批(自建、第三方)等应用里可以用来标识上级审批人
     */
    private List<Long> is_leader_in_dept;
    /**
     * 直属上级UserID，设置范围为企业内成员，可以设置最多5个上级
     */
    private List<String> direct_leader;
    /**
     * 成员头像的mediaid，通过素材管理接口上传图片获得的mediaid
     */
    private String avatar_mediaid;
    /**
     * 启用/禁用成员。1表示启用成员，0表示禁用成员
     */
    private Long enable;
    /**
     * 自定义字段。自定义字段需要先在WEB管理端添加，见扩展属性添加方法，否则忽略未知属性的赋值。
     */
    private Extattr extattr;
    /**
     * 是否邀请该成员使用企业微信（将通过微信服务通知或短信或邮件下发邀请，每天自动下发一次，最多持续3个工作日），默认值为true。
     */
    private Boolean to_invite;
    /**
     * 成员对外属性，字段详情见对外属性
     */
    private ExternalProfile external_profile;
    /**
     * 地址。长度最大128个字符
     */
    private String address;
    /**
     * 主部门
     */
    private Long main_department;
    /**
     * 对外职务，如果设置了该值，则以此作为对外展示的职务，否则以position来展示。长度12个汉字内
     */
    private String external_position;


    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public List<Long> getDepartment() {
        return department;
    }

    public void setDepartment(List<Long> department) {
        this.department = department;
    }

    public List<Long> getOrder() {
        return order;
    }

    public void setOrder(List<Long> order) {
        this.order = order;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBiz_mail() {
        return biz_mail;
    }

    public void setBiz_mail(String biz_mail) {
        this.biz_mail = biz_mail;
    }

    public List<Long> getIs_leader_in_dept() {
        return is_leader_in_dept;
    }

    public void setIs_leader_in_dept(List<Long> is_leader_in_dept) {
        this.is_leader_in_dept = is_leader_in_dept;
    }

    public List<String> getDirect_leader() {
        return direct_leader;
    }

    public void setDirect_leader(List<String> direct_leader) {
        this.direct_leader = direct_leader;
    }

    public Long getEnable() {
        return enable;
    }

    public void setEnable(Long enable) {
        this.enable = enable;
    }

    public String getAvatar_mediaid() {
        return avatar_mediaid;
    }

    public void setAvatar_mediaid(String avatar_mediaid) {
        this.avatar_mediaid = avatar_mediaid;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Long getMain_department() {
        return main_department;
    }

    public void setMain_department(Long main_department) {
        this.main_department = main_department;
    }

    public Extattr getExtattr() {
        return extattr;
    }

    public void setExtattr(Extattr extattr) {
        this.extattr = extattr;
    }

    public Boolean getTo_invite() {
        return to_invite;
    }

    public void setTo_invite(Boolean to_invite) {
        this.to_invite = to_invite;
    }

    public String getExternal_position() {
        return external_position;
    }

    public void setExternal_position(String external_position) {
        this.external_position = external_position;
    }

    public ExternalProfile getExternal_profile() {
        return external_profile;
    }

    public void setExternal_profile(ExternalProfile external_profile) {
        this.external_profile = external_profile;
    }
}
