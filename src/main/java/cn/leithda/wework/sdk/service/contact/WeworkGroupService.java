package cn.leithda.wework.sdk.service.contact;

import cn.leithda.wework.sdk.po.external.contact.group.*;
import cn.leithda.wework.sdk.service.WeworkBaseService;
import org.springframework.stereotype.Service;

/**
 * 客户群管理
 *
 * @author leithda
 * @since 2022/5/31
 */
@Service
public class WeworkGroupService extends WeworkBaseService {

    /**
     * 获取客户群列表
     */
    public static final String GET_GROUP_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/groupchat/list?access_token=%s";
    /**
     * 获取客户群详情
     */
    public static final String GET_GROUP_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/groupchat/get?access_token=%s";
    /**
     * 客户群opengid转换
     */
    public static final String OPENID_TO_CHATID_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/opengid_to_chatid?access_token=%s";

    /**
     * 获取客户群列表
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92120">获取客户群列表</a>
     */
    public GetGroupListResponse getGroupList(String corpId, GetGroupListRequest request) {
        return executePost(corpId, null, false, GetGroupListResponse.class, GET_GROUP_LIST_URL, request);
    }

    /**
     * 获取客户群详情
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92122">获取客户群详情</a>
     */
    public GetGroupResponse getGroup(String corpId, GetGroupRequest request) {
        return executePost(corpId, null, false, GetGroupResponse.class, GET_GROUP_URL, request);
    }

    /**
     * 客户群 openid 转换
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94822">客户群 openid 转换</a>
     */
    public OpenIdToChatIdResponse openIdToChatId(String corpId, OpenIdToChatIdRequest request) {
        return executePost(corpId, null, false, OpenIdToChatIdResponse.class, OPENID_TO_CHATID_URL, request);
    }


    @Override
    protected int getSecretType() {
        return EXTERNAL;
    }
}
