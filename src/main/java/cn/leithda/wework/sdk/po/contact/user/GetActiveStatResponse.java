package cn.leithda.wework.sdk.po.contact.user;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 获取企业活跃成员数响应
 *
 * @author leithda
 * @since 2022/5/27
 */
public class GetActiveStatResponse extends BaseResponse {
    /**
     * 活跃成员数
     */
    private Integer active_cnt;

    public Integer getActive_cnt() {
        return active_cnt;
    }

    public void setActive_cnt(Integer active_cnt) {
        this.active_cnt = active_cnt;
    }
}
