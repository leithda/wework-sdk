package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.BaseResponse;
import cn.leithda.wework.sdk.po.external.joinway.*;
import cn.leithda.wework.sdk.service.BaseWeworkService;
import org.springframework.stereotype.Service;

/**
 * 客户群「加入群聊」管理
 *
 * @author leithda
 * @since 2022/6/1
 */
@Service
public class WeworkJoinWayService extends BaseWeworkService {

    /**
     * 配置客户群进群方式
     */
    public static final String ADD_JOIN_WAY_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/groupchat/add_join_way?access_token=%s";
    /**
     * 获取客户群进群方式配置
     */
    public static final String GET_JOIN_WAY_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/groupchat/get_join_way?access_token=%s";
    /**
     * 更新客户群进群方式配置
     */
    public static final String UPDATE_JOIN_WAY_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/groupchat/update_join_way?access_token=%s";
    /**
     * 删除客户群进群方式配置
     */
    public static final String DEL_JOIN_WAY_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/groupchat/del_join_way?access_token=%s";

    /**
     * 配置客户群进群方式
     *
     * @param corpId  企业ID
     * @param agentId 应用ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92229#%E9%85%8D%E7%BD%AE%E5%AE%A2%E6%88%B7%E7%BE%A4%E8%BF%9B%E7%BE%A4%E6%96%B9%E5%BC%8F">配置客户群进群方式</a>
     */
    public AddJoinWayResponse addJoinWay(String corpId, String agentId, AddJoinWayRequest request) {
        return executePost(corpId, agentId, AddJoinWayResponse.class, ADD_JOIN_WAY_URL, request);
    }

    /**
     * 获取客户群进群方式配置
     *
     * @param corpId  企业ID
     * @param agentId 应用ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92229#%E8%8E%B7%E5%8F%96%E5%AE%A2%E6%88%B7%E7%BE%A4%E8%BF%9B%E7%BE%A4%E6%96%B9%E5%BC%8F%E9%85%8D%E7%BD%AE">获取客户群进群方式配置</a>
     */
    public GetJoinWayResponse getJoinWay(String corpId, String agentId, GetJoinWayRequest request) {
        return executePost(corpId, agentId, GetJoinWayResponse.class, GET_JOIN_WAY_URL, request);
    }

    /**
     * 更新客户群进群方式配置
     *
     * @param corpId  企业ID
     * @param agentId 应用ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92229#%E6%9B%B4%E6%96%B0%E5%AE%A2%E6%88%B7%E7%BE%A4%E8%BF%9B%E7%BE%A4%E6%96%B9%E5%BC%8F%E9%85%8D%E7%BD%AE">更新客户群进群方式配置</a>
     */
    public BaseResponse updateJoinWay(String corpId, String agentId, UpdateJoinWayRequest request) {
        return executePost(corpId, agentId, BaseResponse.class, UPDATE_JOIN_WAY_URL, request);
    }

    /**
     * 删除客户群进群方式配置
     *
     * @param corpId  企业ID
     * @param agentId 应用ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/92229#%E5%88%A0%E9%99%A4%E5%AE%A2%E6%88%B7%E7%BE%A4%E8%BF%9B%E7%BE%A4%E6%96%B9%E5%BC%8F%E9%85%8D%E7%BD%AE">删除客户群进群方式配置</a>
     */
    public BaseResponse delJoinWay(String corpId, String agentId, DelJoinWayRequest request) {
        return executePost(corpId, agentId, BaseResponse.class, DEL_JOIN_WAY_URL, request);
    }

    @Override
    protected int getSecretType() {
        return EXTERNAL;
    }
}
