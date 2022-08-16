package com.alibaba.sdk.android.utils;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.alibaba.sdk.android.utils.a */
/* loaded from: classes13.dex */
public class ThreadFactoryC1107a implements ThreadFactory {
    static {
        Covode.recordClassIndex(4523);
    }

    @Override // java.util.concurrent.ThreadFactory
    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setUncaughtExceptionHandler(new C1108b());
        return thread;
    }
}
