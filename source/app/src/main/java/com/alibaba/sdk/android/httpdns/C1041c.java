package com.alibaba.sdk.android.httpdns;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* renamed from: com.alibaba.sdk.android.httpdns.c */
/* loaded from: classes2.dex */
public class C1041c {

    /* renamed from: a */
    public static final TimeUnit f21552a = TimeUnit.SECONDS;

    /* renamed from: a */
    public static final ThreadFactory f21551a = new ThreadFactory() { // from class: com.alibaba.sdk.android.httpdns.c.1
        static {
            Covode.recordClassIndex(4448);
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable);
            thread.setName("httpdns worker");
            thread.setDaemon(false);
            thread.setUncaughtExceptionHandler(new C1077k());
            return thread;
        }
    };

    /* renamed from: a */
    public static final ExecutorService f21550a = new PThreadPoolExecutor(0, Integer.MAX_VALUE, 1, f21552a, new SynchronousQueue(), f21551a);

    static {
        Covode.recordClassIndex(4447);
    }

    /* renamed from: a */
    public static ExecutorService m19946a() {
        return f21550a;
    }
}
