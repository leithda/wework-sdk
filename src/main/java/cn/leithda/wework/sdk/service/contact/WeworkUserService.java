package cn.leithda.wework.sdk.service.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.po.contact.user.*;
import cn.leithda.wework.sdk.service.contact.WeworkAddressListService;
import org.springframework.stereotype.Service;

/**
 * 成员服务
 *
 * @author leithda
 */
@Service
public class WeworkUserService extends WeworkAddressListService {

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
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90195">创建成员</a>
     */
    public BaseResponse createUser(String corpId, CreateUserRequest request) {
        return executePost(corpId, BaseResponse.class, CREATE_USER_URL, request);
    }

    /**
     * 读取成员
     *
     * @param corpId 企业ID
     * @param userId 成员UserID。对应管理端的帐号，企业内必须唯一。不区分大小写，长度为1~64个字节
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90196">读取成员</a>
     */
    public GetUserResponse getUser(String corpId, String userId) {
        return executeGet(corpId, GetUserResponse.class, GET_USER_URL, userId);
    }

    /**
     * 更新成员
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90197">更新成员</a>
     */
    public BaseResponse updateUser(String corpId, UpdateUserRequest request) {
        return executePost(corpId, BaseResponse.class, UPDATE_USER_URL, request);
    }

    /**
     * 删除成员
     *
     * @param corpId 企业ID
     * @param userId 成员UserID
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90198">删除成员</a>
     */
    public BaseResponse deleteUser(String corpId, String userId) {
        return executeGet(corpId, BaseResponse.class, DELETE_USER_URL, userId);
    }

    /**
     * 批量删除成员
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90199">批量删除成员</a>
     */
    public BaseResponse batchDeleteUser(String corpId, BatchDeleteUserRequest request) {
        return executePost(corpId, BaseResponse.class, BATCH_DELETE_USER_URL, request);
    }

    /**
     * 获取部门成员
     *
     * @param corpId       企业ID
     * @param departmentId 获取的部门id
     * @param fetchChild   是否递归获取子部门下面的成员：1-递归获取，0-只获取本部门
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90200">获取部门成员</a>
     */
    public GetSimpleUserListResponse getSimpleUserList(String corpId, Long departmentId, Integer fetchChild) {
        return executeGet(corpId, GetSimpleUserListResponse.class, GET_SIMPLE_USER_LIST_URL, departmentId, fetchChild);
    }

    /**
     * 获取部门成员详情
     *
     * @param corpId       企业ID
     * @param departmentId 获取的部门id
     * @param fetchChild   1/0：是否递归获取子部门下面的成员
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90201">获取部门成员详情</a>
     */
    public GetUserListResponse getUserList(String corpId, Long departmentId, Integer fetchChild) {
        return executeGet(corpId, GetUserListResponse.class, GET_USER_LIST_URL, departmentId, fetchChild);
    }

    /**
     * userid 与 openid 互换
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90202">userid与openid互换</a>
     */
    public UserId2OpenIdResponse userId2OpenId(String corpId, UserId2OpenIdRequest request) {
        return executePost(corpId, UserId2OpenIdResponse.class, USERID_TO_OPENID_URL, request);
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
        return executeGet(corpId, BaseResponse.class, AUTH_SUCCESS_URL, userId);
    }

    /**
     * 邀请成员
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90975">邀请成员</a>
     */
    public BatchInviteUserResponse batchInviteUser(String corpId, BatchInviteUserRequest request) {
        return executePost(corpId, BatchInviteUserResponse.class, BATCH_INVITE_USER_URL, request);
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
        return executeGet(corpId, GetJoinCorpQrCodeResponse.class, GET_JOIN_CORP_QRCODE_URL, sizeType);
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
        return executePost(corpId, GetActiveStatResponse.class, GET_ACTIVE_STAT_URL, request);
    }

    /**
     * 手机号获取 userid
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     */
    public Mobile2UserIdResponse mobile2UserId(String corpId, Mobile2UserIdRequest request) {
        return executeGet(corpId, Mobile2UserIdResponse.class, MOBILE_TO_USERID_URL, request);
    }

    /**
     * 通用 GET 请求二次封装
     *
     * @param corpId      企业ID
     * @param returnClass 返回类型
     * @param url         请求路径
     * @param param       请求参数
     * @param <T>         返回值类型
     * @return 响应
     */
    private <T extends BaseResponse> T executeGet(String corpId, Class<T> returnClass, String url, Object... param) {
        return executeGet(corpId, null, false, returnClass, url, param);
    }

    /**
     * 通用 POST 请求二次封装
     *
     * @param corpId      企业ID
     * @param returnClass 返回类型
     * @param url         请求路径
     * @param request     请求
     * @param <T>         返回值类型
     * @return 响应
     */
    private <T extends BaseResponse> T executePost(String corpId, Class<T> returnClass, String url, Object request) {
        return executePost(corpId, null, false, returnClass, url, request);
    }
}
