package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.mapcore2d.fx */
/* loaded from: classes19.dex */
public abstract class AbstractRunnableC1719fx implements Runnable {

    /* renamed from: d */
    public AbstractC1720a f23646d;

    /* renamed from: com.amap.api.mapcore2d.fx$a */
    /* loaded from: classes19.dex */
    public interface AbstractC1720a {
        static {
            Covode.recordClassIndex(5268);
        }

        /* renamed from: a */
        void mo17499a(AbstractRunnableC1719fx abstractRunnableC1719fx);

        /* renamed from: b */
        void mo17498b(AbstractRunnableC1719fx abstractRunnableC1719fx);
    }

    static {
        Covode.recordClassIndex(5267);
    }

    /* renamed from: a */
    public abstract void mo17500a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f23646d != null) {
                this.f23646d.mo17499a(this);
            }
            if (Thread.interrupted()) {
                return;
            }
            mo17500a();
            if (!Thread.interrupted() && this.f23646d != null) {
                this.f23646d.mo17498b(this);
            }
        } catch (Throwable th) {
            C1616do.m17866c(th, "ThreadTask", "run");
        }
    }
}
