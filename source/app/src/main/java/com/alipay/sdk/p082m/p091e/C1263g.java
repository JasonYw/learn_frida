package com.alipay.sdk.p082m.p091e;

import com.bytedance.covode.number.Covode;
import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.TreeMap;
import org.json.alipay.C35294b;

/* renamed from: com.alipay.sdk.m.e.g */
/* loaded from: classes13.dex */
public final class C1263g implements AbstractC1265i, AbstractC1266j {
    static {
        Covode.recordClassIndex(4763);
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1266j
    /* renamed from: a */
    public final Object mo19307a(Object obj) {
        TreeMap treeMap = new TreeMap();
        Class<?> cls = obj.getClass();
        while (true) {
            Field[] declaredFields = cls.getDeclaredFields();
            if (!cls.equals(Object.class)) {
                if (declaredFields != null && declaredFields.length > 0) {
                    for (Field field : declaredFields) {
                        if (field != null && !"this$0".equals(field.getName())) {
                            boolean isAccessible = field.isAccessible();
                            field.setAccessible(true);
                            Object obj2 = field.get(obj);
                            if (obj2 != null) {
                                field.setAccessible(isAccessible);
                                Object m19310b = C1262f.m19310b(obj2);
                                if (m19310b != null) {
                                    treeMap.put(field.getName(), m19310b);
                                }
                            }
                        }
                    }
                }
                cls = cls.getSuperclass();
            } else {
                return treeMap;
            }
        }
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1265i
    /* renamed from: a */
    public final Object mo19306a(Object obj, Type type) {
        if (!obj.getClass().equals(C35294b.class)) {
            return null;
        }
        C35294b c35294b = (C35294b) obj;
        Class cls = (Class) type;
        Object newInstance = cls.newInstance();
        while (!cls.equals(Object.class)) {
            Field[] declaredFields = cls.getDeclaredFields();
            if (declaredFields != null && declaredFields.length > 0) {
                for (Field field : declaredFields) {
                    String name = field.getName();
                    Type genericType = field.getGenericType();
                    if (c35294b.m38b(name)) {
                        field.setAccessible(true);
                        field.set(newInstance, C1261e.m19313a(c35294b.m40a(name), genericType));
                    }
                }
            }
            cls = cls.getSuperclass();
        }
        return newInstance;
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1265i, com.alipay.sdk.p082m.p091e.AbstractC1266j
    /* renamed from: a */
    public final boolean mo19308a(Class<?> cls) {
        return true;
    }
}
