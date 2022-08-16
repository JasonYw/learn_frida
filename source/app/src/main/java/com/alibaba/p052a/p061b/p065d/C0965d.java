package com.alibaba.p052a.p061b.p065d;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import com.alibaba.p052a.p061b.C0948b;
import com.alibaba.p052a.p061b.p066e.EnumC0998a;
import com.bytedance.covode.number.Covode;
import com.p3039ut.device.UTDevice;
import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p003X.C116971W2r;

/* renamed from: com.alibaba.a.b.d.d */
/* loaded from: classes13.dex */
public class C0965d {

    /* renamed from: a */
    public static Map<String, String> f21396a;

    static {
        Covode.recordClassIndex(4275);
    }

    /* renamed from: a */
    public static synchronized Map<String, String> m20124a(Context context) {
        synchronized (C0965d.class) {
            if (f21396a != null) {
                f21396a.put(EnumC0998a.CHANNEL.toString(), C0960b.m20136c());
                f21396a.put(EnumC0998a.APPKEY.toString(), C0960b.m20133f());
                String m20078a = C0981m.m20078a(context);
                String m20077b = C0981m.m20077b(context);
                if (TextUtils.isEmpty(m20078a) || TextUtils.isEmpty(m20077b)) {
                    m20078a = "";
                    m20077b = "";
                }
                f21396a.put(EnumC0998a.IMEI.toString(), m20078a);
                f21396a.put(EnumC0998a.IMSI.toString(), m20077b);
                m20123a(f21396a, context);
                return f21396a;
            }
            f21396a = new HashMap();
            if (context == null) {
                return null;
            }
            if (f21396a != null) {
                try {
                    String m20078a2 = C0981m.m20078a(context);
                    String m20077b2 = C0981m.m20077b(context);
                    if (TextUtils.isEmpty(m20078a2) || TextUtils.isEmpty(m20077b2)) {
                        m20078a2 = "";
                        m20077b2 = "";
                    }
                    f21396a.put(EnumC0998a.IMEI.toString(), m20078a2);
                    f21396a.put(EnumC0998a.IMSI.toString(), m20077b2);
                    f21396a.put(EnumC0998a.BRAND.toString(), Build.BRAND);
                    f21396a.put(EnumC0998a.DEVICE_MODEL.toString(), Build.MODEL);
                    f21396a.put(EnumC0998a.RESOLUTION.toString(), m20117d(context));
                    f21396a.put(EnumC0998a.CHANNEL.toString(), C0960b.m20136c());
                    f21396a.put(EnumC0998a.APPKEY.toString(), C0960b.m20133f());
                    f21396a.put(EnumC0998a.APPVERSION.toString(), m20121b(context));
                    f21396a.put(EnumC0998a.LANGUAGE.toString(), m20119c(context));
                    f21396a.put(EnumC0998a.OS.toString(), m20118d());
                    f21396a.put(EnumC0998a.OSVERSION.toString(), m20120c());
                    f21396a.put(EnumC0998a.SDKVERSION.toString(), "2.6.4.8_for_bc_dns");
                    f21396a.put(EnumC0998a.SDKTYPE.toString(), "mini");
                    try {
                        f21396a.put(EnumC0998a.UTDID.toString(), UTDevice.getUtdid(context));
                    } catch (Throwable unused) {
                    }
                    m20123a(f21396a, context);
                } catch (Exception unused2) {
                    return null;
                }
            }
            return f21396a;
        }
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x0033 -> B:6:0x0045). Please submit an issue!!! */
    /* renamed from: a */
    public static void m20123a(Map<String, String> map, Context context) {
        try {
            String[] m20087a = C0977l.m20087a(context);
            map.put(EnumC0998a.ACCESS.toString(), m20087a[0]);
            if (m20087a[0].equals("2G/3G")) {
                map.put(EnumC0998a.ACCESS_SUBTYPE.toString(), m20087a[1]);
            } else {
                map.put(EnumC0998a.ACCESS_SUBTYPE.toString(), "Unknown");
            }
        } catch (Exception unused) {
            map.put(EnumC0998a.ACCESS.toString(), "Unknown");
            map.put(EnumC0998a.ACCESS_SUBTYPE.toString(), "Unknown");
        }
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            String str = "";
            if (telephonyManager != null && telephonyManager.getSimState() == 5) {
                str = telephonyManager.getNetworkOperatorName();
            }
            if (TextUtils.isEmpty(str)) {
                str = "Unknown";
            }
            map.put(EnumC0998a.CARRIER.toString(), str);
        } catch (Exception unused2) {
        }
    }

    /* renamed from: a */
    public static boolean m20125a() {
        try {
            if ((System.getProperty("java.vm.name") != null && System.getProperty("java.vm.name").toLowerCase().contains("lemur")) || System.getProperty("ro.yunos.version") != null || !TextUtils.isEmpty(C0988r.m20064a("ro.yunos.build.version"))) {
                return true;
            }
            return m20116e();
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static String m20122b() {
        String m20063a = C0988r.m20063a("ro.aliyun.clouduuid", "false");
        if ("false".equals(m20063a)) {
            m20063a = C0988r.m20063a("ro.sys.aliyun.clouduuid", "false");
        }
        return TextUtils.isEmpty(m20063a) ? m20115f() : m20063a;
    }

    /* renamed from: b */
    public static String m20121b(Context context) {
        String m20197b = C0948b.m20202a().m20197b();
        if (!TextUtils.isEmpty(m20197b)) {
            return m20197b;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            if (packageInfo == null) {
                return "Unknown";
            }
            f21396a.put(EnumC0998a.APPVERSION.toString(), packageInfo.versionName);
            return packageInfo.versionName;
        } catch (Throwable unused) {
            return "Unknown";
        }
    }

    /* renamed from: c */
    public static String m20120c() {
        String str = Build.VERSION.RELEASE;
        if (m20125a()) {
            String property = System.getProperty("ro.yunos.version");
            if (!TextUtils.isEmpty(property)) {
                return property;
            }
            String m20114g = m20114g();
            TextUtils.isEmpty(m20114g);
            return m20114g;
        }
        return str;
    }

    /* renamed from: c */
    public static String m20119c(Context context) {
        try {
            return Locale.getDefault().getLanguage();
        } catch (Throwable unused) {
            return "Unknown";
        }
    }

    /* renamed from: d */
    public static String m20118d() {
        return (!m20125a() || m20116e()) ? "a" : "y";
    }

    /* renamed from: d */
    public static String m20117d(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            int i = displayMetrics.widthPixels;
            int i2 = displayMetrics.heightPixels;
            if (i > i2) {
                int i3 = i ^ i2;
                i2 ^= i3;
                i = i3 ^ i2;
            }
            return i2 + "*" + i;
        } catch (Exception unused) {
            return "Unknown";
        }
    }

    /* renamed from: e */
    public static boolean m20116e() {
        return !TextUtils.isEmpty(C0988r.m20064a("ro.yunos.product.chip")) || !TextUtils.isEmpty(C0988r.m20064a("ro.yunos.hardware"));
    }

    /* renamed from: f */
    public static String m20115f() {
        try {
            return (String) C116971W2r.LIZ("com.yunos.baseservice.clouduuid.CloudUUID").getMethod("getCloudUUID", new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static String m20114g() {
        try {
            Field declaredField = Build.class.getDeclaredField("YUNOS_BUILD_VERSION");
            if (declaredField == null) {
                return null;
            }
            declaredField.setAccessible(true);
            return (String) declaredField.get(new String());
        } catch (Exception unused) {
            return null;
        }
    }
}
