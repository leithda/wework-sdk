package cn.leithda.wework.sdk.service;

import cn.leithda.wework.sdk.endpoint.AccessTokenCache;
import cn.leithda.wework.sdk.po.GetAccessTokenResponse;
import cn.leithda.wework.sdk.utils.HttpUtils;
import cn.leithda.wework.sdk.utils.JsonUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.support.membermodification.MemberModifier;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

import java.io.IOException;

@RunWith(PowerMockRunner.class)
@PrepareForTest({
        HttpUtils.class
})
@PowerMockIgnore({"javax.net.ssl.*"})
public class AccessTokenServiceTest {


    AccessTokenService accessTokenService;
    @Mock
    AccessTokenCache accessTokenCache;

    @Before
    public void setUp() throws Exception {
        accessTokenService = new AccessTokenService();
        PowerMockito.mockStatic(HttpUtils.class);
        MemberModifier.field(AccessTokenService.class, "accessTokenCache").set(accessTokenService, accessTokenCache);
    }

    @Test
    public void getAccessToken() {
        try {
            // 命中缓存
            PowerMockito.when(accessTokenCache.getAccessToken(Mockito.anyString(), Mockito.anyString())).thenReturn("accessToken");
            accessTokenService.getAccessToken(false, "corpId", "secret");

            // 缓存未命中
            PowerMockito.when(accessTokenCache.getAccessToken(Mockito.anyString(), Mockito.anyString())).thenReturn("");
            GetAccessTokenResponse getAccessTokenResponse = new GetAccessTokenResponse();
            getAccessTokenResponse.setErrcode(0);
            getAccessTokenResponse.setAccess_token("accessToken");
            getAccessTokenResponse.setExpires_in(7200);
            getAccessTokenResponse.setErrmsg("ok");
            PowerMockito.when(HttpUtils.get(Mockito.anyString())).thenReturn(JsonUtils.toJson(getAccessTokenResponse));
            accessTokenService.getAccessToken(false, "corpId", "secret");

            // 异常
            PowerMockito.when(HttpUtils.get(Mockito.anyString())).thenThrow(new IOException("test"));
            accessTokenService.getAccessToken(false, "corpId", "secret");

        } catch (Exception ignored) {
        }
    }

}