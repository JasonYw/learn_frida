package com.alipay.sdk.p082m.p091e;

import com.alipay.sdk.p082m.p093f.C1270a;
import com.bytedance.covode.number.Covode;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import org.json.alipay.C35293a;
import org.json.alipay.C35294b;

/* renamed from: com.alipay.sdk.m.e.e */
/* loaded from: classes13.dex */
public final class C1261e {

    /* renamed from: a */
    public static List<AbstractC1265i> f22106a;

    static {
        Covode.recordClassIndex(4761);
        ArrayList arrayList = new ArrayList();
        f22106a = arrayList;
        arrayList.add(new C1268l());
        f22106a.add(new C1260d());
        f22106a.add(new C1259c());
        f22106a.add(new C1264h());
        f22106a.add(new C1267k());
        f22106a.add(new C1258b());
        f22106a.add(new C1257a());
        f22106a.add(new C1263g());
    }

    /* renamed from: a */
    public static final <T> T m19313a(Object obj, Type type) {
        T t;
        for (AbstractC1265i abstractC1265i : f22106a) {
            if (abstractC1265i.mo19308a(C1270a.m19304a(type)) && (t = (T) abstractC1265i.mo19306a(obj, type)) != null) {
                return t;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static final Object m19312a(String str, Type type) {
        Object c35294b;
        if (str == null || str.length() == 0) {
            return null;
        }
        String trim = str.trim();
        if (trim.startsWith("[") && trim.endsWith("]")) {
            c35294b = new C35293a(trim);
        } else if (!trim.startsWith("{") || !trim.endsWith("}")) {
            return m19313a((Object) trim, type);
        } else {
            c35294b = new C35294b(trim);
        }
        return m19313a(c35294b, type);
    }
}
