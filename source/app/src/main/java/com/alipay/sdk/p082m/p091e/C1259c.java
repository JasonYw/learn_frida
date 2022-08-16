package com.alipay.sdk.p082m.p091e;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import java.util.Date;

/* renamed from: com.alipay.sdk.m.e.c */
/* loaded from: classes13.dex */
public final class C1259c implements AbstractC1265i, AbstractC1266j {
    static {
        Covode.recordClassIndex(4759);
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1266j
    /* renamed from: a */
    public final Object mo19307a(Object obj) {
        return Long.valueOf(((Date) obj).getTime());
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1265i
    /* renamed from: a */
    public final Object mo19306a(Object obj, Type type) {
        return new Date(((Long) obj).longValue());
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1265i, com.alipay.sdk.p082m.p091e.AbstractC1266j
    /* renamed from: a */
    public final boolean mo19308a(Class<?> cls) {
        return Date.class.isAssignableFrom(cls);
    }
}
