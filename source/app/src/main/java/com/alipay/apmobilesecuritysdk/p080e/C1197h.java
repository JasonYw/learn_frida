package com.alipay.apmobilesecuritysdk.p080e;

import android.content.Context;
import android.content.SharedPreferences;
import com.alipay.sdk.p082m.p086b0.C1228a;
import com.alipay.sdk.p082m.p086b0.C1232e;
import com.alipay.sdk.p082m.p124y.C1446b;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import com.heytap.mcssdk.constant.C15151a;
import java.util.UUID;
import p002O.C0002O;
import p003X.G4Y;

/* renamed from: com.alipay.apmobilesecuritysdk.e.h */
/* loaded from: classes2.dex */
public class C1197h {

    /* renamed from: a */
    public static String f21969a = "";

    static {
        Covode.recordClassIndex(4669);
    }

    /* renamed from: a */
    public static long m19532a(Context context) {
        String m19354a = C1228a.m19354a(context, "vkeyid_settings", "update_time_interval");
        if (C1448a.m18661b(m19354a)) {
            try {
                return Long.parseLong(m19354a);
            } catch (Exception unused) {
                return C15151a.f30809f;
            }
        }
        return C15151a.f30809f;
    }

    /* renamed from: a */
    public static void m19531a(Context context, String str) {
        m19529a(context, "update_time_interval", str);
    }

    /* renamed from: a */
    public static void m19530a(Context context, String str, long j) {
        C1228a.m19353a(context, "vkeyid_settings", C0002O.m25086C("vkey_valid", str), String.valueOf(j));
    }

    /* renamed from: a */
    public static void m19529a(Context context, String str, String str2) {
        C1228a.m19353a(context, "vkeyid_settings", str, str2);
    }

    /* renamed from: a */
    public static void m19528a(Context context, boolean z) {
        m19529a(context, "log_switch", z ? "1" : "0");
    }

    /* renamed from: b */
    public static String m19527b(Context context) {
        return C1228a.m19354a(context, "vkeyid_settings", "last_apdid_env");
    }

    /* renamed from: b */
    public static void m19526b(Context context, String str) {
        m19529a(context, "last_machine_boot_time", str);
    }

    /* renamed from: c */
    public static void m19524c(Context context, String str) {
        m19529a(context, "last_apdid_env", str);
    }

    /* renamed from: c */
    public static boolean m19525c(Context context) {
        String m19354a = C1228a.m19354a(context, "vkeyid_settings", "log_switch");
        return m19354a != null && "1".equals(m19354a);
    }

    /* renamed from: d */
    public static String m19523d(Context context) {
        return C1228a.m19354a(context, "vkeyid_settings", "dynamic_key");
    }

    /* renamed from: d */
    public static void m19522d(Context context, String str) {
        m19529a(context, "agent_switch", str);
    }

    /* renamed from: e */
    public static String m19521e(Context context) {
        return C1228a.m19354a(context, "vkeyid_settings", "apse_degrade");
    }

    /* renamed from: e */
    public static void m19520e(Context context, String str) {
        m19529a(context, "dynamic_key", str);
    }

    /* renamed from: f */
    public static String m19519f(Context context) {
        String str;
        SharedPreferences.Editor edit;
        synchronized (C1197h.class) {
            if (C1448a.m18665a(f21969a)) {
                String m19348a = C1232e.m19348a(context, "alipay_vkey_random", "random", "");
                f21969a = m19348a;
                if (C1448a.m18665a(m19348a)) {
                    String m18672a = C1446b.m18672a(UUID.randomUUID().toString());
                    f21969a = m18672a;
                    if (m18672a != null && (edit = G4Y.LIZ(context, "alipay_vkey_random", 0).edit()) != null) {
                        edit.putString("random", m18672a);
                        edit.commit();
                    }
                }
            }
            str = f21969a;
        }
        return str;
    }

    /* renamed from: f */
    public static void m19518f(Context context, String str) {
        m19529a(context, "webrtc_url", str);
    }

    /* renamed from: g */
    public static void m19517g(Context context, String str) {
        m19529a(context, "apse_degrade", str);
    }

    /* renamed from: h */
    public static long m19516h(Context context, String str) {
        try {
            String m19354a = C1228a.m19354a(context, "vkeyid_settings", C0002O.m25086C("vkey_valid", str));
            if (!C1448a.m18665a(m19354a)) {
                return Long.parseLong(m19354a);
            }
            return 0L;
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
