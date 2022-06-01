package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.po.external.marktag.MarkTagRequest;
import cn.leithda.wework.sdk.po.external.strategytag.*;
import cn.leithda.wework.sdk.po.external.tag.*;
import cn.leithda.wework.sdk.service.BaseWeworkService;
import org.springframework.stereotype.Service;

/**
 * 客户标签管理
 *
 * @author leithda
 * @since 2022/5/29
 */
@Service
public class WeworkExternalContactTagService extends BaseWeworkService {

    // region 管理企业标签 URL
    /**
     * 获取企业标签库
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
    // endregion

    // region 管理企业规则组下的客户标签 URL
    /**
     * 获取指定规则组下的企业客户标签
     */
    public static final String GET_STRATEGY_TAG_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_strategy_tag_list?access_token=%s";
    /**
     * 为指定规则组创建企业客户标签
     */
    public static final String ADD_STRATEGY_TAG_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/add_strategy_tag?access_token=%s";
    /**
     * 编辑指定规则组下的企业客户标签
     */
    public static final String EDIT_STRATEGY_TAG_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/edit_strategy_tag?access_token=%s";
    /**
     * 删除指定规则组下的企业客户标签
     */
    public static final String DEL_STRATEGY_TAG_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/del_strategy_tag?access_token=%s";
    // endregion

    // region 编辑客户企业标签 URL
    /**
     * 编辑客户企业标签
     */
    public static final String MARK_TAG_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/mark_tag?access_token=%s";
    // endregion

    // region 管理企业标签 API

    /**
     * 获取企业标签库
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92117#%E8%8E%B7%E5%8F%96%E4%BC%81%E4%B8%9A%E6%A0%87%E7%AD%BE%E5%BA%93">获取企业标签库</a>
     */
    public GetCorpTagListResponse getCorpTagList(String corpId, String agentId, GetCorpTagListRequest request) {
        return executePost(corpId, agentId, GetCorpTagListResponse.class, GET_CORP_TAG_LIST_URL, request);
    }

    /**
     * 添加企业客户标签
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92117#%E6%B7%BB%E5%8A%A0%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E6%A0%87%E7%AD%BE">添加企业客户标签</a>
     */
    public AddCorpTagResponse addCorpTag(String corpId, String agentId, AddCorpTagRequest request) {
        return executePost(corpId, agentId, AddCorpTagResponse.class, ADD_CORP_TAG_URL, request);
    }

    /**
     * 编辑企业客户标签
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92117#%E7%BC%96%E8%BE%91%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E6%A0%87%E7%AD%BE">编辑企业客户标签</a>
     */
    public BaseResponse updateCorpTag(String corpId, String agentId, UpdateCorpTagRequest request) {
        return executePost(corpId, agentId, BaseResponse.class, UPDATE_CORP_TAG_URL, request);
    }

    /**
     * 删除企业客户标签
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92117#%E5%88%A0%E9%99%A4%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E6%A0%87%E7%AD%BE>删除企业客户标签</a>
     */
    public BaseResponse deleteCorpTag(String corpId, String agentId, DeleteCorpTagRequest request) {
        return executePost(corpId, agentId, BaseResponse.class, DELETE_CORP_TAG_URL, request);
    }
    // endregion

    // region 管理企业规则组下的客户标签 API

    /**
     * 获取指定规则组下的企业客户标签
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94882#%E8%8E%B7%E5%8F%96%E6%8C%87%E5%AE%9A%E8%A7%84%E5%88%99%E7%BB%84%E4%B8%8B%E7%9A%84%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E6%A0%87%E7%AD%BE">获取指定规则组下的企业客户标签</a>
     */
    public GetStrategyTagListResponse getStrategyTagList(String corpId, GetStrategyTagListRequest request) {
        return executePost(corpId, null, GetStrategyTagListResponse.class, GET_STRATEGY_TAG_LIST_URL, request);
    }

    /**
     * 为指定规则组创建企业客户标签
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94882#%E4%B8%BA%E6%8C%87%E5%AE%9A%E8%A7%84%E5%88%99%E7%BB%84%E5%88%9B%E5%BB%BA%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E6%A0%87%E7%AD%BE">为指定规则组创建企业客户标签</a>
     */
    public AddStrategyTagResponse addStrategyTag(String corpId, AddStrategyTagRequest request) {
        return executePost(corpId, null, AddStrategyTagResponse.class, ADD_STRATEGY_TAG_URL, request);
    }

    /**
     * 编辑指定规则组下的企业客户标签
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94882#%E7%BC%96%E8%BE%91%E6%8C%87%E5%AE%9A%E8%A7%84%E5%88%99%E7%BB%84%E4%B8%8B%E7%9A%84%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E6%A0%87%E7%AD%BE">编辑指定规则组下的企业客户标签</a>
     */
    public BaseResponse editStrategyTag(String corpId, EditStrategyTagRequest request) {
        return executePost(corpId, null, BaseResponse.class, EDIT_STRATEGY_TAG_URL, request);
    }

    /**
     * 删除指定规则组下的企业客户标签
     *
     * @param copId   企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94882#%E5%88%A0%E9%99%A4%E6%8C%87%E5%AE%9A%E8%A7%84%E5%88%99%E7%BB%84%E4%B8%8B%E7%9A%84%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E6%A0%87%E7%AD%BE">删除指定规则组下的企业客户标签</a>
     */
    public BaseResponse delStrategyTag(String copId, DelStrategyTagRequest request) {
        return executePost(copId, null, BaseResponse.class, DEL_STRATEGY_TAG_URL, request);
    }
    // endregion

    // region 编辑客户企业标签 API

    /**
     * 编辑企业客户标签
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92118">编辑企业客户标签</a>
     */
    public BaseResponse markTag(String corpId, String agentId, MarkTagRequest request) {
        return executePost(corpId, agentId, BaseResponse.class, MARK_TAG_URL, request);
    }
    // endregion

    @Override
    protected int getSecretType() {
        return EXTERNAL;
    }

}
