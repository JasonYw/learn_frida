package com.amap.api.mapcore2d;

import com.amap.api.mapcore2d.AbstractRunnableC1719fx;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.amap.api.mapcore2d.fw */
/* loaded from: classes19.dex */
public final class C1717fw {

    /* renamed from: a */
    public static C1717fw f23641a;

    /* renamed from: b */
    public ExecutorService f23642b;

    /* renamed from: c */
    public ConcurrentHashMap<AbstractRunnableC1719fx, Future<?>> f23643c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public AbstractRunnableC1719fx.AbstractC1720a f23644d = new AbstractRunnableC1719fx.AbstractC1720a() { // from class: com.amap.api.mapcore2d.fw.1
        static {
            Covode.recordClassIndex(5266);
        }

        @Override // com.amap.api.mapcore2d.AbstractRunnableC1719fx.AbstractC1720a
        /* renamed from: a */
        public void mo17499a(AbstractRunnableC1719fx abstractRunnableC1719fx) {
        }

        @Override // com.amap.api.mapcore2d.AbstractRunnableC1719fx.AbstractC1720a
        /* renamed from: b */
        public void mo17498b(AbstractRunnableC1719fx abstractRunnableC1719fx) {
            C1717fw.this.m17501a(abstractRunnableC1719fx, false);
        }
    };

    static {
        Covode.recordClassIndex(5265);
    }

    /* renamed from: a */
    public static C1717fw m17503a(int i) {
        return new C1717fw(i);
    }

    public C1717fw(int i) {
        try {
            this.f23642b = new PThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256));
        } catch (Throwable th) {
            C1616do.m17866c(th, "TPool", "ThreadPool");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m17501a(AbstractRunnableC1719fx abstractRunnableC1719fx, boolean z) {
        try {
            Future<?> remove = this.f23643c.remove(abstractRunnableC1719fx);
            if (z && remove != null) {
                remove.cancel(true);
            }
        } catch (Throwable th) {
            C1616do.m17866c(th, "TPool", "removeQueue");
        }
    }
}
