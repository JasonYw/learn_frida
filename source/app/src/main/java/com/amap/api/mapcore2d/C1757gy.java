package com.amap.api.mapcore2d;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.location.Location;
import android.net.NetworkInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.SystemClock;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.SparseArray;
import androidx.core.view.MotionEventCompat;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Hashtable;
import java.util.Random;
import org.json.JSONObject;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.gy */
/* loaded from: classes19.dex */
public final class C1757gy {

    /* renamed from: b */
    public static int f23932b;

    /* renamed from: c */
    public static String[] f23933c;

    /* renamed from: d */
    public static Hashtable<String, Long> f23934d = new Hashtable<>();

    /* renamed from: e */
    public static SparseArray<String> f23935e = null;

    /* renamed from: f */
    public static String[] f23936f = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"};

    /* renamed from: g */
    public static String f23937g = "android.permission.ACCESS_BACKGROUND_LOCATION";

    /* renamed from: a */
    public static WifiManager f23931a = null;

    /* renamed from: h */
    public static boolean f23938h = false;

    static {
        Covode.recordClassIndex(5305);
    }

    /* renamed from: a */
    public static double m17278a(double d) {
        return ((long) (d * 1000000.0d)) / 1000000.0d;
    }

    /* renamed from: a */
    public static float m17277a(float f) {
        return (float) (((long) (f * 100.0d)) / 100.0d);
    }

    /* renamed from: a */
    public static float m17266a(double[] dArr) {
        if (dArr.length != 4) {
            return 0.0f;
        }
        float[] fArr = new float[1];
        Location.distanceBetween(dArr[0], dArr[1], dArr[2], dArr[3], fArr);
        return fArr[0];
    }

    /* renamed from: a */
    public static int m17276a(int i) {
        return (i * 2) - 113;
    }

    /* renamed from: a */
    public static int m17271a(NetworkInfo networkInfo) {
        if (networkInfo == null || !networkInfo.isAvailable() || !networkInfo.isConnected()) {
            return -1;
        }
        return networkInfo.getType();
    }

