package com.alipay.android.phone.mrpc.core;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* renamed from: com.alipay.android.phone.mrpc.core.h */
/* loaded from: classes2.dex */
public final class C1160h extends AbstractC1176w {

    /* renamed from: a */
    public Context f21884a;

    static {
        Covode.recordClassIndex(4631);
    }

    public C1160h(Context context) {
        this.f21884a = context;
    }

    @Override // com.alipay.android.phone.mrpc.core.AbstractC1176w
    /* renamed from: a */
    public final <T> T mo19593a(Class<T> cls, C1148aa c1148aa) {
        return (T) new C1177x(new C1161i(this, c1148aa)).m19591a(cls);
    }
}
