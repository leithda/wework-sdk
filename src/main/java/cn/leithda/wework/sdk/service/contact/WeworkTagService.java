package cn.leithda.wework.sdk.service.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.po.contact.tag.*;
import cn.leithda.wework.sdk.service.BaseWeworkService;
import org.springframework.stereotype.Service;

/**
 * 标签管理
 *
 * @author leithda
 * @since 2022/5/28
 */
@Service
public class WeworkTagService extends BaseWeworkService {

    /**
     * 创建标签
     */
    public static final String CREATE_TAG_URL = "https://qyapi.weixin.qq.com/cgi-bin/tag/create?access_token=%s";
    /**
     * 更新标签
     */
    public static final String UPDATE_TAG_URL = "https://qyapi.weixin.qq.com/cgi-bin/tag/update?access_token=%s";
    /**
     * 删除标签
     */
    public static final String DELETE_TAG_URL = "https://qyapi.weixin.qq.com/cgi-bin/tag/delete?access_token=%s&tagid=%s";
    /**
     * 获取标签成员
     */
    public static final String GET_TAG_USERS_URL = "https://qyapi.weixin.qq.com/cgi-bin/tag/get?access_token=%s&tagid=%s";
    /**
     * 创建标签成员
     */
    public static final String ADD_TAG_USERS_URL = "https://qyapi.weixin.qq.com/cgi-bin/tag/addtagusers?access_token=%s";
    /**
     * 删除标签成员
     */
    public static final String DEL_TAG_USERS_URL = "https://qyapi.weixin.qq.com/cgi-bin/tag/deltagusers?access_token=%s";
    /**
     * 获取标签列表
     */
    public static final String GET_TAG_LIST_URL = "https://qyapi.weixin.qq.com/cgi-bin/tag/list?access_token=%s";

    /**
     * 创建标签
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90210">创建标签</a>
     */
    public CreateTagResponse createTag(String corpId, String agentId, CreateTagRequest request) {
        return executePost(corpId, agentId, CreateTagResponse.class, CREATE_TAG_URL, request);
    }

    /**
     * 更新标签
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90211">更新标签</a>
     */
    public BaseResponse updateTag(String corpId, String agentId, UpdateTagRequest request) {
        return executePost(corpId, agentId, BaseResponse.class, UPDATE_TAG_URL, request);
    }

    /**
     * 删除标签
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param tagId   标签ID
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90212">删除标签</a>
     */
    public BaseResponse deleteTag(String corpId, String agentId, Long tagId) {
        return executeGet(corpId, agentId, BaseResponse.class, DELETE_TAG_URL, tagId);
    }

    /**
     * 获取标签成员
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param tagId   标签ID
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90213">获取标签成员</a>
     */
    public GetTagUsersResponse getTagUsers(String corpId, String agentId, Long tagId) {
        return executeGet(corpId, agentId, GetTagUsersResponse.class, GET_TAG_USERS_URL, tagId);
    }

    /**
     * 增加标签成员
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90214">增加标签成员</a>
     */
    public AddTagUsersResponse addTagUsers(String corpId, String agentId, AddTagUsersRequest request) {
        return executePost(corpId, agentId, AddTagUsersResponse.class, ADD_TAG_USERS_URL, request);
    }

    /**
     * 删除标签成员
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90215">删除标签成员</a>
     */
    public DelTagUsersResponse delTagUsers(String corpId, String agentId, DelTagUsersRequest request) {
        return executePost(corpId, agentId, DelTagUsersResponse.class, DEL_TAG_USERS_URL, request);
    }

    /**
     * 获取标签列表
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/90216">获取标签列表</a>
     */
    public GetTagListResponse getTagList(String corpId, String agentId) {
        return executeGet(corpId, agentId, GetTagListResponse.class, GET_TAG_LIST_URL);
    }


    @Override
    protected int getSecretType() {
        return CONTACT;
    }
}
