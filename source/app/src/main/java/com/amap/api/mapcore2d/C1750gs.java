package com.amap.api.mapcore2d;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.umeng.message.proguard.C34037f;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.gs */
/* loaded from: classes19.dex */
public final class C1750gs {

    /* renamed from: J */
    public static String f23814J;

    /* renamed from: L */
    public static String f23815L;

    /* renamed from: A */
    public String f23816A;

    /* renamed from: B */
    public String f23817B;

    /* renamed from: b */
    public short f23831b;

    /* renamed from: c */
    public String f23832c;

    /* renamed from: d */
    public String f23833d;

    /* renamed from: e */
    public String f23834e;

    /* renamed from: f */
    public String f23835f;

    /* renamed from: g */
    public String f23836g;

    /* renamed from: h */
    public String f23837h;

    /* renamed from: i */
    public String f23838i;

    /* renamed from: j */
    public String f23839j;

    /* renamed from: k */
    public String f23840k;

    /* renamed from: l */
    public String f23841l;

    /* renamed from: m */
    public String f23842m;

    /* renamed from: n */
    public String f23843n;

    /* renamed from: o */
    public String f23844o;

    /* renamed from: p */
    public String f23845p;

    /* renamed from: q */
    public String f23846q;

    /* renamed from: r */
    public String f23847r;

    /* renamed from: s */
    public String f23848s;

    /* renamed from: t */
    public String f23849t;

    /* renamed from: u */
    public String f23850u;

    /* renamed from: v */
    public String f23851v;

    /* renamed from: w */
    public String f23852w;

    /* renamed from: x */
    public String f23853x;

    /* renamed from: y */
    public String f23854y;

    /* renamed from: z */
    public int f23855z;

    /* renamed from: a */
    public String f23830a = "1";

    /* renamed from: C */
    public ArrayList<C1742gm> f23818C = new ArrayList<>();

    /* renamed from: D */
    public String f23819D = null;

    /* renamed from: E */
    public String f23820E = null;

    /* renamed from: F */
    public ArrayList<ScanResult> f23821F = new ArrayList<>();

    /* renamed from: G */
    public String f23822G = null;

    /* renamed from: H */
    public String f23823H = null;

    /* renamed from: I */
    public byte[] f23824I = null;

    /* renamed from: O */
    public byte[] f23828O = null;

    /* renamed from: P */
    public int f23829P = 0;

    /* renamed from: K */
    public String f23825K = null;

    /* renamed from: M */
    public String f23826M = null;

    /* renamed from: N */
    public String f23827N = null;

    static {
        Covode.recordClassIndex(5298);
    }

    /* renamed from: a */
    public static int m17310a(String str, byte[] bArr, int i) {
        try {
        } catch (Throwable th) {
            C1752gu.m17302a(th, "Req", "copyContentWithByteLen");
            bArr[i] = 0;
        }
        if (TextUtils.isEmpty(str)) {
            bArr[i] = 0;
            return i + 1;
        }
        byte[] bytes = str.getBytes("GBK");
        int length = bytes.length;
        if (length > 127) {
            length = 127;
        }
        bArr[i] = (byte) length;
        int i2 = i + 1;
        System.arraycopy(bytes, 0, bArr, i2, length);
        return i2 + length;
    }

