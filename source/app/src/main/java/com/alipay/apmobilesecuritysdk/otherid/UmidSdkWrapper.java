package com.alipay.apmobilesecuritysdk.otherid;

import android.content.Context;
import com.alipay.sdk.p082m.p086b0.C1231d;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class UmidSdkWrapper {
    public static volatile String cachedUmidToken = "";
    public static volatile boolean initUmidFinished;

    static {
        Covode.recordClassIndex(4682);
    }

    public static String compatUmidBug(Context context, String str) {
        if (C1448a.m18665a(str) || C1448a.m18664a(str, "000000000000000000000000")) {
            String utdid = UtdidWrapper.getUtdid(context);
            if (utdid != null && utdid.contains("?")) {
                utdid = "";
            }
            return C1448a.m18665a(utdid) ? "" : utdid;
        }
        return str;
    }

    public static synchronized String getSecurityToken(Context context) {
        String str;
        synchronized (UmidSdkWrapper.class) {
            str = cachedUmidToken;
        }
        return str;
    }

    public static String startUmidTaskSync(Context context, int i) {
        return "";
    }

    public static synchronized void updateLocalUmidToken(Context context, String str) {
        synchronized (UmidSdkWrapper.class) {
            if (C1448a.m18661b(str)) {
                C1231d.m19349a(context, "xxxwww_v2", "umidtk", str);
                cachedUmidToken = str;
            }
        }
    }
}
