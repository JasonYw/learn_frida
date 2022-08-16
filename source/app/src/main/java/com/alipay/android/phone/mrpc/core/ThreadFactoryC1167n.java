package com.alipay.android.phone.mrpc.core;

import com.bytedance.covode.number.Covode;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.alipay.android.phone.mrpc.core.n */
/* loaded from: classes2.dex */
public final class ThreadFactoryC1167n implements ThreadFactory {

    /* renamed from: a */
    public final AtomicInteger f21904a = new AtomicInteger(1);

    static {
        Covode.recordClassIndex(4638);
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable, "com.alipay.mobile.common.transport.http.HttpManager.HttpWorker #" + this.f21904a.getAndIncrement());
        thread.setPriority(4);
        return thread;
    }
}