    /* renamed from: a */
    public static long m17279a() {
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public static Object m17272a(Context context, String str) {
        Object obj = null;
        if (context == null) {
            return null;
        }
        try {
            obj = context.getApplicationContext().getSystemService(str);
            return obj;
        } catch (Throwable th) {
            C1752gu.m17302a(th, "Utils", "getServ");
            return obj;
        }
    }

    /* renamed from: a */
    public static boolean m17273a(Context context) {
        if (context == null) {
            return false;
        }
        try {
            return m17257c() < 17 ? m17260b(context, "android.provider.Settings$System") : m17260b(context, "android.provider.Settings$Global");
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m17269a(String str) {
        return !TextUtils.isEmpty(str) && !"00:00:00:00:00:00".equals(str) && !str.contains(" :");
    }

    /* renamed from: a */
    public static boolean m17268a(JSONObject jSONObject, String str) {
        return C1602db.m17937a(jSONObject, str);
    }

    /* renamed from: a */
    public static byte[] m17275a(int i, byte[] bArr) {
        if (bArr == null || bArr.length < 2) {
            bArr = new byte[2];
        }
        bArr[0] = (byte) (i & MotionEventCompat.ACTION_MASK);
        bArr[1] = (byte) ((i & MotionEventCompat.ACTION_POINTER_INDEX_MASK) >> 8);
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m17274a(long j) {
        byte[] bArr = new byte[8];
        int i = 0;
        do {
            bArr[i] = (byte) ((j >> (i * 8)) & 255);
            i++;
        } while (i < 8);
        return bArr;
    }

    /* renamed from: a */
    public static byte[] m17267a(byte[] bArr) {
        try {
            return C1602db.m17932b(bArr);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "Utils", "gz");
            return null;
        }
    }

    /* renamed from: a */
    public static String[] m17270a(TelephonyManager telephonyManager) {
        int i;
        String[] strArr;
        String networkOperator = telephonyManager != null ? telephonyManager.getNetworkOperator() : null;
        String[] strArr2 = {"0", "0"};
        if (!TextUtils.isEmpty(networkOperator) && TextUtils.isDigitsOnly(networkOperator) && networkOperator.length() > 4) {
            strArr2[0] = networkOperator.substring(0, 3);
            char[] charArray = networkOperator.substring(3).toCharArray();
            int i2 = 0;
            while (i2 < charArray.length && Character.isDigit(charArray[i2])) {
                i2++;
            }
            strArr2[1] = networkOperator.substring(3, i2 + 3);
        }
        try {
            i = Integer.parseInt(strArr2[0]);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "Utils", "getMccMnc");
            i = 0;
        }
        if (i == 0) {
            strArr2[0] = "0";
        }
        if (!"0".equals(strArr2[0]) && !"0".equals(strArr2[1])) {
            f23933c = strArr2;
        } else if ("0".equals(strArr2[0]) && "0".equals(strArr2[1]) && (strArr = f23933c) != null) {
            return strArr;
        }
        return strArr2;
    }

    /* renamed from: b */
    public static double m17264b(double d) {
        return ((long) (d * 100.0d)) / 100.0d;
    }

    /* renamed from: b */
    public static long m17265b() {
        return SystemClock.elapsedRealtime();
    }

    /* renamed from: b */
    public static String m17263b(int i) {
        switch (i) {
            case 0:
                return "success";
            case 1:
                return "重要参数为空";
            case 2:
                return "WIFI信息不足";
            case 3:
                return "请求参数获取出现异常";
            case 4:
                return "网络连接异常";
            case 5:
                return "解析数据异常";
            case 6:
                return "定位结果错误";
            case 7:
                return "KEY错误";
            case 8:
            case 16:
            case MotionEventCompat.AXIS_LTRIGGER /* 17 */:
            default:
                return "其他错误";
            case 9:
                return "初始化异常";
            case 10:
                return "定位服务启动失败";
            case 11:
                return "错误的基站信息，请检查是否插入SIM卡";
            case 12:
                return "缺少定位权限";
            case 13:
                return "网络定位失败，请检查设备是否插入sim卡，是否开启移动网络或开启了wifi模块";
            case 14:
                return "GPS 定位失败，由于设备当前 GPS 状态差,建议持设备到相对开阔的露天场所再次尝试";
            case MotionEventCompat.AXIS_HAT_X /* 15 */:
                return "当前返回位置为模拟软件返回，请关闭模拟软件，或者在option中设置允许模拟";
            case 18:
                return "定位失败，飞行模式下关闭了WIFI开关，请关闭飞行模式或者打开WIFI开关";
            case MotionEventCompat.AXIS_THROTTLE /* 19 */:
                return "定位失败，没有检查到SIM卡，并且关闭了WIFI开关，请打开WIFI开关或者插入SIM卡";
        }
    }

    /* renamed from: b */
    public static String m17261b(Context context) {
        PackageInfo packageInfo;
        if (!TextUtils.isEmpty(C1752gu.f23922g)) {
            return C1752gu.f23922g;
        }
        CharSequence charSequence = null;
        if (context == null) {
            return null;
        }
        try {
            packageInfo = context.getPackageManager().getPackageInfo(C1573cq.m18121c(context), 64);
        } catch (Throwable th) {
            C1752gu.m17302a(th, "Utils", "getAppName part");
            packageInfo = null;
        }
        try {
            if (TextUtils.isEmpty(C1752gu.f23923h)) {
                C1752gu.f23923h = null;
            }
        } catch (Throwable th2) {
            C1752gu.m17302a(th2, "Utils", "getAppName");
        }
        StringBuilder sb = new StringBuilder();
        if (packageInfo != null) {
            if (packageInfo.applicationInfo != null) {
                charSequence = packageInfo.applicationInfo.loadLabel(context.getPackageManager());
            }
            if (charSequence != null) {
                sb.append(charSequence.toString());
            }
            if (!TextUtils.isEmpty(packageInfo.versionName)) {
                sb.append(packageInfo.versionName);
            }
        }
        String m18121c = C1573cq.m18121c(context);
        if (!TextUtils.isEmpty(m18121c)) {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(m18121c);
        }
        if (!TextUtils.isEmpty(C1752gu.f23923h)) {
            sb.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
            sb.append(C1752gu.f23923h);
        }
        String sb2 = sb.toString();
        C1752gu.f23922g = sb2;
        return sb2;
    }

    /* renamed from: b */
    public static String m17259b(TelephonyManager telephonyManager) {
        int i = 0;
        if (f23935e == null) {
            SparseArray<String> sparseArray = new SparseArray<>();
            f23935e = sparseArray;
            sparseArray.append(0, "UNKWN");
            f23935e.append(1, "GPRS");
            f23935e.append(2, "EDGE");
            f23935e.append(3, "UMTS");
            f23935e.append(4, "CDMA");
            f23935e.append(5, "EVDO_0");
            f23935e.append(6, "EVDO_A");
            f23935e.append(7, "1xRTT");
            f23935e.append(8, "HSDPA");
            f23935e.append(9, "HSUPA");
            f23935e.append(10, "HSPA");
            f23935e.append(11, "IDEN");
            f23935e.append(12, "EVDO_B");
            f23935e.append(13, "LTE");
            f23935e.append(14, "EHRPD");
            f23935e.append(15, "HSPAP");
        }
        if (telephonyManager != null) {
            i = C116971W2r.LIZ(telephonyManager);
        }
        return f23935e.get(i, "UNKWN");
    }

    /* renamed from: b */
    public static boolean m17260b(Context context, String str) {
        ContentResolver contentResolver = context.getContentResolver();
        String str2 = (String) C1754gw.m17292a(str, "AIRPLANE_MODE_ON");
        str2.toString();
        return ((Integer) C1754gw.m17291a(str, "getInt", new Object[]{contentResolver, str2}, new Class[]{ContentResolver.class, String.class})).intValue() == 1;
    }

    /* renamed from: b */
    public static byte[] m17262b(int i, byte[] bArr) {
        if (bArr == null || bArr.length < 4) {
            bArr = new byte[4];
        }
        for (int i2 = 0; i2 < bArr.length; i2++) {
            bArr[i2] = (byte) ((i >> (i2 * 8)) & MotionEventCompat.ACTION_MASK);
        }
        return bArr;
    }

    /* renamed from: b */
    public static byte[] m17258b(String str) {
        return m17275a(m17252d(str), (byte[]) null);
    }

    /* renamed from: c */
    public static int m17257c() {
        int i = f23932b;
        if (i > 0) {
            return i;
        }
        try {
            try {
                return C1754gw.m17289b("android.os.Build$VERSION", "SDK_INT");
            } catch (Throwable unused) {
                return 0;
            }
        } catch (Throwable unused2) {
            return Integer.parseInt(C1754gw.m17292a("android.os.Build$VERSION", "SDK").toString());
        }
    }

    /* renamed from: c */
    public static boolean m17256c(Context context) {
        boolean z;
        if (context == null) {
            return true;
        }
        if (f23931a == null) {
            f23931a = (WifiManager) m17272a(context, "wifi");
        }
        try {
            z = f23931a.isWifiEnabled();
        } catch (Throwable unused) {
            z = false;
        }
        if (z) {
            return z;
        }
        if (m17257c() <= 17) {
            return z;
        }
        try {
            return "true".equals(String.valueOf(C1754gw.m17293a(f23931a, "isScanAlwaysAvailable", new Object[0])));
        } catch (Throwable unused2) {
            return z;
        }
    }

    /* renamed from: c */
    public static byte[] m17255c(String str) {
        return m17262b(m17252d(str), (byte[]) null);
    }

    /* renamed from: d */
    public static int m17252d(String str) {
        return Integer.parseInt(str);
    }

    /* renamed from: d */
    public static String m17254d() {
        return Build.MODEL;
    }

    /* renamed from: d */
    public static String m17253d(Context context) {
        String m18040m = C1587cu.m18040m(context);
        if (TextUtils.isEmpty(m18040m) || m18040m.equals("00:00:00:00:00:00")) {
            m18040m = C1755gx.m17288a(context);
        }
        if (TextUtils.isEmpty(m18040m)) {
            m18040m = "00:00:00:00:00:00";
        }
        if (!f23938h) {
            C1755gx.m17287a(context, m18040m);
            f23938h = true;
        }
        return m18040m;
    }

    /* renamed from: e */
    public static byte m17249e(String str) {
        return Byte.parseByte(str);
    }

    /* renamed from: e */
    public static String m17251e() {
        return Build.VERSION.RELEASE;
    }

    /* renamed from: e */
    public static boolean m17250e(Context context) {
        return Build.VERSION.SDK_INT >= 28 && context.getApplicationInfo().targetSdkVersion >= 28;
    }

    /* renamed from: f */
    public static int m17248f() {
        return new Random().nextInt(65536) - 32768;
    }
}
