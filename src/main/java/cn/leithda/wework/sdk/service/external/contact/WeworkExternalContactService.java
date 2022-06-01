package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.po.external.contact.*;
import cn.leithda.wework.sdk.po.external.strategy.*;
import cn.leithda.wework.sdk.service.BaseWeworkService;
import cn.leithda.wework.sdk.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 客户管理
 *
 * @author leithda
 */
@Service
public class WeworkExternalContactService extends BaseWeworkService {
    /**
     * 获取客户列表
     */
    public static final String GET_EXTERNAL_CONTACT_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/list?access_token=%s&userid=%s";
    /**
     * 获取客户详情
     */
    public static final String GET_EXTERNAL_CONTACT_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get?access_token=%s&external_userid=%s&cursor=%s";
    /**
     * 批量获取客户详情
     */
    public static final String BATCH_GET_EXTERNAL_CONTENT_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/batch/get_by_user?access_token=%s";
    /**
     * 修改客户备注信息
     */
    public static final String REMARK_EXTERNAL_CONTACT_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/remark?access_token=%s";

    // region 客户联系规则组管理 URL
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
    // endregion

    /**
     * 获取客户列表
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param userId  企业微信成员ID
     * @return 客户列表
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92113">获取客户列表</a>
     */
    public GetExternalContactListResponse getExternalContactList(String corpId, String agentId, String userId) {
        return executeGet(corpId, agentId, GetExternalContactListResponse.class, GET_EXTERNAL_CONTACT_LIST_URL, userId);
    }

    /**
     * 获取客户详情
     *
     * @param corpId         企业ID
     * @param agentId        应用ID(指定时通过指定应用访问API)
     * @param externalUserId 外部联系人的userid，注意不是企业成员的帐号
     * @return 客户详情
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92114">获取客户详情</a>
     */
    public GetExternalContactResponse getExternalContact(String corpId, String agentId, String externalUserId) {
        String cursor = "";
        GetExternalContactResponse response = null;
        List<FollowInfo> followInfoList = new ArrayList<>();
        do {
            GetExternalContactResponse getExternalContactResponse = executeGet(corpId, agentId, GetExternalContactResponse.class, GET_EXTERNAL_CONTACT_URL, externalUserId, cursor);
            response = Objects.isNull(response) ? getExternalContactResponse : response;
            followInfoList.addAll(getExternalContactResponse.getFollow_user());
            cursor = getExternalContactResponse.getNext_cursor();
        } while (StringUtils.isNotEmpty(cursor));
        response.setFollow_user(followInfoList);
        return response;
    }

    /**
     * 批量获取客户详情
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 客户详情列表
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92994">批量获取客户详情</a>
     */
    public BatchGetExternalContactResponse batchGetExternalContact(String corpId, String agentId, BatchGetExternalContactRequest request) {
        String cursor = "";
        BatchGetExternalContactResponse response = null;
        List<BatchGetExternalContactResponse.ExternalContactInfo> externalContactInfoList = new ArrayList<>();
        do {
            BatchGetExternalContactResponse batchGetExternalContactResponse = executePost(corpId, agentId, BatchGetExternalContactResponse.class, BATCH_GET_EXTERNAL_CONTENT_URL, request);
            response = Objects.isNull(response) ? batchGetExternalContactResponse : response;
            externalContactInfoList.addAll(batchGetExternalContactResponse.getExternal_contact_list());
        } while (StringUtils.isNotEmpty(cursor));
        response.setExternal_contact_list(externalContactInfoList);
        return response;
    }

    /**
     * 修改客户备注信息
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92115">修改客户备注信息</a>
     */
    public BaseResponse remarkExternalContact(String corpId, String agentId, RemarkExternalContactRequest request) {
        return executePost(corpId, agentId, BaseResponse.class, REMARK_EXTERNAL_CONTACT_URL, request);
    }

    // region 客户联系规则组管理 API

    /**
     * 获取规则组列表
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94883#%E8%8E%B7%E5%8F%96%E8%A7%84%E5%88%99%E7%BB%84%E5%88%97%E8%A1%A8">获取规则组列表</a>
     */
    public GetStrategyListResponse getStrategyList(String corpId, GetStrategyListRequest request) {
        return executePost(corpId, null, GetStrategyListResponse.class, GET_STRATEGY_LIST_URL, request);
    }

    /**
     * 获取规则组详情
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94883#%E8%8E%B7%E5%8F%96%E8%A7%84%E5%88%99%E7%BB%84%E8%AF%A6%E6%83%85">获取规则组详情</a>
     */
    public GetStrategyResponse getStrategy(String corpId, GetStrategyRequest request) {
        return executePost(corpId, null, GetStrategyResponse.class, GET_STRATEGY_URL, request);
    }

    /**
     * 获取规则组管理范围
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94883#%E8%8E%B7%E5%8F%96%E8%A7%84%E5%88%99%E7%BB%84%E7%AE%A1%E7%90%86%E8%8C%83%E5%9B%B4">获取规则组管理范围</a>
     */
    public GetStrategyRangeResponse getStrategyRange(String corpId, GetStrategyRangeRequest request) {
        return executePost(corpId, null, GetStrategyRangeResponse.class, GET_STRATEGY_RANGE_URL, request);
    }

    /**
     * 创建规则组
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94883#%E5%88%9B%E5%BB%BA%E6%96%B0%E7%9A%84%E8%A7%84%E5%88%99%E7%BB%84">创建规则组</a>
     */
    public CreateStrategyResponse createStrategy(String corpId, CreateStrategyRequest request) {
        return executePost(corpId, null, CreateStrategyResponse.class, CREATE_STRATEGY_URL, request);
    }

    /**
     * 编辑规则组及其管理范围
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94883#%E7%BC%96%E8%BE%91%E8%A7%84%E5%88%99%E7%BB%84%E5%8F%8A%E5%85%B6%E7%AE%A1%E7%90%86%E8%8C%83%E5%9B%B4">编辑规则组及其管理范围</a>
     */
    public BaseResponse editStrategy(String corpId, EditStrategyRequest request) {
        return executePost(corpId, null, BaseResponse.class, EDIT_STRATEGY_URL, request);
    }

    /**
     * 删除规则组
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94883#%E5%88%A0%E9%99%A4%E8%A7%84%E5%88%99%E7%BB%84">删除规则组</a>
     */
    public BaseResponse deleteStrategy(String corpId, DeleteStrategyRequest request) {
        return executePost(corpId, null, BaseResponse.class, DELETE_STRATEGY_URL, request);
    }
    // endregion

    @Override
    protected int getSecretType() {
        return EXTERNAL;
    }
}
