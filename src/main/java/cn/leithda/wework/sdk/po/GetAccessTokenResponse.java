package cn.leithda.wework.sdk.po;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 获取Token响应
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class GetAccessTokenResponse extends BaseResponse {
    /**
     * 获取到的凭证，最长为512字节
     */
    private String access_token;
    /**
     * 凭证的有效时间（秒）
     */
    private Integer expires_in;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public Integer getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(Integer expires_in) {
        this.expires_in = expires_in;
    }
}
