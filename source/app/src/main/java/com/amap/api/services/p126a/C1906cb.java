package com.amap.api.services.p126a;

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

/* renamed from: com.amap.api.services.a.cb */
/* loaded from: classes19.dex */
public class C1906cb extends C1901by implements Thread.UncaughtExceptionHandler {

    /* renamed from: e */
    public static ExecutorService f24568e;

    /* renamed from: g */
    public static WeakReference<Context> f24570g;

    /* renamed from: d */
    public Context f24572d;

    /* renamed from: i */
    public List<AbstractC1909a> f24573i;

    /* renamed from: f */
    public static Set<Integer> f24569f = Collections.synchronizedSet(new HashSet());

    /* renamed from: h */
    public static final ThreadFactory f24571h = new ThreadFactory() { // from class: com.amap.api.services.a.cb.2

        /* renamed from: a */
        public final AtomicInteger f24578a = new AtomicInteger(1);

        static {
            Covode.recordClassIndex(5519);
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable, "pama#" + this.f24578a.getAndIncrement());
        }
    };

    /* renamed from: com.amap.api.services.a.cb$a */
    /* loaded from: classes19.dex */
    public interface AbstractC1909a {
        static {
            Covode.recordClassIndex(5520);
        }

        /* renamed from: a */
        void m16713a(Thread thread, Throwable th);
    }

    @Override // com.amap.api.services.p126a.C1901by
    /* renamed from: a */
    public void mo16730a() {
        C1902bz.m16741a(this.f24572d);
    }

    /* renamed from: d */
    public static synchronized C1906cb m16715d() {
        C1906cb c1906cb;
        synchronized (C1906cb.class) {
            c1906cb = (C1906cb) C1901by.f24553a;
        }
        return c1906cb;
    }

    static {
        Covode.recordClassIndex(5517);
    }

    /* renamed from: b */
    public static void m16720b() {
        WeakReference<Context> weakReference = f24570g;
        if (weakReference != null && weakReference.get() != null) {
            C1902bz.m16741a(f24570g.get());
        } else if (C1901by.f24553a != null) {
            C1901by.f24553a.mo16730a();
        }
    }

    /* renamed from: c */
    public static synchronized ExecutorService m16717c() {
        ExecutorService executorService;
        synchronized (C1906cb.class) {
            try {
                if (f24568e == null || f24568e.isShutdown()) {
                    f24568e = new PThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256), f24571h);
                }
            } catch (Throwable unused) {
            }
            executorService = f24568e;
        }
        return executorService;
    }

    /* renamed from: e */
    private void m16714e() {
        try {
            this.f24554b = Thread.getDefaultUncaughtExceptionHandler();
            if (this.f24554b == null) {
                Thread.setDefaultUncaughtExceptionHandler(this);
                this.f24555c = true;
                return;
            }
            String obj = this.f24554b.toString();
            if (!obj.startsWith("com.amap.apis.utils.core.dynamiccore") && (obj.indexOf("com.amap.api") != -1 || obj.indexOf("com.loc") != -1)) {
                this.f24555c = false;
                return;
            }
            Thread.setDefaultUncaughtExceptionHandler(this);
            this.f24555c = true;
        } catch (Throwable unused) {
        }
    }

    public C1906cb(Context context, C1889bo c1889bo) {
        this.f24572d = context;
        m16714e();
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public void uncaughtException(Thread thread, Throwable th) {
        m16722a(thread, th);
        if (th == null) {
            return;
        }
        mo16721a(th, 0, null, null);
        if (this.f24554b != null) {
            try {
                Thread.setDefaultUncaughtExceptionHandler(this.f24554b);
            } catch (Throwable unused) {
            }
            this.f24554b.uncaughtException(thread, th);
        }
    }

    /* renamed from: a */
    public static synchronized C1906cb m16729a(Context context, C1889bo c1889bo) {
        synchronized (C1906cb.class) {
            if (c1889bo != null) {
                if (c1889bo.m16818a() != null && !"".equals(c1889bo.m16818a())) {
                    if (!f24569f.add(Integer.valueOf(c1889bo.hashCode()))) {
                        return (C1906cb) C1901by.f24553a;
                    }
                    if (C1901by.f24553a == null) {
                        C1901by.f24553a = new C1906cb(context, c1889bo);
                    } else {
                        C1901by.f24553a.f24555c = false;
                    }
                    C1901by.f24553a.mo16728a(context, c1889bo, C1901by.f24553a.f24555c);
                    return (C1906cb) C1901by.f24553a;
                }
                throw new C1863be("sdk name is invalid");
            }
            throw new C1863be("sdk info is null");
        }
    }

    /* renamed from: a */
    private void m16722a(Thread thread, Throwable th) {
        for (int i = 0; i < this.f24573i.size() && i < 10; i++) {
            try {
                AbstractC1909a abstractC1909a = this.f24573i.get(i);
                if (abstractC1909a != null) {
                    abstractC1909a.m16713a(thread, th);
                }
            } catch (Throwable unused) {
                return;
            }
        }
    }

    /* renamed from: b */
    public void m16718b(Throwable th, String str, String str2) {
        if (th == null) {
            return;
        }
        try {
            mo16721a(th, 1, str, str2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: b */
    public static void m16719b(C1889bo c1889bo, String str, String str2) {
        try {
            if (C1901by.f24553a != null) {
                C1901by.f24553a.mo16726a(c1889bo, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static void m16716c(Throwable th, String str, String str2) {
        try {
            if (C1901by.f24553a != null) {
                C1901by.f24553a.mo16721a(th, 1, str, str2);
            }
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public static void m16727a(C1889bo c1889bo, String str, C1863be c1863be) {
        if (c1863be != null) {
            m16724a(c1889bo, str, c1863be.m16971c(), c1863be.m16970d(), c1863be.m16969e(), c1863be.m16972b());
        }
    }

    @Override // com.amap.api.services.p126a.C1901by
    /* renamed from: a */
    public void mo16728a(final Context context, final C1889bo c1889bo, final boolean z) {
        try {
            ExecutorService m16717c = m16717c();
            if (m16717c != null && !m16717c.isShutdown()) {
                m16717c.submit(new Runnable() { // from class: com.amap.api.services.a.cb.1
                    static {
                        Covode.recordClassIndex(5518);
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            synchronized (Looper.getMainLooper()) {
                                new C1919ck(context, true).m16669a(c1889bo);
                            }
                            if (z) {
                                C1910cc.m16711a(C1906cb.this.f24572d);
                            }
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        } catch (Throwable unused) {
        }
    }

    @Override // com.amap.api.services.p126a.C1901by
    /* renamed from: a */
    public void mo16726a(C1889bo c1889bo, String str, String str2) {
        C1910cc.m16704a(c1889bo, this.f24572d, str2, str);
    }

    @Override // com.amap.api.services.p126a.C1901by
    /* renamed from: a */
    public void mo16721a(Throwable th, int i, String str, String str2) {
        C1910cc.m16706a(this.f24572d, th, i, str, str2);
    }

    /* renamed from: a */
    public static void m16725a(C1889bo c1889bo, String str, String str2, String str3, String str4) {
        m16724a(c1889bo, str, str2, str3, "", str4);
    }

    /* renamed from: a */
    public static void m16724a(C1889bo c1889bo, String str, String str2, String str3, String str4, String str5) {
        try {
            if (C1901by.f24553a != null) {
                C1901by.f24553a.mo16726a(c1889bo, C0002O.m25080C("path:", str, ",type:", str2, ",gsid:", str3, ",csid:", str4, ",code:", str5), "networkError");
            }
        } catch (Throwable unused) {
        }
    }
}
