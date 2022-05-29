package cn.leithda.wework.sdk.po.callback.contact;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 标签变更回调实体
 *
 * @author leithda
 * @since 2022/5/29
 */
public class UpdateTagCallbackEntity extends BaseCallbackEntity {
    /**
     * 标签Id
     */
    private Long tagId;
    /**
     * 标签中新增的成员userid列表，用逗号分隔
     */
    private String addUserItems;
    /**
     * 	标签中删除的成员userid列表，用逗号分隔
     */
    private String delUserItems;
    /**
     * 标签中新增的部门id列表，用逗号分隔
     */
    private String addPartyItems;
    /**
     * 标签中删除的部门id列表，用逗号分隔
     */
    private String delPartyItems;

    public Long getTagId() {
        return tagId;
    }

    public void setTagId(Long tagId) {
        this.tagId = tagId;
    }

    public String getAddUserItems() {
        return addUserItems;
    }

    public void setAddUserItems(String addUserItems) {
        this.addUserItems = addUserItems;
    }

    public String getDelUserItems() {
        return delUserItems;
    }

    public void setDelUserItems(String delUserItems) {
        this.delUserItems = delUserItems;
    }

    public String getAddPartyItems() {
        return addPartyItems;
    }

    public void setAddPartyItems(String addPartyItems) {
        this.addPartyItems = addPartyItems;
    }

    public String getDelPartyItems() {
        return delPartyItems;
    }

    public void setDelPartyItems(String delPartyItems) {
        this.delPartyItems = delPartyItems;
    }
}
