package com.amap.api.services.p126a;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import p002O.C0002O;

/* renamed from: com.amap.api.services.a.ao */
/* loaded from: classes19.dex */
public abstract class AbstractC1815ao<T, V> extends AbstractC1843b<T, V> {
    static {
        Covode.recordClassIndex(5426);
    }

    /* renamed from: j */
    public T m17065j() {
        return this.f24221a;
    }

    @Override // com.amap.api.services.p126a.AbstractC1969di
    /* renamed from: i */
    public String mo16250i() {
        new StringBuilder();
        return C0002O.m25086C(C2006i.m16380a(), "/weather/weatherInfo?");
    }

    public AbstractC1815ao(Context context, T t) {
        super(context, t);
    }
}
