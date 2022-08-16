package com.alipay.sdk.p082m.p084a0;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Environment;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.util.Pair;
import com.alipay.sdk.p082m.p125z.C1448a;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.bytedance.unisus.uniservice.logger.LoggerUtil;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.io.LineNumberReader;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.util.Enumeration;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.TimeZone;
import org.json.JSONArray;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.a0.b */
/* loaded from: classes2.dex */
public final class C1222b {

    /* renamed from: h */
    public static C1222b f22063h = new C1222b();

    /* renamed from: a */
    public long f22064a = 0;

    /* renamed from: b */
    public long f22065b = 0;

    /* renamed from: c */
    public long f22066c = 0;

    /* renamed from: d */
    public long f22067d = 0;

    /* renamed from: e */
    public String f22068e;

    /* renamed from: f */
    public String f22069f;

    /* renamed from: g */
    public String f22070g;

    static {
        Covode.recordClassIndex(4722);
    }

    /* renamed from: a */
    public static boolean m19421a(long j) {
        return System.currentTimeMillis() - j < 3600000;
    }

    /* renamed from: a */
    public static boolean m19419a(Context context, String str) {
        return context.getPackageManager().checkPermission(str, context.getPackageName()) != 0;
    }

    /* renamed from: b */
    public static C1222b m19418b() {
        return f22063h;
    }

