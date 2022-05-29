package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.po.external.contact.strategytag.*;
import cn.leithda.wework.sdk.service.WeworkBaseService;

/**
 * 管理企业规则组下的客户标签服务
 *
 * @author leithda
 * @since 2022/5/29
 */
public class WeworkExternContactStrategyTagService extends WeworkBaseService {

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

    /**
     * 获取指定规则组下的企业客户标签
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94882#%E8%8E%B7%E5%8F%96%E6%8C%87%E5%AE%9A%E8%A7%84%E5%88%99%E7%BB%84%E4%B8%8B%E7%9A%84%E4%BC%81%E4%B8%9A%E5%AE%A2%E6%88%B7%E6%A0%87%E7%AD%BE">获取指定规则组下的企业客户标签</a>
     */
    public GetStrategyTagListResponse getStrategyTagList(String corpId, GetStrategyTagListRequest request) {
        return executePost(corpId, null, false, GetStrategyTagListResponse.class, GET_STRATEGY_TAG_LIST_URL, request);
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
        return executePost(corpId, null, false, AddStrategyTagResponse.class, ADD_STRATEGY_TAG_URL, request);
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
        return executePost(corpId, null, false, BaseResponse.class, EDIT_STRATEGY_TAG_URL, request);
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
        return executePost(copId, null, false, BaseResponse.class, DEL_STRATEGY_TAG_URL, request);
    }


    @Override
    protected int getSecretType() {
        return EXTERNAL;
    }
}
