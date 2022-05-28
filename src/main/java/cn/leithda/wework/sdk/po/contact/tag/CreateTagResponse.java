package cn.leithda.wework.sdk.po.contact.tag;

import cn.leithda.wework.sdk.po.BaseResponse;

/**
 * 创建标签响应
 *
 * @author leithda
 * @since 2022/5/28
 */
public class CreateTagResponse extends BaseResponse {
    /**
     * 标签id
     */
    private Long tagid;

    public Long getTagid() {
        return tagid;
    }

    public void setTagid(Long tagid) {
        this.tagid = tagid;
    }
}
