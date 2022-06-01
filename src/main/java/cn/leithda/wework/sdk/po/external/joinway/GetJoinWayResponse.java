package cn.leithda.wework.sdk.po.external.joinway;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 获取客户群进群方式配置响应
 *
 * @author leithda
 * @since 2022/6/1
 */
public class GetJoinWayResponse extends BaseResponse {
    /**
     * 配置详情
     */
    private JoinWay join_way;

    public JoinWay getJoin_way() {
        return join_way;
    }

    public void setJoin_way(JoinWay join_way) {
        this.join_way = join_way;
    }
}
