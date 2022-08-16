package com.alipay.sdk.p082m.p091e;

import com.alipay.sdk.p082m.p093f.C1270a;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.json.alipay.C35293a;
import org.json.alipay.C35294b;

/* renamed from: com.alipay.sdk.m.e.f */
/* loaded from: classes13.dex */
public final class C1262f {

    /* renamed from: a */
    public static List<AbstractC1266j> f22107a;

    static {
        Covode.recordClassIndex(4762);
        ArrayList arrayList = new ArrayList();
        f22107a = arrayList;
        arrayList.add(new C1268l());
        f22107a.add(new C1260d());
        f22107a.add(new C1259c());
        f22107a.add(new C1264h());
        f22107a.add(new C1258b());
        f22107a.add(new C1257a());
        f22107a.add(new C1263g());
    }

    /* renamed from: a */
    public static String m19311a(Object obj) {
        if (obj == null) {
            return null;
        }
        Object m19310b = m19310b(obj);
        if (C1270a.m19305a(m19310b.getClass())) {
            return C35294b.m37c(m19310b.toString());
        }
        if (Collection.class.isAssignableFrom(m19310b.getClass())) {
            return new C35293a((Collection) m19310b).toString();
        }
        if (Map.class.isAssignableFrom(m19310b.getClass())) {
            return new C35294b((Map) m19310b).toString();
        }
        throw new IllegalArgumentException("Unsupported Class : " + m19310b.getClass());
    }

    /* renamed from: b */
    public static Object m19310b(Object obj) {
        Object mo19307a;
        if (obj == null) {
            return null;
        }
        for (AbstractC1266j abstractC1266j : f22107a) {
            if (abstractC1266j.mo19308a(obj.getClass()) && (mo19307a = abstractC1266j.mo19307a(obj)) != null) {
                return mo19307a;
            }
        }
        throw new IllegalArgumentException("Unsupported Class : " + obj.getClass());
    }
}
