package com.alipay.apmobilesecuritysdk.p079d;

import android.content.Context;
import com.alipay.sdk.p082m.p124y.C1446b;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import p002O.C0002O;

/* renamed from: com.alipay.apmobilesecuritysdk.d.e */
/* loaded from: classes2.dex */
public final class C1189e {

    /* renamed from: a */
    public static Map<String, String> f21954a;

    /* renamed from: b */
    public static final String[] f21955b = {"AD1", "AD2", "AD3", "AD8", "AD9", "AD10", "AD11", "AD12", "AD14", "AD15", "AD16", "AD18", "AD20", "AD21", "AD23", "AD24", "AD26", "AD27", "AD28", "AD29", "AD30", "AD31", "AD34", "AA1", "AA2", "AA3", "AA4", "AC4", "AC10", "AE1", "AE2", "AE3", "AE4", "AE5", "AE6", "AE7", "AE8", "AE9", "AE10", "AE11", "AE12", "AE13", "AE14", "AE15"};

    static {
        Covode.recordClassIndex(4661);
    }

    /* renamed from: a */
    public static String m19564a(Map<String, String> map) {
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList(map.keySet());
        Collections.sort(arrayList);
        for (int i = 0; i < arrayList.size(); i++) {
            String str = (String) arrayList.get(i);
            String str2 = map.get(str);
            String str3 = "";
            if (str2 == null) {
                str2 = str3;
            }
            new StringBuilder();
            if (i != 0) {
                str3 = "&";
            }
            stringBuffer.append(C0002O.m25084C(str3, str, "=", str2));
        }
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static synchronized Map<String, String> m19565a(Context context, Map<String, String> map) {
        Map<String, String> map2;
        synchronized (C1189e.class) {
            if (f21954a == null) {
                m19562c(context, map);
            }
            f21954a.putAll(C1188d.m19568a());
            map2 = f21954a;
        }
        return map2;
    }

    /* renamed from: a */
    public static synchronized void m19566a() {
        synchronized (C1189e.class) {
            f21954a = null;
        }
    }

    /* renamed from: b */
    public static synchronized String m19563b(Context context, Map<String, String> map) {
        String[] strArr;
        String m18672a;
        synchronized (C1189e.class) {
            m19565a(context, map);
            TreeMap treeMap = new TreeMap();
            for (String str : f21955b) {
                if (f21954a.containsKey(str)) {
                    treeMap.put(str, f21954a.get(str));
                }
            }
            m18672a = C1446b.m18672a(m19564a(treeMap));
        }
        return m18672a;
    }

    /* renamed from: c */
    public static synchronized void m19562c(Context context, Map<String, String> map) {
        synchronized (C1189e.class) {
            TreeMap treeMap = new TreeMap();
            f21954a = treeMap;
            treeMap.putAll(C1186b.m19570a(context, map));
            f21954a.putAll(C1188d.m19567a(context));
            f21954a.putAll(C1187c.m19569a(context));
            f21954a.putAll(C1185a.m19571a(context, map));
        }
    }
}
