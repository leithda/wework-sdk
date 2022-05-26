package cn.leithda.wework.sdk.po.external.contact;

import java.util.List;

/**
 * 修改客户备注信息请求
 *
 * @author leithda
 */
public class RemarkExternalContactRequest {
    /**
     * 企业成员的userid
     */
    private String userid;
    /**
     * 外部联系人userid
     */
    private String external_userid;
    /**
     * 此用户对外部联系人的备注，最多20个字符
     */
    private String remark;
    /**
     * 此用户对外部联系人的描述，最多150个字符
     */
    private String description;
    /**
     * 此用户对外部联系人备注的所属公司名称，最多20个字符
     */
    private String remark_company;
    /**
     * 此用户对外部联系人备注的手机号
     */
    private List<String> remark_mobiles;
    /**
     * 备注图片的mediaid
     */
    private String remark_pic_mediaid;

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getExternal_userid() {
        return external_userid;
    }

    public void setExternal_userid(String external_userid) {
        this.external_userid = external_userid;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRemark_company() {
        return remark_company;
    }

    public void setRemark_company(String remark_company) {
        this.remark_company = remark_company;
    }

    public List<String> getRemark_mobiles() {
        return remark_mobiles;
    }

    public void setRemark_mobiles(List<String> remark_mobiles) {
        this.remark_mobiles = remark_mobiles;
    }

    public String getRemark_pic_mediaid() {
        return remark_pic_mediaid;
    }

    public void setRemark_pic_mediaid(String remark_pic_mediaid) {
        this.remark_pic_mediaid = remark_pic_mediaid;
    }
}
