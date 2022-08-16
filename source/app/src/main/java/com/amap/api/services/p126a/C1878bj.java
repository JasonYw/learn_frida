package com.amap.api.services.p126a;

import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.TrafficStats;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Environment;
import android.os.IBinder;
import android.os.Looper;
import android.os.Parcel;
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

/* renamed from: com.amap.api.services.a.bj */
/* loaded from: classes19.dex */
public class C1878bj {

    /* renamed from: c */
    public static boolean f24488c;

    /* renamed from: e */
    public static boolean f24490e;

    /* renamed from: i */
    public static String f24494i;

    /* renamed from: j */
    public static boolean f24495j;

    /* renamed from: l */
    public static boolean f24497l;

    /* renamed from: s */
    public static boolean f24504s;

    /* renamed from: t */
    public static long f24505t;

    /* renamed from: u */
    public static int f24506u;

    /* renamed from: v */
    public static String f24507v;

    /* renamed from: a */
    public static String f24486a = "";

    /* renamed from: b */
    public static String f24487b = "";

    /* renamed from: d */
    public static String f24489d = "";

    /* renamed from: k */
    public static String f24496k = "";

    /* renamed from: m */
    public static String f24498m = "";

    /* renamed from: n */
    public static String f24499n = "";

    /* renamed from: o */
    public static String f24500o = "";

    /* renamed from: p */
    public static String f24501p = "";

    /* renamed from: q */
    public static String f24502q = "";

    /* renamed from: r */
    public static String f24503r = "";

    /* renamed from: f */
    public static int f24491f = -1;

    /* renamed from: g */
    public static String f24492g = "";

    /* renamed from: h */
    public static String f24493h = "";

    /* renamed from: w */
    public static String f24508w = "";

    public static String com_amap_api_services_a_bj_android_net_wifi_WifiInfo_getBSSID(WifiInfo wifiInfo) {
        ActionInvokeEntrance.setEventUuid(101100);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiInfo, new Object[0], 101100, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String bssid = wifiInfo.getBSSID();
        ActionInvokeEntrance.actionInvoke(bssid, wifiInfo, new Object[0], 101100, "com_amap_api_services_a_bj_android_net_wifi_WifiInfo_getBSSID(Landroid/net/wifi/WifiInfo;)Ljava/lang/String;");
        return bssid;
    }

    /* renamed from: com_amap_api_services_a_bj_android_net_wifi_WifiInfo_getMacAddress */
    public static String m16903xbf8154f4(WifiInfo wifiInfo) {
        ActionInvokeEntrance.setEventUuid(101700);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiInfo, new Object[0], 101700, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String macAddress = wifiInfo.getMacAddress();
        ActionInvokeEntrance.actionInvoke(macAddress, wifiInfo, new Object[0], 101700, "com_amap_api_services_a_bj_android_net_wifi_WifiInfo_getMacAddress(Landroid/net/wifi/WifiInfo;)Ljava/lang/String;");
        return macAddress;
    }

