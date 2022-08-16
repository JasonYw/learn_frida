package com.amap.api.services.p126a;

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

/* renamed from: com.amap.api.services.a.bf */
/* loaded from: classes19.dex */
public class C1864bf {

    /* renamed from: a */
    public static String f24392a;

    /* renamed from: b */
    public static boolean f24393b;

    /* renamed from: c */
    public static String f24394c = "";

    /* renamed from: d */
    public static String f24395d = "";

    /* renamed from: e */
    public static String f24396e = "";

    /* renamed from: f */
    public static String f24397f = "";

    static {
        Covode.recordClassIndex(5475);
    }

    /* renamed from: a */
    public static boolean m16968a() {
        if (f24393b) {
            return true;
        }
        if (m16964b(f24392a)) {
            f24393b = true;
            return true;
        } else if (!TextUtils.isEmpty(f24392a)) {
            f24393b = false;
            f24392a = null;
            return false;
        } else if (m16964b(f24395d)) {
            f24393b = true;
            return true;
        } else {
            if (!TextUtils.isEmpty(f24395d)) {
                f24393b = false;
                f24395d = null;
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static String m16967a(Context context) {
        try {
            return m16958h(context);
        } catch (Throwable unused) {
            return f24397f;
        }
    }

    /* renamed from: a */
    public static void m16966a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f24397f = str;
    }

    /* renamed from: f */
    public static String m16960f(Context context) {
        try {
            return m16958h(context);
        } catch (Throwable th) {
            C1901by.m16742a(th, "AI", "gKy");
            return f24397f;
        }
    }

    /* renamed from: b */
    public static String m16965b(Context context) {
        try {
        } catch (Throwable th) {
            C1901by.m16742a(th, "AI", "gAN");
        }
        if (!"".equals(f24394c)) {
            return f24394c;
        }
        PackageManager packageManager = context.getPackageManager();
        f24394c = (String) packageManager.getApplicationLabel(packageManager.getApplicationInfo(context.getPackageName(), 0));
        return f24394c;
    }

    /* renamed from: c */
    public static String m16963c(Context context) {
        try {
        } catch (Throwable th) {
            C1901by.m16742a(th, "AI", "gpck");
        }
        if (f24395d != null && !"".equals(f24395d)) {
            return f24395d;
        }
        String packageName = context.getPackageName();
        f24395d = packageName;
        if (!m16964b(packageName)) {
            f24395d = context.getPackageName();
        }
        return f24395d;
    }

    /* renamed from: d */
    public static String m16962d(Context context) {
        try {
        } catch (Throwable th) {
            C1901by.m16742a(th, "AI", "gAV");
        }
        if (!"".equals(f24396e)) {
            return f24396e;
        }
        f24396e = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionName;
        String str = f24396e;
        if (str == null) {
            return "";
        }
        return str;
    }

    /* renamed from: h */
    public static String m16958h(Context context) {
        String str = f24397f;
        if (str == null || str.equals("")) {
            ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                String string = applicationInfo.metaData.getString("com.amap.api.v2.apikey");
                f24397f = string;
                if (string == null) {
                    f24397f = m16959g(context);
                }
            } else {
                return f24397f;
            }
        }
        return f24397f;
    }

    /* renamed from: b */
    public static boolean m16964b(String str) {
        char[] charArray;
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        str.toCharArray();
        for (char c : str.toCharArray()) {
            if (('A' > c || c > 'z') && (('0' > c || c > ':') && c != '.')) {
                try {
                    C1906cb.m16719b(C1892bp.m16796a(), str, "errorPackage");
                } catch (Throwable unused) {
                }
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public static String m16961e(Context context) {
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
            if (m16964b(str)) {
                str = packageInfo.packageName;
            }
            if (!TextUtils.isEmpty(f24395d)) {
                str = m16963c(context);
            }
            stringBuffer.append(str);
            String stringBuffer2 = stringBuffer.toString();
            f24392a = stringBuffer2;
            return stringBuffer2;
        } catch (Throwable th) {
            C1901by.m16742a(th, "AI", "gsp");
            return f24392a;
        }
    }

    /* renamed from: g */
    public static String m16959g(Context context) {
        FileInputStream fileInputStream;
        File file = new File(C1902bz.m16733c(context, "k.store"));
        if (!file.exists()) {
            return "";
        }
        try {
            fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[fileInputStream.available()];
                fileInputStream.read(bArr);
                String m16782a = C1892bp.m16782a(bArr);
                if (m16782a.length() != 32) {
                    m16782a = "";
                }
                try {
                    fileInputStream.close();
                } catch (Throwable unused) {
                }
                return m16782a;
            } catch (Throwable th) {
                th = th;
                try {
                    C1901by.m16742a(th, "AI", "gKe");
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
