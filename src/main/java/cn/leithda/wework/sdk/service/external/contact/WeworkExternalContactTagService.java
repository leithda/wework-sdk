package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.po.external.contact.tag.*;
import cn.leithda.wework.sdk.service.WeworkBaseService;
import org.springframework.stereotype.Service;

/**
 * 客户标签管理服务
 *
 * @author leithda
 * @since 2022/5/29
 */
@Service
public class WeworkExternalContactTagService extends WeworkBaseService {

    /**
     * 管理企业标签
     */
    public static final String GET_CORP_TAG_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_corp_tag_list?access_token=%s";
    /**
     * 添加企业客户标签
     */
    public static final String ADD_CORP_TAG_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/add_corp_tag?access_token=%s";
    /**
     * 编辑企业客户标签
     */
    public static final String UPDATE_CORP_TAG_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/edit_corp_tag?access_token=%s";
    /**
     * 删除企业客户标签
     */
    public static final String DELETE_CORP_TAG_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/del_corp_tag?access_token=%s";


    /**
     * 获取企业标签库
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92117#%E8%8E%B7%E5%8F%96%E4%BC%81%E4%B8%9A%E6%A0%87%E7%AD%BE%E5%BA%93">获取企业标签库</a>
     */
    public GetCorpTagListResponse getCorpTagList(String corpId, GetCorpTagListRequest request) {
        return executePost(corpId, null, false, GetCorpTagListResponse.class, GET_CORP_TAG_LIST_URL, request);
    }

    /**
     * 添加企业客户标签
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92117#%E6%B7%BB%E5%8A%A0%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E6%A0%87%E7%AD%BE">添加企业客户标签</a>
     */
    public AddCorpTagResponse addCorpTag(String corpId, AddCorpTagRequest request) {
        return executePost(corpId, null, false, AddCorpTagResponse.class, ADD_CORP_TAG_URL, request);
    }

    /**
     * 编辑企业客户标签
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92117#%E7%BC%96%E8%BE%91%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E6%A0%87%E7%AD%BE">编辑企业客户标签</a>
     */
    public BaseResponse updateCorpTag(String corpId, UpdateCorpTagRequest request) {
        return executePost(corpId, null, false, BaseResponse.class, UPDATE_CORP_TAG_URL, request);
    }

    /**
     * 删除企业客户标签
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92117#%E5%88%A0%E9%99%A4%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E6%A0%87%E7%AD%BE>删除企业客户标签</a>
     */
    public BaseResponse deleteCorpTag(String corpId, DeleteCorpTagRequest request) {
        return executePost(corpId, null, false, BaseResponse.class, DELETE_CORP_TAG_URL, request);
    }

    @Override
    protected int getSecretType() {
        return EXTERNAL;
    }

}
