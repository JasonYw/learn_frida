package com.alipay.apmobilesecuritysdk.p079d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p078c.C1183b;
import com.alipay.sdk.p082m.p084a0.C1222b;
import com.alipay.sdk.p082m.p084a0.C1224d;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alipay.apmobilesecuritysdk.d.d */
/* loaded from: classes2.dex */
public final class C1188d {
    static {
        Covode.recordClassIndex(4660);
    }

    /* renamed from: a */
    public static synchronized Map<String, String> m19568a() {
        HashMap hashMap;
        synchronized (C1188d.class) {
            hashMap = new HashMap();
            try {
                new C1183b();
                hashMap.put("AE16", "");
            } catch (Throwable unused) {
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static synchronized Map<String, String> m19567a(Context context) {
        HashMap hashMap;
        synchronized (C1188d.class) {
            C1224d.m19374a();
            C1222b.m19418b();
            hashMap = new HashMap();
            hashMap.put("AE1", C1224d.m19371b());
            StringBuilder sb = new StringBuilder();
            sb.append(C1224d.m19370c() ? "1" : "0");
            hashMap.put("AE2", sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C1224d.m19373a(context) ? "1" : "0");
            hashMap.put("AE3", sb2.toString());
            hashMap.put("AE4", C1224d.m19368d());
            hashMap.put("AE5", C1224d.m19367e());
            hashMap.put("AE6", C1224d.m19366f());
            hashMap.put("AE7", C1224d.m19365g());
            hashMap.put("AE8", C1224d.m19364h());
            hashMap.put("AE9", C1224d.m19363i());
            hashMap.put("AE10", C1224d.m19362j());
            hashMap.put("AE11", C1224d.m19361k());
            hashMap.put("AE12", C1224d.m19360l());
            hashMap.put("AE13", C1224d.m19359m());
            hashMap.put("AE14", C1224d.m19358n());
            hashMap.put("AE15", C1224d.m19357o());
            hashMap.put("AE21", C1222b.m19403g());
        }
        return hashMap;
    }
}
