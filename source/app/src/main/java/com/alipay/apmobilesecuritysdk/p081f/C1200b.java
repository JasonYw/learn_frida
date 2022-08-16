package com.alipay.apmobilesecuritysdk.p081f;

import com.bytedance.covode.number.Covode;
import java.util.LinkedList;

/* renamed from: com.alipay.apmobilesecuritysdk.f.b */
/* loaded from: classes2.dex */
public final class C1200b {

    /* renamed from: a */
    public static C1200b f21976a = new C1200b();

    /* renamed from: b */
    public Thread f21977b = null;

    /* renamed from: c */
    public LinkedList<Runnable> f21978c = new LinkedList<>();

    static {
        Covode.recordClassIndex(4672);
    }

    /* renamed from: a */
    public static C1200b m19493a() {
        return f21976a;
    }

    /* renamed from: a */
    public final synchronized void m19491a(Runnable runnable) {
        this.f21978c.add(runnable);
        if (this.f21977b == null) {
            Thread thread = new Thread(new RunnableC1201c(this));
            this.f21977b = thread;
            thread.start();
        }
    }
}
