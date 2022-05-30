
# 使用指南

- 引入依赖

```xml
        <dependency>
            <groupId>cn.leithda</groupId>
            <artifactId>wework-sdk</artifactId>
            <version>RELEASE</version>
        </dependency>
```



- 实现 `WeworkCallbackToken` 接口完成基于corpId与agentid 的获取 secret 操作

- 实现 `AccessTokenCache` 完成基于过期时间的Token缓存


## 服务类列表

| 模块       |                  |                                                              |
| ---------- | ---------------- | ------------------------------------------------------------ |
| 通讯录管理 |                  |                                                              |
|            | 成员管理         | `WeworkUserService`                                          |
|            | 部门管理         | `WeworkDepartmentService`                                    |
|            | 标签管理         | `WeworkTagService`                                           |
|            |                  |                                                              |
| 客户联系   |                  |                                                              |
|            | 企业服务人员管理 |                                                              |
|            | 客户管理         | `WeworkExternalContactService`<br/>`WeworkExternalContactStrategyService` |
|            | 客户标签管理     | `WeworkExternalContactTagService`<br/>`WeworkExternalContactMarkTagService` |
|            | 在职继承         | `WeworkTransferService`                                      |

