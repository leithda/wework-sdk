package cn.leithda.wework.sdk.po.external.contact.strategy;

import java.util.List;

/**
 * 创建规则组请求
 *
 * @author leithda
 * @since 2022/5/26
 */
public class CreateStrategyRequest {
    /**
     * 父规则组id
     */
    private Long parent_id;
    /**
     * 规则组名称
     */
    private String strategy_name;
    /**
     * 规则组管理员userid列表，不可配置超级管理员，每个规则组最多可配置20个负责人
     */
    private List<String> admin_list;
    /**
     * 权限
     */
    private StrategyPrivilege privilege;
    /**
     * 规则组管理范围
     */
    private List<StrategyRange> range;

    public Long getParent_id() {
        return parent_id;
    }

    public void setParent_id(Long parent_id) {
        this.parent_id = parent_id;
    }

    public String getStrategy_name() {
        return strategy_name;
    }

    public void setStrategy_name(String strategy_name) {
        this.strategy_name = strategy_name;
    }

    public List<String> getAdmin_list() {
        return admin_list;
    }

    public void setAdmin_list(List<String> admin_list) {
        this.admin_list = admin_list;
    }

    public StrategyPrivilege getPrivilege() {
        return privilege;
    }

    public void setPrivilege(StrategyPrivilege privilege) {
        this.privilege = privilege;
    }

    public List<StrategyRange> getRange() {
        return range;
    }

    public void setRange(List<StrategyRange> range) {
        this.range = range;
    }
}
