package com.amap.api.mapcore2d;

import android.app.ActivityManager;
import android.content.ContentResolver;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.provider.Settings;
import android.telephony.CellLocation;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.util.Xml;
import android.view.WindowManager;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.clientreport.data.Config;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.net.NetworkInterface;
import java.util.Collections;
import java.util.Enumeration;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.cu */
/* loaded from: classes19.dex */
public class C1587cu {

    /* renamed from: c */
    public static boolean f23270c;

    /* renamed from: e */
    public static boolean f23272e;

    /* renamed from: i */
    public static String f23276i;

    /* renamed from: j */
    public static boolean f23277j;

    /* renamed from: q */
    public static boolean f23284q;

    /* renamed from: r */
    public static long f23285r;

    /* renamed from: s */
    public static int f23286s;

    /* renamed from: t */
    public static String f23287t;

    /* renamed from: a */
    public static String f23268a = "";

    /* renamed from: b */
    public static String f23269b = "";

    /* renamed from: d */
    public static String f23271d = "";

    /* renamed from: k */
    public static String f23278k = "";

    /* renamed from: l */
    public static String f23279l = "";

    /* renamed from: m */
    public static String f23280m = "";

    /* renamed from: n */
    public static String f23281n = "";

    /* renamed from: o */
    public static String f23282o = "";

    /* renamed from: p */
    public static String f23283p = "";

    /* renamed from: f */
    public static int f23273f = -1;

    /* renamed from: g */
    public static String f23274g = "";

    /* renamed from: h */
    public static String f23275h = "";

    /* renamed from: u */
    public static String f23288u = "";

    public static String com_amap_api_mapcore2d_cu_android_net_wifi_WifiInfo_getBSSID(WifiInfo wifiInfo) {
        ActionInvokeEntrance.setEventUuid(101100);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiInfo, new Object[0], 101100, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String bssid = wifiInfo.getBSSID();
        ActionInvokeEntrance.actionInvoke(bssid, wifiInfo, new Object[0], 101100, "com_amap_api_mapcore2d_cu_android_net_wifi_WifiInfo_getBSSID(Landroid/net/wifi/WifiInfo;)Ljava/lang/String;");
        return bssid;
    }

    /* renamed from: com_amap_api_mapcore2d_cu_android_net_wifi_WifiInfo_getMacAddress */
    public static String m18064xdcc2b807(WifiInfo wifiInfo) {
        ActionInvokeEntrance.setEventUuid(101700);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiInfo, new Object[0], 101700, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String macAddress = wifiInfo.getMacAddress();
        ActionInvokeEntrance.actionInvoke(macAddress, wifiInfo, new Object[0], 101700, "com_amap_api_mapcore2d_cu_android_net_wifi_WifiInfo_getMacAddress(Landroid/net/wifi/WifiInfo;)Ljava/lang/String;");
        return macAddress;
    }