    /* renamed from: com_amap_api_services_a_bj_android_net_wifi_WifiManager_getConnectionInfo */
    public static WifiInfo m16902x4a4be326(WifiManager wifiManager) {
        ActionInvokeEntrance.setEventUuid(102301);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiManager, new Object[0], 102301, "android.net.wifi.WifiInfo", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (WifiInfo) actionIntercept.second;
        }
        WifiInfo LIZ = C116971W2r.LIZ(wifiManager);
        ActionInvokeEntrance.actionInvoke(LIZ, wifiManager, new Object[0], 102301, "com_amap_api_services_a_bj_android_net_wifi_WifiManager_getConnectionInfo(Landroid/net/wifi/WifiManager;)Landroid/net/wifi/WifiInfo;");
        return LIZ;
    }

    /* renamed from: com_amap_api_services_a_bj_android_net_wifi_WifiManager_getScanResults */
    public static List m16901x20edae7f(WifiManager wifiManager) {
        ActionInvokeEntrance.setEventUuid(102300);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(wifiManager, new Object[0], 102300, "java.util.List", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (List) actionIntercept.second;
        }
        List<ScanResult> scanResults = wifiManager.getScanResults();
        ActionInvokeEntrance.actionInvoke(scanResults, wifiManager, new Object[0], 102300, "com_amap_api_services_a_bj_android_net_wifi_WifiManager_getScanResults(Landroid/net/wifi/WifiManager;)Ljava/util/List;");
        return scanResults;
    }

    public static String com_amap_api_services_a_bj_android_os_Build_SERIAL() {
        ActionInvokeEntrance.setEventUuid(102002);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(Build.class, new Object[0], 102002, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        ActionInvokeEntrance.actionInvoke(null, Build.class, new Object[0], 102002, "com_amap_api_services_a_bj_android_os_Build_SERIAL()Ljava/lang/String;");
        return Build.SERIAL;
    }

    /* renamed from: com_amap_api_services_a_bj_android_provider_Settings$Secure_getString */
    public static String m16900x10a6e465(ContentResolver contentResolver, String str) {
        ActionInvokeEntrance.setEventUuid(102004);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(Settings.Secure.class, new Object[]{contentResolver, str}, 102004, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String LIZ = C116971W2r.LIZ(contentResolver, str);
        ActionInvokeEntrance.actionInvoke(LIZ, Settings.Secure.class, new Object[]{contentResolver, str}, 102004, "com_amap_api_services_a_bj_android_provider_Settings$Secure_getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        return LIZ;
    }

    /* renamed from: com_amap_api_services_a_bj_android_provider_Settings$System_getString */
    public static String m16899x8844f51d(ContentResolver contentResolver, String str) {
        ActionInvokeEntrance.setEventUuid(102003);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(Settings.System.class, new Object[]{contentResolver, str}, 102003, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String string = Settings.System.getString(contentResolver, str);
        ActionInvokeEntrance.actionInvoke(string, Settings.System.class, new Object[]{contentResolver, str}, 102003, "com_amap_api_services_a_bj_android_provider_Settings$System_getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        return string;
    }

    /* renamed from: com_amap_api_services_a_bj_android_telephony_TelephonyManager_getCellLocation */
    public static CellLocation m16898x8b4d8cdd(TelephonyManager telephonyManager) {
        ActionInvokeEntrance.setEventUuid(100900);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(telephonyManager, new Object[0], 100900, "android.telephony.CellLocation", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (CellLocation) actionIntercept.second;
        }
        CellLocation cellLocation = telephonyManager.getCellLocation();
        ActionInvokeEntrance.actionInvoke(cellLocation, telephonyManager, new Object[0], 100900, "com_amap_api_services_a_bj_android_telephony_TelephonyManager_getCellLocation(Landroid/telephony/TelephonyManager;)Landroid/telephony/CellLocation;");
        return cellLocation;
    }

    /* renamed from: com_amap_api_services_a_bj_android_telephony_cdma_CdmaCellLocation_getBaseStationId */
    public static int m16897xaba8b76b(CdmaCellLocation cdmaCellLocation) {
        ActionInvokeEntrance.setEventUuid(100901);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(cdmaCellLocation, new Object[0], 100901, "int", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Integer) actionIntercept.second).intValue();
        }
        int baseStationId = cdmaCellLocation.getBaseStationId();
        ActionInvokeEntrance.actionInvoke(Integer.valueOf(baseStationId), cdmaCellLocation, new Object[0], 100901, "com_amap_api_services_a_bj_android_telephony_cdma_CdmaCellLocation_getBaseStationId(Landroid/telephony/cdma/CdmaCellLocation;)I");
        return baseStationId;
    }

    /* renamed from: com_amap_api_services_a_bj_android_telephony_cdma_CdmaCellLocation_getNetworkId */
    public static int m16896x73e07436(CdmaCellLocation cdmaCellLocation) {
        ActionInvokeEntrance.setEventUuid(100905);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(cdmaCellLocation, new Object[0], 100905, "int", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Integer) actionIntercept.second).intValue();
        }
        int networkId = cdmaCellLocation.getNetworkId();
        ActionInvokeEntrance.actionInvoke(Integer.valueOf(networkId), cdmaCellLocation, new Object[0], 100905, "com_amap_api_services_a_bj_android_telephony_cdma_CdmaCellLocation_getNetworkId(Landroid/telephony/cdma/CdmaCellLocation;)I");
        return networkId;
    }

    /* renamed from: com_amap_api_services_a_bj_android_telephony_cdma_CdmaCellLocation_getSystemId */
    public static int m16895x1ab789bd(CdmaCellLocation cdmaCellLocation) {
        ActionInvokeEntrance.setEventUuid(100904);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(cdmaCellLocation, new Object[0], 100904, "int", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Integer) actionIntercept.second).intValue();
        }
        int systemId = cdmaCellLocation.getSystemId();
        ActionInvokeEntrance.actionInvoke(Integer.valueOf(systemId), cdmaCellLocation, new Object[0], 100904, "com_amap_api_services_a_bj_android_telephony_cdma_CdmaCellLocation_getSystemId(Landroid/telephony/cdma/CdmaCellLocation;)I");
        return systemId;
    }

    /* renamed from: com_amap_api_services_a_bj_android_telephony_gsm_GsmCellLocation_getCid */
    public static int m16894x7636047(GsmCellLocation gsmCellLocation) {
        ActionInvokeEntrance.setEventUuid(100906);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(gsmCellLocation, new Object[0], 100906, "int", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Integer) actionIntercept.second).intValue();
        }
        int cid = gsmCellLocation.getCid();
        ActionInvokeEntrance.actionInvoke(Integer.valueOf(cid), gsmCellLocation, new Object[0], 100906, "com_amap_api_services_a_bj_android_telephony_gsm_GsmCellLocation_getCid(Landroid/telephony/gsm/GsmCellLocation;)I");
        return cid;
    }

    /* renamed from: com_amap_api_services_a_bj_android_telephony_gsm_GsmCellLocation_getLac */
    public static int m16893x7638117(GsmCellLocation gsmCellLocation) {
        ActionInvokeEntrance.setEventUuid(100907);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(gsmCellLocation, new Object[0], 100907, "int", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return ((Integer) actionIntercept.second).intValue();
        }
        int lac = gsmCellLocation.getLac();
        ActionInvokeEntrance.actionInvoke(Integer.valueOf(lac), gsmCellLocation, new Object[0], 100907, "com_amap_api_services_a_bj_android_telephony_gsm_GsmCellLocation_getLac(Landroid/telephony/gsm/GsmCellLocation;)I");
        return lac;
    }

    public static Object com_amap_api_services_a_bj_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        ActionInvokeEntrance.setEventUuid(110000);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(method, new Object[]{obj, objArr}, 110000, "java.lang.Object", true, "com_amap_api_services_a_bj_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return actionIntercept.second;
        }
        Object invoke = method.invoke(obj, objArr);
        ActionInvokeEntrance.actionInvokeReflection(invoke, method, new Object[]{obj, objArr}, "com_amap_api_services_a_bj_java_lang_reflect_Method_invoke(Ljava/lang/reflect/Method;Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", false);
        return invoke;
    }

    /* renamed from: com_amap_api_services_a_bj_java_net_NetworkInterface_getHardwareAddress */
    public static byte[] m16892x75492fee(NetworkInterface networkInterface) {
        ActionInvokeEntrance.setEventUuid(101701);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(networkInterface, new Object[0], 101701, "byte[]", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (byte[]) actionIntercept.second;
        }
        byte[] hardwareAddress = networkInterface.getHardwareAddress();
        ActionInvokeEntrance.actionInvoke(hardwareAddress, networkInterface, new Object[0], 101701, "com_amap_api_services_a_bj_java_net_NetworkInterface_getHardwareAddress(Ljava/net/NetworkInterface;)[B");
        return hardwareAddress;
    }

    /* renamed from: com_amap_api_services_a_bj_java_net_NetworkInterface_getNetworkInterfaces */
    public static Enumeration m16891x309d2daa() {
        ActionInvokeEntrance.setEventUuid(100016);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(NetworkInterface.class, new Object[0], 100016, "java.util.Enumeration", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (Enumeration) actionIntercept.second;
        }
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        ActionInvokeEntrance.actionInvoke(networkInterfaces, NetworkInterface.class, new Object[0], 100016, "com_amap_api_services_a_bj_java_net_NetworkInterface_getNetworkInterfaces()Ljava/util/Enumeration;");
        return networkInterfaces;
    }

    /* renamed from: a */
    public static String m16914a() {
        return f24494i;
    }

    /* renamed from: d */
    public static String m16890d() {
        if (!TextUtils.isEmpty(f24507v)) {
            return f24507v;
        }
        String property = System.getProperty("os.arch");
        f24507v = property;
        return property;
    }

    static {
        Covode.recordClassIndex(5489);
    }

    /* renamed from: b */
    public static void m16907b() {
        try {
            int i = Build.VERSION.SDK_INT;
            com_amap_api_services_a_bj_java_lang_reflect_Method_invoke(TrafficStats.class.getDeclaredMethod("setThreadStatsTag", Integer.TYPE), null, new Object[]{40964});
        } catch (Throwable unused) {
        }
    }

    /* renamed from: c */
    public static long m16905c() {
        long j = f24505t;
        if (j != 0) {
            return j;
        }
        try {
            StatFs statFs = new StatFs(Environment.getRootDirectory().getAbsolutePath());
            StatFs statFs2 = new StatFs(C116971W2r.LIZIZ().getAbsolutePath());
            int i = Build.VERSION.SDK_INT;
            f24505t = ((statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / Config.DEFAULT_MAX_FILE_LENGTH) + ((statFs2.getBlockCountLong() * statFs2.getBlockSizeLong()) / Config.DEFAULT_MAX_FILE_LENGTH);
        } catch (Throwable unused) {
        }
        return f24505t;
    }

    /* renamed from: e */
    public static String m16888e() {
        try {
            for (NetworkInterface networkInterface : Collections.list(m16891x309d2daa())) {
                if (networkInterface.getName().equalsIgnoreCase("wlan0")) {
                    int i = Build.VERSION.SDK_INT;
                    byte[] m16892x75492fee = m16892x75492fee(networkInterface);
                    if (m16892x75492fee == null) {
                        return "";
                    }
                    StringBuilder sb = new StringBuilder();
                    for (byte b : m16892x75492fee) {
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

    /* renamed from: A */
    public static String m16925A(Context context) {
        try {
            return m16920F(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: c */
    public static String m16904c(Context context) {
        try {
            return m16920F(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: e */
    public static int m16887e(Context context) {
        try {
            return m16916J(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: f */
    public static int m16886f(Context context) {
        try {
            return m16919G(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: g */
    public static String m16885g(Context context) {
        try {
            return m16921E(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: r */
    public static int m16874r(Context context) {
        try {
            return m16916J(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: s */
    public static int m16873s(Context context) {
        try {
            return m16919G(context);
        } catch (Throwable unused) {
            return -1;
        }
    }

    /* renamed from: y */
    public static String m16867y(Context context) {
        try {
            return m16921E(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: H */
    public static ConnectivityManager m16918H(Context context) {
        return (ConnectivityManager) context.getSystemService("connectivity");
    }

    /* renamed from: K */
    public static TelephonyManager m16915K(Context context) {
        return (TelephonyManager) context.getSystemService("phone");
    }

    /* renamed from: d */
    public static String m16889d(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        try {
            return m16917I(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: u */
    public static String m16871u(Context context) {
        try {
            NetworkInfo m16872t = m16872t(context);
            if (m16872t == null) {
                return null;
            }
            return m16872t.getExtraInfo();
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: I */
    public static String m16917I(Context context) {
        String m16867y = m16867y(context);
        if (m16867y != null && m16867y.length() >= 5) {
            return m16867y.substring(3, 5);
        }
        return "";
    }

    /* renamed from: J */
    public static int m16916J(Context context) {
        TelephonyManager m16915K;
        if (!m16912a(context, C1892bp.m16776c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=")) || (m16915K = m16915K(context)) == null) {
            return -1;
        }
        return C116971W2r.LIZ(m16915K);
    }

    /* renamed from: p */
    public static String m16876p(Context context) {
        try {
            TelephonyManager m16915K = m16915K(context);
            if (m16915K == null) {
                return "";
            }
            String networkOperator = m16915K.getNetworkOperator();
            if (TextUtils.isEmpty(networkOperator) || networkOperator.length() < 3) {
                return "";
            }
            return networkOperator.substring(0, 3);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: q */
    public static String m16875q(Context context) {
        try {
            TelephonyManager m16915K = m16915K(context);
            if (m16915K == null) {
                return "";
            }
            String networkOperator = m16915K.getNetworkOperator();
            if (TextUtils.isEmpty(networkOperator) || networkOperator.length() < 3) {
                return "";
            }
            return networkOperator.substring(3);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: t */
    public static NetworkInfo m16872t(Context context) {
        ConnectivityManager m16918H;
        if (!m16912a(context, C1892bp.m16776c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (m16918H = m16918H(context)) == null) {
            return null;
        }
        return C116971W2r.LIZ(m16918H);
    }

    /* renamed from: F */
    public static String m16920F(Context context) {
        if (!m16912a(context, C1892bp.m16776c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return null;
        }
        TelephonyManager m16915K = m16915K(context);
        if (m16915K == null) {
            return "";
        }
        String simOperatorName = m16915K.getSimOperatorName();
        if (TextUtils.isEmpty(simOperatorName)) {
            return m16915K.getNetworkOperatorName();
        }
        return simOperatorName;
    }

    /* renamed from: G */
    public static int m16919G(Context context) {
        ConnectivityManager m16918H;
        NetworkInfo LIZ;
        if (context == null || !m16912a(context, C1892bp.m16776c("AYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19ORVRXT1JLX1NUQVRF")) || (m16918H = m16918H(context)) == null || (LIZ = C116971W2r.LIZ(m16918H)) == null) {
            return -1;
        }
        return LIZ.getType();
    }

    /* renamed from: a */
    public static String m16913a(Context context) {
        try {
            if (!TextUtils.isEmpty(f24489d)) {
                return f24489d;
            }
            C1889bo m16763a = C1899bw.m16763a();
            if (C1930cr.m16608a(context, m16763a)) {
                Class m16607a = C1930cr.m16607a(context, m16763a, C1892bp.m16776c("WY29tLmFtYXAuYXBpLmFpdW5ldC5OZXRSZXVlc3RQYXJhbQ"));
                if (m16607a != null) {
                    f24489d = (String) m16607a.getMethod("getAdiuExtras", new Class[0]).invoke(m16607a, new Object[0]);
                }
                return f24489d;
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: h */
    public static String m16884h(final Context context) {
        if (f24497l) {
            return "";
        }
        if (!TextUtils.isEmpty(f24496k)) {
            return f24496k;
        }
        if (Looper.getMainLooper() == Looper.myLooper()) {
            C1906cb.m16717c().submit(new Runnable() { // from class: com.amap.api.services.a.bj.2
                static {
                    Covode.recordClassIndex(5491);
                }

                @Override // java.lang.Runnable
                public final void run() {
                    C1878bj.m16922D(context);
                }
            });
            return f24496k;
        }
        return m16922D(context);
    }

    /* renamed from: k */
    public static String m16881k(Context context) {
        if (!TextUtils.isEmpty(f24498m)) {
            return f24498m;
        }
        try {
            String m16900x10a6e465 = m16900x10a6e465(context.getContentResolver(), C1892bp.m16776c(new String(C1899bw.m16762a(13))));
            f24498m = m16900x10a6e465;
            if (m16900x10a6e465 == null) {
                return "";
            }
            return f24498m;
        } catch (Throwable unused) {
            return f24498m;
        }
    }

    /* renamed from: l */
    public static String m16880l(Context context) {
        WifiManager wifiManager;
        if (context == null) {
            return "";
        }
        try {
            if (!m16912a(context, C1892bp.m16776c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF")) || (wifiManager = (WifiManager) context.getSystemService("wifi")) == null || !wifiManager.isWifiEnabled()) {
                return "";
            }
            return com_amap_api_services_a_bj_android_net_wifi_WifiInfo_getBSSID(m16902x4a4be326(wifiManager));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: z */
    public static int m16866z(Context context) {
        int i = f24506u;
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
        f24506u = i3;
        return i3;
    }

    /* renamed from: E */
    public static String m16921E(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        String str = f24508w;
        if (str != null && !"".equals(str)) {
            return f24508w;
        }
        if (!m16912a(context, C1892bp.m16776c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return f24508w;
        }
        TelephonyManager m16915K = m16915K(context);
        if (m16915K == null) {
            return "";
        }
        Method m16787a = C1892bp.m16787a(m16915K.getClass(), "UZ2V0U3Vic2NyaWJlcklk", new Class[0]);
        if (m16787a != null) {
            f24508w = (String) com_amap_api_services_a_bj_java_lang_reflect_Method_invoke(m16787a, m16915K, new Object[0]);
        }
        if (f24508w == null) {
            f24508w = "";
        }
        return f24508w;
    }

    /* renamed from: a */
    public static List<ScanResult> m16909a(List<ScanResult> list) {
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
    public static String m16906b(final Context context) {
        try {
            if (!TextUtils.isEmpty(f24487b)) {
                return f24487b;
            }
            C1889bo m16763a = C1899bw.m16763a();
            if (m16763a == null) {
                return null;
            }
            if (C1930cr.m16608a(context, m16763a)) {
                final Class m16607a = C1930cr.m16607a(context, m16763a, C1892bp.m16776c("WY29tLmFtYXAuYXBpLmFpdW5ldC5OZXRSZXVlc3RQYXJhbQ"));
                if (m16607a == null) {
                    return f24487b;
                }
                String str = (String) m16607a.getMethod("getADIU", Context.class).invoke(m16607a, context);
                if (!TextUtils.isEmpty(str)) {
                    f24487b = str;
                    return str;
                } else if (!f24495j) {
                    f24495j = true;
                    C1906cb.m16717c().submit(new Runnable() { // from class: com.amap.api.services.a.bj.1
                        static {
                            Covode.recordClassIndex(5490);
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                Map map = (Map) m16607a.getMethod("getGetParams", new Class[0]).invoke(m16607a, new Object[0]);
                                if (map == null) {
                                    return;
                                }
                                String str2 = (String) m16607a.getMethod("getPostParam", String.class, String.class, String.class, String.class).invoke(m16607a, C1878bj.m16883i(context), C1878bj.m16869w(context), C1878bj.m16878n(context), C1878bj.m16867y(context));
                                if (TextUtils.isEmpty(str2)) {
                                    return;
                                }
                                m16607a.getMethod("parseResult", Context.class, String.class).invoke(m16607a, context, new String(C1957dd.m16503a().m16502a(new C1956dc(str2.getBytes(), map))));
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

    /* renamed from: i */
    public static String m16883i(Context context) {
        if (f24486a != null && !"".equals(f24486a)) {
            return f24486a;
        }
        if (m16912a(context, C1892bp.m16776c("WYW5kcm9pZC5wZXJtaXNzaW9uLldSSVRFX1NFVFRJTkdT"))) {
            f24486a = m16899x8844f51d(context.getContentResolver(), "mqBRboGZkQPcAkyk");
        }
        if (f24486a != null && !"".equals(f24486a)) {
            return f24486a;
        }
        try {
            f24486a = m16923C(context);
        } catch (Throwable unused) {
        }
        String str = f24486a;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: j */
    public static String m16882j(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        if (!TextUtils.isEmpty(f24499n)) {
            return f24499n;
        }
        if (!m16912a(context, C1892bp.m16776c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 26) {
            return (String) com_amap_api_services_a_bj_java_lang_reflect_Method_invoke(C1892bp.m16787a(Build.class, "MZ2V0U2VyaWFs", new Class[0]), Build.class, new Object[0]);
        }
        int i = Build.VERSION.SDK_INT;
        f24499n = com_amap_api_services_a_bj_android_os_Build_SERIAL();
        String str = f24499n;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: m */
    public static String m16879m(Context context) {
        StringBuilder sb = new StringBuilder();
        if (context != null) {
            if (m16912a(context, C1892bp.m16776c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
                WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
                if (wifiManager == null) {
                    return "";
                }
                if (wifiManager.isWifiEnabled()) {
                    List m16901x20edae7f = m16901x20edae7f(wifiManager);
                    if (m16901x20edae7f != null && m16901x20edae7f.size() != 0) {
                        m16909a(m16901x20edae7f);
                        boolean z = true;
                        for (int i = 0; i < m16901x20edae7f.size() && i < 7; i++) {
                            ScanResult scanResult = (ScanResult) m16901x20edae7f.get(i);
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

    /* renamed from: n */
    public static String m16878n(Context context) {
        if (f24500o != null && !"".equals(f24500o)) {
            return f24500o;
        }
        if (!m16912a(context, C1892bp.m16776c("WYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19XSUZJX1NUQVRF"))) {
            return f24500o;
        }
        WifiManager wifiManager = (WifiManager) context.getSystemService("wifi");
        if (wifiManager == null) {
            return "";
        }
        f24500o = m16903xbf8154f4(m16902x4a4be326(wifiManager));
        if (C1892bp.m16776c("YMDI6MDA6MDA6MDA6MDA6MDA").equals(f24500o) || C1892bp.m16776c("YMDA6MDA6MDA6MDA6MDA6MDA").equals(f24500o)) {
            f24500o = m16888e();
        }
        return f24500o;
    }

    /* renamed from: v */
    public static String m16870v(Context context) {
        StringBuilder sb;
        if (f24501p != null && !"".equals(f24501p)) {
            return f24501p;
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
        f24501p = sb.toString();
        return f24501p;
    }

    /* renamed from: w */
    public static String m16869w(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        if (f24502q != null && !"".equals(f24502q)) {
            return f24502q;
        }
        if (!m16912a(context, C1892bp.m16776c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return f24502q;
        }
        TelephonyManager m16915K = m16915K(context);
        if (m16915K == null) {
            return "";
        }
        Method m16787a = C1892bp.m16787a(m16915K.getClass(), "QZ2V0RGV2aWNlSWQ", new Class[0]);
        if (Build.VERSION.SDK_INT >= 26) {
            m16787a = C1892bp.m16787a(m16915K.getClass(), "QZ2V0SW1laQ==", new Class[0]);
        }
        if (m16787a != null) {
            f24502q = (String) com_amap_api_services_a_bj_java_lang_reflect_Method_invoke(m16787a, m16915K, new Object[0]);
        }
        if (f24502q == null) {
            f24502q = "";
        }
        return f24502q;
    }

    /* renamed from: x */
    public static String m16868x(Context context) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        if (f24503r != null && !"".equals(f24503r)) {
            return f24503r;
        }
        if (!m16912a(context, C1892bp.m16776c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU="))) {
            return f24503r;
        }
        TelephonyManager m16915K = m16915K(context);
        if (m16915K == null) {
            return "";
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Method m16787a = C1892bp.m16787a(m16915K.getClass(), "QZ2V0TWVpZA==", new Class[0]);
            if (m16787a != null) {
                f24503r = (String) com_amap_api_services_a_bj_java_lang_reflect_Method_invoke(m16787a, m16915K, new Object[0]);
            }
            if (f24503r == null) {
                f24503r = "";
            }
        }
        return f24503r;
    }

    /* renamed from: C */
    public static String m16923C(Context context) {
        FileInputStream fileInputStream = null;
        try {
            if (C1892bp.m16792a(context, "android.permission.READ_EXTERNAL_STORAGE") && "mounted".equals(Environment.getExternalStorageState())) {
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

    /* renamed from: D */
    public static String m16922D(Context context) {
        int i = 0;
        if (C1892bp.m16776c("IeGlhb21p").equalsIgnoreCase(Build.MANUFACTURER)) {
            try {
                Class LIZ = C116971W2r.LIZ(C1892bp.m16776c("WY29tLmFuZHJvaWQuaWQuaW1wbC5JZFByb3ZpZGVySW1wbA"));
                Object com_amap_api_services_a_bj_java_lang_reflect_Method_invoke = com_amap_api_services_a_bj_java_lang_reflect_Method_invoke(LIZ.getMethod(C1892bp.m16776c("MZ2V0T0FJRA"), Context.class), LIZ.newInstance(), new Object[]{context});
                if (com_amap_api_services_a_bj_java_lang_reflect_Method_invoke != null) {
                    String str = (String) com_amap_api_services_a_bj_java_lang_reflect_Method_invoke;
                    f24496k = str;
                    return str;
                }
            } catch (Throwable th) {
                C1901by.m16742a(th, "oa", "xm");
                f24497l = true;
            }
        } else {
            if (C1892bp.m16776c("IaHVhd2Vp").equalsIgnoreCase(Build.MANUFACTURER)) {
                try {
                    Intent intent = new Intent();
                    intent.setAction(C1892bp.m16776c("WY29tLnVvZGlzLm9wZW5kZXZpY2UuT1BFTklEU19TRVJWSUNF"));
                    intent.setPackage(C1892bp.m16776c("UY29tLmh1YXdlaS5od2lk"));
                    ServiceConnectionC1881a serviceConnectionC1881a = new ServiceConnectionC1881a();
                    if (C116971W2r.LIZ(context, intent, serviceConnectionC1881a, 1)) {
                        while (i < 100 && TextUtils.isEmpty(f24496k)) {
                            i++;
                            Thread.sleep(15L);
                        }
                        context.unbindService(serviceConnectionC1881a);
                    }
                    return f24496k;
                } catch (Throwable th2) {
                    C1901by.m16742a(th2, "oa", "hw");
                }
            } else {
                "OPPO".equalsIgnoreCase(Build.MANUFACTURER);
            }
            f24497l = true;
        }
        return f24496k;
    }

    /* renamed from: o */
    public static String[] m16877o(Context context) {
        if (m16912a(context, C1892bp.m16776c("WYW5kcm9pZC5wZXJtaXNzaW9uLlJFQURfUEhPTkVfU1RBVEU=")) && m16912a(context, C1892bp.m16776c("EYW5kcm9pZC5wZXJtaXNzaW9uLkFDQ0VTU19DT0FSU0VfTE9DQVRJT04="))) {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            if (telephonyManager == null) {
                return new String[]{"", ""};
            }
            CellLocation m16898x8b4d8cdd = m16898x8b4d8cdd(telephonyManager);
            if (m16898x8b4d8cdd instanceof GsmCellLocation) {
                GsmCellLocation gsmCellLocation = (GsmCellLocation) m16898x8b4d8cdd;
                int m16894x7636047 = m16894x7636047(gsmCellLocation);
                int m16893x7638117 = m16893x7638117(gsmCellLocation);
                return new String[]{m16893x7638117 + "||" + m16894x7636047, "gsm"};
            }
            if (m16898x8b4d8cdd instanceof CdmaCellLocation) {
                CdmaCellLocation cdmaCellLocation = (CdmaCellLocation) m16898x8b4d8cdd;
                int m16895x1ab789bd = m16895x1ab789bd(cdmaCellLocation);
                int m16896x73e07436 = m16896x73e07436(cdmaCellLocation);
                int m16897xaba8b76b = m16897xaba8b76b(cdmaCellLocation);
                return new String[]{m16895x1ab789bd + "||" + m16896x73e07436 + "||" + m16897xaba8b76b, "cdma"};
            }
            return new String[]{"", ""};
        }
        return new String[]{"", ""};
    }

    /* renamed from: a */
    public static boolean m16912a(Context context, String str) {
        if (context != null && context.checkCallingOrSelfPermission(str) == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: com.amap.api.services.a.bj$a */
    /* loaded from: classes19.dex */
    public static class ServiceConnectionC1881a implements ServiceConnection {
        static {
            Covode.recordClassIndex(5492);
        }

        @Override // android.content.ServiceConnection
        public void onServiceDisconnected(ComponentName componentName) {
        }

        @Override // android.content.ServiceConnection
        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("com.uodis.opendevice.aidl.OpenDeviceIdentifierService");
                iBinder.transact(1, obtain, obtain2, 0);
                obtain2.readException();
                String unused = C1878bj.f24496k = obtain2.readString();
            } catch (Throwable th) {
                try {
                    boolean unused2 = C1878bj.f24497l = true;
                    C1901by.m16742a(th, "oa", "hwtr");
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }

    /* renamed from: a */
    public static String m16911a(Context context, String str, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            return "";
        }
        try {
            int i = Build.VERSION.SDK_INT;
            if (!TextUtils.isEmpty(f24492g)) {
                return f24492g;
            }
            if (!z && f24491f >= 0 && f24491f < 2) {
                return "";
            }
            TelephonyManager m16915K = m16915K(context);
            if (f24491f == -1) {
                Method m16787a = C1892bp.m16787a(TelephonyManager.class, "UZ2V0UGhvbmVDb3VudA=", new Class[0]);
                if (m16787a != null) {
                    try {
                        f24491f = ((Integer) com_amap_api_services_a_bj_java_lang_reflect_Method_invoke(m16787a, m16915K, new Object[0])).intValue();
                    } catch (Throwable unused) {
                    }
                }
                f24491f = 0;
            }
            if (!z && f24491f <= 1) {
                return "";
            }
            Method m16787a2 = C1892bp.m16787a(TelephonyManager.class, "MZ2V0SW1laQ=", Integer.TYPE);
            if (m16787a2 == null) {
                f24491f = 0;
                return "";
            }
            StringBuilder sb = new StringBuilder();
            for (int i2 = 0; i2 < f24491f; i2++) {
                try {
                    sb.append((String) com_amap_api_services_a_bj_java_lang_reflect_Method_invoke(m16787a2, m16915K, new Object[]{Integer.valueOf(i2)}));
                    sb.append(str);
                } catch (Throwable unused2) {
                }
            }
            String sb2 = sb.toString();
            if (sb2.length() == 0) {
                f24491f = 0;
                return "";
            }
            String substring = sb2.substring(0, sb2.length() - 1);
            f24492g = substring;
            return substring;
        } catch (Throwable unused3) {
            return "";
        }
    }
}
