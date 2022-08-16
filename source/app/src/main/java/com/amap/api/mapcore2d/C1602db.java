package com.amap.api.mapcore2d;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import androidx.core.view.MotionEventCompat;
import com.amap.api.mapcore2d.C1599da;
import com.bytedance.covode.number.Covode;
import com.umeng.commonsdk.internal.C33838c;
import com.umeng.message.proguard.C34037f;
import com.xiaomi.mipush.sdk.Constants;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.spec.X509EncodedKeySpec;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.zip.GZIPOutputStream;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;
import org.json.JSONObject;
import p002O.C0002O;

/* renamed from: com.amap.api.mapcore2d.db */
/* loaded from: classes19.dex */
public class C1602db {

    /* renamed from: a */
    public static String f23332a;

    /* renamed from: b */
    public static final String[] f23333b = {"arm64-v8a", "x86_64"};

    /* renamed from: c */
    public static final String[] f23334c = {"arm", "x86"};

    /* renamed from: g */
    public static void m17921g(String str) {
    }

    /* renamed from: a */
    public static boolean m17946a(Context context, String str) {
        if (context != null && context.checkCallingOrSelfPermission(str) == 0) {
            if (Build.VERSION.SDK_INT >= 23 && context.getApplicationInfo().targetSdkVersion >= 23) {
                try {
                    if (((Integer) context.getClass().getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() != 0) {
                        return false;
                    }
                } catch (Throwable unused) {
                }
            }
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m17942a(ByteArrayOutputStream byteArrayOutputStream, String str) {
        if (TextUtils.isEmpty(str)) {
            try {
                byteArrayOutputStream.write(new byte[]{0});
                return;
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
        int length = str.length();
        if (length > 255) {
            length = MotionEventCompat.ACTION_MASK;
        }
        m17943a(byteArrayOutputStream, (byte) length, m17940a(str));
    }

    /* renamed from: a */
    public static byte[] m17940a(String str) {
        if (TextUtils.isEmpty(str)) {
            return new byte[0];
        }
        try {
            return str.getBytes(C34037f.f43302f);
        } catch (UnsupportedEncodingException unused) {
            return str.getBytes();
        }
    }

    /* renamed from: a */
    public static void m17943a(ByteArrayOutputStream byteArrayOutputStream, byte b, byte[] bArr) {
        try {
            byteArrayOutputStream.write(new byte[]{b});
            int i = b & 255;
            if (i < 255) {
                if (i <= 0) {
                    return;
                }
                byteArrayOutputStream.write(bArr);
            } else if (i != 255) {
            } else {
                byteArrayOutputStream.write(bArr, 0, MotionEventCompat.ACTION_MASK);
            }
        } catch (IOException e) {
            C1612dl.m17891a(e, "ut", "wFie");
        }
    }

    /* renamed from: a */
    public static boolean m17937a(JSONObject jSONObject, String str) {
        return jSONObject != null && jSONObject.has(str);
    }

    /* renamed from: a */
    public static void m17945a(Context context, String str, String str2, JSONObject jSONObject) {
        String str3;
        String str4;
        String str5 = "";
        String m18119e = C1573cq.m18119e(context);
        String m17990b = C1594cx.m17990b(m18119e);
        String m18125a = C1573cq.m18125a(context);
        try {
            if (jSONObject.has(C33838c.f42636f)) {
                str4 = jSONObject.getString(C33838c.f42636f);
                str3 = C0002O.m25085C("请在高德开放平台官网中搜索\"", str4, "\"相关内容进行解决");
            } else {
                str4 = str5;
                str3 = str4;
            }
            try {
                if ("INVALID_USER_SCODE".equals(str4)) {
                    String string = jSONObject.has("sec_code") ? jSONObject.getString("sec_code") : str5;
                    if (jSONObject.has("sec_code_debug")) {
                        str5 = jSONObject.getString("sec_code_debug");
                    }
                    if (m17990b.equals(string) || m17990b.equals(str5)) {
                        str3 = "请在高德开放平台官网中搜索\"请求内容过长导致业务调用失败\"相关内容进行解决";
                    }
                } else if ("INVALID_USER_KEY".equals(str4)) {
                    if (jSONObject.has("key")) {
                        str5 = jSONObject.getString("key");
                    }
                    if (str5.length() > 0 && !m18125a.equals(str5)) {
                        str3 = "请在高德开放平台官网上发起技术咨询工单—>账号与Key问题，咨询INVALID_USER_KEY如何解决";
                    }
                }
            } catch (Throwable unused) {
            }
        } catch (Throwable unused2) {
            str3 = str5;
        }
        m17921g(f23332a);
        m17921g("                                   鉴权错误信息                                  ");
        m17921g(f23332a);
        m17923f(C0002O.m25086C("SHA1Package:", m18119e));
        m17923f(C0002O.m25086C("key:", m18125a));
        m17923f(C0002O.m25086C("csid:", str));
        m17923f(C0002O.m25086C("gsid:", str2));
        m17923f(C0002O.m25086C("json:", jSONObject.toString()));
        m17921g("                                                                               ");
        m17921g(str3);
        m17921g(f23332a);
    }

    /* renamed from: a */
    public static C1599da m17950a() {
        C1599da.C1601a c1601a = new C1599da.C1601a("collection", "1.0", "AMap_collection_1.0");
        c1601a.m17957a(new String[]{"com.amap.api.collection"});
        return c1601a.m17960a();
    }

    /* renamed from: b */
    public static C1599da m17935b() {
        C1599da.C1601a c1601a = new C1599da.C1601a("co", "1.0.0", "AMap_co_1.0.0");
        c1601a.m17957a(new String[]{"com.amap.co", "com.amap.opensdk.co", "com.amap.location"});
        return c1601a.m17960a();
    }

    static {
        Covode.recordClassIndex(5150);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        do {
            sb.append("=");
            i++;
        } while (i < 80);
        f23332a = sb.toString();
    }

    /* renamed from: d */
    public static PublicKey m17928d() {
        ByteArrayInputStream byteArrayInputStream;
        try {
            byteArrayInputStream = new ByteArrayInputStream(C1589cv.m18021b("MIICnjCCAgegAwIBAgIJAJ0Pdzos7ZfYMA0GCSqGSIb3DQEBBQUAMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjAeFw0xMzA4MTUwNzU2NTVaFw0yMzA4MTMwNzU2NTVaMGgxCzAJBgNVBAYTAkNOMRMwEQYDVQQIDApTb21lLVN0YXRlMRAwDgYDVQQHDAdCZWlqaW5nMREwDwYDVQQKDAhBdXRvbmF2aTEfMB0GA1UEAwwWY29tLmF1dG9uYXZpLmFwaXNlcnZlcjCBnzANBgkqhkiG9w0BAQEFAAOBjQAwgYkCgYEA8eWAyHbFPoFPfdx5AD+D4nYFq4dbJ1p7SIKt19Oz1oivF/6H43v5Fo7s50pD1UF8+Qu4JoUQxlAgOt8OCyQ8DYdkaeB74XKb1wxkIYg/foUwN1CMHPZ9O9ehgna6K4EJXZxR7Y7XVZnbjHZIVn3VpPU/Rdr2v37LjTw+qrABJxMCAwEAAaNQME4wHQYDVR0OBBYEFOM/MLGP8xpVFuVd+3qZkw7uBvOTMB8GA1UdIwQYMBaAFOM/MLGP8xpVFuVd+3qZkw7uBvOTMAwGA1UdEwQFMAMBAf8wDQYJKoZIhvcNAQEFBQADgYEA4LY3g8aAD8JkxAOqUXDDyLuCCGOc2pTIhn0TwMNaVdH4hZlpTeC/wuRD5LJ0z3j+IQ0vLvuQA5uDjVyEOlBrvVIGwSem/1XGUo13DfzgAJ5k1161S5l+sFUo5TxpHOXr8Z5nqJMjieXmhnE/I99GFyHpQmw4cC6rhYUhdhtg+Zk="));
        } catch (Throwable unused) {
            byteArrayInputStream = null;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            KeyFactory keyFactory = KeyFactory.getInstance("RSA");
            Certificate generateCertificate = certificateFactory.generateCertificate(byteArrayInputStream);
            if (generateCertificate != null && keyFactory != null) {
                PublicKey generatePublic = keyFactory.generatePublic(new X509EncodedKeySpec(generateCertificate.getPublicKey().getEncoded()));
                try {
                    byteArrayInputStream.close();
                } catch (Throwable unused2) {
                }
                return generatePublic;
            }
            try {
                byteArrayInputStream.close();
            } catch (Throwable unused3) {
            }
            return null;
        } catch (Throwable unused4) {
            if (byteArrayInputStream != null) {
                try {
                    byteArrayInputStream.close();
                } catch (Throwable unused5) {
                }
            }
            return null;
        }
    }

    /* renamed from: c */
    public static byte[] m17931c() {
        try {
            StringBuffer stringBuffer = new StringBuffer("16,16,18,77,15,911,121,77,121,911,38,77,911,99,86,67,611,96,48,77,84,911,38,67,021,301,86,67,611,98,48,77,511,77,48,97,511,58,48,97,511,84,501,87,511,96,48,77,221,911,38,77,121,37,86,67,25,301,86,67,021,96,86,67,021,701,86,67,35,56,86,67,611,37,221,87");
            stringBuffer.reverse();
            String[] split = stringBuffer.toString().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            byte[] bArr = new byte[split.length];
            for (int i = 0; i < split.length; i++) {
                bArr[i] = Byte.parseByte(split[i]);
            }
            StringBuffer stringBuffer2 = new StringBuffer(new String(C1589cv.m18021b(new String(bArr))));
            stringBuffer2.reverse();
            String[] split2 = stringBuffer2.toString().split(Constants.ACCEPT_TIME_SEPARATOR_SP);
            byte[] bArr2 = new byte[split2.length];
            for (int i2 = 0; i2 < split2.length; i2++) {
                bArr2[i2] = Byte.parseByte(split2[i2]);
            }
            return bArr2;
        } catch (Throwable th) {
            C1612dl.m17891a(th, "ut", "gIV");
            return new byte[16];
        }
    }

    /* renamed from: f */
    public static String m17922f(byte[] bArr) {
        try {
            return m17920g(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static boolean m17934b(Context context) {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: d */
    public static byte[] m17926d(byte[] bArr) {
        try {
            return m17919h(bArr);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    /* renamed from: e */
    public static String m17924e(byte[] bArr) {
        try {
            return m17920g(bArr);
        } catch (Throwable th) {
            C1612dl.m17891a(th, "ut", "h2s");
            return null;
        }
    }

    /* renamed from: c */
    public static String m17930c(String str) {
        if (str.length() < 2) {
            return "";
        }
        return C1589cv.m18026a(str.substring(1));
    }

    /* renamed from: a */
    public static String m17949a(long j) {
        try {
            return new SimpleDateFormat("yyyyMMdd HH:mm:ss:SSS", Locale.CHINA).format(new Date(j));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static String m17933b(String str) {
        if (str == null) {
            return null;
        }
        String m18017c = C1589cv.m18017c(m17940a(str));
        try {
            return ((char) ((m18017c.length() % 26) + 65)) + m18017c;
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: e */
    public static byte[] m17925e(String str) {
        if (str.length() % 2 != 0) {
            str = C0002O.m25086C("0", str);
        }
        byte[] bArr = new byte[str.length() / 2];
        for (int i = 0; i < bArr.length; i++) {
            int i2 = i * 2;
            bArr[i] = (byte) Integer.parseInt(str.substring(i2, i2 + 2), 16);
        }
        return bArr;
    }

    /* renamed from: g */
    public static String m17920g(byte[] bArr) {
        StringBuilder sb = new StringBuilder();
        if (bArr == null) {
            return null;
        }
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            if (hexString.length() == 1) {
                hexString = "0" + hexString;
            }
            sb.append(hexString);
        }
        return sb.toString();
    }

    /* renamed from: h */
    public static byte[] m17919h(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        GZIPOutputStream gZIPOutputStream = null;
        if (bArr == null) {
            return null;
        }
        try {
            byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                GZIPOutputStream gZIPOutputStream2 = new GZIPOutputStream(byteArrayOutputStream);
                try {
                    gZIPOutputStream2.write(bArr);
                    gZIPOutputStream2.finish();
                    byte[] byteArray = byteArrayOutputStream.toByteArray();
                    gZIPOutputStream2.close();
                    byteArrayOutputStream.close();
                    return byteArray;
                } catch (Throwable th) {
                    th = th;
                    gZIPOutputStream = gZIPOutputStream2;
                    try {
                        throw th;
                    } catch (Throwable th2) {
                        if (gZIPOutputStream != null) {
                            gZIPOutputStream.close();
                        }
                        if (byteArrayOutputStream != null) {
                            byteArrayOutputStream.close();
                            throw th2;
                        }
                        throw th2;
                    }
                }
            } catch (Throwable th3) {
                th = th3;
            }
        } catch (Throwable th4) {
            th = th4;
            byteArrayOutputStream = null;
        }
    }

    /* renamed from: b */
    public static byte[] m17932b(byte[] bArr) {
        try {
            return m17919h(bArr);
        } catch (Throwable th) {
            C1612dl.m17891a(th, "ut", "gZp");
            return new byte[0];
        }
    }

    /* renamed from: d */
    public static String m17927d(String str) {
        try {
        } catch (Throwable th) {
            C1612dl.m17891a(th, "ut", "sPa");
        }
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        String[] split = str.split("&");
        Arrays.sort(split);
        StringBuffer stringBuffer = new StringBuffer();
        for (String str2 : split) {
            stringBuffer.append(str2);
            stringBuffer.append("&");
        }
        String stringBuffer2 = stringBuffer.toString();
        if (stringBuffer2.length() > 1) {
            return (String) stringBuffer2.subSequence(0, stringBuffer2.length() - 1);
        }
        return str;
    }

    /* renamed from: f */
    public static void m17923f(String str) {
        int i;
        while (true) {
            if (str.length() < 78) {
                break;
            }
            String substring = str.substring(0, 78);
            m17921g("|" + substring + "|");
            str = str.substring(78);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("|");
        sb.append(str);
        for (i = 0; i < 78 - str.length(); i++) {
            sb.append(" ");
        }
        sb.append("|");
        m17921g(sb.toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:11:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0037 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x00a5  */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.String m17947a(android.content.Context r7) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 1
            java.lang.String r3 = "ut"
            r4 = 28
            r0 = 21
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 >= r4) goto L31
            android.content.pm.ApplicationInfo r2 = r7.getApplicationInfo()     // Catch: java.lang.Throwable -> L2b
            java.lang.Class<android.content.pm.ApplicationInfo> r0 = android.content.pm.ApplicationInfo.class
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L2b
            java.lang.Class r1 = p003X.C116971W2r.LIZ(r0)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r0 = "primaryCpuAbi"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L2b
            r0.setAccessible(r6)     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r2 = r0.get(r2)     // Catch: java.lang.Throwable -> L2b
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> L2b
            goto L33
        L2b:
            r1 = move-exception
            java.lang.String r0 = "gct"
            com.amap.api.mapcore2d.C1612dl.m17891a(r1, r3, r0)
        L31:
            java.lang.String r2 = ""
        L33:
            int r0 = android.os.Build.VERSION.SDK_INT
            if (r0 < r4) goto L9f
            java.lang.Class<android.os.Build> r1 = android.os.Build.class
            java.lang.String r0 = "SUPPORTED_ABIS"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L99
            r4 = 0
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L99
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> L99
            r5 = 0
            if (r1 == 0) goto L4e
            int r0 = r1.length     // Catch: java.lang.Throwable -> L99
            if (r0 <= 0) goto L4e
            r2 = r1[r5]     // Catch: java.lang.Throwable -> L99
        L4e:
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L9f
            java.lang.String[] r0 = com.amap.api.mapcore2d.C1602db.f23333b     // Catch: java.lang.Throwable -> L99
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L99
            boolean r0 = r0.contains(r2)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L9f
            android.content.pm.ApplicationInfo r0 = r7.getApplicationInfo()     // Catch: java.lang.Throwable -> L99
            java.lang.String r1 = r0.nativeLibraryDir     // Catch: java.lang.Throwable -> L99
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L99
            if (r0 != 0) goto L9f
            java.lang.String r0 = java.io.File.separator     // Catch: java.lang.Throwable -> L99
            int r0 = r1.lastIndexOf(r0)     // Catch: java.lang.Throwable -> L99
            int r0 = r0 + r6
            java.lang.String r1 = r1.substring(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.String[] r0 = com.amap.api.mapcore2d.C1602db.f23334c     // Catch: java.lang.Throwable -> L99
            java.util.List r0 = java.util.Arrays.asList(r0)     // Catch: java.lang.Throwable -> L99
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L99
            if (r0 == 0) goto L9f
            java.lang.Class<android.os.Build> r1 = android.os.Build.class
            java.lang.String r0 = "SUPPORTED_32_BIT_ABIS"
            java.lang.reflect.Field r0 = r1.getDeclaredField(r0)     // Catch: java.lang.Throwable -> L99
            java.lang.Object r1 = r0.get(r4)     // Catch: java.lang.Throwable -> L99
            java.lang.String[] r1 = (java.lang.String[]) r1     // Catch: java.lang.Throwable -> L99
            if (r1 == 0) goto L9f
            int r0 = r1.length     // Catch: java.lang.Throwable -> L99
            if (r0 <= 0) goto L9f
            r2 = r1[r5]     // Catch: java.lang.Throwable -> L99
            goto L9f
        L99:
            r1 = move-exception
            java.lang.String r0 = "gct_p"
            com.amap.api.mapcore2d.C1612dl.m17891a(r1, r3, r0)
        L9f:
            boolean r0 = android.text.TextUtils.isEmpty(r2)
            if (r0 == 0) goto La7
            java.lang.String r2 = android.os.Build.CPU_ABI
        La7:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.amap.api.mapcore2d.C1602db.m17947a(android.content.Context):java.lang.String");
    }

    /* renamed from: c */
    public static byte[] m17929c(byte[] bArr) {
        ByteArrayOutputStream byteArrayOutputStream;
        ZipOutputStream zipOutputStream;
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    try {
                        byteArrayOutputStream = new ByteArrayOutputStream();
                        try {
                            zipOutputStream = new ZipOutputStream(byteArrayOutputStream);
                            try {
                                zipOutputStream.putNextEntry(new ZipEntry("log"));
                                zipOutputStream.write(bArr);
                                zipOutputStream.closeEntry();
                                zipOutputStream.finish();
                                byte[] byteArray = byteArrayOutputStream.toByteArray();
                                try {
                                    zipOutputStream.close();
                                } catch (Throwable th) {
                                    C1612dl.m17891a(th, "ut", "zp1");
                                }
                                byteArrayOutputStream.close();
                                return byteArray;
                            } catch (Throwable th2) {
                                th = th2;
                                try {
                                    C1612dl.m17891a(th, "ut", "zp");
                                    if (zipOutputStream != null) {
                                        try {
                                            zipOutputStream.close();
                                        } catch (Throwable th3) {
                                            C1612dl.m17891a(th3, "ut", "zp1");
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                        byteArrayOutputStream.close();
                                        return null;
                                    }
                                    return null;
                                } catch (Throwable th4) {
                                    if (zipOutputStream != null) {
                                        try {
                                            zipOutputStream.close();
                                        } catch (Throwable th5) {
                                            C1612dl.m17891a(th5, "ut", "zp1");
                                        }
                                    }
                                    if (byteArrayOutputStream != null) {
                                        try {
                                            byteArrayOutputStream.close();
                                            throw th4;
                                        } catch (Throwable th6) {
                                            C1612dl.m17891a(th6, "ut", "zp2");
                                            throw th4;
                                        }
                                    }
                                    throw th4;
                                }
                            }
                        } catch (Throwable th7) {
                            th = th7;
                            zipOutputStream = null;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        byteArrayOutputStream = null;
                        zipOutputStream = null;
                    }
                }
            } catch (Throwable th9) {
                C1612dl.m17891a(th9, "ut", "zp2");
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m17939a(Throwable th) {
        StringWriter stringWriter;
        PrintWriter printWriter;
        try {
            stringWriter = new StringWriter();
            try {
                printWriter = new PrintWriter(stringWriter);
            } catch (Throwable unused) {
                printWriter = null;
            }
        } catch (Throwable unused2) {
            stringWriter = null;
            printWriter = null;
        }
        try {
            th.printStackTrace(printWriter);
            for (Throwable cause = th.getCause(); cause != null; cause = cause.getCause()) {
                cause.printStackTrace(printWriter);
            }
            String obj = stringWriter.toString();
            try {
                stringWriter.close();
            } catch (Throwable unused3) {
            }
            try {
                printWriter.close();
            } catch (Throwable unused4) {
            }
            return obj;
        } catch (Throwable unused5) {
            if (stringWriter != null) {
                try {
                    stringWriter.close();
                } catch (Throwable unused6) {
                }
            }
            if (printWriter != null) {
                try {
                    printWriter.close();
                } catch (Throwable unused7) {
                }
            }
            return null;
        }
    }

    /* renamed from: a */
    public static String m17938a(Map<String, String> map) {
        if (map != null && map.size() != 0) {
            StringBuffer stringBuffer = new StringBuffer();
            boolean z = true;
            try {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    if (z) {
                        z = false;
                        stringBuffer.append(entry.getKey());
                        stringBuffer.append("=");
                        stringBuffer.append(entry.getValue());
                    } else {
                        stringBuffer.append("&");
                        stringBuffer.append(entry.getKey());
                        stringBuffer.append("=");
                        stringBuffer.append(entry.getValue());
                    }
                }
            } catch (Throwable th) {
                C1612dl.m17891a(th, "ut", "abP");
            }
            return stringBuffer.toString();
        }
        return null;
    }

    /* renamed from: a */
    public static String m17936a(byte[] bArr) {
        if (bArr != null && bArr.length != 0) {
            try {
                return new String(bArr, C34037f.f43302f);
            } catch (UnsupportedEncodingException unused) {
                return new String(bArr);
            }
        }
        return "";
    }

    /* renamed from: a */
    public static boolean m17944a(Context context, boolean z) {
        return C1625dr.m17825a(context, z);
    }

    /* renamed from: a */
    public static String m17948a(long j, String str) {
        try {
            return new SimpleDateFormat(str, Locale.CHINA).format(new Date(j));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static Method m17941a(Class cls, String str, Class<?>... clsArr) {
        try {
            return cls.getDeclaredMethod(m17930c(str), clsArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}