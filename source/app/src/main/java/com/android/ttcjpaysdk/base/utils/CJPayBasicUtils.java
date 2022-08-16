package com.android.ttcjpaysdk.base.utils;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.media.MediaScannerConnection;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.widget.Toast;
import androidx.core.view.MotionEventCompat;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayBPEAService;
import com.android.ttcjpaysdk.base.service.ICJPayFingerprintService;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.bytedance.p1300mt.protector.impl.CastProtectorUtils;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC137059cb9;
import p003X.AbstractC137454chW;
import p003X.C116971W2r;
import p003X.C136954cZR;
import p003X.C137447chP;
import p003X.C137448chQ;
import p003X.C137449chR;
import p003X.C137450chS;
import p003X.C137451chT;
import p003X.C137452chU;
import p003X.C137453chV;
import p003X.C137455chX;
import p003X.C64859BiX;
import p003X.RunnableC137402cgg;

/* loaded from: classes17.dex */
public class CJPayBasicUtils {
    public static ChangeQuickRedirect changeQuickRedirect;
    public static long lastClickTime;
    public static volatile String mAppName;
    public static volatile String mAppVersionName;
    public static final byte[] TT_CJ_PAY_TFCC_DEBUG_KEY = {48, 52, 97, 99, 97, 102, 54, 54, 51, 48, 99, 51, 98, 54, 51, 57, 99, 55, 49, 98, 55, 52, 55, 97, 99, 99, 53, 101, 50, 100, 97, 100, 54, 101, 98, 55, 50, 102, 57, 98, 101, 101, 52, 52, 52, 53, 55, 50, 53, 57, 100, 54, 48, 101, 54, 52, 98, 55, 100, 57, 50, 55, 51, 50, 49, 57, 57, 48, 97, 56, 100, 49, 57, 57, 102, 102, 54, 52, 55, 97, 102, 99, 57, 57, 56, 49, 101, 97, 102, 49, 98, 98, 50, 52, 51, 50, 98, 98, 97, 97, 57, 55, 52, 50, 51, 49, 53, 51, 99, 52, 48, 49, 100, 50, 98, 53, 56, 57, 99, 55, 101, 54, 100, 54, 53, 98, 97, 50, 48, 99};
    public static final byte[] TT_CJ_PAY_TFCC_ONLINE_KEY = {48, 52, 100, 97, 102, 49, 53, 57, 51, 98, 53, 49, 48, 49, 53, 55, 52, 101, 100, 50, 48, 49, 51, 98, 52, 49, 97, 48, 100, 51, 97, 52, 52, 98, 52, 48, 54, 54, 50, 97, 100, 50, 48, 98, 97, 102, 101, 57, 98, 98, 101, 51, 97, 99, 98, 97, 97, 99, 50, 48, 101, 48, 56, 49, 99, 99, 48, 102, 101, 100, 99, 54, 57, 97, 98, 102, 97, 57, 54, 50, 52, 48, 52, 48, 52, 49, 51, 50, 52, 53, 50, 49, 100, 57, 48, 51, 52, 51, 49, 57, 99, 100, 49, 48, 55, 55, 99, 50, 97, 56, 102, 98, 99, 102, 53, 102, 51, 57, 54, 51, 52, 51, 99, 100, 98, 99, 100, 100, 102, 57};
    public static volatile int mAppVersionCode = -9999;
    public static volatile int isJailBroken = -1;
    public static String SettingsVersionSuffix = "-bdpay";
    public static int sdkVersionCode = -9999;

    public static String getVersionName() {
        return "6.3.3.3";
    }

    public static byte[] getTfccKey() {
        if (CJPayHostInfo.serverType != 2) {
            return TT_CJ_PAY_TFCC_ONLINE_KEY;
        }
        return TT_CJ_PAY_TFCC_DEBUG_KEY;
    }

    /* loaded from: classes17.dex */
    public enum HalfType {
        TOP,
        BUTTON,
        ALL;
        
        public static ChangeQuickRedirect changeQuickRedirect;

        /* renamed from: values  reason: to resolve conflict with enum method */
        public static HalfType[] valuesCustom() {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
            if (proxy.isSupported) {
                return (HalfType[]) proxy.result;
            }
            return (HalfType[]) values().clone();
        }

        static {
            Covode.recordClassIndex(6719);
        }

        public static HalfType valueOf(String str) {
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
            if (proxy.isSupported) {
                return (HalfType) proxy.result;
            }
            return (HalfType) Enum.valueOf(HalfType.class, str);
        }
    }