    /* renamed from: com_amap_api_mapcore2d_cu_android_net_wifi_WifiManager_getConnectionInfo */
    public static WifiInfo m18063xbbfb74b3(WifiManager wifiManager) {
        ActionInvokeEntrance.setEventUuid(102301);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiManager, new Object[0], 102301, "android.net.wifi.WifiInfo", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (WifiInfo) actionIntercept.second;
        }
        WifiInfo LIZ = C116971W2r.LIZ(wifiManager);
        ActionInvokeEntrance.actionInvoke(LIZ, wifiManager, new Object[0], 102301, "com_amap_api_mapcore2d_cu_android_net_wifi_WifiManager_getConnectionInfo(Landroid/net/wifi/WifiManager;)Landroid/net/wifi/WifiInfo;");
        return LIZ;
    }

    /* renamed from: com_amap_api_mapcore2d_cu_android_net_wifi_WifiManager_getScanResults */
    public static List m18062x29d15012(WifiManager wifiManager) {
        ActionInvokeEntrance.setEventUuid(102300);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiManager, new Object[0], 102300, "java.util.List", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (List) actionIntercept.second;
        }
        List<ScanResult> scanResults = wifiManager.getScanResults();
        ActionInvokeEntrance.actionInvoke(scanResults, wifiManager, new Object[0], 102300, "com_amap_api_mapcore2d_cu_android_net_wifi_WifiManager_getScanResults(Landroid/net/wifi/WifiManager;)Ljava/util/List;");
        return scanResults;
    }

    public static String com_amap_api_mapcore2d_cu_android_os_Build_SERIAL() {
        ActionInvokeEntrance.setEventUuid(102002);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(Build.class, new Object[0], 102002, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        ActionInvokeEntrance.actionInvoke(null, Build.class, new Object[0], 102002, "com_amap_api_mapcore2d_cu_android_os_Build_SERIAL()Ljava/lang/String;");
        return Build.SERIAL;
    }

    /* renamed from: com_amap_api_mapcore2d_cu_android_provider_Settings$Secure_getString */
    public static String m18061x8ccf4472(ContentResolver contentResolver, String str) {
        ActionInvokeEntrance.setEventUuid(102004);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(Settings.Secure.class, new Object[]{contentResolver, str}, 102004, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String LIZ = C116971W2r.LIZ(contentResolver, str);
        ActionInvokeEntrance.actionInvoke(LIZ, Settings.Secure.class, new Object[]{contentResolver, str}, 102004, "com_amap_api_mapcore2d_cu_android_provider_Settings$Secure_getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        return LIZ;
    }

    /* renamed from: com_amap_api_mapcore2d_cu_android_provider_Settings$System_getString */
    public static String m18060x46d552a(ContentResolver contentResolver, String str) {
        ActionInvokeEntrance.setEventUuid(102003);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(Settings.System.class, new Object[]{contentResolver, str}, 102003, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String string = Settings.System.getString(contentResolver, str);
        ActionInvokeEntrance.actionInvoke(string, Settings.System.class, new Object[]{contentResolver, str}, 102003, "com_amap_api_mapcore2d_cu_android_provider_Settings$System_getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        return string;
    }

    /* renamed from: com_amap_api_mapcore2d_cu_android_telephony_TelephonyManager_getCellLocation */
    public static CellLocation m18059x908f8fea(TelephonyManager telephonyManager) {
        ActionInvokeEntrance.setEventUuid(100900);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(telephonyManager, new Object[0], 100900, "android.telephony.CellLocation", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (CellLocation) actionIntercept.second;
        }
        CellLocation cellLocation = telephonyManager.getCellLocation();
        ActionInvokeEntrance.actionInvoke(cellLocation, telephonyManager, new Object[0], 100900, "com_amap_api_mapcore2d_cu_android_telephony_TelephonyManager_getCellLocation(Landroid/telephony/TelephonyManager;)Landroid/telephony/CellLocation;");
        return cellLocation;
    }

    /* renamed from: com_amap_api_mapcore2d_cu_android_telephony_cdma_CdmaCellLocation_getBaseStationId */
    public static int m18058x99cd7cb8(CdmaCellLocation cdmaCellLocation) {
        ActionInvokeEntrance.setEventUuid(100901);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(cdmaCellLocation, new Object[0], 100901, "int", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Integer) actionIntercept.second).intValue();
        }
        int baseStationId = cdmaCellLocation.getBaseStationId();
        ActionInvokeEntrance.actionInvoke(Integer.valueOf(baseStationId), cdmaCellLocation, new Object[0], 100901, "com_amap_api_mapcore2d_cu_android_telephony_cdma_CdmaCellLocation_getBaseStationId(Landroid/telephony/cdma/CdmaCellLocation;)I");
        return baseStationId;
    }

    /* renamed from: com_amap_api_mapcore2d_cu_android_telephony_cdma_CdmaCellLocation_getNetworkId */
    public static int m18057x30ade803(CdmaCellLocation cdmaCellLocation) {
        ActionInvokeEntrance.setEventUuid(100905);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(cdmaCellLocation, new Object[0], 100905, "int", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Integer) actionIntercept.second).intValue();
        }
        int networkId = cdmaCellLocation.getNetworkId();
        ActionInvokeEntrance.actionInvoke(Integer.valueOf(networkId), cdmaCellLocation, new Object[0], 100905, "com_amap_api_mapcore2d_cu_android_telephony_cdma_CdmaCellLocation_getNetworkId(Landroid/telephony/cdma/CdmaCellLocation;)I");
        return networkId;
    }

    /* renamed from: com_amap_api_mapcore2d_cu_android_telephony_cdma_CdmaCellLocation_getSystemId */
    public static int m18056xbdb5e850(CdmaCellLocation cdmaCellLocation) {
        ActionInvokeEntrance.setEventUuid(100904);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(cdmaCellLocation, new Object[0], 100904, "int", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Integer) actionIntercept.second).intValue();
        }
        int systemId = cdmaCellLocation.getSystemId();
        ActionInvokeEntrance.actionInvoke(Integer.valueOf(systemId), cdmaCellLocation, new Object[0], 100904, "com_amap_api_mapcore2d_cu_android_telephony_cdma_CdmaCellLocation_getSystemId(Landroid/telephony/cdma/CdmaCellLocation;)I");
        return systemId;
    }

    /* renamed from: com_amap_api_mapcore2d_cu_android_telephony_gsm_GsmCellLocation_getCid */
    public static int m18055x1af3f114(GsmCellLocation gsmCellLocation) {
        ActionInvokeEntrance.setEventUuid(100906);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(gsmCellLocation, new Object[0], 100906, "int", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Integer) actionIntercept.second).intValue();
        }
        int cid = gsmCellLocation.getCid();
        ActionInvokeEntrance.actionInvoke(Integer.valueOf(cid), gsmCellLocation, new Object[0], 100906, "com_amap_api_mapcore2d_cu_android_telephony_gsm_GsmCellLocation_getCid(Landroid/telephony/gsm/GsmCellLocation;)I");
        return cid;
    }

    /* renamed from: com_amap_api_mapcore2d_cu_android_telephony_gsm_GsmCellLocation_getLac */
    public static int m18054x1af411e4(GsmCellLocation gsmCellLocation) {
        ActionInvokeEntrance.setEventUuid(100907);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(gsmCellLocation, new Object[0], 100907, "int", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Integer) actionIntercept.second).intValue();
        }
        int lac = gsmCellLocation.getLac();
        ActionInvokeEntrance.actionInvoke(Integer.valueOf(lac), gsmCellLocation, new Object[0], 100907, "com_amap_api_mapcore2d_cu_android_telephony_gsm_GsmCellLocation_getLac(Landroid/telephony/gsm/GsmCellLocation;)I");
        return lac;
    }

    public static Object com_amap_api_mapcore2d_cu_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        ActionInvokeEntrance.setEventUuid(110000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_amap_api_mapcore2d_cu_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return actionIntercept.second;
        }
        Object invoke = method.invoke(obj, objArr);
        ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_amap_api_mapcore2d_cu_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        return invoke;
    }

    /* renamed from: com_amap_api_mapcore2d_cu_java_net_NetworkInterface_getHardwareAddress */
    public static byte[] m18053x88d9c0bb(NetworkInterface networkInterface) {
        ActionInvokeEntrance.setEventUuid(101701);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(networkInterface, new Object[0], 101701, "byte[]", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (byte[]) actionIntercept.second;
        }
        byte[] hardwareAddress = networkInterface.getHardwareAddress();
        ActionInvokeEntrance.actionInvoke(hardwareAddress, networkInterface, new Object[0], 101701, "com_amap_api_mapcore2d_cu_java_net_NetworkInterface_getHardwareAddress(Ljava/net/NetworkInterface;)[B");
        return hardwareAddress;
    }

    /* renamed from: com_amap_api_mapcore2d_cu_java_net_NetworkInterface_getNetworkInterfaces */
    public static Enumeration m18052xa24cbf37() {
        ActionInvokeEntrance.setEventUuid(100016);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(NetworkInterface.class, new Object[0], 100016, "java.util.Enumeration", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (Enumeration) actionIntercept.second;
        }
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        ActionInvokeEntrance.actionInvoke(networkInterfaces, NetworkInterface.class, new Object[0], 100016, "com_amap_api_mapcore2d_cu_java_net_NetworkInterface_getNetworkInterfaces()Ljava/util/Enumeration;");
        return networkInterfaces;
    }

    /* renamed from: a */
    public static String m18073a() {
        return f23276i;
    }

    /* renamed from: d */
    public static String m18051d() {
        if (!TextUtils.isEmpty(f23287t)) {
            return f23287t;
        }
        String property = System.getProperty("os.arch");
        f23287t = property;
        return property;
    }

    static {
        Covode.recordClassIndex(5135);
    }

    /* renamed from: b */
    public static void m18068b() {
        try {
            int i = Build.VERSION.SDK_INT;
            com_amap_api_mapcore2d_cu_java_lang_reflect_Method_invoke(TrafficStats.class.getDeclaredMethod("setThreadStatsTag", Integer.TYPE), null, new Object[]{40964});
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static long m18066c() {
        long j = f23285r;
        if (j != 0) {
            return j;
        }
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(C116971W2r.LIZIZ().getAbsolutePath());
            int i = Build.VERSION.SDK_INT;
            f23285r = ((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / Config.DEFAULT_MAX_FILE_LENGTH) + ((statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / Config.DEFAULT_MAX_FILE_LENGTH);
        } catch (Throwable unused) {
        }
        return f23285r;
    }

    /* renamed from: e */
    public static String m18049e() {
        try {
            for (NetworkInterface networkInterface : Collections.list(m18052xa24cbf37())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    int i = Build.VERSION.SDK_INT;
                    byte[] m18053x88d9c0bb = m18053x88d9c0bb(networkInterface);
                    if (m18053x88d9c0bb == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b : m18053x88d9c0bb) {
                        String upperCase = Integer.toHexString(b & 255).toUpperCase();
                        if (upperCase.length() == 1) {
                            sb.append("0");
                        }
                        sb.append(upperCase);
                        sb.append(Constants.COLON_SEPARATOR);
                    }
                    if (sb.length() > 0) {
                        sb.deleteCharAt(sb.length() - 1);
                    }
                    return sb.toString();
                }
            }
            return "";
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m18065c(Context context) {
        try {
            return m18079C(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: e */
    public static int m18048e(Context context) {
        try {
            return m18075G(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: f */
    public static int m18047f(Context context) {
        try {
            return m18078D(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: g */
    public static String m18046g(Context context) {
        try {
            return m18080B(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: q */
    public static int m18036q(Context context) {
        try {
            return m18075G(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: r */
    public static int m18035r(Context context) {
        try {
            return m18078D(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: x */
    public static String m18029x(Context context) {
        try {
            return m18080B(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: z */
    public static String m18027z(Context context) {
        try {
            return m18079C(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: E */
    public static ConnectivityManager m18077E(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* renamed from: H */
    public static TelephonyManager m18074H(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: d */
    public static String m18050d(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        try {
            return m18076F(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: t */
    public static String m18033t(Context context) {
        try {
            NetworkInfo m18034s = m18034s(context);
            if (m18034s == null) {
                return null;
            }
            return m18034s.getExtraInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: F */
    public static String m18076F(Context context) {
        String m18029x = m18029x(context);
        if (m18029x != null && m18029x.length() >= 5) {
            return m18029x.substring(3, 5);
        }
        return "";
    }

    /* renamed from: G */
    public static int m18075G(Context context) {
        TelephonyManager m18074H;
        if (!m18071a(context, C1602db.m17930c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=")) || (m18074H = m18074H(context)) == null) {
            return -1;
        }
        return C116971W2r.LIZ(m18074H);
    }

    /* renamed from: o */
    public static String m18038o(Context context) {
        try {
            TelephonyManager m18074H = m18074H(context);
            if (m18074H == null) {
                return "";
            }
            String networkOperator = m18074H.getNetworkOperator();
            if (TextUtils.isEmpty(networkOperator) || networkOperator.length() < 3) {
                return "";
            }
            return networkOperator.substring(0, 3);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: p */
    public static String m18037p(Context context) {
        try {
            TelephonyManager m18074H = m18074H(context);
            if (m18074H == null) {
                return "";
            }
            String networkOperator = m18074H.getNetworkOperator();
            if (TextUtils.isEmpty(networkOperator) || networkOperator.length() < 3) {
                return "";
            }
            return networkOperator.substring(3);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: s */
    public static NetworkInfo m18034s(Context context) {
        ConnectivityManager m18077E;
        if (!m18071a(context, C1602db.m17930c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (m18077E = m18077E(context)) == null) {
            return null;
        }
        return C116971W2r.LIZ(m18077E);
    }

    /* renamed from: C */
    public static String m18079C(Context context) {
        if (!m18071a(context, C1602db.m17930c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return null;
        }
        TelephonyManager m18074H = m18074H(context);
        if (m18074H == null) {
            return "";
        }
        String simOperatorName = m18074H.getSimOperatorName();
        if (TextUtils.isEmpty(simOperatorName)) {
            return m18074H.getNetworkOperatorName();
        }
        return simOperatorName;
    }

    /* renamed from: D */
    public static int m18078D(Context context) {
        ConnectivityManager m18077E;
        NetworkInfo LIZ;
        if (context == null || !m18071a(context, C1602db.m17930c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (m18077E = m18077E(context)) == null || (LIZ = C116971W2r.LIZ(m18077E)) == null) {
            return -1;
        }
        return LIZ.getType();
    }

    /* renamed from: a */
    public static String m18072a(Context context) {
        try {
            if (!TextUtils.isEmpty(f23271d)) {
                return f23271d;
            }
            C1599da m17912a = C1610dj.m17912a();
            if (C1645ef.m17721a(context, m17912a)) {
                Class m17720a = C1645ef.m17720a(context, m17912a, C1602db.m17930c("WY29tLmFtYXAuYXBpLmFpdW5ldC5OZXRSZXVlc3RQYXJhbQ"));
                if (m17720a != null) {
                    f23271d = (String) m17720a.getMethod("getAdiuExtras", new Class[0]).invoke(m17720a, new Object[0]);
                }
                return f23271d;
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: j */
    public static String m18043j(Context context) {
        if (!TextUtils.isEmpty(f23278k)) {
            return f23278k;
        }
        try {
            String m18061x8ccf4472 = m18061x8ccf4472(context.getContentResolver(), C1602db.m17930c(new String(C1610dj.m17911a(13))));
            f23278k = m18061x8ccf4472;
            if (m18061x8ccf4472 == null) {
                return "";
            }
            return f23278k;
        } catch (Throwable unused) {
            return f23278k;
        }
    }

    /* renamed from: k */
    public static String m18042k(Context context) {
        WifiManager wifiManager;
        if (context == null) {
            return "";
        }
        try {
            if (!m18071a(context, C1602db.m17930c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) || (wifiManager = (WifiManager) context.getSystemService("wifi")) == null || !wifiManager.isWifiEnabled()) {
                return "";
            }
            return com_amap_api_mapcore2d_cu_android_net_wifi_WifiInfo_getBSSID(m18063xbbfb74b3(wifiManager));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: y */
    public static int m18028y(Context context) {
        int i = f23286s;
        if (i != 0) {
            return i;
        }
        int i2 = Build.VERSION.SDK_INT;
        ActivityManager activityManager = (ActivityManager) context.getSystemService(PushConstants.INTENT_ACTIVITY_NAME);
        if (activityManager == null) {
            return 0;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        int i3 = ((int) (memoryInfo.totalMem / 1024)) / AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END;
        f23286s = i3;
        return i3;
    }

    /* renamed from: B */
    public static String m18080B(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        String str = f23288u;
        if (str != null && !"".equals(str)) {
            return f23288u;
        }
        if (!m18071a(context, C1602db.m17930c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return f23288u;
        }
        TelephonyManager m18074H = m18074H(context);
        if (m18074H == null) {
            return "";
        }
        Method m17941a = C1602db.m17941a(m18074H.getClass(), "UZ2V0U3Vic2NyaWJlcklk", new Class[0]);
        if (m17941a != null) {
            f23288u = (String) com_amap_api_mapcore2d_cu_java_lang_reflect_Method_invoke(m17941a, m18074H, new Object[0]);
        }
        if (f23288u == null) {
            f23288u = "";
        }
        return f23288u;
    }

    /* renamed from: a */
    public static List<ScanResult> m18069a(List<ScanResult> list) {
        int size = list.size();
        for (int i = 0; i < size - 1; i++) {
            for (int i2 = 1; i2 < size - i; i2++) {
                int i3 = i2 - 1;
                if (list.get(i3).level > list.get(i2).level) {
                    ScanResult scanResult = list.get(i3);
                    list.set(i3, list.get(i2));
                    list.set(i2, scanResult);
                }
            }
        }
        return list;
    }

    /* renamed from: b */
    public static String m18067b(final Context context) {
        try {
            if (!TextUtils.isEmpty(f23269b)) {
                return f23269b;
            }
            C1599da m17912a = C1610dj.m17912a();
            if (m17912a == null) {
                return null;
            }
            if (C1645ef.m17721a(context, m17912a)) {
                final Class m17720a = C1645ef.m17720a(context, m17912a, C1602db.m17930c("WY29tLmFtYXAuYXBpLmFpdW5ldC5OZXRSZXVlc3RQYXJhbQ"));
                if (m17720a == null) {
                    return f23269b;
                }
                String str = (String) m17720a.getMethod("getADIU", Context.class).invoke(m17720a, context);
                if (!TextUtils.isEmpty(str)) {
                    f23269b = str;
                    return str;
                } else if (!f23277j) {
                    f23277j = true;
                    C1616do.m17865d().submit(new Runnable() { // from class: com.amap.api.mapcore2d.cu.1
                        static {
                            Covode.recordClassIndex(5136);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                Map map = (Map) m17720a.getMethod("getGetParams", new Class[0]).invoke(m17720a, new Object[0]);
                                if (map == null) {
                                    return;
                                }
                                String str2 = (String) m17720a.getMethod("getPostParam", String.class, String.class, String.class, String.class).invoke(m17720a, C1587cu.m18045h(context), C1587cu.m18031v(context), C1587cu.m18040m(context), C1587cu.m18029x(context));
                                if (TextUtils.isEmpty(str2)) {
                                    return;
                                }
                                m17720a.getMethod("parseResult", Context.class, String.class).invoke(m17720a, context, new String(C1671er.m17615a().m17614a(new C1670eq(str2.getBytes(), map))));
                            } catch (Throwable unused) {
                            }
                        }
                    });
                    return "";
                } else {
                    return "";
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: h */
    public static String m18045h(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        if (f23268a != null && !"".equals(f23268a)) {
            return f23268a;
        }
        if (m18071a(context, C1602db.m17930c("WYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFVFRJTkdT"))) {
            f23268a = m18060x46d552a(context.getContentResolver(), "mqBRboGZkQPcAkyk");
        }
        if (f23268a != null && !"".equals(f23268a)) {
            return f23268a;
        }
        try {
            f23268a = m18081A(context);
        } catch (Throwable unused) {
        }
        String str = f23268a;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: i */
    public static String m18044i(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        if (!TextUtils.isEmpty(f23279l)) {
            return f23279l;
        }
        if (!m18071a(context, C1602db.m17930c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return (String) com_amap_api_mapcore2d_cu_java_lang_reflect_Method_invoke(C1602db.m17941a(Build.class, "MZ2V0U2VyaWFs", new Class[0]), Build.class, new Object[0]);
        }
        int i = Build.VERSION.SDK_INT;
        f23279l = com_amap_api_mapcore2d_cu_android_os_Build_SERIAL();
        String str = f23279l;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: l */
    public static String m18041l(Context context) {
        StringBuilder sb = new StringBuilder();
        if (context != null) {
            if (m18071a(context, C1602db.m17930c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (wifiManager == null) {
                    return "";
                }
                if (wifiManager.isWifiEnabled()) {
                    List m18062x29d15012 = m18062x29d15012(wifiManager);
                    if (m18062x29d15012 != null && m18062x29d15012.size() != 0) {
                        m18069a(m18062x29d15012);
                        boolean z = true;
                        for (int i = 0; i < m18062x29d15012.size() && i < 7; i++) {
                            ScanResult scanResult = (ScanResult) m18062x29d15012.get(i);
                            if (z) {
                                z = false;
                            } else {
                                sb.append(";");
                            }
                            sb.append(scanResult.BSSID);
                        }
                    } else {
                        return sb.toString();
                    }
                }
                return sb.toString();
            }
        }
        return sb.toString();
    }

    /* renamed from: m */
    public static String m18040m(Context context) {
        if (f23280m != null && !"".equals(f23280m)) {
            return f23280m;
        }
        if (!m18071a(context, C1602db.m17930c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
            return f23280m;
        }
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager == null) {
            return "";
        }
        f23280m = m18064xdcc2b807(m18063xbbfb74b3(wifiManager));
        if (C1602db.m17930c("YMDI6MDA6MDA6MDA6MDA6MDA").equals(f23280m) || C1602db.m17930c("YMDA6MDA6MDA6MDA6MDA6MDA").equals(f23280m)) {
            f23280m = m18049e();
        }
        return f23280m;
    }

    /* renamed from: u */
    public static String m18032u(Context context) {
        StringBuilder sb;
        if (f23281n != null && !"".equals(f23281n)) {
            return f23281n;
        }
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        if (windowManager == null) {
            return "";
        }
        windowManager.getDefaultDisplay().getMetrics(displayMetrics);
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        if (i2 > i) {
            sb = new StringBuilder();
            sb.append(i);
            sb.append("*");
            sb.append(i2);
        } else {
            sb = new StringBuilder();
            sb.append(i2);
            sb.append("*");
            sb.append(i);
        }
        f23281n = sb.toString();
        return f23281n;
    }

    /* renamed from: v */
    public static String m18031v(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        if (f23282o != null && !"".equals(f23282o)) {
            return f23282o;
        }
        if (!m18071a(context, C1602db.m17930c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return f23282o;
        }
        TelephonyManager m18074H = m18074H(context);
        if (m18074H == null) {
            return "";
        }
        Method m17941a = C1602db.m17941a(m18074H.getClass(), "QZ2V0RGV2aWNlSWQ", new Class[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            m17941a = C1602db.m17941a(m18074H.getClass(), "QZ2V0SW1laQ==", new Class[0]);
        }
        if (m17941a != null) {
            f23282o = (String) com_amap_api_mapcore2d_cu_java_lang_reflect_Method_invoke(m17941a, m18074H, new Object[0]);
        }
        if (f23282o == null) {
            f23282o = "";
        }
        return f23282o;
    }

    /* renamed from: w */
    public static String m18030w(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        if (f23283p != null && !"".equals(f23283p)) {
            return f23283p;
        }
        if (!m18071a(context, C1602db.m17930c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return f23283p;
        }
        TelephonyManager m18074H = m18074H(context);
        if (m18074H == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Method m17941a = C1602db.m17941a(m18074H.getClass(), "QZ2V0TWVpZA==", new Class[0]);
            if (m17941a != null) {
                f23283p = (String) com_amap_api_mapcore2d_cu_java_lang_reflect_Method_invoke(m17941a, m18074H, new Object[0]);
            }
            if (f23283p == null) {
                f23283p = "";
            }
        }
        return f23283p;
    }

    /* renamed from: A */
    public static String m18081A(Context context) {
        FileInputStream fileInputStream = null;
        try {
            if (C1602db.m17946a(context, "android.permission.READ_EXTERNAL_STORAGE") && "mounted".equals(Environment.getExternalStorageState())) {
                String absolutePath = C116971W2r.LIZIZ().getAbsolutePath();
                new StringBuilder();
                File file = new File(C0002O.m25086C(absolutePath, "/.UTSystemConfig/Global/Alvin2.xml"));
                XmlPullParser newPullParser = Xml.newPullParser();
                FileInputStream fileInputStream2 = new FileInputStream(file);
                try {
                    newPullParser.setInput(fileInputStream2, "utf-8");
                    boolean z = false;
                    for (int eventType = newPullParser.getEventType(); 1 != eventType; eventType = newPullParser.next()) {
                        if (eventType != 0) {
                            if (eventType != 2) {
                                if (eventType != 3) {
                                    if (eventType == 4 && z) {
                                        String text = newPullParser.getText();
                                        try {
                                            fileInputStream2.close();
                                        } catch (Throwable unused) {
                                        }
                                        return text;
                                    }
                                } else {
                                    z = false;
                                }
                            } else if (newPullParser.getAttributeCount() > 0) {
                                int attributeCount = newPullParser.getAttributeCount();
                                for (int i = 0; i < attributeCount; i++) {
                                    String attributeValue = newPullParser.getAttributeValue(i);
                                    if ("UTDID2".equals(attributeValue) || "UTDID".equals(attributeValue)) {
                                        z = true;
                                    }
                                }
                            }
                        }
                    }
                    fileInputStream = fileInputStream2;
                } catch (Throwable unused2) {
                    fileInputStream = fileInputStream2;
                    if (fileInputStream == null) {
                        return "";
                    }
                    fileInputStream.close();
                    return "";
                }
            }
            if (fileInputStream == null) {
                return "";
            }
        } catch (Throwable unused3) {
        }
        try {
            fileInputStream.close();
            return "";
        } catch (Throwable unused4) {
            return "";
        }
    }

    /* renamed from: n */
    public static String[] m18039n(Context context) {
        if (m18071a(context, C1602db.m17930c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=")) && m18071a(context, C1602db.m17930c("EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04="))) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return new String[]{"", ""};
            }
            CellLocation m18059x908f8fea = m18059x908f8fea(telephonyManager);
            if (m18059x908f8fea instanceof GsmCellLocation) {
                GsmCellLocation gsmCellLocation = (GsmCellLocation) m18059x908f8fea;
                int m18055x1af3f114 = m18055x1af3f114(gsmCellLocation);
                int m18054x1af411e4 = m18054x1af411e4(gsmCellLocation);
                return new String[]{m18054x1af411e4 + "||" + m18055x1af3f114, "gsm"};
            }
            if (m18059x908f8fea instanceof CdmaCellLocation) {
                CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) m18059x908f8fea;
                int m18056xbdb5e850 = m18056xbdb5e850(cdmaCellLocation);
                int m18057x30ade803 = m18057x30ade803(cdmaCellLocation);
                int m18058x99cd7cb8 = m18058x99cd7cb8(cdmaCellLocation);
                return new String[]{m18056xbdb5e850 + "||" + m18057x30ade803 + "||" + m18058x99cd7cb8, "cdma"};
            }
            return new String[]{"", ""};
        }
        return new String[]{"", ""};
    }

    /* renamed from: a */
    public static boolean m18071a(Context context, String str) {
        if (context != null && context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static String m18070a(Context context, String str, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        try {
            int i = Build.VERSION.SDK_INT;
            if (!TextUtils.isEmpty(f23274g)) {
                return f23274g;
            }
            if (!z && f23273f >= 0 && f23273f < 2) {
                return "";
            }
            TelephonyManager m18074H = m18074H(context);
            if (f23273f == -1) {
                Method m17941a = C1602db.m17941a(TelephonyManager.class, "UZ2V0UGhvbmVDb3VudA=", new Class[0]);
                if (m17941a != null) {
                    try {
                        f23273f = ((Integer) com_amap_api_mapcore2d_cu_java_lang_reflect_Method_invoke(m17941a, m18074H, new Object[0])).intValue();
                    } catch (Throwable unused) {
                    }
                }
                f23273f = 0;
            }
            if (!z && f23273f <= 1) {
                return "";
            }
            Method m17941a2 = C1602db.m17941a(TelephonyManager.class, "MZ2V0SW1laQ=", Integer.TYPE);
            if (m17941a2 == null) {
                f23273f = 0;
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < f23273f; i2++) {
                try {
                    sb.append((String) com_amap_api_mapcore2d_cu_java_lang_reflect_Method_invoke(m17941a2, m18074H, new Object[]{Integer.valueOf(i2)}));
                    sb.append(str);
                } catch (Throwable unused2) {
                }
            }
            String sb2 = sb.toString();
            if (sb2.length() == 0) {
                f23273f = 0;
                return "";
            }
            String substring = sb2.substring(0, sb2.length() - 1);
            f23274g = substring;
            return substring;
        } catch (Throwable unused3) {
            return "";
        }
    }
}
