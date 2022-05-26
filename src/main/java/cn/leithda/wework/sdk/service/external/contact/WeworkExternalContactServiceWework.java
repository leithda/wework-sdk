package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.external.contact.GetExternalContactListResponse;
import cn.leithda.wework.sdk.service.WeworkBaseService;
import org.springframework.stereotype.Service;

@Service
public class WeworkExternalContactServiceWework extends WeworkBaseService {

    public static final String GET_EXTERNAL_CONTACT_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/list?access_token=?&userid=?";

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
}
