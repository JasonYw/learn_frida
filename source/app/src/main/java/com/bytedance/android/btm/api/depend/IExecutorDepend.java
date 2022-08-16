package com.bytedance.android.btm.api.depend;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* loaded from: classes18.dex */
public interface IExecutorDepend {
    static {
        Covode.recordClassIndex(11296);
    }

    ExecutorService getCPUExecutor();

    ExecutorService getIOExecutor();

    ScheduledExecutorService getScheduledExecutor();
}
