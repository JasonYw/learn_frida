package com.amap.api.services.p126a;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.amap.api.services.a.cs */
/* loaded from: classes19.dex */
public class C1932cs {

    /* renamed from: a */
    public static final C1932cs f24644a = new C1932cs();

    /* renamed from: d */
    public static final ThreadFactory f24645d = new ThreadFactoryC1934b();

    /* renamed from: b */
    public final Map<String, AbstractC1938cu> f24646b = new HashMap();

    /* renamed from: c */
    public final Map<String, C1933a> f24647c = new HashMap();

    /* renamed from: e */
    public ExecutorService f24648e = null;

    /* renamed from: b */
    public static C1932cs m16597b() {
        return f24644a;
    }

    static {
        Covode.recordClassIndex(5543);
    }

    /* renamed from: a */
    public ExecutorService m16600a() {
        try {
            if (this.f24648e == null || this.f24648e.isShutdown()) {
                this.f24648e = new PThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(128), f24645d);
            }
        } catch (Throwable unused) {
        }
        return this.f24648e;
    }

    /* renamed from: com.amap.api.services.a.cs$a */
    /* loaded from: classes19.dex */
    public class C1933a {

        /* renamed from: a */
        public volatile boolean f24649a;

        /* renamed from: b */
        public volatile boolean f24650b;

        static {
            Covode.recordClassIndex(5544);
        }

        public C1933a() {
        }
    }

    /* renamed from: com.amap.api.services.a.cs$b */
    /* loaded from: classes10.dex */
    public static class ThreadFactoryC1934b implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f24652a = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(5545);
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "amapD#" + this.f24652a.getAndIncrement());
        }
    }

    /* renamed from: b */
    private boolean m16596b(C1889bo c1889bo) {
        if (c1889bo != null && !TextUtils.isEmpty(c1889bo.m16814b()) && !TextUtils.isEmpty(c1889bo.m16818a())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C1933a m16598a(C1889bo c1889bo) {
        synchronized (this.f24647c) {
            if (!m16596b(c1889bo)) {
                return null;
            }
            String m16818a = c1889bo.m16818a();
            C1933a c1933a = this.f24647c.get(m16818a);
            if (c1933a == null) {
                try {
                    C1933a c1933a2 = new C1933a();
                    try {
                        this.f24647c.put(m16818a, c1933a2);
                    } catch (Throwable unused) {
                    }
                    c1933a = c1933a2;
                } catch (Throwable unused2) {
                }
            }
            return c1933a;
        }
    }

    /* renamed from: a */
    public AbstractC1938cu m16599a(Context context, C1889bo c1889bo) {
        AbstractC1938cu abstractC1938cu;
        if (m16596b(c1889bo) && context != null) {
            String m16818a = c1889bo.m16818a();
            synchronized (this.f24646b) {
                abstractC1938cu = this.f24646b.get(m16818a);
                if (abstractC1938cu == null) {
                    try {
                        C1940cw c1940cw = new C1940cw(context.getApplicationContext(), c1889bo, true);
                        try {
                            this.f24646b.put(m16818a, c1940cw);
                            C1926co.m16635a(context, c1889bo);
                        } catch (Throwable unused) {
                        }
                        abstractC1938cu = c1940cw;
                    } catch (Throwable unused2) {
                    }
                }
            }
            return abstractC1938cu;
        }
        return null;
    }
}
