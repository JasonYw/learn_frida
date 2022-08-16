package com.alibaba.sdk.android.httpdns.p071b;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.List;

/* renamed from: com.alibaba.sdk.android.httpdns.b.a */
/* loaded from: classes19.dex */
public class C1034a implements AbstractC1039f {

    /* renamed from: a */
    public final C1037d f21532a;

    static {
        Covode.recordClassIndex(4440);
    }

    public C1034a(Context context) {
        this.f21532a = new C1037d(context);
    }

    @Override // com.alibaba.sdk.android.httpdns.p071b.AbstractC1039f
    /* renamed from: a */
    public List<C1038e> mo19949a() {
        return this.f21532a.m19958b();
    }

    @Override // com.alibaba.sdk.android.httpdns.p071b.AbstractC1039f
    /* renamed from: a */
    public void mo19948a(C1038e c1038e) {
        this.f21532a.m19962a(c1038e);
    }

    @Override // com.alibaba.sdk.android.httpdns.p071b.AbstractC1039f
    /* renamed from: b */
    public void mo19947b(C1038e c1038e) {
        this.f21532a.m19952b(c1038e.f21544m, c1038e.host);
    }
}
