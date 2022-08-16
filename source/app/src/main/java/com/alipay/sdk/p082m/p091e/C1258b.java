package com.alipay.sdk.p082m.p091e;

import com.alipay.sdk.p082m.p093f.C1270a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import org.json.alipay.C35293a;
import p002O.C0002O;

/* renamed from: com.alipay.sdk.m.e.b */
/* loaded from: classes13.dex */
public final class C1258b implements AbstractC1265i, AbstractC1266j {
    static {
        Covode.recordClassIndex(4758);
    }

    /* renamed from: a */
    public static Collection<Object> m19314a(Class<?> cls, Type type) {
        if (cls == AbstractCollection.class) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(HashSet.class)) {
            return new HashSet();
        }
        if (cls.isAssignableFrom(LinkedHashSet.class)) {
            return new LinkedHashSet();
        }
        if (cls.isAssignableFrom(TreeSet.class)) {
            return new TreeSet();
        }
        if (cls.isAssignableFrom(ArrayList.class)) {
            return new ArrayList();
        }
        if (cls.isAssignableFrom(EnumSet.class)) {
            return EnumSet.noneOf(type instanceof ParameterizedType ? ((ParameterizedType) type).getActualTypeArguments()[0] : Object.class);
        }
        try {
            return (Collection) cls.newInstance();
        } catch (Exception unused) {
            throw new IllegalArgumentException(C0002O.m25086C("create instane error, class ", cls.getName()));
        }
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1266j
    /* renamed from: a */
    public final Object mo19307a(Object obj) {
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : (Iterable) obj) {
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
        Collection<Object> m19314a = m19314a(C1270a.m19304a(type), type);
        if (!(type instanceof ParameterizedType)) {
            throw new IllegalArgumentException("Does not support the implement for generics.");
        }
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        for (int i = 0; i < c35293a.m45a(); i++) {
            m19314a.add(C1261e.m19313a(c35293a.m44a(i), type2));
        }
        return m19314a;
    }

    @Override // com.alipay.sdk.p082m.p091e.AbstractC1265i, com.alipay.sdk.p082m.p091e.AbstractC1266j
    /* renamed from: a */
    public final boolean mo19308a(Class<?> cls) {
        return Collection.class.isAssignableFrom(cls);
    }
}
