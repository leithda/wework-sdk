package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.external.transfer.TransferCustomerRequest;
import cn.leithda.wework.sdk.po.external.transfer.TransferCustomerResponse;
import cn.leithda.wework.sdk.po.external.transfer.TransferResultRequest;
import cn.leithda.wework.sdk.po.external.transfer.TransferResultResponse;
import cn.leithda.wework.sdk.service.BaseWeworkService;
import org.springframework.stereotype.Service;

/**
 * 在职继承
 *
 * @author leithda
 * @since 2022/5/30
 */
@Service
public class WeworkTransferService extends BaseWeworkService {

    /**
     * 分配在职成员的客户
     */
    public static final String TRANSFER_CUSTOMER_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/transfer_customer?access_token=%s";
    /**
     * 查询客户接替状态
     */
    public static final String TRANSFER_RESULT_URL = "https://qyapi.weixin.qq.com/cgi-bin/externalcontact/transfer_result?access_token=%s";

    /**
     * 分配在职成员的客户
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94096">分配在职成员的客户</a>
     */
    public TransferCustomerResponse transferCustomer(String corpId, String agentId, TransferCustomerRequest request) {
        return executePost(corpId, agentId, TransferCustomerResponse.class, TRANSFER_CUSTOMER_URL, request);
    }

    /**
     * 查询客户接替状态
     *
     * @param corpId  企业ID
     * @param agentId 应用ID(指定时通过指定应用访问API)
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94097">查询客户交替状态</a>
     */
    public TransferResultResponse transferResult(String corpId, String agentId, TransferResultRequest request) {
        return executePost(corpId, agentId, TransferResultResponse.class, TRANSFER_RESULT_URL, request);
    }

    @Override
    protected int getSecretType() {
        return EXTERNAL;
    }
}
