package cn.leithda.wework.sdk.po.external.strategy;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

/**
 * 客户联系规则
 *
 * @author leithda
 * @since 2022/5/26
 */
@JsonIgnoreProperties(ignoreUnknown = true) // 反序列化时，忽略类中不存在的属性
public class Strategy {
    /**
     * 规则组id
     */
    private Long strategy_id;
    /**
     * 父规则组id， 如果当前规则组没父规则组，则为0
     */
    private Long parent_id;
    /**
     * 规则组名称
     */
    private String strategy_name;
    /**
     * 规则组创建时间戳
     */
    private Long create_time;
    /**
     * 规则组管理员userid列表
     */
    private List<String> admin_list;
    /**
     * 权限列表
     */
    private StrategyPrivilege privilege;

    public Long getStrategy_id() {
        return strategy_id;
    }

    public void setStrategy_id(Long strategy_id) {
        this.strategy_id = strategy_id;
    }

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

    public Long getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Long create_time) {
        this.create_time = create_time;
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
}
