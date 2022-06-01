package cn.leithda.wework.sdk.po.external.joinway;

/**
 * 获取客户群进群方式配置请求
 *
 * @author leithda
 * @since 2022/6/1
 */
public class GetJoinWayRequest {
    /**
     * 联系方式的配置id
     */
    private String config_id;

    public String getConfig_id() {
        return config_id;
    }

    public void setConfig_id(String config_id) {
        this.config_id = config_id;
    }
}
