package com.alibaba.p052a.p061b.p068g;

import com.alibaba.p052a.p061b.C0941a;
import com.alibaba.p052a.p061b.p062a.C0942a;
import com.alibaba.p052a.p061b.p063b.C0949a;
import com.alibaba.p052a.p061b.p065d.C0960b;
import com.alibaba.p052a.p061b.p065d.C0974i;
import com.alibaba.p052a.p061b.p065d.C0989s;
import com.bytedance.covode.number.Covode;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;
import java.util.Random;

/* renamed from: com.alibaba.a.b.g.a */
/* loaded from: classes13.dex */
public class C1003a {

    /* renamed from: a */
    public static C1003a f21498a = new C1003a();

    /* renamed from: b */
    public long f21499b = C0942a.m20217d();

    /* renamed from: c */
    public boolean f21500c = false;

    /* renamed from: d */
    public int f21501d;

    static {
        Covode.recordClassIndex(4313);
    }

    /* renamed from: a */
    public static C1003a m20036a() {
        return f21498a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public long m20030e() {
        C0974i.m20098a("UploadEngine", "UTDC.bBackground:", Boolean.valueOf(C0941a.f21273a), "AppInfoUtil.isForeground(UTDC.getContext()) ", Boolean.valueOf(C0960b.m20141a(C0941a.m20233c())));
        boolean z = !C0960b.m20141a(C0941a.m20233c());
        C0941a.f21273a = z;
        C0942a.m20217d();
        this.f21499b = (z ? C0942a.m20215e() : C0942a.m20217d()) + this.f21501d;
        if (C0942a.m20221b()) {
            this.f21499b = JsBridgeDelegate.GET_URL_OUT_TIME;
        }
        return this.f21499b;
    }

    /* renamed from: b */
    public synchronized void m20034b() {
        this.f21500c = true;
        if (C0989s.m20062a().m20056b(2)) {
            C0989s.m20062a().m20061a(2);
        }
        m20030e();
        Random random = new Random();
        if (!AbstractRunnableC1005b.m20021c()) {
            C0989s.m20062a().m20059a(2, new AbstractRunnableC1005b() { // from class: com.alibaba.a.b.g.a.1
                static {
                    Covode.recordClassIndex(4314);
                }

                @Override // com.alibaba.p052a.p061b.p068g.AbstractRunnableC1005b
                /* renamed from: a */
                public void mo20029a() {
                    if (C1003a.this.f21500c) {
                        C0949a.m20174k();
                        C1003a.this.m20030e();
                        C0974i.m20098a("UploadTask", "mPeriod:", Long.valueOf(C1003a.this.f21499b));
                        if (C0989s.m20062a().m20056b(2)) {
                            C0989s.m20062a().m20061a(2);
                        }
                        if (AbstractRunnableC1005b.m20021c()) {
                            return;
                        }
                        C0989s.m20062a().m20059a(2, this, C1003a.this.f21499b);
                    }
                }

                @Override // com.alibaba.p052a.p061b.p068g.AbstractRunnableC1005b
                /* renamed from: b */
                public void mo20023b() {
                    C1003a.this.m20032c();
                }
            }, random.nextInt((int) this.f21499b));
        }
    }

    /* renamed from: c */
    public void m20032c() {
        this.f21501d = this.f21501d == 0 ? 7000 : 0;
    }

    /* renamed from: d */
    public synchronized void m20031d() {
        this.f21500c = false;
        C0989s.m20062a().m20061a(2);
    }
}
