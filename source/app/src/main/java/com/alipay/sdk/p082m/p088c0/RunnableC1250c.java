package com.alipay.sdk.p082m.p088c0;

import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.sdk.m.c0.c */
/* loaded from: classes2.dex */
public final class RunnableC1250c implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C1249b f22094a;

    static {
        Covode.recordClassIndex(4750);
    }

    public RunnableC1250c(C1249b c1249b) {
        this.f22094a = c1249b;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f22094a.m19334b();
        } catch (Exception e) {
            C1251d.m19331a(e);
        }
    }
}
