package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.po.external.contact.*;
import cn.leithda.wework.sdk.service.WeworkBaseService;
import org.springframework.stereotype.Service;

/**
 * 客户联系规则组服务
 *
 * @author leithda
 * @since 2022/5/26
 */
@Service
public class WeworkExternalContactStrategyService extends WeworkBaseService {

    /**
     * 获取规则组列表
     */
    public static final String GET_STRATEGY_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/customer_strategy/list?access_token=%s";
    /**
     * 获取规则组详情
     */
    public static final String GET_STRATEGY_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/customer_strategy/get?access_token=%s";
    /**
     * 获取规则组管理范围
     */
    public static final String GET_STRATEGY_RANGE_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/customer_strategy/get_range?access_token=%s";
    /**
     * 创建规则组
     */
    public static final String CREATE_STRATEGY_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/customer_strategy/create?access_token=%s";
    /**
     * 编辑规则组及其管理范围
     */
    public static final String EDIT_STRATEGY_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/customer_strategy/edit?access_token=%s";
    /**
     * 删除规则组
     */
    public static final String DELETE_STRATEGY_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/customer_strategy/del?access_token=%s";

    /**
     * 获取规则组列表
     *
     * @param corpId  企业微信主体ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94883#%E8%8E%B7%E5%8F%96%E8%A7%84%E5%88%99%E7%BB%84%E5%88%97%E8%A1%A8">获取规则组列表</a>
     */
    public GetStrategyListResponse getStrategyList(String corpId, GetStrategyListRequest request) {
        return executePost(EXTERNAL, corpId, null, false, GetStrategyListResponse.class, GET_STRATEGY_LIST_URL, request);
    }

    /**
     * 获取规则组详情
     *
     * @param corpId  企业微信主体ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94883#%E8%8E%B7%E5%8F%96%E8%A7%84%E5%88%99%E7%BB%84%E8%AF%A6%E6%83%85">获取规则组详情</a>
     */
    public GetStrategyResponse getStrategy(String corpId, GetStrategyRequest request) {
        return executePost(EXTERNAL, corpId, null, false, GetStrategyResponse.class, GET_STRATEGY_URL, request);
    }

    /**
     * 获取规则组管理范围
     *
     * @param corpId  企业微信主体ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94883#%E8%8E%B7%E5%8F%96%E8%A7%84%E5%88%99%E7%BB%84%E7%AE%A1%E7%90%86%E8%8C%83%E5%9B%B4">获取规则组管理范围</a>
     */
    public GetStrategyRangeResponse getStrategyRange(String corpId, GetStrategyRangeRequest request) {
        return executePost(EXTERNAL, corpId, null, false, GetStrategyRangeResponse.class, GET_STRATEGY_RANGE_URL, request);
    }

    /**
     * 创建规则组
     *
     * @param corpId  企业微信主体ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94883#%E5%88%9B%E5%BB%BA%E6%96%B0%E7%9A%84%E8%A7%84%E5%88%99%E7%BB%84">创建规则组</a>
     */
    public CreateStrategyResponse createStrategy(String corpId, CreateStrategyRequest request) {
        return executePost(EXTERNAL, corpId, null, false, CreateStrategyResponse.class, CREATE_STRATEGY_URL, request);
    }

    /**
     * 编辑规则组及其管理范围
     * @param corpId 企业微信主体ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94883#%E7%BC%96%E8%BE%91%E8%A7%84%E5%88%99%E7%BB%84%E5%8F%8A%E5%85%B6%E7%AE%A1%E7%90%86%E8%8C%83%E5%9B%B4">编辑规则组及其管理范围</a>
     */
    public BaseResponse editStrategy(String corpId, EditStrategyRequest request) {
        return executePost(EXTERNAL, corpId, null, false, BaseResponse.class, EDIT_STRATEGY_URL, request);
    }

    /**
     * 删除规则组
     * @param corpId 企业微信主体ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94883#%E5%88%A0%E9%99%A4%E8%A7%84%E5%88%99%E7%BB%84">删除规则组</a>
     */
    public BaseResponse deleteStrategy(String corpId, DeleteStrategyRequest request){
        return executePost(EXTERNAL, corpId, null, false, BaseResponse.class, DELETE_STRATEGY_URL, request);
    }
}
