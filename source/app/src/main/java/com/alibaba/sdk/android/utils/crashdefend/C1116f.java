package com.alibaba.sdk.android.utils.crashdefend;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.utils.crashdefend.f */
/* loaded from: classes13.dex */
public final class C1116f {

    /* renamed from: a */
    public final ThreadFactory f21738a = new ThreadFactory() { // from class: com.alibaba.sdk.android.utils.crashdefend.f.1
        static {
            Covode.recordClassIndex(4534);
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "safe_thread");
            thread.setDaemon(false);
            return thread;
        }
    };

    /* renamed from: c */
    public ExecutorService f21739c;

    static {
        Covode.recordClassIndex(4533);
    }

    /* renamed from: a */
    public final synchronized ExecutorService m19778a() {
        if (this.f21739c == null) {
            this.f21739c = new PThreadPoolExecutor(0, Integer.MAX_VALUE, 1L, TimeUnit.SECONDS, new SynchronousQueue(), this.f21738a);
        }
        return this.f21739c;
    }
}
