package com.amap.api.mapcore2d;

import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.go */
/* loaded from: classes19.dex */
public final class C1746go {

    /* renamed from: c */
    public static long f23772c;

    /* renamed from: d */
    public static long f23773d;

    /* renamed from: e */
    public static long f23774e;

    /* renamed from: f */
    public static long f23775f;

    /* renamed from: g */
    public static long f23776g;

    /* renamed from: q */
    public static HashMap<String, Long> f23777q = new HashMap<>(36);

    /* renamed from: r */
    public static long f23778r = 0;

    /* renamed from: s */
    public static int f23779s = 0;

    /* renamed from: a */
    public WifiManager f23780a;

    /* renamed from: h */
    public Context f23782h;

    /* renamed from: b */
    public ArrayList<ScanResult> f23781b = new ArrayList<>();

    /* renamed from: i */
    public boolean f23783i = false;

    /* renamed from: j */
    public StringBuilder f23784j = null;

    /* renamed from: k */
    public boolean f23785k = true;

    /* renamed from: l */
    public boolean f23786l = true;

    /* renamed from: m */
    public boolean f23787m = true;

    /* renamed from: v */
    public volatile WifiInfo f23793v = null;

    /* renamed from: n */
    public String f23788n = null;

    /* renamed from: o */
    public TreeMap<Integer, ScanResult> f23789o = null;

    /* renamed from: p */
    public boolean f23790p = true;

    /* renamed from: t */
    public ConnectivityManager f23791t = null;

    /* renamed from: w */
    public long f23794w = 30000;

    /* renamed from: u */
    public volatile boolean f23792u = false;

    static {
        Covode.recordClassIndex(5294);
    }

    public C1746go(Context context, WifiManager wifiManager) {
        this.f23780a = wifiManager;
        this.f23782h = context;
    }

