package com.alipay.sdk.p082m.p091e;

import com.alipay.sdk.p082m.p093f.C1270a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Properties;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import org.json.alipay.C35294b;

/* renamed from: com.alipay.sdk.m.e.h */
/* loaded from: classes13.dex */
public final class C1264h implements AbstractC1265i, AbstractC1266j {
    static {
        Covode.recordClassIndex(4764);
    }

    /* renamed from: a */
    public static Map<Object, Object> m19309a(Type type) {
        while (type != Properties.class) {
            if (type == Hashtable.class) {
                return new Hashtable();
            }
            if (type == IdentityHashMap.class) {
                return new IdentityHashMap();
            }
            if (type == SortedMap.class || type == TreeMap.class) {
                return new TreeMap();
            }
            if (type == ConcurrentMap.class || type == ConcurrentHashMap.class) {
                return new ConcurrentHashMap();
            }
            if (type == Map.class || type == HashMap.class) {
                return new HashMap();
            }
            if (type == LinkedHashMap.class) {
                return new LinkedHashMap();
            }
            if (!(type instanceof ParameterizedType)) {
                Class cls = (Class) type;
                if (cls.isInterface()) {
                    throw new IllegalArgumentException("unsupport type " + type);
                }
                try {
                    return (Map) cls.newInstance();
                } catch (Exception e) {
                    throw new IllegalArgumentException("unsupport type " + type, e);
                }
            }
            type = ((ParameterizedType) type).getRawType();
        }
        return new Properties();
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1266j
    /* renamed from: a */
    public final Object mo19307a(Object obj) {
        TreeMap treeMap = new TreeMap();
        for (Map.Entry entry : ((Map) obj).entrySet()) {
            if (!(entry.getKey() instanceof String)) {
                throw new IllegalArgumentException("Map key must be String!");
            }
            treeMap.put(entry.getKey(), C1262f.m19310b(entry.getValue()));
        }
        return treeMap;
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1265i
    /* renamed from: a */
    public final Object mo19306a(Object obj, Type type) {
        if (!obj.getClass().equals(C35294b.class)) {
            return null;
        }
        C35294b c35294b = (C35294b) obj;
        Map<Object, Object> m19309a = m19309a(type);
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Deserialize Map must be Generics!");
        }
        ParameterizedType parameterizedType = (ParameterizedType) type;
        Type type2 = parameterizedType.getActualTypeArguments()[0];
        Type type3 = parameterizedType.getActualTypeArguments()[1];
        if (String.class != type2) {
            throw new IllegalArgumentException("Deserialize Map Key must be String.class");
        }
        Iterator m42a = c35294b.m42a();
        while (m42a.hasNext()) {
            String str = (String) m42a.next();
            m19309a.put(str, C1270a.m19305a((Class<?>) ((Class) type3)) ? c35294b.m40a(str) : C1261e.m19313a(c35294b.m40a(str), type3));
        }
        return m19309a;
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1265i, com.alipay.sdk.p082m.p091e.AbstractC1266j
    /* renamed from: a */
    public final boolean mo19308a(Class<?> cls) {
        return Map.class.isAssignableFrom(cls);
    }
}
