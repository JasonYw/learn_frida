package com.alipay.sdk.p082m.p107m;

import android.content.Context;
import android.content.SharedPreferences;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.preference.PreferenceManager;
import android.text.TextUtils;
import android.util.Pair;
import android.widget.TextView;
import com.alipay.sdk.p082m.p101j.C1294a;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p105l.C1313a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p119s.C1378b;
import com.alipay.sdk.p082m.p120t.C1379a;
import com.alipay.sdk.p082m.p121u.C1383c;
import com.alipay.sdk.p082m.p121u.C1399n;
import com.alipay.sdk.p082m.p122w.C1405b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.umeng.analytics.pro.C33764r;
import java.util.Random;
import p002O.C0002O;
import p003X.G4Y;

/* renamed from: com.alipay.sdk.m.m.b */
/* loaded from: classes2.dex */
public class C1331b {

    /* renamed from: f */
    public static final String f22267f = "virtual_imsi";

    /* renamed from: g */
    public static volatile C1331b f22268g;

    /* renamed from: a */
    public String f22269a;

    /* renamed from: b */
    public String f22270b = "sdk-and-lite";

    /* renamed from: c */
    public String f22271c;

    static {
        Covode.recordClassIndex(4831);
    }

    public static String com_alipay_sdk_m_m_b_android_net_wifi_WifiInfo_getBSSID(WifiInfo wifiInfo) {
        ActionInvokeEntrance.setEventUuid(101100);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiInfo, new Object[0], 101100, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String bssid = wifiInfo.getBSSID();
        ActionInvokeEntrance.actionInvoke(bssid, wifiInfo, new Object[0], 101100, "com_alipay_sdk_m_m_b_android_net_wifi_WifiInfo_getBSSID(Landroid/net/wifi/WifiInfo;)Ljava/lang/String;");
        return bssid;
    }

