package com.alibaba.sdk.android.httpdns.p073d;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.httpdns.d.a */
/* loaded from: classes13.dex */
public final class C1049a {

    /* renamed from: b */
    public ExecutorService f21561b;

    /* renamed from: b */
    public final ThreadFactory f21562b = new ThreadFactory() { // from class: com.alibaba.sdk.android.httpdns.d.a.1
        static {
            Covode.recordClassIndex(4456);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "report_thread");
            thread.setDaemon(false);
            return thread;
        }
    };

    static {
        Covode.recordClassIndex(4455);
    }

    /* renamed from: b */
    public final synchronized ExecutorService m19922b() {
        if (this.f21561b == null) {
            this.f21561b = new PThreadPoolExecutor(0, Integer.MAX_VALUE, 1L, TimeUnit.SECONDS, new SynchronousQueue(), this.f21562b);
        }
        return this.f21561b;
    }
}
