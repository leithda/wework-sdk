package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.external.contact.group.*;
import cn.leithda.wework.sdk.service.BaseWeworkService;
import cn.leithda.wework.sdk.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 客户群管理
 *
 * @author leithda
 * @since 2022/5/31
 */
@Service
public class WeworkGroupService extends BaseWeworkService {

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
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92120">获取客户群列表</a>
     */
    public GetGroupListResponse getGroupList(String corpId, String agentId, GetGroupListRequest request) {
        String cursor;
        GetGroupListResponse response = null;
        List<GetGroupListResponse.GroupList> groupList = new ArrayList<>();
        do {
            GetGroupListResponse getGroupListResponse = executePost(corpId, agentId, GetGroupListResponse.class, GET_GROUP_LIST_URL, request);
            response = Objects.isNull(response) ? getGroupListResponse : response;
            groupList.addAll(getGroupListResponse.getGroup_chat_list());
            cursor = getGroupListResponse.getNext_cursor();
        } while (StringUtils.isNotEmpty(cursor));
        response.setGroup_chat_list(groupList);
        return response;
    }

    /**
     * 获取客户群详情
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92122">获取客户群详情</a>
     */
    public GetGroupResponse getGroup(String corpId, String agentId, GetGroupRequest request) {
        return executePost(corpId, agentId, GetGroupResponse.class, GET_GROUP_URL, request);
    }

    /**
     * 客户群 openid 转换
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94822">客户群 openid 转换</a>
     */
    public OpenIdToChatIdResponse openIdToChatId(String corpId, String agentId, OpenIdToChatIdRequest request) {
        return executePost(corpId, agentId, OpenIdToChatIdResponse.class, OPENID_TO_CHATID_URL, request);
    }


    @Override
    protected int getSecretType() {
        return CONTACT;
    }
}
