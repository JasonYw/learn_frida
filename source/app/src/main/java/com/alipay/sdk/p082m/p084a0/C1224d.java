package com.alipay.sdk.p082m.p084a0;

import android.content.ContentResolver;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.Pair;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import java.io.File;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.a0.d */
/* loaded from: classes2.dex */
public final class C1224d {

    /* renamed from: a */
    public static C1224d f22072a = new C1224d();

    static {
        Covode.recordClassIndex(4724);
    }

    /* renamed from: a */
    public static C1224d m19374a() {
        return f22072a;
    }

    /* renamed from: a */
    public static String m19372a(String str, String str2) {
        try {
            return (String) C116971W2r.LIZ("android.os.SystemProperties").getMethod("get", String.class, String.class).invoke(null, str, str2);
        } catch (Exception unused) {
            return str2;
        }
    }

    /* renamed from: a */
    public static boolean m19373a(Context context) {
        int length;
        try {
            if (Build.HARDWARE.contains("goldfish") || Build.PRODUCT.contains("sdk") || Build.FINGERPRINT.contains("generic")) {
                return true;
            }
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager != null) {
                String m19369xe7447931 = m19369xe7447931(telephonyManager);
                if (m19369xe7447931 != null && (length = m19369xe7447931.length()) != 0) {
                    for (int i = 0; i < length; i++) {
                        if (Character.isWhitespace(m19369xe7447931.charAt(i)) || m19369xe7447931.charAt(i) == '0') {
                        }
                    }
                }
                return true;
            }
            return C1448a.m18665a(com_alipay_sdk_m_a0_d_android_provider_Settings$Secure_getString(context.getContentResolver(), "android_id"));
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static String m19371b() {
        return "android";
    }

    /* renamed from: c */
    public static boolean m19370c() {
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        int i = 0;
        while (true) {
            try {
                new StringBuilder();
                if (!new File(C0002O.m25086C(strArr[i], "su")).exists()) {
                    i++;
                    if (i >= 5) {
                        break;
                    }
                } else {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String com_alipay_sdk_m_a0_d_android_provider_Settings$Secure_getString(ContentResolver contentResolver, String str) {
        ActionInvokeEntrance.setEventUuid(102004);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(Settings.Secure.class, new Object[]{contentResolver, str}, 102004, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String LIZ = C116971W2r.LIZ(contentResolver, str);
        ActionInvokeEntrance.actionInvoke(LIZ, Settings.Secure.class, new Object[]{contentResolver, str}, 102004, "com_alipay_sdk_m_a0_d_android_provider_Settings$Secure_getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        return LIZ;
    }

    /* renamed from: com_alipay_sdk_m_a0_d_android_telephony_TelephonyManager_getDeviceId */
    public static String m19369xe7447931(TelephonyManager telephonyManager) {
        ActionInvokeEntrance.setEventUuid(101600);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(telephonyManager, new Object[0], 101600, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String LIZIZ = C116971W2r.LIZIZ(telephonyManager);
        ActionInvokeEntrance.actionInvoke(LIZIZ, telephonyManager, new Object[0], 101600, "com_alipay_sdk_m_a0_d_android_telephony_TelephonyManager_getDeviceId(Landroid/telephony/TelephonyManager;)Ljava/lang/String;");
        return LIZIZ;
    }

    /* renamed from: d */
    public static String m19368d() {
        return Build.BOARD;
    }

    /* renamed from: e */
    public static String m19367e() {
        return Build.BRAND;
    }

    /* renamed from: f */
    public static String m19366f() {
        return Build.DEVICE;
    }

    /* renamed from: g */
    public static String m19365g() {
        return Build.DISPLAY;
    }

    /* renamed from: h */
    public static String m19364h() {
        return Build.VERSION.INCREMENTAL;
    }

    /* renamed from: i */
    public static String m19363i() {
        return Build.MANUFACTURER;
    }

    /* renamed from: j */
    public static String m19362j() {
        return Build.MODEL;
    }

    /* renamed from: k */
    public static String m19361k() {
        return Build.PRODUCT;
    }

    /* renamed from: l */
    public static String m19360l() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: m */
    public static String m19359m() {
        return Build.VERSION.SDK;
    }

    /* renamed from: n */
    public static String m19358n() {
        return Build.TAGS;
    }

    /* renamed from: o */
    public static String m19357o() {
        return m19372a("ro.kernel.qemu", "0");
    }
}