    /* renamed from: a */
    public static boolean m17363a(int i) {
        try {
            return WifiManager.calculateSignalLevel(i, 20) > 0;
        } catch (ArithmeticException e) {
            C1752gu.m17302a(e, "Aps", "wifiSigFine");
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m17361a(WifiInfo wifiInfo) {
        return wifiInfo != null && !TextUtils.isEmpty(com_amap_api_mapcore2d_go_android_net_wifi_WifiInfo_getSSID(wifiInfo)) && C1757gy.m17269a(com_amap_api_mapcore2d_go_android_net_wifi_WifiInfo_getBSSID(wifiInfo));
    }

    public static String com_amap_api_mapcore2d_go_android_net_wifi_WifiInfo_getBSSID(WifiInfo wifiInfo) {
        ActionInvokeEntrance.setEventUuid(101100);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiInfo, new Object[0], 101100, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String bssid = wifiInfo.getBSSID();
        ActionInvokeEntrance.actionInvoke(bssid, wifiInfo, new Object[0], 101100, "com_amap_api_mapcore2d_go_android_net_wifi_WifiInfo_getBSSID(Landroid/net/wifi/WifiInfo;)Ljava/lang/String;");
        return bssid;
    }

    public static String com_amap_api_mapcore2d_go_android_net_wifi_WifiInfo_getSSID(WifiInfo wifiInfo) {
        ActionInvokeEntrance.setEventUuid(101000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiInfo, new Object[0], 101000, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String ssid = wifiInfo.getSSID();
        ActionInvokeEntrance.actionInvoke(ssid, wifiInfo, new Object[0], 101000, "com_amap_api_mapcore2d_go_android_net_wifi_WifiInfo_getSSID(Landroid/net/wifi/WifiInfo;)Ljava/lang/String;");
        return ssid;
    }

    /* renamed from: com_amap_api_mapcore2d_go_android_net_wifi_WifiManager_getConnectionInfo */
    public static WifiInfo m17355x5f62117d(WifiManager wifiManager) {
        ActionInvokeEntrance.setEventUuid(102301);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiManager, new Object[0], 102301, "android.net.wifi.WifiInfo", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (WifiInfo) actionIntercept.second;
        }
        WifiInfo LIZ = C116971W2r.LIZ(wifiManager);
        ActionInvokeEntrance.actionInvoke(LIZ, wifiManager, new Object[0], 102301, "com_amap_api_mapcore2d_go_android_net_wifi_WifiManager_getConnectionInfo(Landroid/net/wifi/WifiManager;)Landroid/net/wifi/WifiInfo;");
        return LIZ;
    }

    /* renamed from: com_amap_api_mapcore2d_go_android_net_wifi_WifiManager_getScanResults */
    public static List m17354x6feaf788(WifiManager wifiManager) {
        ActionInvokeEntrance.setEventUuid(102300);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiManager, new Object[0], 102300, "java.util.List", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (List) actionIntercept.second;
        }
        List<ScanResult> scanResults = wifiManager.getScanResults();
        ActionInvokeEntrance.actionInvoke(scanResults, wifiManager, new Object[0], 102300, "com_amap_api_mapcore2d_go_android_net_wifi_WifiManager_getScanResults(Landroid/net/wifi/WifiManager;)Ljava/util/List;");
        return scanResults;
    }

    public static boolean com_amap_api_mapcore2d_go_android_net_wifi_WifiManager_startScan(WifiManager wifiManager) {
        ActionInvokeEntrance.setEventUuid(102302);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiManager, new Object[0], 102302, "boolean", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Boolean) actionIntercept.second).booleanValue();
        }
        boolean startScan = wifiManager.startScan();
        ActionInvokeEntrance.actionInvoke(Boolean.valueOf(startScan), wifiManager, new Object[0], 102302, "com_amap_api_mapcore2d_go_android_net_wifi_WifiManager_startScan(Landroid/net/wifi/WifiManager;)Z");
        return startScan;
    }

    /* renamed from: d */
    private void m17352d(boolean z) {
        this.f23785k = z;
        this.f23786l = true;
        this.f23787m = true;
        this.f23794w = 30000L;
    }

    /* renamed from: i */
    public static String m17347i() {
        return String.valueOf(C1757gy.m17265b() - f23775f);
    }

    /* renamed from: j */
    private List<ScanResult> m17346j() {
        WifiManager wifiManager = this.f23780a;
        if (wifiManager != null) {
            try {
                List<ScanResult> m17354x6feaf788 = m17354x6feaf788(wifiManager);
                int i = Build.VERSION.SDK_INT;
                HashMap<String, Long> hashMap = new HashMap<>(36);
                for (ScanResult scanResult : m17354x6feaf788) {
                    hashMap.put(scanResult.BSSID, Long.valueOf(scanResult.timestamp));
                }
                if (f23777q.isEmpty() || !f23777q.equals(hashMap)) {
                    f23777q = hashMap;
                    f23778r = C1757gy.m17265b();
                }
                this.f23788n = null;
                return m17354x6feaf788;
            } catch (SecurityException e) {
                this.f23788n = e.getMessage();
                return null;
            } catch (Throwable th) {
                this.f23788n = null;
                C1752gu.m17302a(th, "WifiManagerWrapper", "getScanResults");
            }
        }
        return null;
    }

    /* renamed from: k */
    private WifiInfo m17345k() {
        try {
            if (this.f23780a == null) {
                return null;
            }
            return m17355x5f62117d(this.f23780a);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "WifiManagerWrapper", "getConnectionInfo");
            return null;
        }
    }

    /* renamed from: l */
    private int m17344l() {
        WifiManager wifiManager = this.f23780a;
        if (wifiManager != null) {
            return wifiManager.getWifiState();
        }
        return 4;
    }

    /* renamed from: m */
    private boolean m17343m() {
        long m17265b = C1757gy.m17265b() - f23772c;
        if (m17265b < 4900) {
            return false;
        }
        if (m17342n() && m17265b < 9900) {
            return false;
        }
        if (f23779s > 1) {
            long j = this.f23794w;
            if (j == 30000) {
                j = C1751gt.m17305b() != -1 ? C1751gt.m17305b() : 30000L;
            }
            if (Build.VERSION.SDK_INT >= 28 && m17265b < j) {
                return false;
            }
        }
        if (this.f23780a == null) {
            return false;
        }
        f23772c = C1757gy.m17265b();
        int i = f23779s;
        if (i < 2) {
            f23779s = i + 1;
        }
        return com_amap_api_mapcore2d_go_android_net_wifi_WifiManager_startScan(this.f23780a);
    }

    /* renamed from: n */
    private boolean m17342n() {
        if (this.f23791t == null) {
            this.f23791t = (ConnectivityManager) C1757gy.m17272a(this.f23782h, "connectivity");
        }
        return m17362a(this.f23791t);
    }

    /* renamed from: o */
    private boolean m17341o() {
        if (this.f23780a == null) {
            return false;
        }
        return C1757gy.m17256c(this.f23782h);
    }

    /* renamed from: p */
    private void m17340p() {
        String str;
        ArrayList<ScanResult> arrayList = this.f23781b;
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        if (C1757gy.m17265b() - f23775f > 3600000) {
            m17359b();
        }
        if (this.f23789o == null) {
            this.f23789o = new TreeMap<>(Collections.reverseOrder());
        }
        this.f23789o.clear();
        int size = this.f23781b.size();
        for (int i = 0; i < size; i++) {
            ScanResult scanResult = this.f23781b.get(i);
            if (C1757gy.m17269a(scanResult != null ? scanResult.BSSID : "") && (size <= 20 || m17363a(scanResult.level))) {
                if (!TextUtils.isEmpty(scanResult.SSID)) {
                    if (!"<unknown ssid>".equals(scanResult.SSID)) {
                        str = String.valueOf(i);
                    }
                    this.f23789o.put(Integer.valueOf((scanResult.level * 25) + i), scanResult);
                } else {
                    str = "unkwn";
                }
                scanResult.SSID = str;
                this.f23789o.put(Integer.valueOf((scanResult.level * 25) + i), scanResult);
            }
        }
        this.f23781b.clear();
        for (ScanResult scanResult2 : this.f23789o.values()) {
            this.f23781b.add(scanResult2);
        }
        this.f23789o.clear();
    }

    /* renamed from: q */
    private void m17339q() {
        if (m17336t()) {
            long m17265b = C1757gy.m17265b();
            int i = 20;
            if (m17265b - f23773d >= 10000) {
                this.f23781b.clear();
                f23776g = f23775f;
            }
            m17338r();
            if (m17265b - f23773d < 10000) {
                return;
            }
            while (f23775f == f23776g) {
                try {
                    Thread.sleep(150L);
                } catch (Throwable unused) {
                }
                i--;
                if (i <= 0) {
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    private void m17338r() {
        if (m17336t()) {
            try {
                if (!m17343m()) {
                    return;
                }
                f23774e = C1757gy.m17265b();
            } catch (Throwable th) {
                C1752gu.m17302a(th, "WifiManager", "wifiScan");
            }
        }
    }

    /* renamed from: s */
    private void m17337s() {
        if (f23776g != f23775f) {
            List<ScanResult> list = null;
            try {
                list = m17346j();
            } catch (Throwable th) {
                C1752gu.m17302a(th, "WifiManager", "updateScanResult");
            }
            f23776g = f23775f;
            if (list == null) {
                this.f23781b.clear();
                return;
            }
            this.f23781b.clear();
            this.f23781b.addAll(list);
        }
    }

    /* renamed from: t */
    private boolean m17336t() {
        this.f23790p = m17341o();
        if (!this.f23790p || !this.f23785k) {
            return false;
        }
        if (f23774e != 0) {
            if (C1757gy.m17265b() - f23774e < 4900 || C1757gy.m17265b() - f23775f < 1500) {
                return false;
            }
            int i = ((C1757gy.m17265b() - f23775f) > 4900L ? 1 : ((C1757gy.m17265b() - f23775f) == 4900L ? 0 : -1));
        }
        return true;
    }

    /* renamed from: a */
    public final ArrayList<ScanResult> m17364a() {
        if (this.f23781b == null) {
            return null;
        }
        ArrayList<ScanResult> arrayList = new ArrayList<>();
        if (!this.f23781b.isEmpty()) {
            arrayList.addAll(this.f23781b);
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void m17360a(boolean z) {
        Context context = this.f23782h;
        if (!C1751gt.m17306a() || !this.f23787m || this.f23780a == null || context == null || !z || C1757gy.m17257c() <= 17) {
            return;
        }
        ContentResolver contentResolver = context.getContentResolver();
        try {
            if (((Integer) C1754gw.m17291a("android.provider.Settings$Global", "getInt", new Object[]{contentResolver, "wifi_scan_always_enabled"}, new Class[]{ContentResolver.class, String.class})).intValue() != 0) {
                return;
            }
            C1754gw.m17291a("android.provider.Settings$Global", "putInt", new Object[]{contentResolver, "wifi_scan_always_enabled", 1}, new Class[]{ContentResolver.class, String.class, Integer.TYPE});
        } catch (Throwable th) {
            C1752gu.m17302a(th, "WifiManagerWrapper", "enableWifiAlwaysScan");
        }
    }

    /* renamed from: a */
    public final boolean m17362a(ConnectivityManager connectivityManager) {
        WifiManager wifiManager = this.f23780a;
        if (wifiManager == null) {
            return false;
        }
        try {
            if (C1757gy.m17271a(C116971W2r.LIZ(connectivityManager)) != 1) {
                return false;
            }
            return m17361a(m17355x5f62117d(wifiManager));
        } catch (Throwable th) {
            C1752gu.m17302a(th, "WifiManagerWrapper", "wifiAccess");
            return false;
        }
    }

    /* renamed from: b */
    public final void m17359b() {
        this.f23793v = null;
        this.f23781b.clear();
    }

    /* renamed from: b */
    public final void m17358b(boolean z) {
        if (z) {
            m17339q();
        } else {
            m17338r();
        }
        if (this.f23792u) {
            this.f23792u = false;
            m17359b();
        }
        m17337s();
        if (C1757gy.m17265b() - f23775f > 20000) {
            this.f23781b.clear();
        }
        f23773d = C1757gy.m17265b();
        if (this.f23781b.isEmpty()) {
            f23775f = C1757gy.m17265b();
            List<ScanResult> m17346j = m17346j();
            if (m17346j != null) {
                this.f23781b.addAll(m17346j);
            }
        }
        m17340p();
    }

    /* renamed from: c */
    public final void m17357c() {
        if (this.f23780a != null && C1757gy.m17265b() - f23775f > 4900) {
            f23775f = C1757gy.m17265b();
        }
    }

    /* renamed from: c */
    public final void m17356c(boolean z) {
        m17352d(z);
    }

    /* renamed from: d */
    public final void m17353d() {
        int i;
        if (this.f23780a == null) {
            return;
        }
        try {
            i = m17344l();
        } catch (Throwable th) {
            C1752gu.m17302a(th, "Aps", "onReceive part");
            i = 4;
        }
        if (this.f23781b == null) {
            this.f23781b = new ArrayList<>();
        }
        if (i != 0 && i != 1 && i != 4) {
            return;
        }
        this.f23792u = true;
    }

    /* renamed from: e */
    public final boolean m17351e() {
        return this.f23790p;
    }

    /* renamed from: f */
    public final WifiInfo m17350f() {
        this.f23793v = m17345k();
        return this.f23793v;
    }

    /* renamed from: g */
    public final boolean m17349g() {
        return this.f23783i;
    }

    /* renamed from: h */
    public final void m17348h() {
        m17359b();
        this.f23781b.clear();
    }
}
