package com.alipay.sdk.p082m.p087c;

import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.alipay.sdk.p082m.p085b.AbstractC1226b;
import com.alipay.sdk.p082m.p089d.C1252a;
import com.bytedance.covode.number.Covode;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.c.a */
/* loaded from: classes2.dex */
public class C1234a {
    static {
        Covode.recordClassIndex(4734);
    }

    /* renamed from: a */
    public static boolean m19345a() {
        String m19343a = m19343a("ro.build.version.emui");
        String m19343a2 = m19343a("hw_sc.build.platform.version");
        if (TextUtils.isEmpty(m19343a) && TextUtils.isEmpty(m19343a2)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m19343a(String str) {
        try {
            return (String) C116971W2r.LIZ("android.os.SystemProperties").getDeclaredMethod("get", String.class).invoke(null, str);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static AbstractC1226b m19344a(Context context) {
        String str = Build.BRAND;
        C1252a.m19326b("Device", "Brand", str);
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (!str.equalsIgnoreCase("huawei") && !str.equalsIgnoreCase("honor") && !str.equalsIgnoreCase("华为")) {
            if (!str.equalsIgnoreCase("xiaomi") && !str.equalsIgnoreCase("redmi") && !str.equalsIgnoreCase("meitu") && !str.equalsIgnoreCase("小米") && !str.equalsIgnoreCase("blackshark")) {
                if (str.equalsIgnoreCase("vivo")) {
                    return new C1246h();
                }
                if (!str.equalsIgnoreCase("oppo") && !str.equalsIgnoreCase("oneplus") && !str.equalsIgnoreCase("realme")) {
                    if (!str.equalsIgnoreCase("lenovo") && !str.equalsIgnoreCase("zuk")) {
                        if (str.equalsIgnoreCase("nubia")) {
                            return new C1241e();
                        }
                        if (str.equalsIgnoreCase("samsung")) {
                            return new C1243g();
                        }
                        if (m19345a()) {
                            return new C1235b();
                        }
                        if (!str.equalsIgnoreCase("meizu") && !str.equalsIgnoreCase("mblu")) {
                            return null;
                        }
                        return new C1240d();
                    }
                    return new C1239c();
                }
                return new C1242f();
            }
            return new C1247i();
        }
        return new C1235b();
    }
}
