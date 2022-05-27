package cn.leithda.wework.sdk.service.contact.user;

import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.po.contact.user.CreateUserRequest;
import cn.leithda.wework.sdk.po.contact.user.GetUserResponse;
import cn.leithda.wework.sdk.service.WeworkBaseService;
import org.springframework.stereotype.Service;

/**
 * 成员服务
 *
 * @author leithda
 */
@Service
public class WeworkUserService extends WeworkBaseService {

    /**
     * 创建成员
     */
    public static final String CREATE_USER_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/create?access_token=%s";
    /**
     * 读取成员
     */
    public static final String GET_USER_URL = "https://qyapi.weixin.qq.com/cgi-bin/user/get?access_token=%s&userid=%s";

    /**
     * 创建成员
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90195">创建成员</a>
     */
    public BaseResponse createUser(String corpId, CreateUserRequest request) {
        return executePost(CONTACT, corpId, null, false, BaseResponse.class, CREATE_USER_URL, request);
    }

    /**
     * 读取成员
     * @param corpId 企业ID
     * @param userId 成员UserID。对应管理端的帐号，企业内必须唯一。不区分大小写，长度为1~64个字节
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90196">读取成员</a>
     */
    public GetUserResponse getUser(String corpId, String userId){
        return executeGet(CONTACT, corpId, null, false, GetUserResponse.class, GET_USER_URL, userId);
    }
}
