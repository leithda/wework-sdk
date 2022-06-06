# 回调接入指南

官方文档： https://developer.work.weixin.qq.com/document/path/90930


## 接入回调
1. 通过回调地址实现 corpId及 callbackType 的获取，其中callbackType用于区分同主体不同回调配置。注：可使用`@PathVariable`方式获取
2. 实现 `WeworkCallbackToken` 接口，根据`corpId`及`callbackType`获取token及aeskey逻辑
3. 实现下方表格中接口的 `#doExecute` 方法完成业务处理
4. 使用 `CallbackMsgParser` 完成回调的验签及消息解密
5. 将解密后的消息作为参数传入 `CallbackMsgDispatcher#dispath` 方法即可


## 回调接口
### 通讯录回调
| 回调                                                         | 待实现接口                        |
| ------------------------------------------------------------ | --------------------------------- |
| [创建成员事件](https://developer.work.weixin.qq.com/document/path/90970#%E6%96%B0%E5%A2%9E%E6%88%90%E5%91%98%E4%BA%8B%E4%BB%B6) | `CrateUserCallbackProcessor`      |
| [删除成员事件](https://developer.work.weixin.qq.com/document/path/90970#%E5%88%A0%E9%99%A4%E6%88%90%E5%91%98%E4%BA%8B%E4%BB%B6) | `DeleteUserCallbackProcessor`     |
| [更新成员事件](https://developer.work.weixin.qq.com/document/path/90970#%E6%9B%B4%E6%96%B0%E6%88%90%E5%91%98%E4%BA%8B%E4%BB%B6) | `UpdateUserCallbackProcessor`     |
| [新增部门事件](https://developer.work.weixin.qq.com/document/path/90971#%E6%96%B0%E5%A2%9E%E9%83%A8%E9%97%A8%E4%BA%8B%E4%BB%B6) | `CreatePartCallbackProcessor`     |
| [删除部门事件](https://developer.work.weixin.qq.com/document/path/90971#%E5%88%A0%E9%99%A4%E9%83%A8%E9%97%A8%E4%BA%8B%E4%BB%B6) | `DeletePartCallbackProcessor`     |
| [更新部门事件](https://developer.work.weixin.qq.com/document/path/90971#%E6%9B%B4%E6%96%B0%E9%83%A8%E9%97%A8%E4%BA%8B%E4%BB%B6) | `UpdatePartCallbackProcessor`     |
| [成员标签变更](https://developer.work.weixin.qq.com/document/path/90972) | `UpdateTagCallbackProcessor`      |
| [异步任务完成](https://developer.work.weixin.qq.com/document/path/90973) | `BatchJobCallbackResultProcessor` |



### 客户联系变更回调

| 回调                         | 待实现接口                                |
| ---------------------------- | ----------------------------------------- |
| 添加企业客户事件             | `AddExternalContactCallbackProcessor`     |
| 编辑企业客户事件             | `EditExternalContactCallbackProcessor`    |
| 外部联系人免验证添加成员事件 | `AddHalfExternalContactCallbackProcessor` |
| 删除企业客户事件             | `DelExternalContactCallbackProcessor`     |
| 删除跟进成员事件             | `DelFollowUserCallbackProcessor`          |
| 客户接替失败事件             | `TransferFailCallbackProcessor`           |
| 客户群创建事件               | `CreateChatCallbackProcessor`             |
| 客户群变更事件               | `UpdateChatCallbackProcessor`             |
| 客户群解散事件               | `DismissChatCallbackProcessor`            |
| 企业客户标签创建事件         | `CreateTagCallbackProcessor`              |
| 企业客户标签变更事件         | `UpdateTagCallbackProcessor`              |
| 企业客户标签删除事件         | `DeleteTagCallbackProcessor`              |
| 企业客户标签重排事件         | `ShuffleTagCallbackProcessor`             |

