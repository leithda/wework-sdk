package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.po.external.contact.*;
import cn.leithda.wework.sdk.service.WeworkBaseService;
import cn.leithda.wework.sdk.utils.StringUtils;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * 客户服务
 *
 * @author leithda
 */
@Service
public class WeworkExternalContactService extends WeworkBaseService {
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

    /**
     * 获取客户列表
     *
     * @param corpId 企业ID
     * @param userId 企业微信成员ID
     * @return 客户列表
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92113">获取客户列表</a>
     */
    public GetExternalContactListResponse getExternalContactList(String corpId, String userId) {
        return executeGet(corpId, null, false, GetExternalContactListResponse.class, GET_EXTERNAL_CONTACT_LIST_URL, userId);
    }

    /**
     * 获取客户详情
     *
     * @param corpId         企业ID
     * @param externalUserId 外部联系人的userid，注意不是企业成员的帐号
     * @return 客户详情
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92114">获取客户详情</a>
     */
    public GetExternalContactResponse getExternalContact(String corpId, String externalUserId) {
        String cursor = "";
        GetExternalContactResponse response = null;
        List<FollowInfo> followInfoList = new ArrayList<>();
        do {
            GetExternalContactResponse getExternalContactResponse = executeGet(corpId, null, false, GetExternalContactResponse.class, GET_EXTERNAL_CONTACT_URL, externalUserId, cursor);
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
     * @param request 请求
     * @return 客户详情列表
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92994">批量获取客户详情</a>
     */
    public BatchGetExternalContactResponse batchGetExternalContact(String corpId, BatchGetExternalContactRequest request) {
        String cursor = "";
        BatchGetExternalContactResponse response = null;
        List<BatchGetExternalContactResponse.ExternalContactInfo> externalContactInfoList = new ArrayList<>();
        do {
            BatchGetExternalContactResponse batchGetExternalContactResponse = executePost(corpId, null, false, BatchGetExternalContactResponse.class, BATCH_GET_EXTERNAL_CONTENT_URL, request);
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
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92115">修改客户备注信息</a>
     */
    public BaseResponse remarkExternalContact(String corpId, RemarkExternalContactRequest request) {
        return executePost(corpId, null, false, BaseResponse.class, REMARK_EXTERNAL_CONTACT_URL, request);
    }


    @Override
    protected int getSecretType() {
        return EXTERNAL;
    }
}
