package cn.leithda.wework.sdk.service.external.contact;

import org.junit.Before;
import org.junit.Test;

public class WeworkExternalContactServiceTest {

    WeworkExternalContactService weworkExternalContactService;

    @Before
    public void setUp() throws Exception {
        weworkExternalContactService = new WeworkExternalContactService();
    }

    @Test
    public void getExternalContactList() {
        weworkExternalContactService.getExternalContactList("corpId","userId");
    }

    @Test
    public void getExternalContact() {
        weworkExternalContactService.getExternalContact("corpId", "externalUserId");
    }
}