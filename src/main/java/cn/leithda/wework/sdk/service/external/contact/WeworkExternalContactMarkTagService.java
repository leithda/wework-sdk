package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.po.external.contact.marktag.MarkTagRequest;
import cn.leithda.wework.sdk.service.WeworkBaseService;

/**
 * 编辑客户标签
 *
 * @author leithda
 * @since 2022/5/29
 */
public class WeworkExternalContactMarkTagService extends WeworkBaseService {

    /**
     * 编辑客户企业标签
     */
    public static final String MARK_TAG_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/mark_tag?access_token=%s";

    /**
     * 编辑企业客户标签
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92118">编辑企业客户标签</a>
     */
    public BaseResponse markTag(String corpId, MarkTagRequest request) {
        return executePost(corpId, null, false, BaseResponse.class, MARK_TAG_URL, request);
    }


    @Override
    protected int getSecretType() {
        return EXTERNAL;
    }
}
