package cn.leithda.wework.sdk.service.contact.dept;

import cn.leithda.wework.sdk.endpoint.AccessTokenCache;
import cn.leithda.wework.sdk.endpoint.WeworkSecret;
import cn.leithda.wework.sdk.po.contact.dept.CreateDeptRequest;
import cn.leithda.wework.sdk.po.contact.dept.UpdateDeptRequest;
import cn.leithda.wework.sdk.service.AccessTokenService;
import cn.leithda.wework.sdk.utils.HttpUtils;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.api.support.membermodification.MemberModifier;
import org.powermock.core.classloader.annotations.PowerMockIgnore;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;

@RunWith(PowerMockRunner.class)
@PrepareForTest({
        AccessTokenService.class,
        HttpUtils.class
})
@PowerMockIgnore({"javax.net.ssl.*"})
public class WeworkDepartmentServiceTest {

    WeworkDepartmentService weworkDepartmentService;

    @Mock
    WeworkSecret weworkSecret;
    @Mock
    AccessTokenCache accessTokenCache;


    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        AccessTokenService accessTokenService = PowerMockito.spy(new AccessTokenService());
        PowerMockito.mockStatic(HttpUtils.class);

        weworkDepartmentService = new WeworkDepartmentService();
        MemberModifier.field(AccessTokenService.class, "accessTokenCache").set(accessTokenService, accessTokenCache);
        MemberModifier.field(WeworkDepartmentService.class, "accessTokenService").set(weworkDepartmentService, accessTokenService);
        MemberModifier.field(WeworkDepartmentService.class, "weworkSecret").set(weworkDepartmentService, weworkSecret);
    }

    @Test
    public void getDeptList() {
        weworkDepartmentService.getDeptList("corpId", 1L);
    }

    @Test
    public void getSimpleDeptList(){
        weworkDepartmentService.getSimpleDeptList("corpId", 1L);
    }

    @Test
    public void getDept(){
        weworkDepartmentService.getDept("corpId", 1L);
    }

    @Test
    public void createDept() {
        weworkDepartmentService.createDept("corpId", new CreateDeptRequest());
    }

    @Test
    public void updateDept() {
        weworkDepartmentService.updateDept("corpId", new UpdateDeptRequest());
    }

    @Test
    public void deleteDept() {
        weworkDepartmentService.deleteDept("corpId", 1L);
    }
}