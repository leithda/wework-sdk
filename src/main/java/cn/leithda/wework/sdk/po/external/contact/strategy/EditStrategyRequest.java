package cn.leithda.wework.sdk.po.external.contact.strategy;

import java.util.List;

/**
 * 编辑规则组及其管理范围请求
 *
 * @author leithda
 * @since 2022/5/26
 */
public class EditStrategyRequest {
    /**
     * 规则组id
     */
    private Long strategy_id;
    /**
     * 规则组名称
     */
    private String strategy_name;
    /**
     * 管理员列表，如果为空则不对负责人做编辑，如果有则覆盖旧的负责人列表
     */
    private List<String> admin_list;
    /**
     * 权限配置，如果为空则不对权限做编辑，如果有则覆盖旧的权限配置
     */
    private StrategyPrivilege privilege;
    /**
     * 增加的规则组管理范围
     */
    private List<StrategyRange> range_add;
    /**
     * 删除的规则组管理范围
     */
    private List<StrategyRange> range_del;

    public Long getStrategy_id() {
        return strategy_id;
    }

    public void setStrategy_id(Long strategy_id) {
        this.strategy_id = strategy_id;
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

    public List<StrategyRange> getRange_add() {
        return range_add;
    }

    public void setRange_add(List<StrategyRange> range_add) {
        this.range_add = range_add;
    }

    public List<StrategyRange> getRange_del() {
        return range_del;
    }

    public void setRange_del(List<StrategyRange> range_del) {
        this.range_del = range_del;
    }
}
