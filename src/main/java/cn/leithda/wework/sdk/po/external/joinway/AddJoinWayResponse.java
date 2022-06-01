package cn.leithda.wework.sdk.po.external.joinway;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 配置客户群进群方式响应
 *
 * @author leithda
 * @since 2022/6/1
 */
public class AddJoinWayResponse extends BaseResponse {
    /**
     * 配置id
     */
    private String config_id;

    public String getConfig_id() {
        return config_id;
    }

    public void setConfig_id(String config_id) {
        this.config_id = config_id;
    }
}
