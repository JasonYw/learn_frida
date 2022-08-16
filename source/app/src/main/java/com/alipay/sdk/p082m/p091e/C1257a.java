package com.alipay.sdk.p082m.p091e;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Array;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import org.json.alipay.C35293a;

/* renamed from: com.alipay.sdk.m.e.a */
/* loaded from: classes13.dex */
public final class C1257a implements AbstractC1265i, AbstractC1266j {
    static {
        Covode.recordClassIndex(4757);
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1266j
    /* renamed from: a */
    public final Object mo19307a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Object[]) obj) {
            arrayList.add(C1262f.m19310b(obj2));
        }
        return arrayList;
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1265i
    /* renamed from: a */
    public final Object mo19306a(Object obj, Type type) {
        if (!obj.getClass().equals(C35293a.class)) {
            return null;
        }
        C35293a c35293a = (C35293a) obj;
        if (type instanceof GenericArrayType) {
            throw new IllegalArgumentException("Does not support generic array!");
        }
        Class<?> componentType = ((Class) type).getComponentType();
        int m45a = c35293a.m45a();
        Object newInstance = Array.newInstance(componentType, m45a);
        for (int i = 0; i < m45a; i++) {
            Array.set(newInstance, i, C1261e.m19313a(c35293a.m44a(i), componentType));
        }
        return newInstance;
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1265i, com.alipay.sdk.p082m.p091e.AbstractC1266j
    /* renamed from: a */
    public final boolean mo19308a(Class<?> cls) {
        return cls.isArray();
    }
}
