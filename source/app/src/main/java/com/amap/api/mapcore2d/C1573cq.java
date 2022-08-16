package com.amap.api.mapcore2d;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Locale;
import p003X.C116971W2r;

/* renamed from: com.amap.api.mapcore2d.cq */
/* loaded from: classes19.dex */
public class C1573cq {

    /* renamed from: a */
    public static String f23173a;

    /* renamed from: b */
    public static boolean f23174b;

    /* renamed from: c */
    public static String f23175c = "";

    /* renamed from: d */
    public static String f23176d = "";

    /* renamed from: e */
    public static String f23177e = "";

    /* renamed from: f */
    public static String f23178f = "";

    static {
        Covode.recordClassIndex(5121);
    }

    /* renamed from: a */
    public static boolean m18126a() {
        if (f23174b) {
            return true;
        }
        if (m18122b(f23173a)) {
            f23174b = true;
            return true;
        } else if (!TextUtils.isEmpty(f23173a)) {
            f23174b = false;
            f23173a = null;
            return false;
        } else if (m18122b(f23176d)) {
            f23174b = true;
            return true;
        } else {
            if (!TextUtils.isEmpty(f23176d)) {
                f23174b = false;
                f23176d = null;
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static String m18125a(Context context) {
        try {
            return m18116h(context);
        } catch (Throwable unused) {
            return f23178f;
        }
    }

    /* renamed from: a */
    public static void m18124a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f23178f = str;
    }

    /* renamed from: f */
    public static String m18118f(Context context) {
        try {
            return m18116h(context);
        } catch (Throwable th) {
            C1612dl.m17891a(th, "AI", "gKy");
            return f23178f;
        }
    }

    /* renamed from: b */
    public static String m18123b(Context context) {
        try {
        } catch (Throwable th) {
            C1612dl.m17891a(th, "AI", "gAN");
        }
        if (!"".equals(f23175c)) {
            return f23175c;
        }
        PackageManager packageManager = context.getPackageManager();
        f23175c = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
        return f23175c;
    }

    /* renamed from: c */
    public static String m18121c(Context context) {
        try {
        } catch (Throwable th) {
            C1612dl.m17891a(th, "AI", "gpck");
        }
        if (f23176d != null && !"".equals(f23176d)) {
            return f23176d;
        }
        String packageName = context.getPackageName();
        f23176d = packageName;
        if (!m18122b(packageName)) {
            f23176d = context.getPackageName();
        }
        return f23176d;
    }

    /* renamed from: d */
    public static String m18120d(Context context) {
        try {
        } catch (Throwable th) {
            C1612dl.m17891a(th, "AI", "gAV");
        }
        if (!"".equals(f23177e)) {
            return f23177e;
        }
        f23177e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        String str = f23177e;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: h */
    public static String m18116h(Context context) {
        String str = f23178f;
        if (str == null || str.equals("")) {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                String string = applicationInfo.metaData.getString("com.amap.api.v2.apikey");
                f23178f = string;
                if (string == null) {
                    f23178f = m18117g(context);
                }
            } else {
                return f23178f;
            }
        }
        return f23178f;
    }

    /* renamed from: b */
    public static boolean m18122b(String str) {
        char[] charArray;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.toCharArray();
        for (char c : str.toCharArray()) {
            if (('A' > c || c > 'z') && (('0' > c || c > ':') && c != '.')) {
                try {
                    C1616do.m17869b(C1602db.m17950a(), str, "errorPackage");
                } catch (Throwable unused) {
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static String m18119e(Context context) {
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
            byte[] digest = MessageDigest.getInstance("SHA1").digest(packageInfo.signatures[0].toByteArray());
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                String upperCase = Integer.toHexString(b & 255).toUpperCase(Locale.US);
                if (upperCase.length() == 1) {
                    stringBuffer.append("0");
                }
                stringBuffer.append(upperCase);
                stringBuffer.append(Constants.COLON_SEPARATOR);
            }
            String str = packageInfo.packageName;
            if (m18122b(str)) {
                str = packageInfo.packageName;
            }
            if (!TextUtils.isEmpty(f23176d)) {
                str = m18121c(context);
            }
            stringBuffer.append(str);
            String stringBuffer2 = stringBuffer.toString();
            f23173a = stringBuffer2;
            return stringBuffer2;
        } catch (Throwable th) {
            C1612dl.m17891a(th, "AI", "gsp");
            return f23173a;
        }
    }

    /* renamed from: g */
    public static String m18117g(Context context) {
        FileInputStream fileInputStream;
        File file = new File(C1613dm.m17881c(context, "k.store"));
        if (!file.exists()) {
            return "";
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                String m17936a = C1602db.m17936a(bArr);
                if (m17936a.length() != 32) {
                    m17936a = "";
                }
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                return m17936a;
            } catch (Throwable th) {
                th = th;
                try {
                    C1612dl.m17891a(th, "AI", "gKe");
                    try {
                        if (file.exists()) {
                            C116971W2r.LIZ(file);
                        }
                    } catch (Throwable unused2) {
                    }
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused3) {
                        }
                    }
                    return "";
                } catch (Throwable th2) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }
}
