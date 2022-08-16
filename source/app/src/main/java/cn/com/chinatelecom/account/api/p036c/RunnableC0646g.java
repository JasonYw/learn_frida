package cn.com.chinatelecom.account.api.p036c;

import com.bytedance.covode.number.Covode;

/* renamed from: cn.com.chinatelecom.account.api.c.g */
/* loaded from: classes2.dex */
public final class RunnableC0646g implements Runnable {

    /* renamed from: a */
    public /* synthetic */ AbstractC0644e f20932a;

    /* renamed from: b */
    public /* synthetic */ C0645f f20933b;

    static {
        Covode.recordClassIndex(2697);
    }

    public RunnableC0646g(C0645f c0645f, AbstractC0644e abstractC0644e) {
        this.f20933b = c0645f;
        this.f20932a = abstractC0644e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean m20699d;
        m20699d = this.f20933b.m20699d();
        if (m20699d || this.f20932a == null) {
            return;
        }
        this.f20933b.m20701c();
        this.f20932a.mo20713a();
    }
}
