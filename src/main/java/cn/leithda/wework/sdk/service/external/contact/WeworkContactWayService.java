package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.po.external.contactway.*;
import cn.leithda.wework.sdk.service.BaseWeworkService;
import cn.leithda.wework.sdk.utils.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 客户联系「联系我」管理
 *
 * @author leithda
 * @since 2022/6/1
 */
public class WeworkContactWayService extends BaseWeworkService {

    /**
     * 配置客户联系「联系我」方式
     */
    public static final String ADD_CONTACT_WAY_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/add_contact_way?access_token=%s";
    /**
     * 获取企业已配置的「联系我」方式
     */
    public static final String GET_CONTACT_WAY_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get_contact_way?access_token=%s";
    /**
     * 获取企业已配置的「联系我」列表
     */
    public static final String GET_CONTACT_WAY_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/list_contact_way?access_token=%s";
    /**
     * 更新企业已配置的「联系我」方式
     */
    public static final String UPDATE_CONTACT_WAY_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/update_contact_way?access_token=%s";
    /**
     * 删除企业已配置的「联系我」方式
     */
    public static final String DEL_CONTACT_WAY_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/del_contact_way?access_token=%s";

    /**
     * 配置客户联系「联系我」方式
     *
     * @param corpId  企业ID
     * @param agentId 应用ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92228#%E9%85%8D%E7%BD%AE%E5%AE%A2%E6%88%B7%E8%81%94%E7%B3%BB%E3%80%8C%E8%81%94%E7%B3%BB%E6%88%91%E3%80%8D%E6%96%B9%E5%BC%8F">配置客户联系「联系我」方式</a>
     */
    public AddContactWayResponse addContactWay(String corpId, String agentId, AddContactWayRequest request) {
        return executePost(corpId, agentId, AddContactWayResponse.class, ADD_CONTACT_WAY_URL, request);
    }

    /**
     * 获取企业已配置的「联系我」方式
     *
     * @param corpId  企业ID
     * @param agentId 应用ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92228#%E8%8E%B7%E5%8F%96%E4%BC%81%E4%B8%9A%E5%B7%B2%E9%85%8D%E7%BD%AE%E7%9A%84%E3%80%8C%E8%81%94%E7%B3%BB%E6%88%91%E3%80%8D%E6%96%B9%E5%BC%8F">获取企业已配置的「联系我」方式</a>
     */
    public GetContactWayResponse getContactWay(String corpId, String agentId, GetContactWayRequest request) {
        return executePost(corpId, agentId, GetContactWayResponse.class, GET_CONTACT_WAY_URL, request);
    }

    /**
     * 获取企业已配置的「联系我」列表
     *
     * @param corpId  企业ID
     * @param agentId 应用ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92228#%E8%8E%B7%E5%8F%96%E4%BC%81%E4%B8%9A%E5%B7%B2%E9%85%8D%E7%BD%AE%E7%9A%84%E3%80%8C%E8%81%94%E7%B3%BB%E6%88%91%E3%80%8D%E5%88%97%E8%A1%A8">获取企业已配置的「联系我」列表</a>
     */
    public GetContactWayListResponse getContactWayList(String corpId, String agentId, GetContactWayListRequest request) {
        GetContactWayListResponse response = null;
        String cursor;
        List<GetContactWayListResponse.ContactWayList> contactWayList = new ArrayList<>();
        do {
            GetContactWayListResponse getContactWayListResponse = executePost(corpId, agentId, GetContactWayListResponse.class, GET_CONTACT_WAY_LIST_URL, request);
            response = Objects.isNull(response) ? getContactWayListResponse : response;
            cursor = getContactWayListResponse.getNext_cursor();
        } while (StringUtils.isNotEmpty(cursor));
        response.setContact_way(contactWayList);
        return response;
    }

    /**
     * 更新企业已配置的「联系我」方式
     * @param corpId 企业ID
     * @param agentId 应用ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92228#%E6%9B%B4%E6%96%B0%E4%BC%81%E4%B8%9A%E5%B7%B2%E9%85%8D%E7%BD%AE%E7%9A%84%E3%80%8C%E8%81%94%E7%B3%BB%E6%88%91%E3%80%8D%E6%96%B9%E5%BC%8F>更新企业已配置的「联系我」方式</a>
     */
    public BaseResponse updateContactWay(String corpId, String agentId, UpdateContactWayRequest request){
        return executePost(corpId, agentId, BaseResponse.class, UPDATE_CONTACT_WAY_URL, request);
    }

    /**
     * 删除企业已配置的「联系我」方式
     * @param corpId 企业ID
     * @param agentId 应用ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92228#%E5%88%A0%E9%99%A4%E4%BC%81%E4%B8%9A%E5%B7%B2%E9%85%8D%E7%BD%AE%E7%9A%84%E3%80%8C%E8%81%94%E7%B3%BB%E6%88%91%E3%80%8D%E6%96%B9%E5%BC%8F>删除企业已配置的「联系我」方式</a>
     */
    public BaseResponse delContactWay(String corpId, String agentId, DelContactWayRequest request){
        return executePost(corpId, agentId, BaseResponse.class, DEL_CONTACT_WAY_URL, request);
    }


    @Override
    protected int getSecretType() {
        return EXTERNAL;
    }
}
