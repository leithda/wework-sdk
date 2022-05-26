package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.external.contact.FollowUser;
import cn.leithda.wework.sdk.po.external.contact.GetExternalContactListResponse;
import cn.leithda.wework.sdk.po.external.contact.GetExternalContactResponse;
import cn.leithda.wework.sdk.service.WeworkBaseService;
import cn.leithda.wework.sdk.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service
public class WeworkExternalContactService extends WeworkBaseService {

    public static final String GET_EXTERNAL_CONTACT_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/list?access_token=%s&userid=%s";

    public static final String GET_EXTERNAL_CONTACT_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/get?access_token=%s&external_userid=%s&cursor=%s";

    /**
     * 获取客户列表
     *
     * @param corpId 企业微信主体ID
     * @param userId 企业微信成员ID
     * @return 客户列表
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92113">获取客户列表</a>
     */
    public GetExternalContactListResponse getExternalContactList(String corpId, String userId) {
        return executeGet(EXTERNAL, corpId, null, false, GetExternalContactListResponse.class, GET_EXTERNAL_CONTACT_LIST_URL, userId);
    }

    /**
     * 获取客户详情
     *
     * @param corpId         企业微信主体ID
     * @param externalUserId 外部联系人的userid，注意不是企业成员的帐号
     * @return 客户详情
     */
    public GetExternalContactResponse getExternalContact(String corpId, String externalUserId) {
        String cursor = "";
        GetExternalContactResponse response = null;
        List<FollowUser> followUserList = new ArrayList<>();
        do {
            GetExternalContactResponse getExternalContactResponse = executeGet(EXTERNAL, corpId, null, false, GetExternalContactResponse.class, GET_EXTERNAL_CONTACT_URL, externalUserId, cursor);
            response = Objects.isNull(response) ? getExternalContactResponse : response;
            followUserList.addAll(getExternalContactResponse.getFollow_user());
            cursor = getExternalContactResponse.getNext_cursor();
        } while (StringUtils.isNotEmpty(cursor));
        response.setFollow_user(followUserList);
        return response;
    }

}
