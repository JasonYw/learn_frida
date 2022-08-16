package com.alipay.sdk.p082m.p121u;

import android.app.Activity;
import android.app.Application;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.ConditionVariable;
import android.os.Looper;
import android.os.Process;
import android.provider.Settings;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.Pair;
import android.view.WindowManager;
import com.alipay.sdk.app.EnvUtils;
import com.alipay.sdk.p082m.p097h.C1280a;
import com.alipay.sdk.p082m.p097h.C1283d;
import com.alipay.sdk.p082m.p097h.C1285f;
import com.alipay.sdk.p082m.p101j.C1294a;
import com.alipay.sdk.p082m.p101j.C1295b;
import com.alipay.sdk.p082m.p101j.EnumC1296c;
import com.alipay.sdk.p082m.p103k.C1301a;
import com.alipay.sdk.p082m.p105l.C1313a;
import com.alipay.sdk.p082m.p107m.C1328a;
import com.alipay.sdk.p082m.p119s.C1376a;
import com.alipay.sdk.p082m.p119s.C1378b;
import com.bytedance.covode.number.Covode;
import com.bytedance.helios.sdk.ActionInvokeEntrance;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.math.BigInteger;
import java.net.URL;
import java.net.URLDecoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.cert.CertificateFactory;
import java.security.cert.X509Certificate;
import java.security.interfaces.RSAPublicKey;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.regex.Matcher;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C116971W2r;

/* renamed from: com.alipay.sdk.m.u.n */
/* loaded from: classes2.dex */
public class C1399n {

    /* renamed from: f */
    public static final int f22430f = 125;

    /* renamed from: e */
    public static final String[] f22429e = {"10.1.5.1013151", "10.1.5.1013148"};

