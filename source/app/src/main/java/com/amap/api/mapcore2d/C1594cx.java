package com.amap.api.mapcore2d;

import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* renamed from: com.amap.api.mapcore2d.cx */
/* loaded from: classes19.dex */
public class C1594cx {
    static {
        Covode.recordClassIndex(5142);
    }

    /* renamed from: b */
    public static byte[] m17989b(byte[] bArr) {
        return m17991a(bArr, "MD5");
    }

    /* renamed from: a */
    public static String m17992a(byte[] bArr) {
        return C1602db.m17924e(m17989b(bArr));
    }

    /* renamed from: b */
    public static String m17990b(String str) {
        if (str == null) {
            return null;
        }
        return C1602db.m17924e(m17987d(str));
    }

    /* renamed from: c */
    public static String m17988c(String str) {
        return C1602db.m17922f(m17986e(str));
    }

    /* renamed from: e */
    public static byte[] m17986e(String str) {
        try {
            return m17985f(str);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    /* renamed from: d */
    public static byte[] m17987d(String str) {
        try {
            return m17985f(str);
        } catch (Throwable th) {
            C1612dl.m17891a(th, "MD5", "gmb");
            return new byte[0];
        }
    }

    /* renamed from: f */
    public static byte[] m17985f(String str) {
        if (str == null) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(C1602db.m17940a(str));
        return messageDigest.digest();
    }

    /* renamed from: a */
    public static String m17993a(String str) {
        FileInputStream fileInputStream;
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            File file = new File(str);
            if (!file.isFile() || !file.exists()) {
                return null;
            }
            byte[] bArr = new byte[AccessibilityEventCompat.TYPE_WINDOW_CONTENT_CHANGED];
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            fileInputStream = new FileInputStream(file);
            while (true) {
                try {
                    int read = fileInputStream.read(bArr);
                    if (read != -1) {
                        messageDigest.update(bArr, 0, read);
                    } else {
                        String m17924e = C1602db.m17924e(messageDigest.digest());
                        try {
                            fileInputStream.close();
                            return m17924e;
                        } catch (IOException e) {
                            C1612dl.m17891a(e, "MD5", "gfm");
                            return m17924e;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        C1612dl.m17891a(th, "MD5", "gfm");
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                return null;
                            } catch (IOException e2) {
                                C1612dl.m17891a(e2, "MD5", "gfm");
                                return null;
                            }
                        }
                        return null;
                    } catch (Throwable th2) {
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                throw th2;
                            } catch (IOException e3) {
                                C1612dl.m17891a(e3, "MD5", "gfm");
                                throw th2;
                            }
                        }
                        throw th2;
                    }
                }
            }
        } catch (Throwable th3) {
            th = th3;
            fileInputStream = null;
        }
    }

    /* renamed from: a */
    public static byte[] m17991a(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable th) {
            C1612dl.m17891a(th, "MD5", "gmb");
            return null;
        }
    }
}
