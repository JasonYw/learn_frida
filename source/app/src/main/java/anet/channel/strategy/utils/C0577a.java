package anet.channel.strategy.utils;

import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadScheduledThreadPoolExecutor;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p003X.C116971W2r;

/* renamed from: anet.channel.strategy.utils.a */
/* loaded from: classes2.dex */
public class C0577a {

    /* renamed from: a */
    public static AtomicInteger f20808a = new AtomicInteger(0);

    /* renamed from: b */
    public static ScheduledThreadPoolExecutor f20809b = null;

    static {
        Covode.recordClassIndex(2346);
    }

    /* renamed from: a */
    public static ScheduledThreadPoolExecutor m20800a() {
        MethodCollector.m14708i(91);
        if (f20809b == null) {
            synchronized (C0577a.class) {
                try {
                    if (f20809b == null) {
                        PThreadScheduledThreadPoolExecutor pThreadScheduledThreadPoolExecutor = new PThreadScheduledThreadPoolExecutor(2, new ThreadFactoryC0578b());
                        f20809b = pThreadScheduledThreadPoolExecutor;
                        pThreadScheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
                        C116971W2r.LIZ((ThreadPoolExecutor) f20809b, true);
                    }
                } catch (Throwable th) {
                    MethodCollector.m14707o(91);
                    throw th;
                }
            }
        }
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = f20809b;
        MethodCollector.m14707o(91);
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: a */
    public static void m20799a(Runnable runnable) {
        try {
            m20800a().submit(runnable);
        } catch (Exception e) {
            ALog.m20787e("awcn.AmdcThreadPoolExecutor", "submit task failed", null, e, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m20798a(Runnable runnable, long j) {
        try {
            m20800a().schedule(runnable, j, TimeUnit.MILLISECONDS);
        } catch (Exception e) {
            ALog.m20787e("awcn.AmdcThreadPoolExecutor", "schedule task failed", null, e, new Object[0]);
        }
    }
}
