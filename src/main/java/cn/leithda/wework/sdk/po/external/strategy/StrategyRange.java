package cn.leithda.wework.sdk.po.external.strategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * 规则组范围
 *
 * @author leithda
 * @since 2022/5/26
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class StrategyRange {
    /**
     * 规则组的管理范围节点类型 1-成员 2-部门
     */
    private Integer type;
    /**
     * 管理范围内配置的成员userid，仅type为1时返回
     */
    private String userid;
    /**
     * 管理范围内配置的部门partyid，仅type为2时返回
     */
    private String partyid;

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPartyid() {
        return partyid;
    }

    public void setPartyid(String partyid) {
        this.partyid = partyid;
    }
}
