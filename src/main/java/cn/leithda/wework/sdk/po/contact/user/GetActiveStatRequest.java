package cn.leithda.wework.sdk.po.contact.user;

/**
 * 获取企业活跃成员数请求
 *
 * @author leithda
 * @since 2022/5/27
 */
public class GetActiveStatRequest {
    /**
     * 具体某天的活跃人数，最长支持获取30天前数据，格式：2020-03-27
     */
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}
