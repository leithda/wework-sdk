package cn.leithda.wework.sdk.po.contact.user;

import java.util.List;

/**
 * 更新成员请求
 *
 * @author leithda
 * @since 2022/5/27
 */
public class UpdateUserRequest {
    /**
     * 成员UserID。对应管理端的帐号，企业内必须唯一。不区分大小写，长度为1~64个字节
     */
    private String userid;
    /**
     * 如果userid由系统自动生成，则仅允许修改一次。新值可由new_userid字段指定。
     */
    private String new_userid;
    /**
     * 成员名称。长度为1~64个utf8字符
     */
    private String name;
    /**
     * 成员所属部门id列表，不超过100个
     */
    private List<Long> department;
    /**
     * 部门内的排序值，默认为0。当有传入department时有效。数量必须和department一致，数值越大排序越前面。有效的值范围是[0, 2^32)
     */
    private List<Long> order;
    /**
     * 职务信息。长度为0~128个字符
     */
    private String position;
    /**
     * 手机号码。企业内必须唯一。若成员已激活企业微信，则需成员自行修改（此情况下该参数被忽略，但不会报错）
     */
    private String mobile;
    /**
     * 性别。1表示男性，2表示女性
     */
    private String gender;
    /**
     * 邮箱。长度不超过64个字节，且为有效的email格式。企业内必须唯一。
     */
    private String email;
    /**
     * 邮箱。企业邮箱。仅对开通企业邮箱的企业有效。长度6~64个字节，且为有效的企业邮箱格式。企业内必须唯一。仅2022年4月25日以前创建且企业邮箱为系统自动生成的成员可修改一次
     */
    private String biz_mail;
    /**
     * 部门负责人字段，个数必须和department一致，表示在所在的部门内是否为负责人。
     */
    private List<Long> is_leader_in_dept;
    /**
     * 直属上级，可以设置企业范围内成员为直属上级，最多设置5个
     */
    private List<String> direct_leader;
    /**
     * 启用/禁用成员。1表示启用成员，0表示禁用成员
     */
    private Long enable;
    /**
     * 成员头像的mediaid，通过素材管理接口上传图片获得的mediaid
     */
    private String avatar_mediaid;
    /**
     * 座机。由1-32位的纯数字、“-”、“+”或“,”组成
     */
    private String telephone;
    /**
     * 别名。长度为1-64个utf8字符
     */
    private String alias;
    /**
     * 地址。长度最大128个字符
     */
    private String address;
    /**
     * 主部门
     */
    private Long main_department;
    /**
     * 自定义字段。自定义字段需要先在WEB管理端添加，见扩展属性添加方法，否则忽略未知属性的赋值。
     */
    private Extattr extattr;
    /**
     * 对外职务，如果设置了该值，则以此作为对外展示的职务，否则以position来展示。不超过12个汉字
     */
    private String external_position;
    /**
     * 成员对外属性，字段详情见对外属性
     */
    private ExternalProfile external_profile;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getNew_userid() {
        return new_userid;
    }

    public void setNew_userid(String new_userid) {
        this.new_userid = new_userid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
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

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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
