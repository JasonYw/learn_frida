package com.amap.api.services.p126a;

import android.text.TextUtils;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import com.bytedance.covode.number.Covode;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.MessageDigest;

/* renamed from: com.amap.api.services.a.bm */
/* loaded from: classes19.dex */
public class C1887bm {
    static {
        Covode.recordClassIndex(5498);
    }

    /* renamed from: b */
    public static byte[] m16831b(byte[] bArr) {
        return m16833a(bArr, "MD5");
    }

    /* renamed from: a */
    public static String m16834a(byte[] bArr) {
        return C1892bp.m16770e(m16831b(bArr));
    }

    /* renamed from: b */
    public static String m16832b(String str) {
        if (str == null) {
            return null;
        }
        return C1892bp.m16770e(m16829d(str));
    }

    /* renamed from: c */
    public static String m16830c(String str) {
        return C1892bp.m16769f(m16828e(str));
    }

    /* renamed from: e */
    public static byte[] m16828e(String str) {
        try {
            return m16827f(str);
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    /* renamed from: d */
    public static byte[] m16829d(String str) {
        try {
            return m16827f(str);
        } catch (Throwable th) {
            C1901by.m16742a(th, "MD5", "gmb");
            return new byte[0];
        }
    }

    /* renamed from: f */
    public static byte[] m16827f(String str) {
        if (str == null) {
            return null;
        }
        MessageDigest messageDigest = MessageDigest.getInstance("MD5");
        messageDigest.update(C1892bp.m16786a(str));
        return messageDigest.digest();
    }

    /* renamed from: a */
    public static String m16835a(String str) {
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
                        String m16770e = C1892bp.m16770e(messageDigest.digest());
                        try {
                            fileInputStream.close();
                            return m16770e;
                        } catch (IOException e) {
                            C1901by.m16742a(e, "MD5", "gfm");
                            return m16770e;
                        }
                    }
                } catch (Throwable th) {
                    th = th;
                    try {
                        C1901by.m16742a(th, "MD5", "gfm");
                        if (fileInputStream != null) {
                            try {
                                fileInputStream.close();
                                return null;
                            } catch (IOException e2) {
                                C1901by.m16742a(e2, "MD5", "gfm");
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
                                C1901by.m16742a(e3, "MD5", "gfm");
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
    public static byte[] m16833a(byte[] bArr, String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.update(bArr);
            return messageDigest.digest();
        } catch (Throwable th) {
            C1901by.m16742a(th, "MD5", "gmb");
            return null;
        }
    }
}
