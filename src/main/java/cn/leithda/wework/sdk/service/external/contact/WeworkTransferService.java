package cn.leithda.wework.sdk.service.external.contact;

import cn.leithda.wework.sdk.po.external.contact.transfer.TransferCustomerRequest;
import cn.leithda.wework.sdk.po.external.contact.transfer.TransferCustomerResponse;
import cn.leithda.wework.sdk.po.external.contact.transfer.TransferResultRequest;
import cn.leithda.wework.sdk.po.external.contact.transfer.TransferResultResponse;
import cn.leithda.wework.sdk.service.WeworkBaseService;
import org.springframework.stereotype.Service;

/**
 * 在职继承
 *
 * @author leithda
 * @since 2022/5/30
 */
@Service
public class WeworkTransferService extends WeworkBaseService {

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
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94096">分配在职成员的客户</a>
     */
    public TransferCustomerResponse transferCustomer(String corpId, TransferCustomerRequest request) {
        return executePost(corpId, null, false, TransferCustomerResponse.class, TRANSFER_CUSTOMER_URL, request);
    }

    /**
     * 查询客户接替状态
     *
     * @param corpId  企业ID
     * @param request 请求
     * @return 响应
     * @see <a href="https://developer.work.weixin.qq.com/document/path/94097">查询客户交替状态</a>
     */
    public TransferResultResponse transferResult(String corpId, TransferResultRequest request) {
        return executePost(corpId, null, false, TransferResultResponse.class, TRANSFER_RESULT_URL, request);
    }

    @Override
    protected int getSecretType() {
        return EXTERNAL;
    }
}
