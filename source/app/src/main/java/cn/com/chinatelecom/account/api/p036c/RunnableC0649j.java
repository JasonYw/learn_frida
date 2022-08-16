package cn.com.chinatelecom.account.api.p036c;

import com.bytedance.covode.number.Covode;

/* renamed from: cn.com.chinatelecom.account.api.c.j */
/* loaded from: classes2.dex */
public final class RunnableC0649j implements Runnable {

    /* renamed from: a */
    public /* synthetic */ long f20940a;

    /* renamed from: b */
    public /* synthetic */ C0648i f20941b;

    static {
        Covode.recordClassIndex(2700);
    }

    public RunnableC0649j(C0648i c0648i, long j) {
        this.f20941b = c0648i;
        this.f20940a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20941b.f20937a.mo20712a(System.currentTimeMillis() - this.f20940a);
    }
}