    /* renamed from: g */
    public static final char[] f22431g = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '+', '/'};

    /* renamed from: a */
    public static String m18795a(String str, String str2, String str3) {
        try {
            int indexOf = str3.indexOf(str) + str.length();
            if (indexOf <= str.length()) {
                return "";
            }
            int i = 0;
            if (!TextUtils.isEmpty(str2)) {
                i = str3.indexOf(str2, indexOf);
            }
            if (i <= 0) {
                return str3.substring(indexOf);
            }
            return str3.substring(indexOf, i);
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: b */
    public static String m18788b(Context context) {
        return "-1;-1";
    }

    public static String com_alipay_sdk_m_u_n_android_provider_Settings$Secure_getString(ContentResolver contentResolver, String str) {
        ActionInvokeEntrance.setEventUuid(102004);
        Pair<Boolean, Object> actionIntercept = ActionInvokeEntrance.actionIntercept(Settings.Secure.class, new Object[]{contentResolver, str}, 102004, "java.lang.String", false, null, false);
        if (((Boolean) actionIntercept.first).booleanValue()) {
            return (String) actionIntercept.second;
        }
        String LIZ = C116971W2r.LIZ(contentResolver, str);
        ActionInvokeEntrance.actionInvoke(LIZ, Settings.Secure.class, new Object[]{contentResolver, str}, 102004, "com_alipay_sdk_m_u_n_android_provider_Settings$Secure_getString(Landroid/content/ContentResolver;Ljava/lang/String;)Ljava/lang/String;");
        return LIZ;
    }

    /* renamed from: a */
    public static String m18801a(C1376a c1376a, byte[] bArr) {
        BigInteger modulus;
        try {
            PublicKey publicKey = ((X509Certificate) CertificateFactory.getInstance("X.509").generateCertificate(new ByteArrayInputStream(bArr))).getPublicKey();
            if ((publicKey instanceof RSAPublicKey) && (modulus = ((RSAPublicKey) publicKey).getModulus()) != null) {
                return modulus.toString(16);
            }
            return null;
        } catch (Exception e) {
            C1301a.m19215a(c1376a, "auth", "GetPublicKeyFromSignEx", e);
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m18804a(C1376a c1376a, PackageInfo packageInfo) {
        String m25086C;
        if (packageInfo == null) {
            new StringBuilder();
            m25086C = C0002O.m25086C("", "info == null");
        } else {
            Signature[] signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                new StringBuilder();
                m25086C = C0002O.m25086C("", "info.signatures == null");
            } else if (signatureArr.length > 0) {
                return true;
            } else {
                new StringBuilder();
                m25086C = C0002O.m25086C("", "info.signatures.length <= 0");
            }
        }
        C1301a.m19211b(c1376a, "auth", "NotIncludeSignatures", m25086C);
        return false;
    }

    /* renamed from: a */
    public static boolean m18805a(C1376a c1376a, Context context, List<C1328a.C1330b> list, boolean z) {
        try {
            for (C1328a.C1330b c1330b : list) {
                if (c1330b != null) {
                    String str = c1330b.f22264a;
                    if (EnvUtils.isSandBox() && "com.eg.android.AlipayGphone".equals(str)) {
                        str = "com.eg.android.AlipayGphoneRC";
                    }
                    try {
                        PackageInfo packageInfo = context.getPackageManager().getPackageInfo(str, 128);
                        if (packageInfo != null) {
                            if (!z) {
                                return true;
                            }
                            new StringBuilder();
                            C1301a.m19216a(c1376a, "biz", "PgWltVer", C0002O.m25085C(packageInfo.packageName, "|", packageInfo.versionName));
                            return true;
                        }
                        continue;
                    } catch (PackageManager.NameNotFoundException unused) {
                        continue;
                    }
                }
            }
            return false;
        } catch (Throwable th) {
            C1301a.m19215a(c1376a, "biz", "CheckLaunchAppExistEx", th);
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m18812a(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        try {
            String str = packageInfo.versionName;
            if (!TextUtils.equals(str, f22429e[0])) {
                if (!TextUtils.equals(str, f22429e[1])) {
                    return false;
                }
            }
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static String m18817a(int i) {
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            int nextInt = random.nextInt(3);
            if (nextInt == 0) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 65.0d)));
            } else if (nextInt == 1) {
                sb.append(String.valueOf((char) Math.round((Math.random() * 25.0d) + 97.0d)));
            } else if (nextInt == 2) {
                sb.append(String.valueOf(new Random().nextInt(10)));
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m18802a(C1376a c1376a, String str, Activity activity) {
        String substring;
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        if (activity == null) {
            return false;
        }
        if (!str.toLowerCase().startsWith("alipays://platformapi/startApp?".toLowerCase()) && !str.toLowerCase().startsWith("intent://platformapi/startapp?".toLowerCase())) {
            if (!TextUtils.equals(str, "sdklite://h5quit") && !TextUtils.equals(str, m18797a("http", "://m.alipay.com/?action=h5quit"))) {
                if (!str.startsWith("sdklite://h5quit?result=")) {
                    return false;
                }
                try {
                    String substring2 = str.substring(str.indexOf("sdklite://h5quit?result=") + 24);
                    int parseInt = Integer.parseInt(substring2.substring(substring2.lastIndexOf("&end_code=") + 10));
                    if (parseInt != EnumC1296c.SUCCEEDED.m19230b() && parseInt != EnumC1296c.PAY_WAITTING.m19230b()) {
                        EnumC1296c m19229b = EnumC1296c.m19229b(EnumC1296c.FAILED.m19230b());
                        C1295b.m19239a(C1295b.m19240a(m19229b.m19230b(), m19229b.m19233a(), ""));
                    } else {
                        if (C1313a.f22205w) {
                            new StringBuilder();
                            String decode = URLDecoder.decode(str);
                            String decode2 = URLDecoder.decode(decode);
                            String str2 = decode2.substring(decode2.indexOf("sdklite://h5quit?result=") + 24, decode2.lastIndexOf("&end_code=")).split("&return_url=")[0];
                            int indexOf = decode.indexOf("&return_url=") + 12;
                            substring = C0002O.m25084C(str2, "&return_url=", decode.substring(indexOf, decode.indexOf("&", indexOf)), decode.substring(decode.indexOf("&", indexOf)));
                        } else {
                            String decode3 = URLDecoder.decode(str);
                            substring = decode3.substring(decode3.indexOf("sdklite://h5quit?result=") + 24, decode3.lastIndexOf("&end_code="));
                        }
                        EnumC1296c m19229b2 = EnumC1296c.m19229b(parseInt);
                        C1295b.m19239a(C1295b.m19240a(m19229b2.m19230b(), m19229b2.m19233a(), substring));
                    }
                } catch (Exception unused) {
                    C1295b.m19239a(C1295b.m19234e());
                }
                activity.runOnUiThread(new RunnableC1400a(activity));
                return true;
            }
            C1295b.m19239a(C1295b.m19241a());
            activity.finish();
            return true;
        }
        try {
            C1402c m18806a = m18806a(c1376a, activity, C1294a.f22165d);
            if (m18806a != null && !m18806a.m18759a() && !m18806a.m18758a(c1376a)) {
                if (str.startsWith("intent://platformapi/startapp")) {
                    str = str.replaceFirst("intent://platformapi/startapp\\?", "alipays://platformapi/startApp?");
                }
                C116971W2r.LIZIZ(activity, new Intent("android.intent.action.VIEW", Uri.parse(str)));
            }
        } catch (Throwable unused2) {
        }
        return true;
    }

    /* renamed from: a */
    public static String m18808a(C1376a c1376a, Context context, String str) {
        try {
            return context.getPackageManager().getPackageInfo(str, 128).versionName;
        } catch (Throwable th) {
            C1301a.m19215a(c1376a, "biz", "GetPackageInfoEx", th);
            return "";
        }
    }

    /* renamed from: a */
    public static String m18794a(String str, boolean z) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(str.getBytes());
            byte[] digest = messageDigest.digest();
            if (z && digest.length > 16) {
                byte[] bArr = new byte[16];
                System.arraycopy(digest, 0, bArr, 0, 16);
                return m18791a(bArr);
            }
            return m18791a(digest);
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m18791a(byte[] bArr) {
        StringBuilder sb = new StringBuilder(bArr.length * 2);
        for (byte b : bArr) {
            sb.append(Character.forDigit((b & 240) >> 4, 16));
            sb.append(Character.forDigit(b & 15, 16));
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static String m18810a(C1376a c1376a) {
        return m18780c(c1376a, "ro.build.fingerprint");
    }

    /* renamed from: a */
    public static boolean m18803a(C1376a c1376a, String str) {
        try {
            String host = new URL(str).getHost();
            if (host.endsWith("alipay.com")) {
                return true;
            }
            return host.endsWith("alipay.net");
        } catch (Throwable th) {
            C1301a.m19215a(c1376a, "biz", "ckUrlErr", th);
            return false;
        }
    }

    /* renamed from: a */
    public static JSONObject m18813a(Intent intent) {
        Bundle extras;
        JSONObject jSONObject = new JSONObject();
        if (intent != null && (extras = intent.getExtras()) != null) {
            for (String str : extras.keySet()) {
                try {
                    jSONObject.put(str, String.valueOf(extras.get(str)));
                } catch (Throwable unused) {
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static Map<String, String> m18792a(JSONObject jSONObject) {
        HashMap hashMap = new HashMap();
        if (jSONObject == null) {
            return hashMap;
        }
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            try {
                hashMap.put(next, jSONObject.optString(next));
            } catch (Throwable th) {
                C1385e.m18866a(th);
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public static boolean m18800a(Object obj, Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return obj == null;
        }
        for (Object obj2 : objArr) {
            if (obj == null) {
                if (obj2 == null) {
                    return true;
                }
            } else if (obj.equals(obj2)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m18816a(long j, Runnable runnable, String str) {
        if (runnable == null) {
            return false;
        }
        ConditionVariable conditionVariable = new ConditionVariable();
        Thread thread = new Thread(new RunnableC1401b(runnable, conditionVariable));
        if (!TextUtils.isEmpty(str)) {
            thread.setName(str);
        }
        thread.start();
        try {
            if (j <= 0) {
                conditionVariable.block();
                return true;
            }
            return conditionVariable.block(j);
        } catch (Throwable unused) {
            return true;
        }
    }

    /* renamed from: a */
    public static String m18797a(String str, String str2) {
        new StringBuilder();
        return C0002O.m25086C(str, str2);
    }

    /* renamed from: a */
    public static String m18809a(C1376a c1376a, Context context) {
        try {
            String m18831a = C1395j.m18831a(c1376a, context, "alipay_cashier_ap_fi", "");
            if (!TextUtils.isEmpty(m18831a)) {
                return m18831a;
            }
            try {
                C1395j.m18829b(c1376a, context, "alipay_cashier_ap_fi", C1280a.m19282a("FU", System.currentTimeMillis(), new C1283d(), (short) 0, new C1285f()).m19298a());
                String m18831a2 = C1395j.m18831a(c1376a, context, "alipay_cashier_ap_fi", "");
                if (!TextUtils.isEmpty(m18831a2)) {
                    return m18831a2;
                }
                C1301a.m19211b(c1376a, "biz", "e_regen_empty", "");
                return "";
            } catch (Exception e) {
                C1301a.m19211b(c1376a, "biz", "e_gen", e.getClass().getSimpleName());
                return "";
            }
        } catch (Exception e2) {
            C1301a.m19215a(c1376a, "biz", "e_gen_err", e2);
            return "";
        }
    }

    /* renamed from: a */
    public static void m18796a(String str, String str2, Context context, C1376a c1376a) {
        if (context == null || TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || m18787b(c1376a) || !C1328a.m19107z().m19113t()) {
            return;
        }
        try {
            Intent intent = new Intent("android.app.intent.action.APP_EXCEPTION_OCCUR");
            intent.putExtra("bizType", str);
            intent.putExtra("exName", str2);
            intent.setPackage(context.getPackageName());
            context.sendBroadcast(intent);
            new StringBuilder();
            C1301a.m19216a(c1376a, "biz", "AppNotify", C0002O.m25085C(str, "|", str2));
        } catch (Exception unused) {
        }
    }

    /* renamed from: com.alipay.sdk.m.u.n$a */
    /* loaded from: classes2.dex */
    public static class RunnableC1400a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Activity f22432a;

        static {
            Covode.recordClassIndex(4900);
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f22432a.finish();
        }

        public RunnableC1400a(Activity activity) {
            this.f22432a = activity;
        }
    }

    /* renamed from: com.alipay.sdk.m.u.n$c */
    /* loaded from: classes2.dex */
    public static final class C1402c {

        /* renamed from: a */
        public final PackageInfo f22435a;

        /* renamed from: b */
        public final int f22436b;

        /* renamed from: c */
        public final String f22437c;

        static {
            Covode.recordClassIndex(4902);
        }

        /* renamed from: a */
        public final boolean m18759a() {
            if (this.f22435a.versionCode < this.f22436b) {
                return true;
            }
            return false;
        }

        /* renamed from: a */
        public final boolean m18758a(C1376a c1376a) {
            Signature[] signatureArr = this.f22435a.signatures;
            if (signatureArr == null || signatureArr.length == 0) {
                return false;
            }
            for (Signature signature : signatureArr) {
                String m18801a = C1399n.m18801a(c1376a, signature.toByteArray());
                if (m18801a != null && !TextUtils.equals(m18801a, this.f22437c)) {
                    C1301a.m19211b(c1376a, "biz", "PublicKeyUnmatch", String.format("Got %s, expected %s", m18801a, this.f22437c));
                    return true;
                }
            }
            return false;
        }

        public C1402c(PackageInfo packageInfo, int i, String str) {
            this.f22435a = packageInfo;
            this.f22436b = i;
            this.f22437c = str;
        }
    }

    /* renamed from: f */
    public static String m18770f() {
        return C0002O.m25086C("Android ", Build.VERSION.RELEASE);
    }

    /* renamed from: g */
    public static int m18767g() {
        try {
            return Process.myUid();
        } catch (Throwable th) {
            C1385e.m18866a(th);
            return -200;
        }
    }

    /* renamed from: com.alipay.sdk.m.u.n$b */
    /* loaded from: classes2.dex */
    public static class RunnableC1401b implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ Runnable f22433a;

        /* renamed from: b */
        public final /* synthetic */ ConditionVariable f22434b;

        static {
            Covode.recordClassIndex(4901);
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                this.f22433a.run();
            } finally {
                this.f22434b.open();
            }
        }

        public RunnableC1401b(Runnable runnable, ConditionVariable conditionVariable) {
            this.f22433a = runnable;
            this.f22434b = conditionVariable;
        }
    }

    /* renamed from: b */
    public static String m18790b() {
        if (EnvUtils.isSandBox()) {
            return "com.eg.android.AlipayGphoneRC";
        }
        try {
            return C1294a.f22165d.get(0).f22264a;
        } catch (Throwable unused) {
            return "com.eg.android.AlipayGphone";
        }
    }

    /* renamed from: h */
    public static boolean m18764h() {
        if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static int m18818a() {
        String m18916c = C1378b.m18915d().m18916c();
        if (!TextUtils.isEmpty(m18916c)) {
            String replaceAll = m18916c.replaceAll("=", "");
            if (replaceAll.length() >= 5) {
                replaceAll = replaceAll.substring(0, 5);
            }
            int m18799a = (int) (m18799a(replaceAll) % 10000);
            if (m18799a < 0) {
                return m18799a * (-1);
            }
            return m18799a;
        }
        return -1;
    }

    static {
        Covode.recordClassIndex(4899);
    }

    /* renamed from: c */
    public static int m18782c() {
        try {
            String lowerCase = Build.BRAND.toLowerCase();
            String lowerCase2 = Build.MANUFACTURER.toLowerCase();
            if (m18800a("huawei", lowerCase, lowerCase2)) {
                return 1;
            }
            if (!m18800a("oppo", lowerCase, lowerCase2)) {
                if (m18800a("vivo", lowerCase, lowerCase2)) {
                    return 4;
                }
                if (m18800a("lenovo", lowerCase, lowerCase2)) {
                    return 8;
                }
                if (m18800a("xiaomi", lowerCase, lowerCase2)) {
                    return 16;
                }
                if (m18800a("oneplus", lowerCase, lowerCase2)) {
                    return 32;
                }
                return 0;
            }
            return 2;
        } catch (Exception unused) {
            return 61440;
        }
    }

    /* renamed from: d */
    public static String m18778d() {
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("/proc/version"), 256);
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            Matcher matcher = C116971W2r.LIZJ("\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\((?:[^(]*\\([^)]*\\))?[^)]*\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)").matcher(readLine);
            if (!matcher.matches() || matcher.groupCount() < 4) {
                return "Unavailable";
            }
            return C0002O.m25081C(matcher.group(1), "\n", matcher.group(2), " ", matcher.group(3), "\n", matcher.group(4));
        } catch (IOException unused) {
            return "Unavailable";
        }
    }

    /* renamed from: e */
    public static String m18774e() {
        String m18778d = m18778d();
        int indexOf = m18778d.indexOf(Constants.ACCEPT_TIME_SEPARATOR_SERVER);
        if (indexOf != -1) {
            m18778d = m18778d.substring(0, indexOf);
        }
        int indexOf2 = m18778d.indexOf("\n");
        if (indexOf2 != -1) {
            m18778d = m18778d.substring(0, indexOf2);
        }
        return C0002O.m25086C("Linux ", m18778d);
    }

    /* renamed from: i */
    public static boolean m18761i() {
        try {
            String[] split = C1328a.m19107z().m19126g().split("\\|");
            String str = Build.MODEL;
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            for (String str2 : split) {
                if (TextUtils.equals(str, str2) || TextUtils.equals(str2, "all")) {
                    return true;
                }
            }
            return false;
        } catch (Throwable th) {
            C1385e.m18866a(th);
            return false;
        }
    }

    /* renamed from: a */
    public static long m18799a(String str) {
        return m18798a(str, 6);
    }

    /* renamed from: b */
    public static int m18789b(int i) {
        return i / 100000;
    }

    /* renamed from: g */
    public static String m18765g(String str) {
        return m18794a(str, true);
    }

    /* renamed from: c */
    public static String m18781c(Context context) {
        return context.getResources().getConfiguration().locale.toString();
    }

    /* renamed from: e */
    public static String m18773e(Context context) {
        String m18819b = C1398m.m18819b(context);
        return m18819b.substring(0, m18819b.indexOf("://"));
    }

    /* renamed from: h */
    public static JSONObject m18762h(String str) {
        try {
            return new JSONObject(str);
        } catch (Throwable unused) {
            return new JSONObject();
        }
    }

    /* renamed from: c */
    public static String m18779c(String str) {
        if (EnvUtils.isSandBox() && TextUtils.equals(str, "com.eg.android.AlipayGphoneRC")) {
            return "com.eg.android.AlipayGphoneRC.IAlixPay";
        }
        return "com.eg.android.AlipayGphone.IAlixPay";
    }

    /* renamed from: d */
    public static int m18775d(String str) {
        int i = 0;
        while (!str.equals(String.valueOf(f22431g[i]))) {
            i++;
            if (i >= 64) {
                return 0;
            }
        }
        return i;
    }

    /* renamed from: f */
    public static String m18769f(Context context) {
        DisplayMetrics m18777d = m18777d(context);
        return m18777d.widthPixels + "*" + m18777d.heightPixels;
    }

    /* renamed from: d */
    public static DisplayMetrics m18777d(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        ((WindowManager) context.getApplicationContext().getSystemService("window")).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics;
    }

    /* renamed from: e */
    public static int m18771e(String str) {
        try {
            String m19123j = C1328a.m19107z().m19123j();
            int i = 0;
            if (TextUtils.isEmpty(m19123j)) {
                return 0;
            }
            if (m18783b(m19123j, "").contains(str)) {
                i = 2;
            }
            return i | 1;
        } catch (Throwable unused) {
            return 61440;
        }
    }

    /* renamed from: f */
    public static boolean m18768f(String str) {
        return C116971W2r.LIZJ("^http(s)?://([a-z0-9_\\-]+\\.)*(alipaydev|alipay|taobao)\\.(com|net)(:\\d+)?(/.*)?$").matcher(str).matches();
    }

    /* renamed from: g */
    public static String m18766g(Context context) {
        return C0002O.m25080C(" (", m18770f(), ";", m18774e(), ";", m18781c(context), ";;", m18769f(context), ")(sdk android)");
    }

    /* renamed from: h */
    public static boolean m18763h(Context context) {
        try {
            if (context.getPackageManager().getPackageInfo("com.alipay.android.app", 128) == null) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: i */
    public static String m18760i(String str) {
        try {
            Uri parse = Uri.parse(str);
            return String.format("%s%s", parse.getAuthority(), parse.getPath());
        } catch (Throwable th) {
            C1385e.m18866a(th);
            return Constants.ACCEPT_TIME_SEPARATOR_SERVER;
        }
    }

    /* renamed from: a */
    public static ActivityInfo m18815a(Context context) {
        ActivityInfo[] activityInfoArr;
        if (context instanceof Activity) {
            try {
                Activity activity = (Activity) context;
                for (ActivityInfo activityInfo : context.getPackageManager().getPackageInfo(context.getPackageName(), 1).activities) {
                    if (TextUtils.equals(activityInfo.name, activity.getClass().getName())) {
                        return activityInfo;
                    }
                }
                return null;
            } catch (Throwable th) {
                C1385e.m18866a(th);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Map<String, String> m18784b(String str) {
        String[] split;
        HashMap hashMap = new HashMap();
        for (String str2 : str.split("&")) {
            int indexOf = str2.indexOf("=", 1);
            if (-1 != indexOf) {
                hashMap.put(str2.substring(0, indexOf), URLDecoder.decode(str2.substring(indexOf + 1)));
            }
        }
        return hashMap;
    }

    /* renamed from: b */
    public static boolean m18787b(C1376a c1376a) {
        if (c1376a != null && !TextUtils.isEmpty(c1376a.f22370g)) {
            return c1376a.f22370g.toLowerCase().contains("auth");
        }
        return false;
    }

    /* renamed from: a */
    public static <T> T m18793a(WeakReference<T> weakReference) {
        if (weakReference == null) {
            return null;
        }
        return weakReference.get();
    }

    /* renamed from: a */
    public static PackageInfo m18814a(Context context, String str) {
        return context.getPackageManager().getPackageInfo(str, 192);
    }

    /* renamed from: b */
    public static String m18786b(C1376a c1376a, Context context) {
        return m18808a(c1376a, context, context.getPackageName());
    }

    /* renamed from: e */
    public static String m18772e(C1376a c1376a, String str) {
        try {
            return URLDecoder.decode(str, "utf-8");
        } catch (UnsupportedEncodingException e) {
            C1301a.m19215a(c1376a, "biz", "H5PayDataAnalysisError", e);
            return "";
        }
    }

    /* renamed from: b */
    public static String m18783b(String str, String str2) {
        String com_alipay_sdk_m_u_n_android_provider_Settings$Secure_getString = com_alipay_sdk_m_u_n_android_provider_Settings$Secure_getString(((Application) C1378b.m18915d().m18917b()).getContentResolver(), str);
        if (com_alipay_sdk_m_u_n_android_provider_Settings$Secure_getString == null) {
            return str2;
        }
        return com_alipay_sdk_m_u_n_android_provider_Settings$Secure_getString;
    }

    /* renamed from: c */
    public static String m18780c(C1376a c1376a, String str) {
        try {
            return (String) C116971W2r.LIZ("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e) {
            C1301a.m19211b(c1376a, "biz", "rflex", e.getClass().getSimpleName());
            return null;
        }
    }

    /* renamed from: a */
    public static long m18798a(String str, int i) {
        int i2;
        int pow = (int) Math.pow(2.0d, i);
        int length = str.length();
        long j = 0;
        int i3 = length;
        for (int i4 = 0; i4 < length; i4++) {
            j += Integer.parseInt(String.valueOf(m18775d(str.substring(i4, i2)))) * ((long) Math.pow(pow, i3 - 1));
            i3--;
        }
        return j;
    }

    /* renamed from: b */
    public static Map<String, String> m18785b(C1376a c1376a, String str) {
        String[] split;
        HashMap hashMap = new HashMap(4);
        int indexOf = str.indexOf(63);
        if (indexOf != -1 && indexOf < str.length() - 1) {
            for (String str2 : str.substring(indexOf + 1).split("&")) {
                int indexOf2 = str2.indexOf(61, 1);
                if (indexOf2 != -1 && indexOf2 < str2.length() - 1) {
                    hashMap.put(str2.substring(0, indexOf2), m18772e(c1376a, str2.substring(indexOf2 + 1)));
                }
            }
        }
        return hashMap;
    }

    /* renamed from: d */
    public static boolean m18776d(C1376a c1376a, String str) {
        try {
            int m18771e = m18771e(str);
            StringBuilder sb = new StringBuilder();
            sb.append(m18771e);
            C1301a.m19216a(c1376a, "biz", "bindExt", sb.toString());
            if (C1328a.m19107z().m19118o()) {
                if ((m18771e & 2) == 2) {
                    return true;
                }
            }
        } catch (Throwable unused) {
        }
        return false;
    }

    /* renamed from: a */
    public static C1402c m18811a(PackageInfo packageInfo, int i, String str) {
        if (packageInfo == null) {
            return null;
        }
        return new C1402c(packageInfo, i, str);
    }

    /* renamed from: a */
    public static C1402c m18806a(C1376a c1376a, Context context, List<C1328a.C1330b> list) {
        C1402c m18807a;
        if (list == null) {
            return null;
        }
        for (C1328a.C1330b c1330b : list) {
            if (c1330b != null && (m18807a = m18807a(c1376a, context, c1330b.f22264a, c1330b.f22265b, c1330b.f22266c)) != null && !m18807a.m18758a(c1376a) && !m18807a.m18759a()) {
                return m18807a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C1402c m18807a(C1376a c1376a, Context context, String str, int i, String str2) {
        PackageInfo packageInfo;
        if (EnvUtils.isSandBox() && "com.eg.android.AlipayGphone".equals(str)) {
            str = "com.eg.android.AlipayGphoneRC";
        }
        try {
            packageInfo = m18814a(context, str);
        } catch (Throwable th) {
            C1301a.m19211b(c1376a, "auth", "GetPackageInfoEx", th.getMessage());
            packageInfo = null;
        }
        if (!m18804a(c1376a, packageInfo)) {
            return null;
        }
        return m18811a(packageInfo, i, str2);
    }
}
