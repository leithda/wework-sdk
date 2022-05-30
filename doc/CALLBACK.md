# 回调接入指南



1. 通过回调地址实现 corpId及 callbackType的获取
2. 实现 `WeworkCallbackToken` 接口，根据`corpId`及`callbackType`获取token及aeskey逻辑
3. 实现诸如 CreateUserCallbackProcessor 中的 `#doExecute` 完成业务处理
4. 使用 `CallbackMsgParser` 完成回调的验签及消息解密
5. 将解密后的消息作为参数传入 `CallbackMsgDispatcher#dispath` 方法即可



## 回调接口

| 回调         | 接口                              |
| ------------ | --------------------------------- |
| 创建成员     | `CrateUserCallbackProcessor`      |
| 删除成员     | `DeleteUserCallbackProcessor`     |
| 变更成员     | `UpdateUserCallbackProcessor`     |
| 新增部门     | `CreatePartCallbackProcessor`     |
| 删除部门     | `DeletePartCallbackProcessor`     |
| 变更部门     | `UpdatePartCallbackProcessor`     |
| 成员标签变更 | `UpdateTagCallbackProcessor`      |
| 异步任务完成 | `BatchJobCallbackResultProcessor` |

