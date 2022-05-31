package cn.leithda.wework.sdk.service.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.po.contact.user.*;
import cn.leithda.wework.sdk.service.BaseWeworkService;
import org.springframework.stereotype.Service;

/**
 * 成员管理
 *
 * @author leithda
 */
@Service
public class WeworkUserService extends BaseWeworkService {

    /**
     * 创建成员
     */
    public static final String CREATE_USER_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/create?access_token=%s";
    /**
     * 读取成员
     */
    public static final String GET_USER_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/get?access_token=%s&userid=%s";
    /**
     * 更新成员
     */
    public static final String UPDATE_USER_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/update?access_token=%s";
    /**
     * 删除成员
     */
    public static final String DELETE_USER_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/delete?access_token=%s&userid=%s";
    /**
     * 批量删除成员
     */
    public static final String BATCH_DELETE_USER_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/batchdelete?access_token=%s";
    /**
     * 获取部门成员
     */
    public static final String GET_SIMPLE_USER_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/simplelist?access_token=%s&department_id=%s&fetch_child=%s";
    /**
     * 获取部门成员详情
     */
    public static final String GET_USER_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/list?access_token=%s&department_id=%s&fetch_child=%s";
    /**
     * userid 与 openid 互换
     */
    public static final String USERID_TO_OPENID_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/convert_to_openid?access_token=%s";
    /**
     * 二次验证
     */
    public static final String AUTH_SUCCESS_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/authsucc?access_token=%s&userid=%s";
    /**
     * 邀请成员
     */
    public static final String BATCH_INVITE_USER_URL = "https://qyapi.weixin.qq.com/cgi-bin/batch/invite?access_token=%s";
    /**
     * 获取加入企业二维码
     */
    public static final String GET_JOIN_CORP_QRCODE_URL = "https://qyapi.weixin.qq.com/cgi-bin/corp/get_join_qrcode?access_token=%s&size_type=%s";
    /**
     * 获取企业活跃成员数
     */
    public static final String GET_ACTIVE_STAT_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/get_active_stat?access_token=%s";
    /**
     * 手机号获取 userid
     */
    public static final String MOBILE_TO_USERID_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/getuserid?access_token=%s";

    /**
     * 创建成员
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90195">创建成员</a>
     */
    public BaseResponse createUser(String corpId, String agentId, CreateUserRequest request) {
        return executePost(corpId, agentId, BaseResponse.class, CREATE_USER_URL, request);
    }

    /**
     * 读取成员
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param userId  成员UserID。对应管理端的帐号，企业内必须唯一。不区分大小写，长度为1~64个字节
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90196">读取成员</a>
     */
    public GetUserResponse getUser(String corpId, String agentId, String userId) {
        return executeGet(corpId, agentId, GetUserResponse.class, GET_USER_URL, userId);
    }

    /**
     * 更新成员
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90197">更新成员</a>
     */
    public BaseResponse updateUser(String corpId, String agentId, UpdateUserRequest request) {
        return executePost(corpId, agentId, BaseResponse.class, UPDATE_USER_URL, request);
    }

    /**
     * 删除成员
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param userId  成员UserID
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90198">删除成员</a>
     */
    public BaseResponse deleteUser(String corpId, String agentId, String userId) {
        return executeGet(corpId, agentId, BaseResponse.class, DELETE_USER_URL, userId);
    }

    /**
     * 批量删除成员
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90199">批量删除成员</a>
     */
    public BaseResponse batchDeleteUser(String corpId, String agentId, BatchDeleteUserRequest request) {
        return executePost(corpId, agentId, BaseResponse.class, BATCH_DELETE_USER_URL, request);
    }

    /**
     * 获取部门成员
     *
     * @param corpId       企业ID
     * @param agentId      应用ID(指定时通过指定应用访问API)
     * @param departmentId 获取的部门id
     * @param fetchChild   是否递归获取子部门下面的成员：1-递归获取，0-只获取本部门
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90200">获取部门成员</a>
     */
    public GetSimpleUserListResponse getSimpleUserList(String corpId, String agentId, Long departmentId, Integer fetchChild) {
        return executeGet(corpId, agentId, GetSimpleUserListResponse.class, GET_SIMPLE_USER_LIST_URL, departmentId, fetchChild);
    }

    /**
     * 获取部门成员详情
     *
     * @param corpId       企业ID
     * @param agentId      应用ID(指定时通过指定应用访问API)
     * @param departmentId 获取的部门id
     * @param fetchChild   1/0：是否递归获取子部门下面的成员
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90201">获取部门成员详情</a>
     */
    public GetUserListResponse getUserList(String corpId, String agentId, Long departmentId, Integer fetchChild) {
        return executeGet(corpId, agentId, GetUserListResponse.class, GET_USER_LIST_URL, departmentId, fetchChild);
    }

    /**
     * userid 与 openid 互换
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90202">userid与openid互换</a>
     */
    public UserId2OpenIdResponse userId2OpenId(String corpId, String agentId, UserId2OpenIdRequest request) {
        return executePost(corpId, agentId, UserId2OpenIdResponse.class, USERID_TO_OPENID_URL, request);
    }

    /**
     * 二次验证
     *
     * @param corpId 企业ID
     * @param userId 成员UserID。对应管理端的帐号
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90203">二次验证</a>
     */
    public BaseResponse authSuccess(String corpId, String userId) {
        return executeGet(corpId, null, BaseResponse.class, AUTH_SUCCESS_URL, userId);
    }

    /**
     * 邀请成员
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90975">邀请成员</a>
     */
    public BatchInviteUserResponse batchInviteUser(String corpId, String agentId, BatchInviteUserRequest request) {
        return executePost(corpId, agentId, BatchInviteUserResponse.class, BATCH_INVITE_USER_URL, request);
    }

    /**
     * 获取加入企业二维码
     *
     * @param corpId   企业ID
     * @param sizeType qrcode尺寸类型，1=171 x 171， 2= 399 x 399， 3= 741 x 741， 4= 2052 x 2052
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/91714">获取加入企业二维码</a>
     */
    public GetJoinCorpQrCodeResponse getJoinCorpQrCode(String corpId, Integer sizeType) {
        return executeGet(corpId, null, GetJoinCorpQrCodeResponse.class, GET_JOIN_CORP_QRCODE_URL, sizeType);
    }

    /**
     * 获取企业活跃成员数
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92714">获取企业活跃成员数</a>
     */
    public GetActiveStatResponse getActiveStat(String corpId, GetActiveStatRequest request) {
        return executePost(corpId, null, GetActiveStatResponse.class, GET_ACTIVE_STAT_URL, request);
    }

    /**
     * 手机号获取 userid
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     */
    public Mobile2UserIdResponse mobile2UserId(String corpId, String agentId, Mobile2UserIdRequest request) {
        return executeGet(corpId, agentId, Mobile2UserIdResponse.class, MOBILE_TO_USERID_URL, request);
    }

    @Override
    protected int getSecretType() {
        return CONTACT;
    }
}
