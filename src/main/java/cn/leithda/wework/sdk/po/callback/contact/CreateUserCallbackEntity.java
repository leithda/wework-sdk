package cn.leithda.wework.sdk.po.callback.contact;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

import java.util.List;


/**
 * 新增成员事件实体
 *
 * @author leithda
 * @since 2022/5/28
 */
public class CreateUserCallbackEntity extends BaseCallbackEntity {
    /**
     * 成员UserID
     */
    private String userID;
    /**
     * 成员名称;代开发自建应用需要管理员授权才返回
     */
    private String name;
    /**
     * 成员部门列表，仅返回该应用有查看权限的部门id
     */
    private List<Long> department;
    /**
     * 主部门
     */
    private Long mainDepartment;
    /**
     * 表示所在部门是否为部门负责人，0-否，1-是，顺序与Department字段的部门逐一对应。上游共享的应用不返回该字段
     */
    private List<Long> isLeaderInDept;
    /**
     * 直属上级UserID，最多5个。代开发的自建应用和上游共享的应用不返回该字段
     */
    private List<String> directLeader;
    /**
     * 职位信息。长度为0~64个字节;代开发自建应用需要管理员授权才返回。上游共享的应用不返回该字段
     */
    private String position;
    /**
     * 手机号码;代开发自建应用需要管理员授权才返回。上游共享的应用不返回该字段
     */
    private String mobile;
    /**
     * 性别，1表示男性，2表示女性。上游共享的应用不返回该字段
     */
    private Integer gender;
    /**
     * 邮箱;代开发自建应用需要管理员授权才返回。上游共享的应用不返回该字段
     */
    private String email;
    /**
     * 企业邮箱;代开发自建应用不返回该字段。上游共享的应用不返回该字段
     */
    private String bizMail;
    /**
     * 激活状态：1=已激活 2=已禁用 4=未激活 已激活代表已激活企业微信或已关注微信插件（原企业号）5=成员退出
     */
    private Integer status;
    /**
     * 头像url。注：如果要获取小图将url最后的”/0”改成”/100”即可。上游共享的应用不返回该字段
     */
    private String avatar;
    /**
     * 成员别名。上游共享的应用不返回该字段
     */
    private String alias;
    /**
     * 座机;代开发自建应用需要管理员授权才返回。上游共享的应用不返回该字段
     */
    private String telephone;
    /**
     * 地址;代开发自建应用需要管理员授权才返回。上游共享的应用不返回该字段
     */
    private String address;
    /**
     * 扩展属性;代开发自建应用需要管理员授权才返回。上游共享的应用不返回该字段
     */
    private ExtAttr extAttr;

    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
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

    public Long getMainDepartment() {
        return mainDepartment;
    }

    public void setMainDepartment(Long mainDepartment) {
        this.mainDepartment = mainDepartment;
    }

    public List<Long> getIsLeaderInDept() {
        return isLeaderInDept;
    }

    public void setIsLeaderInDept(List<Long> isLeaderInDept) {
        this.isLeaderInDept = isLeaderInDept;
    }

    public List<String> getDirectLeader() {
        return directLeader;
    }

    public void setDirectLeader(List<String> directLeader) {
        this.directLeader = directLeader;
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

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBizMail() {
        return bizMail;
    }

    public void setBizMail(String bizMail) {
        this.bizMail = bizMail;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
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

    public ExtAttr getExtAttr() {
        return extAttr;
    }

    public void setExtAttr(ExtAttr extAttr) {
        this.extAttr = extAttr;
    }
}
