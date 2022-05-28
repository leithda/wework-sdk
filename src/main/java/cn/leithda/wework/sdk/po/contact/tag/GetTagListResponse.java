package cn.leithda.wework.sdk.po.contact.tag;

import cn.leithda.wework.sdk.po.BaseResponse;

import java.util.List;

/**
 * 获取标签列表响应
 *
 * @author leithda
 * @since 2022/5/28
 */
public class GetTagListResponse extends BaseResponse {

    private List<Tag> taglist;


    public List<Tag> getTaglist() {
        return taglist;
    }

    public void setTaglist(List<Tag> taglist) {
        this.taglist = taglist;
    }
}
