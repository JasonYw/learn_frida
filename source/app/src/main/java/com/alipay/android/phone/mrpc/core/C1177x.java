package com.alipay.android.phone.mrpc.core;

import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;

/* renamed from: com.alipay.android.phone.mrpc.core.x */
/* loaded from: classes2.dex */
public final class C1177x {

    /* renamed from: a */
    public AbstractC1159g f21939a;

    /* renamed from: b */
    public C1179z f21940b = new C1179z(this);

    static {
        Covode.recordClassIndex(4648);
    }

    public C1177x(AbstractC1159g abstractC1159g) {
        this.f21939a = abstractC1159g;
    }

    /* renamed from: a */
    public final AbstractC1159g m19592a() {
        return this.f21939a;
    }

    /* renamed from: a */
    public final <T> T m19591a(Class<T> cls) {
        return (T) C116971W2r.LIZ(cls.getClassLoader(), new Class[]{cls}, new C1178y(this.f21939a, cls, this.f21940b));
    }
}