    /* renamed from: a */
    private String m17311a(String str, int i) {
        String[] split = this.f23817B.split("\\*")[i].split(Constants.ACCEPT_TIME_SEPARATOR_SP);
        if ("lac".equals(str)) {
            return split[0];
        }
        if ("cellid".equals(str)) {
            return split[1];
        }
        if (!"signal".equals(str)) {
            return null;
        }
        return split[2];
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x000d, code lost:
        if (r5.length != 6) goto L3;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private byte[] m17312a(java.lang.String r7) {
        /*
            r6 = this;
            java.lang.String r0 = ":"
            java.lang.String[] r5 = r7.split(r0)
            r2 = 6
            byte[] r4 = new byte[r2]
            r3 = 0
            if (r5 == 0) goto Lf
            int r0 = r5.length     // Catch: java.lang.Throwable -> L3e
            if (r0 == r2) goto L1b
        Lf:
            java.lang.String[] r5 = new java.lang.String[r2]     // Catch: java.lang.Throwable -> L3e
            r1 = 0
        L12:
            if (r1 >= r2) goto L1b
            java.lang.String r0 = "0"
            r5[r1] = r0     // Catch: java.lang.Throwable -> L3e
            int r1 = r1 + 1
            goto L12
        L1b:
            r2 = 0
        L1c:
            int r0 = r5.length     // Catch: java.lang.Throwable -> L3e
            if (r2 >= r0) goto L54
            r0 = r5[r2]     // Catch: java.lang.Throwable -> L3e
            int r0 = r0.length()     // Catch: java.lang.Throwable -> L3e
            r1 = 2
            if (r0 <= r1) goto L30
            r0 = r5[r2]     // Catch: java.lang.Throwable -> L3e
            java.lang.String r0 = r0.substring(r3, r1)     // Catch: java.lang.Throwable -> L3e
            r5[r2] = r0     // Catch: java.lang.Throwable -> L3e
        L30:
            r1 = r5[r2]     // Catch: java.lang.Throwable -> L3e
            r0 = 16
            int r0 = java.lang.Integer.parseInt(r1, r0)     // Catch: java.lang.Throwable -> L3e
            byte r0 = (byte) r0     // Catch: java.lang.Throwable -> L3e
            r4[r2] = r0     // Catch: java.lang.Throwable -> L3e
            int r2 = r2 + 1
            goto L1c
        L3e:
            r2 = move-exception
            java.lang.String r1 = java.lang.String.valueOf(r7)
            java.lang.String r0 = "getMacBa "
            java.lang.String r1 = r0.concat(r1)
            java.lang.String r0 = "Req"
            com.amap.api.mapcore2d.C1752gu.m17302a(r2, r0, r1)
            java.lang.String r0 = "00:00:00:00:00:00"
            byte[] r4 = r6.m17312a(r0)
        L54:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1750gs.m17312a(java.lang.String):byte[]");
    }

    /* renamed from: b */
    private String m17308b(String str) {
        String str2 = this.f23816A;
        new StringBuilder();
        if (!str2.contains(C0002O.m25086C(str, ">"))) {
            return "0";
        }
        String str3 = this.f23816A;
        new StringBuilder();
        int indexOf = str3.indexOf(C0002O.m25086C(str, ">"));
        return this.f23816A.substring(indexOf + str.length() + 1, this.f23816A.indexOf("</".concat(String.valueOf(str))));
    }

    /* renamed from: b */
    private void m17309b() {
        if (TextUtils.isEmpty(this.f23830a)) {
            this.f23830a = "";
        }
        if (TextUtils.isEmpty(this.f23832c)) {
            this.f23832c = "";
        }
        if (TextUtils.isEmpty(this.f23833d)) {
            this.f23833d = "";
        }
        if (TextUtils.isEmpty(this.f23834e)) {
            this.f23834e = "";
        }
        if (TextUtils.isEmpty(this.f23835f)) {
            this.f23835f = "";
        }
        if (TextUtils.isEmpty(this.f23836g)) {
            this.f23836g = "";
        }
        if (TextUtils.isEmpty(this.f23837h)) {
            this.f23837h = "";
        }
        if (TextUtils.isEmpty(this.f23838i)) {
            this.f23838i = "";
        }
        if (TextUtils.isEmpty(this.f23839j) || (!"0".equals(this.f23839j) && !"2".equals(this.f23839j))) {
            this.f23839j = "0";
        }
        if (TextUtils.isEmpty(this.f23840k) || (!"0".equals(this.f23840k) && !"1".equals(this.f23840k))) {
            this.f23840k = "0";
        }
        if (TextUtils.isEmpty(this.f23841l)) {
            this.f23841l = "";
        }
        if (TextUtils.isEmpty(this.f23842m)) {
            this.f23842m = "";
        }
        if (TextUtils.isEmpty(this.f23843n)) {
            this.f23843n = "";
        }
        if (TextUtils.isEmpty(this.f23844o)) {
            this.f23844o = "";
        }
        if (TextUtils.isEmpty(this.f23845p)) {
            this.f23845p = "";
        }
        if (TextUtils.isEmpty(this.f23846q)) {
            this.f23846q = "";
        }
        if (TextUtils.isEmpty(this.f23847r)) {
            this.f23847r = "";
        }
        if (TextUtils.isEmpty(this.f23848s)) {
            this.f23848s = "";
        }
        if (TextUtils.isEmpty(this.f23849t)) {
            this.f23849t = "";
        }
        if (TextUtils.isEmpty(this.f23850u)) {
            this.f23850u = "";
        }
        if (TextUtils.isEmpty(this.f23851v)) {
            this.f23851v = "";
        }
        if (TextUtils.isEmpty(this.f23852w)) {
            this.f23852w = "";
        }
        if (TextUtils.isEmpty(this.f23853x)) {
            this.f23853x = "";
        }
        if (TextUtils.isEmpty(this.f23854y) || (!"1".equals(this.f23854y) && !"2".equals(this.f23854y))) {
            this.f23854y = "0";
        }
        if (!C1743gn.m17419a(this.f23855z)) {
            this.f23855z = 0;
        }
        if (TextUtils.isEmpty(this.f23816A)) {
            this.f23816A = "";
        }
        if (TextUtils.isEmpty(this.f23817B)) {
            this.f23817B = "";
        }
        if (TextUtils.isEmpty(this.f23820E)) {
            this.f23820E = "";
        }
        if (TextUtils.isEmpty(this.f23822G)) {
            this.f23822G = "";
        }
        if (TextUtils.isEmpty(this.f23823H)) {
            this.f23823H = "";
        }
        if (TextUtils.isEmpty(f23814J)) {
            f23814J = "";
        }
        if (this.f23824I == null) {
            this.f23824I = new byte[0];
        }
        if (TextUtils.isEmpty(this.f23827N)) {
            this.f23827N = "";
        }
    }

    public static String com_amap_api_mapcore2d_gs_android_net_wifi_WifiInfo_getBSSID(WifiInfo wifiInfo) {
        ActionInvokeEntrance.setEventUuid(101100);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiInfo, new Object[0], 101100, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String bssid = wifiInfo.getBSSID();
        ActionInvokeEntrance.actionInvoke(bssid, wifiInfo, new Object[0], 101100, "com_amap_api_mapcore2d_gs_android_net_wifi_WifiInfo_getBSSID(Landroid/net/wifi/WifiInfo;)Ljava/lang/String;");
        return bssid;
    }

    public static String com_amap_api_mapcore2d_gs_android_net_wifi_WifiInfo_getSSID(WifiInfo wifiInfo) {
        ActionInvokeEntrance.setEventUuid(101000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiInfo, new Object[0], 101000, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String ssid = wifiInfo.getSSID();
        ActionInvokeEntrance.actionInvoke(ssid, wifiInfo, new Object[0], 101000, "com_amap_api_mapcore2d_gs_android_net_wifi_WifiInfo_getSSID(Landroid/net/wifi/WifiInfo;)Ljava/lang/String;");
        return ssid;
    }

    /* renamed from: com_amap_api_mapcore2d_gs_android_telephony_TelephonyManager_getSubscriberId */
    public static String m17307xb461719c(TelephonyManager telephonyManager) {
        ActionInvokeEntrance.setEventUuid(101900);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(telephonyManager, new Object[0], 101900, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String LIZLLL = C116971W2r.LIZLLL(telephonyManager);
        ActionInvokeEntrance.actionInvoke(LIZLLL, telephonyManager, new Object[0], 101900, "com_amap_api_mapcore2d_gs_android_telephony_TelephonyManager_getSubscriberId(Landroid/telephony/TelephonyManager;)Ljava/lang/String;");
        return LIZLLL;
    }

    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7, types: [android.net.ConnectivityManager] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.String] */
    /* renamed from: a */
    public final void m17313a(Context context, boolean z, boolean z2, C1743gn c1743gn, C1746go c1746go, ConnectivityManager connectivityManager, String str) {
        String str2;
        String str3;
        ?? r4;
        NetworkInfo networkInfo;
        ConnectivityManager connectivityManager2;
        String str4;
        String str5;
        ArrayList<ScanResult> arrayList;
        String m18118f = C1573cq.m18118f(context);
        int m17248f = C1757gy.m17248f();
        this.f23825K = str;
        if (!z2) {
            str2 = "UC_nlp_20131029";
            str3 = "BKZCHMBBSSUK7U8GLUKHBB56CCFF78U";
        } else {
            str2 = "api_serverSDK_130905";
            str3 = "S128DF1572465B890OE3F7A13167KLEI";
        }
        StringBuilder sb = new StringBuilder();
        int m17395c = c1743gn.m17395c();
        int m17384d = c1743gn.m17384d();
        TelephonyManager m17382e = c1743gn.m17382e();
        ArrayList<C1742gm> m17420a = c1743gn.m17420a();
        ArrayList<C1742gm> m17400b = c1743gn.m17400b();
        ArrayList<ScanResult> m17364a = c1746go.m17364a();
        String str6 = "1";
        String str7 = m17384d == 2 ? str6 : "0";
        if (m17382e != null) {
            if (TextUtils.isEmpty(C1752gu.f23919d)) {
                try {
                    C1752gu.f23919d = C1587cu.m18031v(context);
                } catch (Throwable th) {
                    C1752gu.m17302a(th, "Aps", "getApsReq part4");
                }
            }
            r4 = "888888888888888";
            if (TextUtils.isEmpty(C1752gu.f23919d) && Build.VERSION.SDK_INT < 29) {
                C1752gu.f23919d = r4;
            }
            if (TextUtils.isEmpty(C1752gu.f23920e)) {
                try {
                    C1752gu.f23920e = m17307xb461719c(m17382e);
                } catch (SecurityException unused) {
                } catch (Throwable th2) {
                    C1752gu.m17302a(th2, "Aps", "getApsReq part2");
                }
            }
            if (TextUtils.isEmpty(C1752gu.f23920e) && Build.VERSION.SDK_INT < 29) {
                C1752gu.f23920e = r4;
            }
        }
        try {
            r4 = connectivityManager;
            networkInfo = C116971W2r.LIZ((ConnectivityManager) r4);
            connectivityManager2 = r4;
        } catch (Throwable th3) {
            C1752gu.m17302a(th3, "Aps", "getApsReq part");
            networkInfo = null;
            connectivityManager2 = r4;
        }
        boolean m17362a = c1746go.m17362a(connectivityManager2);
        int m17271a = C1757gy.m17271a(networkInfo);
        String str8 = "";
        if (m17271a != -1) {
            str4 = C1757gy.m17259b(m17382e);
            if (m17362a) {
                str6 = "2";
            }
        } else {
            str4 = str8;
            str6 = str4;
        }
        if (!m17420a.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            str5 = str8;
            if (m17384d == 1) {
                C1742gm c1742gm = m17420a.get(0);
                sb2.delete(0, sb2.length());
                sb2.append("<mcc>");
                sb2.append(c1742gm.f23733a);
                sb2.append("</mcc>");
                sb2.append("<mnc>");
                sb2.append(c1742gm.f23734b);
                sb2.append("</mnc>");
                sb2.append("<lac>");
                sb2.append(c1742gm.f23735c);
                sb2.append("</lac>");
                sb2.append("<cellid>");
                sb2.append(c1742gm.f23736d);
                sb2.append("</cellid>");
                sb2.append("<signal>");
                sb2.append(c1742gm.f23742j);
                sb2.append("</signal>");
                str8 = sb2.toString();
                for (int i = 1; i < m17420a.size(); i++) {
                    C1742gm c1742gm2 = m17420a.get(i);
                    sb.append(c1742gm2.f23735c);
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(c1742gm2.f23736d);
                    sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    sb.append(c1742gm2.f23742j);
                    if (i < m17420a.size() - 1) {
                        sb.append("*");
                    }
                }
            } else if (m17384d != 2) {
                str8 = str5;
            } else {
                C1742gm c1742gm3 = m17420a.get(0);
                sb2.delete(0, sb2.length());
                sb2.append("<mcc>");
                sb2.append(c1742gm3.f23733a);
                sb2.append("</mcc>");
                sb2.append("<sid>");
                sb2.append(c1742gm3.f23739g);
                sb2.append("</sid>");
                sb2.append("<nid>");
                sb2.append(c1742gm3.f23740h);
                sb2.append("</nid>");
                sb2.append("<bid>");
                sb2.append(c1742gm3.f23741i);
                sb2.append("</bid>");
                if (c1742gm3.f23738f > 0 && c1742gm3.f23737e > 0) {
                    sb2.append("<lon>");
                    sb2.append(c1742gm3.f23738f);
                    sb2.append("</lon>");
                    sb2.append("<lat>");
                    sb2.append(c1742gm3.f23737e);
                    sb2.append("</lat>");
                }
                sb2.append("<signal>");
                sb2.append(c1742gm3.f23742j);
                sb2.append("</signal>");
                str8 = sb2.toString();
            }
            sb2.delete(0, sb2.length());
        } else {
            str5 = str8;
        }
        if ((m17395c & 4) != 4 || m17400b.isEmpty()) {
            this.f23818C.clear();
        } else {
            this.f23818C.clear();
            this.f23818C.addAll(m17400b);
        }
        StringBuilder sb3 = new StringBuilder();
        if (c1746go.m17351e()) {
            if (m17362a) {
                WifiInfo m17350f = c1746go.m17350f();
                if (C1746go.m17361a(m17350f)) {
                    sb3.append(com_amap_api_mapcore2d_gs_android_net_wifi_WifiInfo_getBSSID(m17350f));
                    sb3.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    int rssi = m17350f.getRssi();
                    if (rssi < -128 || rssi > 127) {
                        rssi = 0;
                    }
                    sb3.append(rssi);
                    sb3.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
                    String com_amap_api_mapcore2d_gs_android_net_wifi_WifiInfo_getSSID = com_amap_api_mapcore2d_gs_android_net_wifi_WifiInfo_getSSID(m17350f);
                    int i2 = 32;
                    try {
                        i2 = com_amap_api_mapcore2d_gs_android_net_wifi_WifiInfo_getSSID(m17350f).getBytes(C34037f.f43302f).length;
                    } catch (Exception unused2) {
                    }
                    if (i2 >= 32) {
                        com_amap_api_mapcore2d_gs_android_net_wifi_WifiInfo_getSSID = "unkwn";
                    }
                    sb3.append(com_amap_api_mapcore2d_gs_android_net_wifi_WifiInfo_getSSID.replace("*", "."));
                }
            }
            if (m17364a != null && (arrayList = this.f23821F) != null) {
                arrayList.clear();
                this.f23821F.addAll(m17364a);
            }
        } else {
            c1746go.m17359b();
            ArrayList<ScanResult> arrayList2 = this.f23821F;
            if (arrayList2 != null) {
                arrayList2.clear();
            }
        }
        this.f23831b = (short) 0;
        if (!z) {
            this.f23831b = (short) (this.f23831b | 2);
        }
        this.f23832c = str2;
        this.f23833d = str3;
        this.f23835f = C1757gy.m17254d();
        this.f23836g = "android" + C1757gy.m17251e();
        this.f23837h = C1757gy.m17261b(context);
        this.f23838i = str7;
        this.f23839j = "0";
        this.f23840k = "0";
        this.f23841l = "0";
        this.f23842m = "0";
        this.f23843n = "0";
        this.f23844o = m18118f;
        this.f23845p = C1752gu.f23919d;
        this.f23846q = C1752gu.f23920e;
        this.f23848s = String.valueOf(m17248f);
        this.f23849t = C1757gy.m17253d(context);
        this.f23851v = "4.7.0";
        this.f23852w = null;
        this.f23850u = str5;
        this.f23853x = str4;
        this.f23854y = str6;
        this.f23855z = m17395c;
        this.f23816A = str8;
        this.f23817B = sb.toString();
        this.f23819D = c1743gn.m17378i();
        this.f23822G = C1746go.m17347i();
        this.f23820E = sb3.toString();
        try {
            if (TextUtils.isEmpty(f23814J)) {
                f23814J = C1587cu.m18045h(context);
            }
        } catch (Throwable unused3) {
        }
        try {
            if (TextUtils.isEmpty(f23815L)) {
                f23815L = C1587cu.m18067b(context);
            }
        } catch (Throwable unused4) {
        }
        try {
            if (TextUtils.isEmpty(this.f23827N)) {
                this.f23827N = C1587cu.m18044i(context);
            }
        } catch (Throwable unused5) {
        }
        sb.delete(0, sb.length());
        sb3.delete(0, sb3.length());
    }

    /* JADX WARN: Can't wrap try/catch for region: R(19:12|13|14|(8:180|(1:182)(5:(1:207)|184|(1:205)|187|(2:189|(2:191|192)(3:193|(3:195|(2:200|201)(1:198)|199)|202))(1:(2:204|192)))|183|184|(0)|205|187|(0)(0))|17|(13:21|22|23|(1:176)(5:26|(1:28)|29|(5:31|(8:33|(3:67|(1:69)|70)(6:39|(3:41|(1:43)|44)|46|(1:66)|50|(8:52|(2:64|63)|56|(1:58)|(1:60)|61|62|63))|45|46|(1:48)|66|50|(0))|71|72|63)|73)|74|(1:76)(9:160|161|162|163|(1:165)|166|167|(1:173)|171)|77|(1:79)(8:127|(1:129)(1:159)|130|(1:132)|133|(10:135|136|137|138|(1:140)(2:152|(1:154))|141|(1:151)|145|(2:147|148)(1:150)|149)|157|158)|80|81|82|(1:84)|(23:86|87|88|89|90|(1:92)|93|(2:119|120)|95|96|97|98|99|100|101|102|(1:104)(1:114)|105|(1:107)|108|(1:110)|111|112)(22:125|88|89|90|(0)|93|(0)|95|96|97|98|99|100|101|102|(0)(0)|105|(0)|108|(0)|111|112))|179|23|(0)|176|74|(0)(0)|77|(0)(0)|80|81|82|(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0497, code lost:
        r6[r5] = 0;
        r0 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x04e2  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0537  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x04bc A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0489 A[Catch: all -> 0x0497, TRY_LEAVE, TryCatch #6 {all -> 0x0497, blocks: (B:82:0x0476, B:86:0x0484, B:125:0x0489), top: B:81:0x0476 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0407  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x012c A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:189:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x019d  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0219 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0484 A[Catch: all -> 0x0497, TryCatch #6 {all -> 0x0497, blocks: (B:82:0x0476, B:86:0x0484, B:125:0x0489), top: B:81:0x0476 }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x04aa A[Catch: all -> 0x04ca, TryCatch #8 {all -> 0x04ca, blocks: (B:90:0x04a2, B:92:0x04aa, B:93:0x04b4), top: B:89:0x04a2 }] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final byte[] m17314a() {
        /*
            Method dump skipped, instructions count: 1349
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1750gs.m17314a():byte[]");
    }
}
