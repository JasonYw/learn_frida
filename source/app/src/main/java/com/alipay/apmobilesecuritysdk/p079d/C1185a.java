package com.alipay.apmobilesecuritysdk.p079d;

import android.content.Context;
import com.alipay.sdk.p082m.p084a0.C1221a;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.alipay.apmobilesecuritysdk.d.a */
/* loaded from: classes2.dex */
public final class C1185a {
    static {
        Covode.recordClassIndex(4657);
    }

    /* renamed from: a */
    public static synchronized Map<String, String> m19571a(Context context, Map<String, String> map) {
        HashMap hashMap;
        synchronized (C1185a.class) {
            String m18662a = C1448a.m18662a(map, "appchannel", "");
            hashMap = new HashMap();
            hashMap.put("AA1", context.getPackageName());
            C1221a.m19424a();
            hashMap.put("AA2", C1221a.m19423a(context));
            hashMap.put("AA3", "APPSecuritySDK-ALIPAYSDK");
            hashMap.put("AA4", "3.4.0.202203211140");
            hashMap.put("AA6", m18662a);
        }
        return hashMap;
    }
}
