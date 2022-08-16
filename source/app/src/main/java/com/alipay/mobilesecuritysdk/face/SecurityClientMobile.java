package com.alipay.mobilesecuritysdk.face;

import android.content.Context;
import com.alipay.apmobilesecuritysdk.face.APSecuritySdk;
import com.alipay.apmobilesecuritysdk.p076a.C1180a;
import com.alipay.sdk.p082m.p105l.C1314b;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class SecurityClientMobile {
    static {
        Covode.recordClassIndex(4687);
    }

    public static synchronized String GetApdid(Context context, Map<String, String> map) {
        String m19588a;
        synchronized (SecurityClientMobile.class) {
            HashMap hashMap = new HashMap();
            hashMap.put(C1314b.f22207g, C1448a.m18662a(map, C1314b.f22207g, ""));
            hashMap.put("tid", C1448a.m18662a(map, "tid", ""));
            hashMap.put("userId", C1448a.m18662a(map, "userId", ""));
            APSecuritySdk.getInstance(context).initToken(0, hashMap, null);
            m19588a = C1180a.m19588a(context);
        }
        return m19588a;
    }
}
