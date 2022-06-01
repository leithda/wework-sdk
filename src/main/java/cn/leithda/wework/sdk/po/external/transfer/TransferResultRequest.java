package cn.leithda.wework.sdk.po.external.transfer;

/**
 * 查询客户接替状态请求
 *
 * @author leithda
 * @since 2022/5/30
 */
public class TransferResultRequest {
    /**
     * 原添加成员的userid
     */
    private String handover_userid;
    /**
     * 	接替成员的userid
     */
    private String takeover_userid;
    /**
     * 分页查询的cursor，每个分页返回的数据不会超过1000条；不填或为空表示获取第一个分页；
     */
    private String cursor;

    public String getHandover_userid() {
        return handover_userid;
    }

    public void setHandover_userid(String handover_userid) {
        this.handover_userid = handover_userid;
    }

    public String getTakeover_userid() {
        return takeover_userid;
    }

    public void setTakeover_userid(String takeover_userid) {
        this.takeover_userid = takeover_userid;
    }

    public String getCursor() {
        return cursor;
    }

    public void setCursor(String cursor) {
        this.cursor = cursor;
    }
}
