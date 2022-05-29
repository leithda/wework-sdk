package cn.leithda.wework.sdk.po.callback.job;

import cn.leithda.wework.sdk.po.callback.BaseCallbackEntity;

/**
 * 异步任务完成通知回调实体
 *
 * @author leithda
 * @since 2022/5/29
 */
public class BatchJobResultCallbackEntity extends BaseCallbackEntity {

    /**
     * 异步任务
     */
    private BatchJob batchJob;

    public BatchJob getBatchJob() {
        return batchJob;
    }

    public void setBatchJob(BatchJob batchJob) {
        this.batchJob = batchJob;
    }
}
