package cn.leithda.wework.sdk.po.external.joinway;

/**
 * 删除客户群进群方式请求
 *
 * @author leithda
 * @since 2022/6/1
 */
public class DelJoinWayRequest {

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
