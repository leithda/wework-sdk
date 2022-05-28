package cn.leithda.wework.sdk.service.contact;

import cn.leithda.wework.sdk.service.WeworkBaseService;

/**
 * 通讯录服务基类
 *
 * @author leithda
 * @since 2022/5/28
 */
public class WeworkAddressListService extends WeworkBaseService {
    @Override
    protected int getSecretType() {
        return CONTACT;
    }
}
