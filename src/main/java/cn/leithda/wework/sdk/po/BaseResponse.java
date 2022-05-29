package cn.leithda.wework.sdk.po;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 企业微信基础响应
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class BaseResponse {
    /**
     * 出错返回码，为0表示成功，非0表示调用失败
     */
    Integer errcode;
    /**
     * 返回码提示语
     */
    String errmsg;

    public Integer getErrcode() {
        return errcode;
    }

    public void setErrcode(Integer errcode) {
        this.errcode = errcode;
    }

    public String getErrmsg() {
        return errmsg;
    }

    public void setErrmsg(String errmsg) {
        this.errmsg = errmsg;
    }
}
