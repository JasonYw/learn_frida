package com.alipay.apmobilesecuritysdk.p079d;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.p080e.C1197h;
import com.alipay.sdk.p082m.p105l.C1314b;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alipay.apmobilesecuritysdk.d.b */
/* loaded from: classes2.dex */
public final class C1186b {
    static {
        Covode.recordClassIndex(4658);
    }

    /* renamed from: a */
    public static synchronized Map<String, String> m19570a(Context context, Map<String, String> map) {
        HashMap hashMap;
        synchronized (C1186b.class) {
            hashMap = new HashMap();
            String m18662a = C1448a.m18662a(map, "tid", "");
            String m18662a2 = C1448a.m18662a(map, C1314b.f22207g, "");
            String m18662a3 = C1448a.m18662a(map, "userId", "");
            String m18662a4 = C1448a.m18662a(map, "appName", "");
            String m18662a5 = C1448a.m18662a(map, "appKeyClient", "");
            String m18662a6 = C1448a.m18662a(map, "tmxSessionId", "");
            String m19519f = C1197h.m19519f(context);
            String m18662a7 = C1448a.m18662a(map, "sessionId", "");
            hashMap.put("AC1", m18662a);
            hashMap.put("AC2", m18662a2);
            hashMap.put("AC3", "");
            hashMap.put("AC4", m19519f);
            hashMap.put("AC5", m18662a3);
            hashMap.put("AC6", m18662a6);
            hashMap.put("AC7", "");
            hashMap.put("AC8", m18662a4);
            hashMap.put("AC9", m18662a5);
            if (C1448a.m18661b(m18662a7)) {
                hashMap.put("AC10", m18662a7);
            }
        }
        return hashMap;
    }
}
