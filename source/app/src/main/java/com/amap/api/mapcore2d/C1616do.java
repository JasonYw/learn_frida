package com.amap.api.mapcore2d;

import android.content.Context;
import android.os.Looper;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.lang.Thread;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import p002O.C0002O;

/* renamed from: com.amap.api.mapcore2d.do */
/* loaded from: classes19.dex */
public class C1616do extends C1612dl implements Thread.UncaughtExceptionHandler {

    /* renamed from: e */
    public static ExecutorService f23362e;

    /* renamed from: g */
    public static WeakReference<Context> f23364g;

    /* renamed from: d */
    public Context f23366d;

    /* renamed from: i */
    public List<AbstractC1619a> f23367i;

    /* renamed from: f */
    public static Set<Integer> f23363f = Collections.synchronizedSet(new HashSet());

    /* renamed from: h */
    public static final ThreadFactory f23365h = new ThreadFactory() { // from class: com.amap.api.mapcore2d.do.2

        /* renamed from: a */
        public final AtomicInteger f23372a = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(5166);
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "pama#" + this.f23372a.getAndIncrement());
        }
    };

    /* renamed from: com.amap.api.mapcore2d.do$a */
    /* loaded from: classes19.dex */
    public interface AbstractC1619a {
        static {
            Covode.recordClassIndex(5167);
        }

        /* renamed from: a */
        void m17862a(Thread thread, Throwable th);
    }

    @Override // com.amap.api.mapcore2d.C1612dl
    /* renamed from: a */
    public void mo17879a() {
        C1613dm.m17885b(this.f23366d);
    }

    /* renamed from: e */
    public static synchronized C1616do m17864e() {
        C1616do c1616do;
        synchronized (C1616do.class) {
            c1616do = (C1616do) C1612dl.f23346a;
        }
        return c1616do;
    }

    static {
        Covode.recordClassIndex(5164);
    }

    /* renamed from: c */
    public static void m17867c() {
        WeakReference<Context> weakReference = f23364g;
        if (weakReference != null && weakReference.get() != null) {
            C1613dm.m17885b(f23364g.get());
        } else if (C1612dl.f23346a != null) {
            C1612dl.f23346a.mo17879a();
        }
    }

    /* renamed from: b */
    public static synchronized void m17870b() {
        synchronized (C1616do.class) {
            try {
                if (f23362e != null) {
                    f23362e.shutdown();
                }
                C1658em.m17674a();
            } catch (Throwable unused) {
            }
            try {
                if (C1612dl.f23346a != null && Thread.getDefaultUncaughtExceptionHandler() == C1612dl.f23346a && C1612dl.f23346a.f23347b != null) {
                    Thread.setDefaultUncaughtExceptionHandler(C1612dl.f23346a.f23347b);
                }
                C1612dl.f23346a = null;
            } catch (Throwable unused2) {
            }
        }
    }

    /* renamed from: d */
    public static synchronized ExecutorService m17865d() {
        ExecutorService executorService;
        synchronized (C1616do.class) {
            try {
                if (f23362e == null || f23362e.isShutdown()) {
                    f23362e = new PThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256), f23365h);
                }
            } catch (Throwable unused) {
            }
            executorService = f23362e;
        }
        return executorService;
    }

    /* renamed from: f */
    private void m17863f() {
        try {
            this.f23347b = Thread.getDefaultUncaughtExceptionHandler();
            if (this.f23347b == null) {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.f23348c = true;
                return;
            }
            String obj = this.f23347b.toString();
            if (!obj.startsWith("com.amap.apis.utils.core.dynamiccore") && (obj.indexOf("com.amap.api") != -1 || obj.indexOf("com.loc") != -1)) {
                this.f23348c = false;
                return;
            }
            Thread.setDefaultUncaughtExceptionHandler(this);
            this.f23348c = true;
        } catch (Throwable unused) {
        }
    }

    public C1616do(Context context, C1599da c1599da) {
        this.f23366d = context;
        m17863f();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        m17872a(thread, th);
        if (th == null) {
            return;
        }
        mo17871a(th, 0, null, null);
        if (this.f23347b != null) {
            try {
                Thread.setDefaultUncaughtExceptionHandler(this.f23347b);
            } catch (Throwable unused) {
            }
            this.f23347b.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    public static synchronized C1616do m17878a(Context context, C1599da c1599da) {
        synchronized (C1616do.class) {
            if (c1599da != null) {
                if (c1599da.m17972a() != null && !"".equals(c1599da.m17972a())) {
                    try {
                        new C1622dq().m17843a(context);
                    } catch (Throwable unused) {
                    }
                    if (!f23363f.add(Integer.valueOf(c1599da.hashCode()))) {
                        return (C1616do) C1612dl.f23346a;
                    }
                    if (C1612dl.f23346a == null) {
                        C1612dl.f23346a = new C1616do(context, c1599da);
                    } else {
                        C1612dl.f23346a.f23348c = false;
                    }
                    C1612dl.f23346a.mo17877a(context, c1599da, C1612dl.f23346a.f23348c);
                    return (C1616do) C1612dl.f23346a;
                }
                throw new C1572cp("sdk name is invalid");
            }
            throw new C1572cp("sdk info is null");
        }
    }

    /* renamed from: a */
    private void m17872a(Thread thread, Throwable th) {
        for (int i = 0; i < this.f23367i.size() && i < 10; i++) {
            try {
                AbstractC1619a abstractC1619a = this.f23367i.get(i);
                if (abstractC1619a != null) {
                    abstractC1619a.m17862a(thread, th);
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    /* renamed from: b */
    public void m17868b(Throwable th, String str, String str2) {
        if (th == null) {
            return;
        }
        try {
            mo17871a(th, 1, str, str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m17869b(C1599da c1599da, String str, String str2) {
        try {
            if (C1612dl.f23346a != null) {
                C1612dl.f23346a.mo17875a(c1599da, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static void m17866c(Throwable th, String str, String str2) {
        try {
            if (C1612dl.f23346a != null) {
                C1612dl.f23346a.mo17871a(th, 1, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.mapcore2d.C1612dl
    /* renamed from: a */
    public void mo17875a(C1599da c1599da, String str, String str2) {
        C1620dp.m17847b(c1599da, this.f23366d, str2, str);
    }

    /* renamed from: a */
    public static void m17876a(C1599da c1599da, String str, C1572cp c1572cp) {
        if (c1572cp != null) {
            m17874a(c1599da, str, c1572cp.m18128c(), c1572cp.m18127d(), c1572cp.m18129b());
        }
    }

    @Override // com.amap.api.mapcore2d.C1612dl
    /* renamed from: a */
    public void mo17877a(final Context context, final C1599da c1599da, final boolean z) {
        try {
            ExecutorService m17865d = m17865d();
            if (m17865d != null && !m17865d.isShutdown()) {
                m17865d.submit(new Runnable() { // from class: com.amap.api.mapcore2d.do.1
                    static {
                        Covode.recordClassIndex(5165);
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            synchronized (Looper.getMainLooper()) {
                                new C1632dy(context, true).m17798a(c1599da);
                            }
                            if (z) {
                                C1620dp.m17860a(C1616do.this.f23366d);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.mapcore2d.C1612dl
    /* renamed from: a */
    public void mo17871a(Throwable th, int i, String str, String str2) {
        C1620dp.m17855a(this.f23366d, th, i, str, str2);
    }

    /* renamed from: a */
    public static void m17874a(C1599da c1599da, String str, String str2, String str3, String str4) {
        try {
            if (C1612dl.f23346a != null) {
                C1612dl.f23346a.mo17875a(c1599da, C0002O.m25080C("path:", str, ",type:", str2, ",gsid:", str3, ",code:", str4), "networkError");
            }
        } catch (Throwable unused) {
        }
    }
}