    /* renamed from: c */
    public static String m19416c() {
        long j;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = statFs.getAvailableBlocks() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j = 0;
        }
        return String.valueOf(j);
    }

    /* renamed from: com_alipay_sdk_m_a0_b_android_hardware_SensorManager_getSensorList */
    public static List m19414xa6beb85a(SensorManager sensorManager, int i) {
        ActionInvokeEntrance.setEventUuid(100702);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(sensorManager, new Object[]{Integer.valueOf(i)}, 100702, "java.util.List", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (List) actionIntercept.second;
        }
        List LIZIZ = C116971W2r.LIZIZ(sensorManager, i);
        ActionInvokeEntrance.actionInvoke(LIZIZ, sensorManager, new Object[]{Integer.valueOf(i)}, 100702, "com_alipay_sdk_m_a0_b_android_hardware_SensorManager_getSensorList(Landroid/hardware/SensorManager;I)Ljava/util/List;");
        return LIZIZ;
    }

    public static String com_alipay_sdk_m_a0_b_android_os_Build_SERIAL() {
        ActionInvokeEntrance.setEventUuid(102002);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(Build.class, new Object[0], 102002, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        ActionInvokeEntrance.actionInvoke(null, Build.class, new Object[0], 102002, "com_alipay_sdk_m_a0_b_android_os_Build_SERIAL()Ljava/lang/String;");
        return Build.SERIAL;
    }

    public static String com_alipay_sdk_m_a0_b_android_os_Build_getSerial() {
        ActionInvokeEntrance.setEventUuid(101200);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(Build.class, new Object[0], 101200, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String serial = Build.getSerial();
        ActionInvokeEntrance.actionInvoke(serial, Build.class, new Object[0], 101200, "com_alipay_sdk_m_a0_b_android_os_Build_getSerial()Ljava/lang/String;");
        return serial;
    }

    public static String com_alipay_sdk_m_a0_b_android_provider_Settings$Secure_getString(ContentResolver contentResolver, String str) {
        ActionInvokeEntrance.setEventUuid(102004);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(Settings.Secure.class, new Object[]{contentResolver, str}, 102004, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String LIZ = C116971W2r.LIZ(contentResolver, str);
        ActionInvokeEntrance.actionInvoke(LIZ, Settings.Secure.class, new Object[]{contentResolver, str}, 102004, "com_alipay_sdk_m_a0_b_android_provider_Settings$Secure_getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        return LIZ;
    }

    /* renamed from: com_alipay_sdk_m_a0_b_android_telephony_TelephonyManager_getDeviceId */
    public static String m19413x73af3573(TelephonyManager telephonyManager) {
        ActionInvokeEntrance.setEventUuid(101600);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(telephonyManager, new Object[0], 101600, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String LIZIZ = C116971W2r.LIZIZ(telephonyManager);
        ActionInvokeEntrance.actionInvoke(LIZIZ, telephonyManager, new Object[0], 101600, "com_alipay_sdk_m_a0_b_android_telephony_TelephonyManager_getDeviceId(Landroid/telephony/TelephonyManager;)Ljava/lang/String;");
        return LIZIZ;
    }

    /* renamed from: com_alipay_sdk_m_a0_b_android_telephony_TelephonyManager_getSimSerialNumber */
    public static String m19412xa0a28732(TelephonyManager telephonyManager) {
        ActionInvokeEntrance.setEventUuid(101400);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(telephonyManager, new Object[0], 101400, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String simSerialNumber = telephonyManager.getSimSerialNumber();
        ActionInvokeEntrance.actionInvoke(simSerialNumber, telephonyManager, new Object[0], 101400, "com_alipay_sdk_m_a0_b_android_telephony_TelephonyManager_getSimSerialNumber(Landroid/telephony/TelephonyManager;)Ljava/lang/String;");
        return simSerialNumber;
    }

    /* renamed from: com_alipay_sdk_m_a0_b_android_telephony_TelephonyManager_getSubscriberId */
    public static String m19411x52642605(TelephonyManager telephonyManager) {
        ActionInvokeEntrance.setEventUuid(101900);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(telephonyManager, new Object[0], 101900, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String LIZLLL = C116971W2r.LIZLLL(telephonyManager);
        ActionInvokeEntrance.actionInvoke(LIZLLL, telephonyManager, new Object[0], 101900, "com_alipay_sdk_m_a0_b_android_telephony_TelephonyManager_getSubscriberId(Landroid/telephony/TelephonyManager;)Ljava/lang/String;");
        return LIZLLL;
    }

    /* renamed from: com_alipay_sdk_m_a0_b_java_net_NetworkInterface_getNetworkInterfaces */
    public static Enumeration m19410xda353466() {
        ActionInvokeEntrance.setEventUuid(100016);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(NetworkInterface.class, new Object[0], 100016, "java.util.Enumeration", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (Enumeration) actionIntercept.second;
        }
        Enumeration<NetworkInterface> networkInterfaces = NetworkInterface.getNetworkInterfaces();
        ActionInvokeEntrance.actionInvoke(networkInterfaces, NetworkInterface.class, new Object[0], 100016, "com_alipay_sdk_m_a0_b_java_net_NetworkInterface_getNetworkInterfaces()Ljava/util/Enumeration;");
        return networkInterfaces;
    }

    /* renamed from: d */
    public static String m19409d() {
        long j;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            StatFs statFs = new StatFs(C116971W2r.LIZIZ().getPath());
            j = statFs.getBlockSize() * statFs.getAvailableBlocks();
            return String.valueOf(j);
        }
        j = 0;
        return String.valueOf(j);
    }

    /* renamed from: d */
    public static String m19408d(Context context) {
        int i = 0;
        try {
            i = Settings.System.getInt(context.getContentResolver(), "airplane_mode_on", 0);
        } catch (Throwable unused) {
        }
        return i == 1 ? "1" : "0";
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x005b, code lost:
        if (r6 != null) goto L28;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m19407e() {
        /*
            java.lang.String r7 = "0000000000000000"
            r2 = 0
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L4d
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = "/proc/cpuinfo"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L4d
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L4d
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L50
            r5.<init>(r6)     // Catch: java.lang.Throwable -> L50
            java.io.LineNumberReader r4 = new java.io.LineNumberReader     // Catch: java.lang.Throwable -> L51
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L51
            r3 = 1
            r1 = 1
        L1b:
            r0 = 100
            if (r1 >= r0) goto L46
            java.lang.String r2 = r4.readLine()     // Catch: java.lang.Throwable -> L44
            if (r2 == 0) goto L46
            java.lang.String r0 = "Serial"
            int r0 = r2.indexOf(r0)     // Catch: java.lang.Throwable -> L44
            if (r0 < 0) goto L41
            java.lang.String r0 = ":"
            int r1 = r2.indexOf(r0)     // Catch: java.lang.Throwable -> L44
            int r1 = r1 + r3
            int r0 = r2.length()     // Catch: java.lang.Throwable -> L44
            java.lang.String r0 = r2.substring(r1, r0)     // Catch: java.lang.Throwable -> L44
            java.lang.String r7 = r0.trim()     // Catch: java.lang.Throwable -> L44
            goto L46
        L41:
            int r1 = r1 + 1
            goto L1b
        L44:
            r2 = r4
            goto L51
        L46:
            r4.close()     // Catch: java.lang.Throwable -> L49
        L49:
            r5.close()     // Catch: java.lang.Throwable -> L62
            goto L62
        L4d:
            r6 = r2
            r5 = r6
            goto L51
        L50:
            r5 = r2
        L51:
            if (r2 == 0) goto L56
            r2.close()     // Catch: java.lang.Throwable -> L56
        L56:
            if (r5 == 0) goto L5b
            r5.close()     // Catch: java.lang.Throwable -> L5b
        L5b:
            if (r6 != 0) goto L62
        L5d:
            if (r7 != 0) goto L61
            java.lang.String r7 = ""
        L61:
            return r7
        L62:
            r6.close()     // Catch: java.lang.Throwable -> L5d
            goto L5d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p084a0.C1222b.m19407e():java.lang.String");
    }

    /* renamed from: e */
    public static String m19406e(Context context) {
        JSONObject jSONObject = new JSONObject();
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            int i = audioManager.getRingerMode() == 0 ? 1 : 0;
            int streamVolume = audioManager.getStreamVolume(0);
            int streamVolume2 = audioManager.getStreamVolume(1);
            int streamVolume3 = audioManager.getStreamVolume(2);
            int streamVolume4 = audioManager.getStreamVolume(3);
            int streamVolume5 = audioManager.getStreamVolume(4);
            jSONObject.put("ringermode", String.valueOf(i));
            jSONObject.put(C2521l.LJIILJJIL, String.valueOf(streamVolume));
            jSONObject.put("system", String.valueOf(streamVolume2));
            jSONObject.put("ring", String.valueOf(streamVolume3));
            jSONObject.put("music", String.valueOf(streamVolume4));
            jSONObject.put("alarm", String.valueOf(streamVolume5));
        } catch (Throwable unused) {
        }
        return jSONObject.toString();
    }

    /* renamed from: f */
    public static String m19405f() {
        String m19377u = m19377u();
        return !C1448a.m18665a(m19377u) ? m19377u : m19376v();
    }

    /* renamed from: f */
    public static String m19404f(Context context) {
        TelephonyManager telephonyManager;
        String networkOperatorName;
        if (context != null) {
            try {
                telephonyManager = (TelephonyManager) context.getSystemService("phone");
            } catch (Throwable unused) {
            }
            if (telephonyManager != null) {
                networkOperatorName = telephonyManager.getNetworkOperatorName();
                return (networkOperatorName != null || "null".equals(networkOperatorName)) ? "" : networkOperatorName;
            }
        }
        networkOperatorName = null;
        if (networkOperatorName != null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x002b, code lost:
        if (r4 != null) goto L33;
     */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0034 A[ORIG_RETURN, RETURN] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m19403g() {
        /*
            r1 = 0
            java.io.FileReader r4 = new java.io.FileReader     // Catch: java.lang.Throwable -> L34
            java.lang.String r0 = "/proc/cpuinfo"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L34
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L2e
            r3.<init>(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r2 = r3.readLine()     // Catch: java.lang.Throwable -> L2b
            java.lang.String r1 = ":\\s+"
            r0 = 2
            java.lang.String[] r2 = r2.split(r1, r0)     // Catch: java.lang.Throwable -> L2b
            if (r2 == 0) goto L27
            int r1 = r2.length     // Catch: java.lang.Throwable -> L2b
            r0 = 1
            if (r1 <= r0) goto L27
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L2b
            r4.close()     // Catch: java.lang.Throwable -> L23
        L23:
            r3.close()     // Catch: java.lang.Throwable -> L26
        L26:
            return r0
        L27:
            r4.close()     // Catch: java.lang.Throwable -> L37
            goto L37
        L2b:
            if (r4 == 0) goto L32
            goto L2f
        L2e:
            r3 = r1
        L2f:
            r4.close()     // Catch: java.lang.Throwable -> L32
        L32:
            if (r3 != 0) goto L37
        L34:
            java.lang.String r0 = ""
            return r0
        L37:
            r3.close()     // Catch: java.lang.Throwable -> L34
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p084a0.C1222b.m19403g():java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:4:0x0050 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:6:? A[RETURN, SYNTHETIC] */
    /* renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m19402g(android.content.Context r3) {
        /*
            if (r3 == 0) goto L4d
            java.lang.String r0 = "sensor"
            java.lang.Object r1 = r3.getSystemService(r0)     // Catch: java.lang.Throwable -> L4d
            android.hardware.SensorManager r1 = (android.hardware.SensorManager) r1     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L4d
            r0 = -1
            java.util.List r1 = m19414xa6beb85a(r1, r0)     // Catch: java.lang.Throwable -> L4d
            if (r1 == 0) goto L4d
            int r0 = r1.size()     // Catch: java.lang.Throwable -> L4d
            if (r0 <= 0) goto L4d
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L4d
            r3.<init>()     // Catch: java.lang.Throwable -> L4d
            java.util.Iterator r2 = r1.iterator()     // Catch: java.lang.Throwable -> L4d
        L22:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L4d
            if (r0 == 0) goto L44
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L4d
            android.hardware.Sensor r1 = (android.hardware.Sensor) r1     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = r1.getName()     // Catch: java.lang.Throwable -> L4d
            r3.append(r0)     // Catch: java.lang.Throwable -> L4d
            int r0 = r1.getVersion()     // Catch: java.lang.Throwable -> L4d
            r3.append(r0)     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = r1.getVendor()     // Catch: java.lang.Throwable -> L4d
            r3.append(r0)     // Catch: java.lang.Throwable -> L4d
            goto L22
        L44:
            java.lang.String r0 = r3.toString()     // Catch: java.lang.Throwable -> L4d
            java.lang.String r0 = com.alipay.sdk.p082m.p125z.C1448a.m18657e(r0)     // Catch: java.lang.Throwable -> L4d
            goto L4e
        L4d:
            r0 = 0
        L4e:
            if (r0 != 0) goto L52
            java.lang.String r0 = ""
        L52:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p084a0.C1222b.m19402g(android.content.Context):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x0032, code lost:
        if (r4 != null) goto L14;
     */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m19401h() {
        /*
            java.lang.String r0 = "/proc/meminfo"
            r1 = 0
            r2 = 0
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L2b
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L2b
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L29
            r0 = 8192(0x2000, float:1.14794E-41)
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L29
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L2d
            if (r1 == 0) goto L25
            java.lang.String r0 = "\\s+"
            java.lang.String[] r1 = r1.split(r0)     // Catch: java.lang.Throwable -> L2d
            r0 = 1
            r0 = r1[r0]     // Catch: java.lang.Throwable -> L2d
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Throwable -> L2d
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L2d
        L25:
            r5.close()     // Catch: java.lang.Throwable -> L39
            goto L39
        L29:
            r4 = r1
            goto L2d
        L2b:
            r4 = r1
            r5 = r4
        L2d:
            if (r5 == 0) goto L32
            r5.close()     // Catch: java.lang.Throwable -> L32
        L32:
            if (r4 != 0) goto L39
        L34:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            return r0
        L39:
            r4.close()     // Catch: java.lang.Throwable -> L34
            goto L34
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p084a0.C1222b.m19401h():java.lang.String");
    }

    /* renamed from: h */
    public static String m19400h(Context context) {
        List<Sensor> m19414xa6beb85a;
        JSONArray jSONArray = new JSONArray();
        if (context != null) {
            try {
                SensorManager sensorManager = (SensorManager) context.getSystemService("sensor");
                if (sensorManager != null && (m19414xa6beb85a = m19414xa6beb85a(sensorManager, -1)) != null && m19414xa6beb85a.size() > 0) {
                    for (Sensor sensor : m19414xa6beb85a) {
                        if (sensor != null) {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("name", sensor.getName());
                            jSONObject.put("version", sensor.getVersion());
                            jSONObject.put("vendor", sensor.getVendor());
                            jSONArray.put(jSONObject);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: i */
    public static String m19399i() {
        long j;
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            j = statFs.getBlockCount() * statFs.getBlockSize();
        } catch (Throwable unused) {
            j = 0;
        }
        return String.valueOf(j);
    }

    /* renamed from: i */
    public static String m19398i(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            new StringBuilder();
            return C0002O.m25085C(Integer.toString(displayMetrics.widthPixels), "*", Integer.toString(displayMetrics.heightPixels));
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: j */
    public static String m19397j() {
        long j;
        if ("mounted".equals(Environment.getExternalStorageState())) {
            StatFs statFs = new StatFs(C116971W2r.LIZIZ().getPath());
            j = statFs.getBlockSize() * statFs.getBlockCount();
            return String.valueOf(j);
        }
        j = 0;
        return String.valueOf(j);
    }

    /* renamed from: j */
    public static String m19396j(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.widthPixels);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: k */
    public static String m19395k() {
        String str;
        try {
            Class LIZ = C116971W2r.LIZ("android.os.SystemProperties");
            str = (String) LIZ.getMethod("get", String.class, String.class).invoke(LIZ.newInstance(), "gsm.version.baseband", "no message");
        } catch (Throwable unused) {
            str = "";
        }
        return str != null ? str : "";
    }

    /* renamed from: k */
    public static String m19394k(Context context) {
        try {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            StringBuilder sb = new StringBuilder();
            sb.append(displayMetrics.heightPixels);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: l */
    public static String m19393l() {
        String str;
        try {
            str = Locale.getDefault().toString();
        } catch (Throwable unused) {
            str = "";
        }
        return str != null ? str : "";
    }

    /* renamed from: l */
    public static String m19392l(Context context) {
        String str;
        try {
            str = com_alipay_sdk_m_a0_b_android_provider_Settings$Secure_getString(context.getContentResolver(), "android_id");
        } catch (Throwable unused) {
            str = "";
        }
        return str == null ? "" : str;
    }

    /* renamed from: m */
    public static String m19391m() {
        String str;
        try {
            str = TimeZone.getDefault().getDisplayName(false, 0);
        } catch (Throwable unused) {
            str = "";
        }
        return str != null ? str : "";
    }

    /* renamed from: m */
    public static String m19390m(Context context) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            return telephonyManager != null ? String.valueOf(C116971W2r.LIZ(telephonyManager)) : "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: n */
    public static String m19389n() {
        try {
            long currentTimeMillis = System.currentTimeMillis() - SystemClock.elapsedRealtime();
            StringBuilder sb = new StringBuilder();
            sb.append(currentTimeMillis - (currentTimeMillis % 1000));
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0026 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0022 -> B:10:0x0023). Please submit an issue!!! */
    /* renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m19388n(android.content.Context r4) {
        /*
            java.lang.String r3 = ""
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo()
            int r2 = r0.targetSdkVersion
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L22
            r0 = 29
            if (r1 >= r0) goto L22
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L22
            r0 = 26
            if (r1 < r0) goto L1d
            r0 = 28
            if (r2 < r0) goto L1d
            java.lang.String r0 = com_alipay_sdk_m_a0_b_android_os_Build_getSerial()     // Catch: java.lang.Throwable -> L22
            goto L23
        L1d:
            java.lang.String r0 = com_alipay_sdk_m_a0_b_android_os_Build_SERIAL()     // Catch: java.lang.Throwable -> L22
            goto L23
        L22:
            r0 = r3
        L23:
            if (r0 != 0) goto L26
            return r3
        L26:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p084a0.C1222b.m19388n(android.content.Context):java.lang.String");
    }

    /* renamed from: o */
    public static String m19387o() {
        try {
            StringBuilder sb = new StringBuilder();
            sb.append(SystemClock.elapsedRealtime());
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: o */
    public static String m19386o(Context context) {
        try {
            String m19380r = m19380r(context);
            String m19375w = m19375w();
            if (!C1448a.m18661b(m19380r) || !C1448a.m18661b(m19375w)) {
                return "";
            }
            new StringBuilder();
            return C0002O.m25085C(m19380r, Constants.COLON_SEPARATOR, m19375w());
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: p */
    public static String m19385p() {
        try {
            StringBuilder sb = new StringBuilder();
            String[] strArr = {"/dev/qemu_pipe", "/dev/socket/qemud", "/system/lib/libc_malloc_debug_qemu.so", "/sys/qemu_trace", "/system/bin/qemu-props", "/dev/socket/genyd", "/dev/socket/baseband_genyd"};
            sb.append("00" + Constants.COLON_SEPARATOR);
            for (int i = 0; i < 7; i++) {
                sb.append(new File(strArr[i]).exists() ? "1" : "0");
            }
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: p */
    public static String m19384p(Context context) {
        long lastModified;
        try {
            long j = 0;
            if (!((KeyguardManager) context.getSystemService("keyguard")).isKeyguardSecure()) {
                return "0:0";
            }
            String[] strArr = {"/data/system/password.key", "/data/system/gesture.key", "/data/system/gatekeeper.password.key", "/data/system/gatekeeper.gesture.key", "/data/system/gatekeeper.pattern.key"};
            for (int i = 0; i < 5; i++) {
                try {
                    lastModified = new File(strArr[i]).lastModified();
                } catch (Throwable unused) {
                }
                j = Math.max(lastModified, j);
            }
            return "1:" + j;
        } catch (Throwable unused2) {
            return "";
        }
    }

    /* renamed from: q */
    public static String m19383q() {
        String[] strArr = {"dalvik.system.Taint"};
        StringBuilder sb = new StringBuilder("00");
        sb.append(Constants.COLON_SEPARATOR);
        for (int i = 0; i <= 0; i++) {
            try {
                C116971W2r.LIZ(strArr[0]);
                sb.append("1");
            } catch (Throwable unused) {
                sb.append("0");
            }
        }
        return sb.toString();
    }

    /* renamed from: q */
    public static String m19382q(Context context) {
        try {
            Intent LIZ = C116971W2r.LIZ(context, (BroadcastReceiver) null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            int intExtra = LIZ.getIntExtra("level", -1);
            int intExtra2 = LIZ.getIntExtra("status", -1);
            boolean z = intExtra2 == 2 || intExtra2 == 5;
            StringBuilder sb = new StringBuilder();
            sb.append(z ? "1" : "0");
            sb.append(Constants.COLON_SEPARATOR);
            sb.append(intExtra);
            return sb.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: r */
    public static String m19381r() {
        LineNumberReader lineNumberReader;
        StringBuilder sb = new StringBuilder();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("/system/build.prop", "ro.product.name=sdk");
        linkedHashMap.put("/proc/tty/drivers", "goldfish");
        linkedHashMap.put("/proc/cpuinfo", "goldfish");
        sb.append("00" + Constants.COLON_SEPARATOR);
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            try {
                lineNumberReader = new LineNumberReader(new InputStreamReader(new FileInputStream(str)));
                while (true) {
                    try {
                        String readLine = lineNumberReader.readLine();
                        if (readLine == null) {
                            break;
                        } else if (readLine.toLowerCase().contains((CharSequence) linkedHashMap.get(str))) {
                            c = '1';
                            break;
                        }
                    } catch (Throwable unused) {
                        sb.append('0');
                        if (lineNumberReader == null) {
                        }
                        lineNumberReader.close();
                    }
                }
                sb.append(c);
            } catch (Throwable unused2) {
                lineNumberReader = null;
            }
            try {
                lineNumberReader.close();
            } catch (Throwable unused3) {
            }
        }
        return sb.toString();
    }

    /* renamed from: r */
    public static String m19380r(Context context) {
        if (m19419a(context, "android.permission.ACCESS_NETWORK_STATE")) {
            return "";
        }
        try {
            NetworkInfo LIZ = C116971W2r.LIZ((ConnectivityManager) context.getSystemService("connectivity"));
            if (LIZ == null) {
                return null;
            }
            if (LIZ.getType() == 1) {
                return "WIFI";
            }
            if (LIZ.getType() != 0) {
                return null;
            }
            int subtype = LIZ.getSubtype();
            return (subtype == 4 || subtype == 1 || subtype == 2 || subtype == 7 || subtype == 11) ? "2G" : (subtype == 3 || subtype == 5 || subtype == 6 || subtype == 8 || subtype == 9 || subtype == 10 || subtype == 12 || subtype == 14 || subtype == 15) ? "3G" : subtype == 13 ? "4G" : "UNKNOW";
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: s */
    public static String m19379s() {
        StringBuilder sb = new StringBuilder();
        sb.append("00" + Constants.COLON_SEPARATOR);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("BRAND", "generic");
        linkedHashMap.put("BOARD", LoggerUtil.UNKNOWN);
        linkedHashMap.put("DEVICE", "generic");
        linkedHashMap.put("HARDWARE", "goldfish");
        linkedHashMap.put("PRODUCT", "sdk");
        linkedHashMap.put("MODEL", "sdk");
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            try {
                String str2 = null;
                String str3 = (String) Build.class.getField(str).get(null);
                String str4 = (String) linkedHashMap.get(str);
                if (str3 != null) {
                    str2 = str3.toLowerCase();
                }
                if (str2 != null && str2.contains(str4)) {
                    c = '1';
                }
            } catch (Throwable unused) {
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* renamed from: t */
    public static String m19378t() {
        StringBuilder sb = new StringBuilder();
        sb.append("00" + Constants.COLON_SEPARATOR);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("ro.hardware", "goldfish");
        linkedHashMap.put("ro.kernel.qemu", "1");
        linkedHashMap.put("ro.product.device", "generic");
        linkedHashMap.put("ro.product.model", "sdk");
        linkedHashMap.put("ro.product.brand", "generic");
        linkedHashMap.put("ro.product.name", "sdk");
        linkedHashMap.put("ro.build.fingerprint", "test-keys");
        linkedHashMap.put("ro.product.manufacturer", "unknow");
        for (String str : linkedHashMap.keySet()) {
            char c = '0';
            String str2 = (String) linkedHashMap.get(str);
            String m18660b = C1448a.m18660b(str, "");
            if (m18660b != null && m18660b.contains(str2)) {
                c = '1';
            }
            sb.append(c);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public static String m19377u() {
        FileReader fileReader;
        BufferedReader bufferedReader;
        String readLine;
        BufferedReader bufferedReader2 = null;
        try {
            fileReader = new FileReader("/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq");
            try {
                bufferedReader = new BufferedReader(fileReader, 8192);
                try {
                    readLine = bufferedReader.readLine();
                } catch (Throwable unused) {
                    bufferedReader2 = bufferedReader;
                    if (bufferedReader2 != null) {
                        try {
                            bufferedReader2.close();
                        } catch (Throwable unused2) {
                        }
                    }
                    if (fileReader == null) {
                        return "";
                    }
                    try {
                        fileReader.close();
                        return "";
                    } catch (Throwable unused3) {
                        return "";
                    }
                }
            } catch (Throwable unused4) {
            }
        } catch (Throwable unused5) {
            fileReader = null;
        }
        if (C1448a.m18665a(readLine)) {
            try {
                bufferedReader.close();
            } catch (Throwable unused6) {
            }
            fileReader.close();
            return "";
        }
        String trim = readLine.trim();
        try {
            bufferedReader.close();
        } catch (Throwable unused7) {
        }
        try {
            fileReader.close();
        } catch (Throwable unused8) {
        }
        return trim;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0034, code lost:
        r6 = r3[1].trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x003a, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0047, code lost:
        if (r4 != null) goto L31;
     */
    /* renamed from: v */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m19376v() {
        /*
            java.lang.String r0 = "/proc/cpuinfo"
            java.lang.String r6 = ""
            r1 = 0
            java.io.FileReader r5 = new java.io.FileReader     // Catch: java.lang.Throwable -> L40
            r5.<init>(r0)     // Catch: java.lang.Throwable -> L40
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3e
            r0 = 8192(0x2000, float:1.14794E-41)
            r4.<init>(r5, r0)     // Catch: java.lang.Throwable -> L3e
        L11:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L42
            if (r1 == 0) goto L3a
            boolean r0 = com.alipay.sdk.p082m.p125z.C1448a.m18665a(r1)     // Catch: java.lang.Throwable -> L42
            if (r0 != 0) goto L11
            java.lang.String r0 = ":"
            java.lang.String[] r3 = r1.split(r0)     // Catch: java.lang.Throwable -> L42
            if (r3 == 0) goto L11
            int r0 = r3.length     // Catch: java.lang.Throwable -> L42
            r2 = 1
            if (r0 <= r2) goto L11
            r0 = 0
            r1 = r3[r0]     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = "BogoMIPS"
            boolean r0 = r1.contains(r0)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L11
            r0 = r3[r2]     // Catch: java.lang.Throwable -> L42
            java.lang.String r6 = r0.trim()     // Catch: java.lang.Throwable -> L42
        L3a:
            r5.close()     // Catch: java.lang.Throwable -> L4a
            goto L4a
        L3e:
            r4 = r1
            goto L42
        L40:
            r4 = r1
            r5 = r4
        L42:
            if (r5 == 0) goto L47
            r5.close()     // Catch: java.lang.Throwable -> L47
        L47:
            if (r4 != 0) goto L4a
        L49:
            return r6
        L4a:
            r4.close()     // Catch: java.lang.Throwable -> L49
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.alipay.sdk.p082m.p084a0.C1222b.m19376v():java.lang.String");
    }

    /* renamed from: w */
    public static String m19375w() {
        try {
            Enumeration m19410xda353466 = m19410xda353466();
            while (m19410xda353466.hasMoreElements()) {
                Enumeration<InetAddress> inetAddresses = ((NetworkInterface) m19410xda353466.nextElement()).getInetAddresses();
                while (inetAddresses.hasMoreElements()) {
                    InetAddress nextElement = inetAddresses.nextElement();
                    if (!nextElement.isLoopbackAddress() && (nextElement instanceof Inet4Address)) {
                        String hostAddress = nextElement.getHostAddress();
                        hostAddress.toString();
                        return hostAddress;
                    }
                }
            }
            return "";
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final String m19422a() {
        try {
            return String.valueOf(new File("/sys/devices/system/cpu/").listFiles(new C1223c(this)).length);
        } catch (Throwable unused) {
            return "1";
        }
    }

    /* renamed from: a */
    public final synchronized String m19420a(Context context) {
        String str;
        if (!m19421a(this.f22065b) || (str = this.f22069f) == null) {
            if (m19419a(context, "android.permission.READ_PHONE_STATE")) {
                return "";
            }
            if (context != null) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null) {
                        this.f22069f = m19413x73af3573(telephonyManager);
                    }
                } catch (Throwable unused) {
                }
            }
            if (this.f22069f == null) {
                this.f22069f = "";
            }
            this.f22065b = System.currentTimeMillis();
            return this.f22069f;
        }
        return str;
    }

    /* renamed from: b */
    public final synchronized String m19417b(Context context) {
        String str;
        if (!m19421a(this.f22064a) || (str = this.f22068e) == null) {
            if (m19419a(context, "android.permission.READ_PHONE_STATE")) {
                return "";
            }
            if (context != null) {
                try {
                    TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                    if (telephonyManager != null) {
                        this.f22068e = m19411x52642605(telephonyManager);
                    }
                } catch (Throwable unused) {
                }
            }
            if (this.f22068e == null) {
                this.f22068e = "";
            }
            this.f22064a = System.currentTimeMillis();
            return this.f22068e;
        }
        return str;
    }

    /* renamed from: c */
    public final synchronized String m19415c(Context context) {
        String str;
        if (!m19421a(this.f22066c) || (str = this.f22070g) == null) {
            if (m19419a(context, "android.permission.READ_PHONE_STATE")) {
                return "";
            }
            try {
                String m19412xa0a28732 = m19412xa0a28732((TelephonyManager) context.getSystemService("phone"));
                this.f22070g = m19412xa0a28732;
                if (m19412xa0a28732 == null || m19412xa0a28732.length() == 0) {
                    this.f22070g = "";
                }
            } catch (Throwable unused) {
            }
            this.f22066c = System.currentTimeMillis();
            return this.f22070g;
        }
        return str;
    }
}
