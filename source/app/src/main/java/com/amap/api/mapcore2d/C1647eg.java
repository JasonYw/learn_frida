package com.amap.api.mapcore2d;

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

/* renamed from: com.amap.api.mapcore2d.eg */
/* loaded from: classes19.dex */
public class C1647eg {

    /* renamed from: a */
    public static final C1647eg f23459a = new C1647eg();

    /* renamed from: d */
    public static final ThreadFactory f23460d = new ThreadFactoryC1649b();

    /* renamed from: b */
    public final Map<String, AbstractC1653ei> f23461b = new HashMap();

    /* renamed from: c */
    public final Map<String, C1648a> f23462c = new HashMap();

    /* renamed from: e */
    public ExecutorService f23463e = null;

    /* renamed from: b */
    public static C1647eg m17710b() {
        return f23459a;
    }

    static {
        Covode.recordClassIndex(5195);
    }

    /* renamed from: a */
    public ExecutorService m17713a() {
        try {
            if (this.f23463e == null || this.f23463e.isShutdown()) {
                this.f23463e = new PThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(128), f23460d);
            }
        } catch (Throwable unused) {
        }
        return this.f23463e;
    }

    /* renamed from: com.amap.api.mapcore2d.eg$a */
    /* loaded from: classes19.dex */
    public class C1648a {

        /* renamed from: a */
        public volatile boolean f23464a;

        /* renamed from: b */
        public volatile boolean f23465b;

        static {
            Covode.recordClassIndex(5196);
        }

        public C1648a() {
        }
    }

    /* renamed from: com.amap.api.mapcore2d.eg$b */
    /* loaded from: classes10.dex */
    public static class ThreadFactoryC1649b implements ThreadFactory {

        /* renamed from: a */
        public final AtomicInteger f23467a = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(5197);
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "amapD#" + this.f23467a.getAndIncrement());
        }
    }

    /* renamed from: b */
    private boolean m17709b(C1599da c1599da) {
        if (c1599da != null && !TextUtils.isEmpty(c1599da.m17968b()) && !TextUtils.isEmpty(c1599da.m17972a())) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public C1648a m17711a(C1599da c1599da) {
        synchronized (this.f23462c) {
            if (!m17709b(c1599da)) {
                return null;
            }
            String m17972a = c1599da.m17972a();
            C1648a c1648a = this.f23462c.get(m17972a);
            if (c1648a == null) {
                try {
                    C1648a c1648a2 = new C1648a();
                    try {
                        this.f23462c.put(m17972a, c1648a2);
                    } catch (Throwable unused) {
                    }
                    c1648a = c1648a2;
                } catch (Throwable unused2) {
                }
            }
            return c1648a;
        }
    }

    /* renamed from: a */
    public AbstractC1653ei m17712a(Context context, C1599da c1599da) {
        AbstractC1653ei abstractC1653ei;
        if (m17709b(c1599da) && context != null) {
            String m17972a = c1599da.m17972a();
            synchronized (this.f23461b) {
                abstractC1653ei = this.f23461b.get(m17972a);
                if (abstractC1653ei == null) {
                    try {
                        C1655ek c1655ek = new C1655ek(context.getApplicationContext(), c1599da, true);
                        try {
                            this.f23461b.put(m17972a, c1655ek);
                            C1641ec.m17748a(context, c1599da);
                        } catch (Throwable unused) {
                        }
                        abstractC1653ei = c1655ek;
                    } catch (Throwable unused2) {
                    }
                }
            }
            return abstractC1653ei;
        }
        return null;
    }
}
