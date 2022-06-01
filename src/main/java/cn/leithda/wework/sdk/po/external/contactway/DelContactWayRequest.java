package cn.leithda.wework.sdk.po.external.contactway;

/**
 * 删除企业已配置的「联系我」方式请求
 *
 * @author leithda
 * @since 2022/6/1
 */
public class DelContactWayRequest {
    /**
     * 企业联系方式的配置id
     */
    private String config_id;

    public String getConfig_id() {
        return config_id;
    }

    public void setConfig_id(String config_id) {
        this.config_id = config_id;
    }
}
