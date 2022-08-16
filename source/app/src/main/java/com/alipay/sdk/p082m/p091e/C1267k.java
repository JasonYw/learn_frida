package com.alipay.sdk.p082m.p091e;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashSet;
import java.util.Set;
import org.json.alipay.C35293a;

/* renamed from: com.alipay.sdk.m.e.k */
/* loaded from: classes13.dex */
public final class C1267k implements AbstractC1265i {
    static {
        Covode.recordClassIndex(4767);
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1265i
    /* renamed from: a */
    public final Object mo19306a(Object obj, Type type) {
        if (!obj.getClass().equals(C35293a.class)) {
            return null;
        }
        C35293a c35293a = (C35293a) obj;
        HashSet hashSet = new HashSet();
        Class cls = type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class;
        for (int i = 0; i < c35293a.m45a(); i++) {
            hashSet.add(C1261e.m19313a(c35293a.m44a(i), cls));
        }
        return hashSet;
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1265i, com.alipay.sdk.p082m.p091e.AbstractC1266j
    /* renamed from: a */
    public final boolean mo19308a(Class<?> cls) {
        return Set.class.isAssignableFrom(cls);
    }
}
