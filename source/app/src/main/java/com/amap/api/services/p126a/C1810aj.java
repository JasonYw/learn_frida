package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: com.amap.api.services.a.aj */
/* loaded from: classes8.dex */
public class C1810aj {

    /* renamed from: c */
    public static volatile C1810aj f24237c;

    /* renamed from: a */
    public BlockingQueue<Runnable> f24238a = new LinkedBlockingQueue();

    /* renamed from: b */
    public ExecutorService f24239b;

    static {
        Covode.recordClassIndex(5421);
    }

    /* renamed from: a */
    public static C1810aj m17072a() {
        if (f24237c == null) {
            synchronized (C1810aj.class) {
                if (f24237c == null) {
                    f24237c = new C1810aj();
                }
            }
        }
        return f24237c;
    }

    /* renamed from: b */
    public static void m17070b() {
        if (f24237c != null) {
            synchronized (C1810aj.class) {
                if (f24237c != null) {
                    f24237c.f24239b.shutdownNow();
                    f24237c.f24239b = null;
                    f24237c = null;
                }
            }
        }
    }

    public C1810aj() {
        this.f24239b = null;
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        this.f24239b = new PThreadPoolExecutor(availableProcessors, availableProcessors * 2, 1L, TimeUnit.SECONDS, this.f24238a, new ThreadPoolExecutor.AbortPolicy());
    }

    /* renamed from: a */
    public void m17071a(Runnable runnable) {
        ExecutorService executorService = this.f24239b;
        if (executorService != null) {
            executorService.execute(runnable);
        }
    }
}
