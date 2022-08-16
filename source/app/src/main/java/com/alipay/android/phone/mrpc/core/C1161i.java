package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.android.phone.mrpc.core.i */
/* loaded from: classes2.dex */
public final class C1161i implements AbstractC1159g {

    /* renamed from: a */
    public final /* synthetic */ C1148aa f21885a;

    /* renamed from: b */
    public final /* synthetic */ C1160h f21886b;

    static {
        Covode.recordClassIndex(4632);
    }

    public C1161i(C1160h c1160h, C1148aa c1148aa) {
        this.f21886b = c1160h;
        this.f21885a = c1148aa;
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC1159g
    /* renamed from: a */
    public final String mo19647a() {
        return this.f21885a.m19665a();
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC1159g
    /* renamed from: b */
    public final AbstractC1149ab mo19646b() {
        Context context;
        context = this.f21886b.f21884a;
        return C1165l.m19636a(context.getApplicationContext());
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC1159g
    /* renamed from: c */
    public final C1148aa mo19645c() {
        return this.f21885a;
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC1159g
    /* renamed from: d */
    public final boolean mo19644d() {
        return this.f21885a.m19662c();
    }
}