    public static boolean checkSuperuserApk() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 39);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!new File("/system/app/Superuser.apk").exists()) {
            return false;
        }
        return true;
    }

    public static String getBioTypeInfo() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 59);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return String.valueOf(isSupportFingerPrint(CJPayHostInfo.applicationContext) ? 1 : 0);
    }

    public static String getJailBreakInfo() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 60);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (isJailBroken()) {
            return "1";
        }
        return "2";
    }

    public static String getNavBarOverride() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 19);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        int i = Build.VERSION.SDK_INT;
        try {
            Method declaredMethod = C116971W2r.LIZ("android.os.SystemProperties").getDeclaredMethod("get", String.class);
            declaredMethod.setAccessible(true);
            return (String) declaredMethod.invoke(null, "qemu.hw.mainkeys");
        } catch (Throwable unused) {
            return null;
        }
    }

    public static String getRealVersion() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 50);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (TextUtils.isEmpty("6.3.3.3")) {
            return "6.3.3.3";
        }
        return "6.3.3";
    }

    public static boolean isClickValid() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 31);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis > 0) {
            long j = lastClickTime;
            if (j >= 0 && currentTimeMillis - j >= 0 && currentTimeMillis - j < 500) {
                return false;
            }
        }
        lastClickTime = currentTimeMillis;
        return true;
    }

    public static boolean isInUIThread() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 6);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (Looper.myLooper() != Looper.getMainLooper()) {
            return false;
        }
        return true;
    }

    public static boolean isJailBroken() {
        boolean z = false;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 38);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (isJailBroken != -1) {
            if (isJailBroken != 1) {
                return false;
            }
            return true;
        }
        if (checkAccessRootData() || checkSuperuserApk() || checkRootPathSU()) {
            z = true;
        }
        int i = z ? 1 : 0;
        int i2 = z ? 1 : 0;
        isJailBroken = i;
        return z;
    }

    public boolean isPublishType() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 51);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String versionName = getVersionName();
        if (!TextUtils.isEmpty(versionName) && C116971W2r.LIZJ(".*[a-zA-Z]+.*").matcher(versionName).matches()) {
            return false;
        }
        return true;
    }

    public static synchronized boolean checkAccessRootData() {
        synchronized (CJPayBasicUtils.class) {
            MethodCollector.m14708i(440);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 41);
            if (proxy.isSupported) {
                boolean booleanValue = ((Boolean) proxy.result).booleanValue();
                MethodCollector.m14707o(440);
                return booleanValue;
            }
            try {
                writeFile("/data/su_test", "test_ok");
                boolean equals = "test_ok".equals(readFile("/data/su_test"));
                MethodCollector.m14707o(440);
                return equals;
            } catch (Exception unused) {
                MethodCollector.m14707o(440);
                return false;
            }
        }
    }

    public static boolean checkRootPathSU() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 40);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String[] strArr = {"/system/bin/", "/system/xbin/", "/system/sbin/", "/sbin/", "/vendor/bin/"};
        int i = 0;
        while (true) {
            try {
                String str = strArr[i];
                new StringBuilder();
                if (new File(C0002O.m25086C(str, "su")).exists()) {
                    return true;
                }
                i++;
                if (i >= 5) {
                    break;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String getBiometricsInfo() {
        String str = "1";
        int i = 0;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 58);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("biometric_params", str);
            if (!isJailBroken()) {
                str = "2";
            }
            jSONObject.put("is_jailbreak", str);
            jSONObject.put("cj_sdk", getRealVersion());
            if (isSupportFingerPrint(CJPayHostInfo.applicationContext)) {
                i = 1;
            }
            jSONObject.put("bio_type", i);
        } catch (Exception unused) {
        }
        return jSONObject.toString();
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:56)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:30)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:18)
        */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041 A[Catch: Exception -> 0x004b, TRY_LEAVE, TryCatch #0 {Exception -> 0x004b, blocks: (B:10:0x0021, B:12:0x0032, B:14:0x0041, B:18:0x0034), top: B:9:0x0021 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0034 -> B:13:0x003f). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int getSDKVersionCode() {
        /*
            r4 = 0
            java.lang.Object[] r5 = new java.lang.Object[r4]
            com.bytedance.hotfix.base.ChangeQuickRedirect r3 = com.android.ttcjpaysdk.base.utils.CJPayBasicUtils.changeQuickRedirect
            r2 = 1
            r1 = 0
            r0 = 54
            com.bytedance.hotfix.PatchProxyResult r1 = com.bytedance.hotfix.PatchProxy.proxy(r5, r1, r3, r2, r0)
            boolean r0 = r1.isSupported
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.result
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            return r0
        L1a:
            int r1 = com.android.ttcjpaysdk.base.utils.CJPayBasicUtils.sdkVersionCode
            r0 = -9999(0xffffffffffffd8f1, float:NaN)
            if (r1 == r0) goto L21
            return r1
        L21:
            java.lang.String r1 = "6.3.3.3"
            java.lang.String r0 = "\\."
            java.lang.String[] r3 = r1.split(r0)     // Catch: java.lang.Exception -> L4b
            java.lang.StringBuffer r2 = new java.lang.StringBuffer     // Catch: java.lang.Exception -> L4b
            r2.<init>()     // Catch: java.lang.Exception -> L4b
            int r0 = r3.length     // Catch: java.lang.Exception -> L4b
            r1 = 4
            if (r0 >= r1) goto L34
            int r1 = r3.length     // Catch: java.lang.Exception -> L4b
            goto L3f
        L34:
            r0 = r3[r4]     // Catch: java.lang.Exception -> L4b
            java.lang.String r0 = formatSubCode(r0)     // Catch: java.lang.Exception -> L4b
            r2.append(r0)     // Catch: java.lang.Exception -> L4b
            int r4 = r4 + 1
        L3f:
            if (r4 < r1) goto L34
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Exception -> L4b
            int r0 = java.lang.Integer.parseInt(r0)     // Catch: java.lang.Exception -> L4b
            com.android.ttcjpaysdk.base.utils.CJPayBasicUtils.sdkVersionCode = r0     // Catch: java.lang.Exception -> L4b
        L4b:
            int r0 = com.android.ttcjpaysdk.base.utils.CJPayBasicUtils.sdkVersionCode
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.utils.CJPayBasicUtils.getSDKVersionCode():int");
    }

    public static String getSettingsVersion() {
        int length;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 53);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        String str = "6.3.3.3";
        if (str.endsWith(SettingsVersionSuffix)) {
            str = str.substring(0, str.indexOf(SettingsVersionSuffix));
        }
        StringBuffer stringBuffer = new StringBuffer();
        try {
            String[] split = str.split("\\.");
            if (split.length < 4) {
                length = split.length;
            } else {
                length = 4;
            }
            for (int i = 0; i < length; i++) {
                stringBuffer.append(formatSettingsSubCode(split[i]));
                stringBuffer.append(".");
            }
            for (int i2 = 0; i2 < 4 - split.length; i2++) {
                stringBuffer.append("0.");
            }
        } catch (Exception unused) {
        }
        String substring = stringBuffer.substring(0, stringBuffer.length() - 1);
        substring.toString();
        return substring;
    }

    public static boolean isHwFoldableDevice() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 56);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        String[] strArr = {"TXL-AN00", "TXL-AN10", "TXL-NX9", "TAH-AN00", "TAH-N29", "TAH-AN00m", "TAH-N29m", "RLI-AN00", "RLI-N29", "RHA-AN00m", "RHA-N29m", "TET-AN00", "TET-AN10", "TET-NX9", "TET-AL00", "TET-AN50"};
        if (!"huawei".equalsIgnoreCase(Build.MANUFACTURER) || !Arrays.asList(strArr).contains(Build.MODEL)) {
            return false;
        }
        return true;
    }

    static {
        Covode.recordClassIndex(6707);
    }

    public static void deleteDir(String str) {
        if (!PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 47).isSupported && str != null) {
            deleteAllFiles(new File(str));
        }
    }

    public static Map<String, String> Json2Map(JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{jSONObject}, null, changeQuickRedirect, true, 49);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                try {
                    String next = keys.next();
                    Object opt = jSONObject.opt(next);
                    if (opt != null) {
                        hashMap.put(next, opt.toString());
                    }
                } catch (Exception unused) {
                }
            }
        }
        return hashMap;
    }

    public static void deleteAllFiles(File file) {
        if (!PatchProxy.proxy(new Object[]{file}, null, changeQuickRedirect, true, 48).isSupported && file != null && file.exists()) {
            if (file.isDirectory()) {
                for (File file2 : file.listFiles()) {
                    deleteAllFiles(file2);
                }
            }
            C116971W2r.LIZ(file);
        }
    }

    public static String formatSettingsSubCode(String str) {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 57);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            i = Integer.parseInt(str);
        } catch (Exception unused) {
            i = -1;
        }
        if (i == -1 || i > 9) {
            return "0";
        }
        return str;
    }

    public static String formatSubCode(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 55);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        try {
            int parseInt = Integer.parseInt(str);
            if (parseInt >= 0 && parseInt <= 9) {
                return String.valueOf(parseInt);
            }
        } catch (Exception unused) {
        }
        return "0";
    }

    public static int getAppVersionCode(Context context) {
        PackageInfo packageInfo;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 9);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (mAppVersionCode != -9999) {
            return mAppVersionCode;
        }
        int i = -1;
        if (context == null) {
            return -1;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) != null) {
                i = packageInfo.versionCode;
            }
        } catch (Exception unused) {
        }
        mAppVersionCode = i;
        return i;
    }

    public static String getSafeUrlBase64(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 52);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (!TextUtils.isEmpty(str)) {
            return str.replace('+', '-').replace('/', '_').replaceAll("=", "");
        }
        return str;
    }

    public static int getScreenHeight(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 14);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (context == null) {
            return 0;
        }
        try {
            return getScreenMetrics(context).y;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static Point getScreenMetrics(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 20);
        if (proxy.isSupported) {
            return (Point) proxy.result;
        }
        if (context != null && context.getResources() != null) {
            DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
            return new Point(displayMetrics.widthPixels, displayMetrics.heightPixels);
        }
        return new Point(0, 0);
    }

    public static int getScreenMinimumSize(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 12);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (getScreenWidth(context) <= getScreenHeight(context)) {
            return getScreenWidth(context);
        }
        return getScreenHeight(context);
    }

    public static int getScreenWidth(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 13);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (context == null) {
            return 0;
        }
        return getScreenMetrics(context).x;
    }

    public static String getValueStr(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, null, changeQuickRedirect, true, 24);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return new DecimalFormat("0.00").format(j * 0.01d);
    }

    public static boolean isNetworkAvailable(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (context == null) {
            return false;
        }
        try {
            NetworkInfo LIZ = C116971W2r.LIZ((ConnectivityManager) context.getSystemService("connectivity"));
            if (LIZ != null) {
                if (LIZ.isConnected()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean isSupportFingerPrint(Context context) {
        ICJPayFingerprintService iCJPayFingerprintService;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 46);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        try {
            if (Build.VERSION.SDK_INT >= 23 && (iCJPayFingerprintService = (ICJPayFingerprintService) CJPayServiceManager.getInstance().getIService(ICJPayFingerprintService.class)) != null) {
                return iCJPayFingerprintService.isSupportFingerprint(context);
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static void switchLanguage(Activity activity) {
        Locale locale;
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 37).isSupported || activity == null) {
            return;
        }
        if (CJPayHostInfo.languageTypeStr != null && "en".equals(CJPayHostInfo.languageTypeStr)) {
            locale = Locale.ENGLISH;
        } else {
            locale = Locale.SIMPLIFIED_CHINESE;
        }
        Configuration configuration = activity.getResources().getConfiguration();
        Resources resources = activity.getResources();
        DisplayMetrics displayMetrics = resources.getDisplayMetrics();
        configuration.locale = locale;
        C116971W2r.LIZ(resources, configuration, displayMetrics);
    }

    public static void detachFromParent(View view) {
        MethodCollector.m14708i(444);
        if (PatchProxy.proxy(new Object[]{view}, null, changeQuickRedirect, true, 45).isSupported) {
            MethodCollector.m14707o(444);
        } else if (view != null && view.getParent() != null) {
            ViewParent parent = view.getParent();
            if (!(parent instanceof ViewGroup)) {
                MethodCollector.m14707o(444);
                return;
            }
            try {
                ((ViewGroup) parent).removeView(view);
                MethodCollector.m14707o(444);
            } catch (Exception unused) {
                MethodCollector.m14707o(444);
            }
        } else {
            MethodCollector.m14707o(444);
        }
    }

    public static synchronized String getAppName(Context context) {
        ApplicationInfo applicationInfo;
        CharSequence applicationLabel;
        synchronized (CJPayBasicUtils.class) {
            MethodCollector.m14708i(437);
            PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 7);
            if (proxy.isSupported) {
                String str = (String) proxy.result;
                MethodCollector.m14707o(437);
                return str;
            } else if (!TextUtils.isEmpty(mAppName)) {
                String str2 = mAppName;
                MethodCollector.m14707o(437);
                return str2;
            } else {
                String str3 = "未知应用";
                if (context == null) {
                    MethodCollector.m14707o(437);
                    return str3;
                }
                try {
                    PackageManager packageManager = context.getApplicationContext().getPackageManager();
                    if (packageManager != null && !TextUtils.isEmpty(context.getPackageName()) && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (applicationLabel = packageManager.getApplicationLabel(applicationInfo)) != null && !TextUtils.isEmpty(applicationLabel.toString())) {
                        str3 = applicationLabel.toString();
                    }
                } catch (Exception unused) {
                }
                mAppName = str3;
                MethodCollector.m14707o(437);
                return str3;
            }
        }
    }

    public static String getAppVersionName(Context context) {
        PackageInfo packageInfo;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 8);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (!TextUtils.isEmpty(mAppVersionName)) {
            return mAppVersionName;
        }
        String str = "未知版本";
        if (context == null) {
            return str;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (packageInfo = packageManager.getPackageInfo(context.getPackageName(), 0)) != null) {
                String str2 = packageInfo.versionName;
                if (!TextUtils.isEmpty(str2)) {
                    str = str2;
                }
            }
        } catch (Exception unused) {
        }
        mAppVersionName = str;
        return str;
    }

    public static String getAutoValueStr(long j) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{new Long(j)}, null, changeQuickRedirect, true, 25);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (j % 100 == 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(j / 100);
            return sb.toString();
        }
        return new DecimalFormat("0.00").format(j * 0.01d);
    }

    public static int getNavigationBarHeight(Activity activity) {
        Resources resources;
        int identifier;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 17);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (activity == null || !hasNavBar(activity)) {
            return 0;
        }
        try {
            ViewGroup viewGroup = (ViewGroup) activity.getWindow().getDecorView();
            if (viewGroup != null) {
                int i = 0;
                for (int i2 = 0; i2 < viewGroup.getChildCount(); i2++) {
                    try {
                        viewGroup.getChildAt(i2).getContext().getPackageName();
                        if (viewGroup.getChildAt(i2).getId() != -1 && "navigationBarBackground".equals(activity.getResources().getResourceEntryName(viewGroup.getChildAt(i2).getId())) && (identifier = (resources = activity.getResources()).getIdentifier("navigation_bar_height", "dimen", "android")) > 0) {
                            i = resources.getDimensionPixelSize(identifier);
                        }
                    } catch (Exception unused) {
                        return i;
                    }
                }
                return i;
            }
        } catch (Exception unused2) {
        }
        return 0;
    }

    public static int getScreenHeight(Activity activity) {
        int i;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 15);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (activity == null) {
            return 0;
        }
        View findViewById = activity.getWindow().getDecorView().findViewById(16908290);
        if (findViewById != null) {
            if (activity.getWindow().getDecorView().getSystemUiVisibility() > 0) {
                i = findViewById.getHeight();
            } else {
                i = findViewById.getHeight() + getStatusBarHeight(activity);
            }
        } else {
            i = activity.getResources().getDisplayMetrics().heightPixels;
        }
        if (i < activity.getResources().getDisplayMetrics().heightPixels) {
            return activity.getResources().getDisplayMetrics().heightPixels;
        }
        return i;
    }

    public static int getStatusBarHeight(Context context) {
        float f;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 16);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (context == null || context.getResources() == null) {
            return 0;
        }
        float dimension = context.getResources().getDimension(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        if (dimension >= 0.0f) {
            f = dimension + 0.5f;
        } else {
            f = dimension - 0.5f;
        }
        return (int) f;
    }

    public static String getUA(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 10);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (context == null) {
            return "";
        }
        return C0002O.m25080C("CJPay-", getRealVersion(), "-Android", Build.VERSION.RELEASE, Constants.ACCEPT_TIME_SEPARATOR_SERVER, getAppName(context), Constants.ACCEPT_TIME_SEPARATOR_SERVER, Integer.valueOf(getScreenHeight(context)), "_", Integer.valueOf(getScreenWidth(context)), "_", Build.MODEL);
    }

    public static boolean hasNavBar(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 18);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("config_showNavigationBar", "bool", "android");
        if (identifier != 0) {
            boolean z = resources.getBoolean(identifier);
            if (TextUtils.equals(Build.BRAND, "samsung") && TextUtils.equals(Build.MODEL, "SM-A9100")) {
                return z;
            }
            String navBarOverride = getNavBarOverride();
            if ("1".equals(navBarOverride)) {
                return false;
            }
            if (!"0".equals(navBarOverride)) {
                return z;
            }
            return true;
        } else if (!ViewConfiguration.get(context).hasPermanentMenuKey()) {
            return true;
        } else {
            return false;
        }
    }

    public static void initStatusBar(Activity activity) {
        MethodCollector.m14708i(439);
        if (PatchProxy.proxy(new Object[]{activity}, null, changeQuickRedirect, true, 35).isSupported) {
            MethodCollector.m14707o(439);
        } else if (activity == null) {
            MethodCollector.m14707o(439);
        } else {
            int i = Build.VERSION.SDK_INT;
            Window window = activity.getWindow();
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(CastProtectorUtils.parseColor("#00000000"));
            window.getDecorView().setSystemUiVisibility(9728);
            MethodCollector.m14707o(439);
        }
    }

    public static String intIP2StringIP(int i) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, null, changeQuickRedirect, true, 11);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return (i & MotionEventCompat.ACTION_MASK) + "." + ((i >> 8) & MotionEventCompat.ACTION_MASK) + "." + ((i >> 16) & MotionEventCompat.ACTION_MASK) + "." + ((i >> 24) & MotionEventCompat.ACTION_MASK);
    }

    public static String readFile(String str) {
        MethodCollector.m14708i(442);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 43);
        if (proxy.isSupported) {
            String str2 = (String) proxy.result;
            MethodCollector.m14707o(442);
            return str2;
        }
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            byte[] bArr = new byte[AccessibilityEventCompat.TYPE_TOUCH_EXPLORATION_GESTURE_END];
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    String str3 = new String(byteArrayOutputStream.toByteArray());
                    MethodCollector.m14707o(442);
                    return str3;
                }
            }
        } catch (Exception unused) {
            MethodCollector.m14707o(442);
            return null;
        }
    }

    public static Map<String, String> getBasicRiskInfo(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 36);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        Context context = CJPayHostInfo.applicationContext;
        if (context == null) {
            return new HashMap();
        }
        String str2 = CJPayHostInfo.aid;
        if (str2 == null) {
            str2 = "";
        }
        String str3 = CJPayHostInfo.did;
        if (str3 == null) {
            str3 = "";
        }
        if (str == null) {
            str = "";
        }
        HashMap hashMap = new HashMap();
        hashMap.put("app_name", getAppName(context));
        hashMap.put("platform", PushConstants.PUSH_FLYME_3_CHANGE_VERSION_START);
        hashMap.put("device_id", str3);
        hashMap.put("did", str3);
        hashMap.put("device_type", Build.MODEL);
        hashMap.put("device_platform", "android");
        hashMap.put("version_code", String.valueOf(getAppVersionCode(context)));
        hashMap.put(C64859BiX.LIZIZ, str2);
        hashMap.put("os_api", String.valueOf(Build.VERSION.SDK_INT));
        hashMap.put("os_version", Build.VERSION.RELEASE);
        hashMap.put("ac", getNetworkState(context));
        hashMap.put(Constants.PHONE_BRAND, Build.MANUFACTURER);
        String str4 = "1";
        hashMap.put("biometric_params", str4);
        hashMap.put("merchant_id", str);
        hashMap.put("resolution", getScreenHeight(context) + "*" + getScreenWidth(context));
        if (!isJailBroken()) {
            str4 = "2";
        }
        hashMap.put("is_jailbreak", str4);
        return hashMap;
    }

    public static String getNetworkState(Context context) {
        NetworkInfo LIZ;
        int LIZ2;
        NetworkInfo.State state;
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, changeQuickRedirect, true, 23);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        if (context == null) {
            return "mobile";
        }
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService("connectivity");
            if (connectivityManager != null && (LIZ = C116971W2r.LIZ(connectivityManager)) != null && LIZ.isAvailable()) {
                NetworkInfo LIZ3 = C116971W2r.LIZ(connectivityManager, 1);
                if (LIZ3 != null && (state = LIZ3.getState()) != null && (state == NetworkInfo.State.CONNECTED || state == NetworkInfo.State.CONNECTING)) {
                    return "wifi";
                }
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                ICJPayBPEAService iCJPayBPEAService = (ICJPayBPEAService) CJPayServiceManager.getInstance().getIService(ICJPayBPEAService.class);
                if (iCJPayBPEAService != null) {
                    LIZ2 = iCJPayBPEAService.getNetworkType(telephonyManager);
                } else {
                    LIZ2 = C116971W2r.LIZ(telephonyManager);
                }
                switch (LIZ2) {
                    case 1:
                    case 2:
                    case 4:
                    case 7:
                    case 11:
                        return "2g";
                    case 3:
                    case 5:
                    case 6:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 14:
                    case MotionEventCompat.AXIS_HAT_X /* 15 */:
                        return "3g";
                    case 13:
                        return "4g";
                    default:
                        return "5g";
                }
            }
        } catch (Throwable unused) {
        }
        return "mobile";
    }

    public static boolean checkAppInstalled(Context context, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 34);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (context != null && str != null && !str.isEmpty()) {
            try {
                if (context.getPackageManager().getPackageInfo(str, 0) != null) {
                    return true;
                }
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static int dipToPX(Context context, float f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Float.valueOf(f)}, null, changeQuickRedirect, true, 21);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        if (context == null) {
            return 0;
        }
        return (int) TypedValue.applyDimension(1, f, context.getResources().getDisplayMetrics());
    }

    public static void displayToast(Context context, int i) {
        if (PatchProxy.proxy(new Object[]{context, Integer.valueOf(i)}, null, changeQuickRedirect, true, 2).isSupported || context == null) {
            return;
        }
        displayToast(context, context.getString(i));
    }

    public static int sp2px(Context context, float f) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Float.valueOf(f)}, null, changeQuickRedirect, true, 22);
        if (proxy.isSupported) {
            return ((Integer) proxy.result).intValue();
        }
        return (int) ((f * context.getApplicationContext().getResources().getDisplayMetrics().scaledDensity) + 0.5d);
    }

    public static Boolean writeFile(String str, String str2) {
        MethodCollector.m14708i(441);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str, str2}, null, changeQuickRedirect, true, 42);
        if (proxy.isSupported) {
            Boolean bool = (Boolean) proxy.result;
            MethodCollector.m14707o(441);
            return bool;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(str);
            fileOutputStream.write(str2.getBytes());
            fileOutputStream.close();
            Boolean bool2 = Boolean.TRUE;
            MethodCollector.m14707o(441);
            return bool2;
        } catch (Exception unused) {
            Boolean bool3 = Boolean.FALSE;
            MethodCollector.m14707o(441);
            return bool3;
        }
    }

    public static void displayToast(Context context, String str) {
        if (!PatchProxy.proxy(new Object[]{context, str}, null, changeQuickRedirect, true, 3).isSupported && context != null && !TextUtils.isEmpty(str)) {
            displayToastInternal(context, str, 0, 17, 0, 0);
        }
    }

    public static Bitmap getRoundCornerImage(Bitmap bitmap, int i, HalfType halfType) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{bitmap, Integer.valueOf(i), halfType}, null, changeQuickRedirect, true, 61);
        if (proxy.isSupported) {
            return (Bitmap) proxy.result;
        }
        if (i <= 0) {
            return bitmap;
        }
        if (bitmap != null) {
            int width = bitmap.getWidth();
            int height = bitmap.getHeight();
            try {
                Bitmap LIZ = C116971W2r.LIZ(width, height, Bitmap.Config.ARGB_8888);
                Canvas canvas = new Canvas(LIZ);
                Paint paint = new Paint();
                Rect rect = new Rect(0, 0, width, height);
                RectF rectF = new RectF(rect);
                paint.setAntiAlias(true);
                float f = i;
                canvas.drawRoundRect(rectF, f, f, paint);
                paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
                canvas.drawBitmap(bitmap, (Rect) null, rect, paint);
                int i2 = C136954cZR.LIZ[halfType.ordinal()];
                if (i2 != 1) {
                    if (i2 != 2) {
                        return LIZ;
                    }
                    int i3 = height - i;
                    return C116971W2r.LIZ(LIZ, 0, i3, width, i3);
                }
                return C116971W2r.LIZ(LIZ, 0, 0, width, height - i);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return null;
    }

    public static void displayToast(Context context, String str, int i) {
        if (!PatchProxy.proxy(new Object[]{context, str, Integer.valueOf(i)}, null, changeQuickRedirect, true, 4).isSupported && context != null && !TextUtils.isEmpty(str)) {
            displayToastInternal(context, str, i, 17, 0, 0);
        }
    }

    public static void displayToastInternal(Context context, String str, int i) {
        if (!PatchProxy.proxy(new Object[]{context, str, Integer.valueOf(i)}, null, changeQuickRedirect, true, 32).isSupported && context != null && !TextUtils.isEmpty(str)) {
            if (!isInUIThread()) {
                new Handler(Looper.getMainLooper()).post(new RunnableC137402cgg(i, context, str));
                return;
            }
            AbstractC137059cb9 abstractC137059cb9 = C2118a.LIZ().LJFF;
            if (abstractC137059cb9 != null) {
                abstractC137059cb9.LIZ(context, str, 0);
                return;
            }
            try {
                Toast makeText = Toast.makeText(context, (CharSequence) null, 0);
                if (makeText != null) {
                    if (i != 0) {
                        if (i != 1) {
                            if (i != 2) {
                                if (i == 3 && getScreenWidth(context) <= getScreenHeight(context)) {
                                    makeText.setGravity(49, 0, (getScreenHeight(context) - dipToPX(context, 165.0f)) - getStatusBarHeight(context));
                                } else {
                                    makeText.setGravity(17, 0, 0);
                                }
                            } else {
                                makeText.setGravity(17, 0, 0);
                            }
                        } else {
                            makeText.setGravity(17, 0, 0);
                        }
                    } else {
                        makeText.setGravity(49, 0, (getScreenHeight(context) - dipToPX(context, 235.0f)) - getStatusBarHeight(context));
                    }
                    makeText.setText(str);
                    C116971W2r.LIZIZ(makeText);
                }
            } catch (Exception unused) {
            }
        }
    }

    public static void fadeInOrOutAnimation(View view, boolean z, Activity activity, AbstractC137454chW abstractC137454chW) {
        if (PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0), activity, abstractC137454chW}, null, changeQuickRedirect, true, 29).isSupported) {
            return;
        }
        fadeInOrOutAnimation(view, z, activity, abstractC137454chW, 300);
    }

    public static void rightInAndRightOutAnimation(View view, boolean z, Activity activity, AbstractC137454chW abstractC137454chW) {
        if (!PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0), activity, abstractC137454chW}, null, changeQuickRedirect, true, 28).isSupported && activity != null && view != null) {
            if (z) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationX", getScreenWidth(activity), 0.0f).setDuration(300L);
                duration.start();
                view.setVisibility(0);
                duration.addListener(new C137452chU(abstractC137454chW));
                return;
            }
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationX", 0.0f, getScreenWidth(activity)).setDuration(300L);
            duration2.start();
            duration2.addListener(new C137450chS(view, abstractC137454chW));
        }
    }

    public static void upAndDownAnimation(View view, boolean z, int i, AbstractC137454chW abstractC137454chW) {
        float f;
        if (PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0), Integer.valueOf(i), abstractC137454chW}, null, changeQuickRedirect, true, 27).isSupported || view == null) {
            return;
        }
        view.setVisibility(0);
        float[] fArr = new float[2];
        float f2 = 0.0f;
        if (z) {
            f = i;
        } else {
            f = 0.0f;
        }
        fArr[0] = f;
        if (!z) {
            f2 = i;
        }
        fArr[1] = f2;
        ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationY", fArr).setDuration(300L);
        duration.start();
        duration.addListener(new C137449chR(z, view, abstractC137454chW));
    }

    public static void upAndDownAnimation(View view, boolean z, Activity activity, AbstractC137454chW abstractC137454chW) {
        if (!PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0), activity, abstractC137454chW}, null, changeQuickRedirect, true, 26).isSupported && activity != null && view != null) {
            if (z) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(view, "translationY", getScreenHeight(activity), 0.0f).setDuration(300L);
                duration.start();
                view.setVisibility(0);
                duration.addListener(new C137451chT(abstractC137454chW));
                return;
            }
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "translationY", 0.0f, getScreenHeight(activity)).setDuration(300L);
            duration2.start();
            duration2.addListener(new C137448chQ(view, abstractC137454chW));
        }
    }

    public static void fadeInOrOutAnimation(View view, boolean z, Activity activity, AbstractC137454chW abstractC137454chW, int i) {
        if (!PatchProxy.proxy(new Object[]{view, Byte.valueOf(z ? (byte) 1 : (byte) 0), activity, abstractC137454chW, Integer.valueOf(i)}, null, changeQuickRedirect, true, 30).isSupported && activity != null && view != null) {
            if (z) {
                ObjectAnimator duration = ObjectAnimator.ofFloat(view, "alpha", 0.0f, 1.0f).setDuration(i);
                duration.start();
                view.setVisibility(0);
                duration.addListener(new C137453chV(abstractC137454chW));
                return;
            }
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(view, "alpha", 1.0f, 0.0f).setDuration(i);
            duration2.start();
            duration2.addListener(new C137447chP(view, abstractC137454chW));
        }
    }

    public static Bitmap updateArrowColour(Context context, int i, int i2, int i3, int i4) {
        MethodCollector.m14708i(438);
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, null, changeQuickRedirect, true, 33);
        if (proxy.isSupported) {
            Bitmap bitmap = (Bitmap) proxy.result;
            MethodCollector.m14707o(438);
            return bitmap;
        }
        try {
            Bitmap LIZ = C116971W2r.LIZ(i3, i4, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(LIZ);
            Paint paint = new Paint(1);
            paint.setColor(i2);
            canvas.drawRoundRect(new RectF(0.0f, 0.0f, i3, i4), 0.0f, 0.0f, paint);
            paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
            canvas.drawBitmap(BitmapFactory.decodeResource(context.getResources(), i), 0.0f, 0.0f, paint);
            MethodCollector.m14707o(438);
            return LIZ;
        } catch (Exception unused) {
            MethodCollector.m14707o(438);
            return null;
        }
    }

    public static void addBitmapToAlbum(Context context, Bitmap bitmap, String str, String str2, Bitmap.CompressFormat compressFormat) {
        MethodCollector.m14708i(443);
        if (PatchProxy.proxy(new Object[]{context, bitmap, str, str2, compressFormat}, null, changeQuickRedirect, true, 44).isSupported) {
            MethodCollector.m14707o(443);
        } else if (context == null) {
            MethodCollector.m14707o(443);
        } else {
            ContentValues contentValues = new ContentValues();
            contentValues.put("_display_name", str);
            contentValues.put("mime_type", str2);
            new StringBuilder();
            String m25084C = C0002O.m25084C(C116971W2r.LIZIZ().getPath(), "/", Environment.DIRECTORY_PICTURES, "/QrCodePay");
            if (Build.VERSION.SDK_INT >= 29) {
                new StringBuilder();
                contentValues.put("relative_path", C0002O.m25086C(Environment.DIRECTORY_PICTURES, "/QrCodePay"));
            } else {
                File file = new File(m25084C);
                if (!file.exists()) {
                    file.mkdir();
                }
                new StringBuilder();
                m25084C = C0002O.m25085C(m25084C, "/", str);
                contentValues.put("_data", m25084C);
            }
            Uri LIZ = C116971W2r.LIZ(context.getContentResolver(), MediaStore.Images.Media.EXTERNAL_CONTENT_URI, contentValues);
            if (LIZ != null) {
                try {
                    OutputStream openOutputStream = context.getContentResolver().openOutputStream(LIZ);
                    if (openOutputStream != null) {
                        bitmap.compress(compressFormat, 100, openOutputStream);
                        openOutputStream.close();
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (!TextUtils.isEmpty(m25084C)) {
                MediaScannerConnection.scanFile(context, new String[]{m25084C}, new String[]{"image/jpeg"}, new C137455chX());
            }
            MethodCollector.m14707o(443);
        }
    }

    public static void displayToastInternal(final Context context, final String str, final int i, final int i2, final int i3, final int i4) {
        if (!PatchProxy.proxy(new Object[]{context, str, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)}, null, changeQuickRedirect, true, 5).isSupported && context != null && !TextUtils.isEmpty(str)) {
            if (!isInUIThread()) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.android.ttcjpaysdk.base.utils.CJPayBasicUtils.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(6708);
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        CJPayBasicUtils.displayToastInternal(context, str, i, i2, i3, i4);
                    }
                });
                return;
            }
            AbstractC137059cb9 abstractC137059cb9 = C2118a.LIZ().LJFF;
            if (abstractC137059cb9 != null) {
                abstractC137059cb9.LIZ(context, str, i);
                return;
            }
            try {
                Toast makeText = Toast.makeText(context, str, i);
                if (makeText != null) {
                    makeText.setGravity(i2, i3, i4);
                    C116971W2r.LIZIZ(makeText);
                }
            } catch (Exception unused) {
            }
        }
    }
}
