package cn.leithda.wework.sdk.po;

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
