package com.alibaba.sdk.android.httpdns;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;

/* renamed from: com.alibaba.sdk.android.httpdns.j */
/* loaded from: classes19.dex */
public class C1075j {

    /* renamed from: a */
    public static ScheduledExecutorService f21616a;

    /* renamed from: a */
    public static final ThreadFactory f21617a = new ThreadFactory() { // from class: com.alibaba.sdk.android.httpdns.j.1
        static {
            Covode.recordClassIndex(4482);
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

    static {
        Covode.recordClassIndex(4481);
    }

    /* renamed from: a */
    public static synchronized ScheduledExecutorService m19879a() {
        ScheduledExecutorService scheduledExecutorService;
        synchronized (C1075j.class) {
            if (f21616a == null) {
                f21616a = new PThreadScheduledThreadPoolExecutor(1, f21617a);
            }
            scheduledExecutorService = f21616a;
        }
        return scheduledExecutorService;
    }
}
