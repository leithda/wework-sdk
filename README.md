# SDK for 企业微信 Java

## 官方文档地址

https://developer.work.weixin.qq.com/document/path/90664

- [开发进度](./doc/PROCESSING.md)
- [使用指南](./doc/USE.md)
- [回调接入指南](./doc/CALLBACK.md)


## 回调接入指南
1. 回调地址中加入 CorpID，以及 callbackType 用于区分获取回调的不同设置
2. 实现 `WeworkCallbackToken` 接口，根据企业ID及type获取token及aeskey逻辑
3. 实现诸如 CreateUserCallbackProcessor 中的 `#doExecute` 完成业务处理
4. 使用 `CallbackMsgParser` 完成回调的验签及消息解密
5. 将解密后的消息作为参数传入 `CallbackMsgDispatcher#dispath` 方法即可