package com.alipay.sdk.p082m.p121u;

import android.content.Context;
import android.net.NetworkInfo;
import android.net.wifi.WifiInfo;
import android.text.TextUtils;
import android.util.Pair;
import com.alipay.sdk.p082m.p122w.C1405b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import p002O.C0002O;

/* renamed from: com.alipay.sdk.m.u.c */
/* loaded from: classes2.dex */
public class C1383c {

    /* renamed from: c */
    public static C1383c f22388c;

    /* renamed from: a */
    public String f22389a;

    static {
        Covode.recordClassIndex(4883);
    }

    public static String com_alipay_sdk_m_u_c_android_net_wifi_WifiInfo_getMacAddress(WifiInfo wifiInfo) {
        ActionInvokeEntrance.setEventUuid(101700);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiInfo, new Object[0], 101700, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String macAddress = wifiInfo.getMacAddress();
        ActionInvokeEntrance.actionInvoke(macAddress, wifiInfo, new Object[0], 101700, "com_alipay_sdk_m_u_c_android_net_wifi_WifiInfo_getMacAddress(Landroid/net/wifi/WifiInfo;)Ljava/lang/String;");
        return macAddress;
    }

    /* renamed from: b */
    public String m18877b() {
        return "000000000000000";
    }

    /* renamed from: c */
    public String m18875c() {
        return "000000000000000";
    }

    /* renamed from: d */
    public String m18873d() {
        return this.f22389a;
    }

    /* renamed from: a */
    public String m18879a() {
        String m18877b = m18877b();
        new StringBuilder();
        String m25086C = C0002O.m25086C(m18877b, "|");
        String m18875c = m18875c();
        if (TextUtils.isEmpty(m18875c)) {
            new StringBuilder();
            return C0002O.m25086C(m25086C, "000000000000000");
        }
        new StringBuilder();
        return C0002O.m25086C(m25086C, m18875c);
    }

    /* renamed from: a */
    public static String m18878a(Context context) {
        return m18876b(context).m18879a().substring(0, 8);
    }

    /* renamed from: b */
    public static C1383c m18876b(Context context) {
        if (f22388c == null) {
            f22388c = new C1383c(context);
        }
        return f22388c;
    }

    /* renamed from: c */
    public static String m18874c(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return context.getResources().getConfiguration().locale.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    public C1383c(Context context) {
        try {
            try {
                String com_alipay_sdk_m_u_c_android_net_wifi_WifiInfo_getMacAddress = com_alipay_sdk_m_u_c_android_net_wifi_WifiInfo_getMacAddress(C1405b.m18748d(null, context));
                this.f22389a = com_alipay_sdk_m_u_c_android_net_wifi_WifiInfo_getMacAddress;
                if (!TextUtils.isEmpty(com_alipay_sdk_m_u_c_android_net_wifi_WifiInfo_getMacAddress)) {
                    return;
                }
            } catch (Exception e) {
                C1385e.m18866a(e);
                if (!TextUtils.isEmpty(this.f22389a)) {
                    return;
                }
            }
            this.f22389a = "00:00:00:00:00:00";
        } catch (Throwable th) {
            if (TextUtils.isEmpty(this.f22389a)) {
                this.f22389a = "00:00:00:00:00:00";
            }
            throw th;
        }
    }

    /* renamed from: d */
    public static EnumC1387g m18872d(Context context) {
        try {
            NetworkInfo m18752a = C1405b.m18752a(null, context);
            if (m18752a != null) {
                if (m18752a.getType() == 0) {
                    return EnumC1387g.m18859a(m18752a.getSubtype());
                }
                if (m18752a.getType() == 1) {
                    return EnumC1387g.WIFI;
                }
            }
            return EnumC1387g.NONE;
        } catch (Exception unused) {
            return EnumC1387g.NONE;
        }
    }
}
