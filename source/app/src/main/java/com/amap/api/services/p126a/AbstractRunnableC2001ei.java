package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;

/* renamed from: com.amap.api.services.a.ei */
/* loaded from: classes19.dex */
public abstract class AbstractRunnableC2001ei implements Runnable {

    /* renamed from: d */
    public AbstractC2002a f24821d;

    /* renamed from: com.amap.api.services.a.ei$a */
    /* loaded from: classes19.dex */
    public interface AbstractC2002a {
        static {
            Covode.recordClassIndex(5613);
        }

        /* renamed from: a */
        void mo16392a(AbstractRunnableC2001ei abstractRunnableC2001ei);

        /* renamed from: b */
        void mo16391b(AbstractRunnableC2001ei abstractRunnableC2001ei);
    }

    static {
        Covode.recordClassIndex(5612);
    }

    /* renamed from: a */
    public abstract void mo16393a();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            if (this.f24821d != null) {
                this.f24821d.mo16392a(this);
            }
            if (Thread.interrupted()) {
                return;
            }
            mo16393a();
            if (!Thread.interrupted() && this.f24821d != null) {
                this.f24821d.mo16391b(this);
            }
        } catch (Throwable th) {
            C1906cb.m16716c(th, "ThreadTask", "run");
        }
    }
}
