package com.amap.api.services.p126a;

import com.amap.api.services.p126a.AbstractRunnableC2001ei;
import com.bytedance.covode.number.Covode;
import com.p1594ss.android.ugc.bytex.pthread.base.proxy.PThreadPoolExecutor;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* renamed from: com.amap.api.services.a.eh */
/* loaded from: classes19.dex */
public final class C1999eh {

    /* renamed from: a */
    public static C1999eh f24816a;

    /* renamed from: b */
    public ExecutorService f24817b;

    /* renamed from: c */
    public ConcurrentHashMap<AbstractRunnableC2001ei, Future<?>> f24818c = new ConcurrentHashMap<>();

    /* renamed from: d */
    public AbstractRunnableC2001ei.AbstractC2002a f24819d = new AbstractRunnableC2001ei.AbstractC2002a() { // from class: com.amap.api.services.a.eh.1
        static {
            Covode.recordClassIndex(5611);
        }

        @Override // com.amap.api.services.p126a.AbstractRunnableC2001ei.AbstractC2002a
        /* renamed from: a */
        public void mo16392a(AbstractRunnableC2001ei abstractRunnableC2001ei) {
        }

        @Override // com.amap.api.services.p126a.AbstractRunnableC2001ei.AbstractC2002a
        /* renamed from: b */
        public void mo16391b(AbstractRunnableC2001ei abstractRunnableC2001ei) {
            C1999eh.this.m16394a(abstractRunnableC2001ei, false);
        }
    };

    static {
        Covode.recordClassIndex(5610);
    }

    /* renamed from: a */
    public static C1999eh m16396a(int i) {
        return new C1999eh(i);
    }

    public C1999eh(int i) {
        try {
            this.f24817b = new PThreadPoolExecutor(i, i, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(256));
        } catch (Throwable th) {
            C1906cb.m16716c(th, "TPool", "ThreadPool");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public synchronized void m16394a(AbstractRunnableC2001ei abstractRunnableC2001ei, boolean z) {
        try {
            Future<?> remove = this.f24818c.remove(abstractRunnableC2001ei);
            if (z && remove != null) {
                remove.cancel(true);
            }
        } catch (Throwable th) {
            C1906cb.m16716c(th, "TPool", "removeQueue");
        }
    }
}