    public static String com_alipay_sdk_m_m_b_android_net_wifi_WifiInfo_getSSID(WifiInfo wifiInfo) {
        ActionInvokeEntrance.setEventUuid(101000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiInfo, new Object[0], 101000, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String ssid = wifiInfo.getSSID();
        ActionInvokeEntrance.actionInvoke(ssid, wifiInfo, new Object[0], 101000, "com_alipay_sdk_m_m_b_android_net_wifi_WifiInfo_getSSID(Landroid/net/wifi/WifiInfo;)Ljava/lang/String;");
        return ssid;
    }

    /* renamed from: d */
    public static String m19093d() {
        return "-1;-1";
    }

    /* renamed from: e */
    public static String m19092e() {
        return "1";
    }

    /* renamed from: a */
    public String m19102a() {
        return this.f22271c;
    }

    /* renamed from: b */
    public static synchronized C1331b m19097b() {
        C1331b c1331b;
        synchronized (C1331b.class) {
            if (f22268g == null) {
                f22268g = new C1331b();
            }
            c1331b = f22268g;
        }
        return c1331b;
    }

    public C1331b() {
        String m19244a = C1294a.m19244a();
        if (!C1294a.m19242b()) {
            this.f22270b += '_' + m19244a;
        }
    }

    /* renamed from: c */
    public static String m19094c() {
        String hexString = Long.toHexString(System.currentTimeMillis());
        Random random = new Random();
        return hexString + (random.nextInt(9000) + 1000);
    }

    /* renamed from: f */
    public static String m19091f() {
        Context m18917b = C1378b.m18915d().m18917b();
        SharedPreferences LIZ = G4Y.LIZ(m18917b, "virtualImeiAndImsi", 0);
        String string = LIZ.getString("virtual_imei", null);
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(C1379a.m18912a(m18917b).m18905d())) {
                string = m19094c();
            } else {
                string = C1383c.m18876b(m18917b).m18877b();
            }
            LIZ.edit().putString("virtual_imei", string).apply();
        }
        return string;
    }

    /* renamed from: g */
    public static String m19090g() {
        Context m18917b = C1378b.m18915d().m18917b();
        SharedPreferences LIZ = G4Y.LIZ(m18917b, "virtualImeiAndImsi", 0);
        String string = LIZ.getString(f22267f, null);
        if (TextUtils.isEmpty(string)) {
            if (TextUtils.isEmpty(C1379a.m18912a(m18917b).m18905d())) {
                String m18916c = C1378b.m18915d().m18916c();
                if (!TextUtils.isEmpty(m18916c) && m18916c.length() >= 18) {
                    string = m18916c.substring(3, 18);
                } else {
                    string = m19094c();
                }
            } else {
                string = C1383c.m18876b(m18917b).m18875c();
            }
            LIZ.edit().putString(f22267f, string).apply();
        }
        return string;
    }

    /* renamed from: a */
    public static String m19101a(Context context) {
        return Float.toString(new TextView(context).getTextSize());
    }

    /* renamed from: a */
    public static synchronized void m19098a(String str) {
        synchronized (C1331b.class) {
            if (TextUtils.isEmpty(str)) {
                return;
            }
            PreferenceManager.getDefaultSharedPreferences(C1378b.m18915d().m18917b()).edit().putString("trideskey", str).apply();
            C1313a.f22202e = str;
        }
    }

    /* renamed from: b */
    public static String m19096b(Context context) {
        if (context != null) {
            try {
                new StringBuilder();
                String packageName = context.getPackageName();
                return C0002O.m25083C("(", packageName, ";", Integer.valueOf(context.getPackageManager().getPackageInfo(packageName, 0).versionCode), ")");
            } catch (Exception unused) {
                return "";
            }
        }
        return "";
    }

    /* renamed from: a */
    public static String m19100a(C1376a c1376a, Context context, boolean z) {
        if (!z) {
            try {
                WifiInfo m18748d = C1405b.m18748d(c1376a, context);
                if (m18748d != null) {
                    return com_alipay_sdk_m_m_b_android_net_wifi_WifiInfo_getBSSID(m18748d);
                }
                return "00";
            } catch (Throwable th) {
                C1301a.m19215a(c1376a, "biz", "lacking_per_2", th);
                return "00";
            }
        }
        return "00";
    }

    /* renamed from: b */
    public static String m19095b(C1376a c1376a, Context context, boolean z) {
        if (!z) {
            try {
                WifiInfo m18748d = C1405b.m18748d(c1376a, context);
                if (m18748d != null) {
                    return com_alipay_sdk_m_m_b_android_net_wifi_WifiInfo_getSSID(m18748d);
                }
                return C33764r.f42396f;
            } catch (Throwable th) {
                C1301a.m19215a(c1376a, "biz", "lacking_per_1", th);
                return C33764r.f42396f;
            }
        }
        return C33764r.f42396f;
    }

    /* renamed from: a */
    public String m19099a(C1376a c1376a, C1379a c1379a, boolean z) {
        Context m18917b = C1378b.m18915d().m18917b();
        C1383c m18876b = C1383c.m18876b(m18917b);
        if (TextUtils.isEmpty(this.f22269a)) {
            String m18770f = C1399n.m18770f();
            String m18774e = C1399n.m18774e();
            String m18781c = C1399n.m18781c(m18917b);
            String m18773e = C1399n.m18773e(m18917b);
            String m18769f = C1399n.m18769f(m18917b);
            String m19101a = m19101a(m18917b);
            this.f22269a = "Msp/15.8.10 (" + m18770f + ";" + m18774e + ";" + m18781c + ";" + m18773e + ";" + m18769f + ";" + m19101a;
        }
        String m18858b = C1383c.m18872d(m18917b).m18858b();
        String m18788b = C1399n.m18788b(m18917b);
        String m19092e = m19092e();
        String m18875c = m18876b.m18875c();
        String m18877b = m18876b.m18877b();
        String m19090g = m19090g();
        String m19091f = m19091f();
        if (c1379a != null) {
            this.f22271c = c1379a.m18906c();
        }
        String replace = Build.MANUFACTURER.replace(";", " ");
        String replace2 = Build.MODEL.replace(";", " ");
        boolean m18914e = C1378b.m18914e();
        String m18873d = m18876b.m18873d();
        String m19095b = m19095b(c1376a, m18917b, z);
        String m19100a = m19100a(c1376a, m18917b, z);
        StringBuilder sb = new StringBuilder();
        sb.append(this.f22269a);
        sb.append(";");
        sb.append(m18858b);
        sb.append(";");
        sb.append(m18788b);
        sb.append(";");
        sb.append(m19092e);
        sb.append(";");
        sb.append(m18875c);
        sb.append(";");
        sb.append(m18877b);
        sb.append(";");
        sb.append(this.f22271c);
        sb.append(";");
        sb.append(replace);
        sb.append(";");
        sb.append(replace2);
        sb.append(";");
        sb.append(m18914e);
        sb.append(";");
        sb.append(m18873d);
        sb.append(";");
        sb.append(m19093d());
        sb.append(";");
        sb.append(this.f22270b);
        sb.append(";");
        sb.append(m19090g);
        sb.append(";");
        sb.append(m19091f);
        sb.append(";");
        sb.append(m19095b);
        sb.append(";");
        sb.append(m19100a);
        if (c1379a != null) {
            String m18751a = C1405b.m18751a(c1376a, m18917b, C1379a.m18912a(m18917b).m18905d(), C1405b.m18749c(c1376a, m18917b));
            if (!TextUtils.isEmpty(m18751a)) {
                sb.append(";;;");
                sb.append(m18751a);
            }
        }
        sb.append(")");
        return sb.toString();
    }
}
