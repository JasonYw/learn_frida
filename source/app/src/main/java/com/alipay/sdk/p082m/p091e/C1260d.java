package com.alipay.sdk.p082m.p091e;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;

/* renamed from: com.alipay.sdk.m.e.d */
/* loaded from: classes13.dex */
public final class C1260d implements AbstractC1265i, AbstractC1266j {
    static {
        Covode.recordClassIndex(4760);
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1266j
    /* renamed from: a */
    public final Object mo19307a(Object obj) {
        return ((Enum) obj).name();
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1265i
    /* renamed from: a */
    public final Object mo19306a(Object obj, Type type) {
        return Enum.valueOf((Class) type, obj.toString());
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1265i, com.alipay.sdk.p082m.p091e.AbstractC1266j
    /* renamed from: a */
    public final boolean mo19308a(Class<?> cls) {
        return Enum.class.isAssignableFrom(cls);
    }
}
