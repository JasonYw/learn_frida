package com.amap.api.mapcore2d;

import android.content.Context;
import com.alipay.sdk.p082m.p121u.C1394i;
import com.amap.api.mapcore2d.C1658em;
import com.bytedance.covode.number.Covode;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* renamed from: com.amap.api.mapcore2d.fh */
/* loaded from: classes19.dex */
public class C1702fh {
    static {
        Covode.recordClassIndex(5250);
    }

    /* renamed from: a */
    public static String m17525a() {
        return C1602db.m17949a(System.currentTimeMillis());
    }

    /* renamed from: a */
    public static C1690fa m17520a(WeakReference<C1690fa> weakReference) {
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference<>(new C1690fa());
        }
        return weakReference.get();
    }

    /* renamed from: a */
    public static String m17524a(Context context, C1599da c1599da) {
        StringBuilder sb = new StringBuilder();
        try {
            String m18046g = C1587cu.m18046g(context);
            sb.append("\"sim\":\"");
            sb.append(m18046g);
            sb.append("\",\"sdkversion\":\"");
            sb.append(c1599da.m17966c());
            sb.append("\",\"product\":\"");
            sb.append(c1599da.m17972a());
            sb.append("\",\"ed\":\"");
            sb.append(c1599da.m17964e());
            sb.append("\",\"nt\":\"");
            sb.append(C1587cu.m18048e(context));
            sb.append("\",\"np\":\"");
            sb.append(C1587cu.m18065c(context));
            sb.append("\",\"mnc\":\"");
            sb.append(C1587cu.m18050d(context));
            sb.append("\",\"ant\":\"");
            sb.append(C1587cu.m18047f(context));
            sb.append(C1394i.f22426f);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static byte[] m17522a(C1658em c1658em, String str, boolean z) {
        C1658em.C1664b c1664b;
        byte[] bArr = new byte[0];
        InputStream inputStream = null;
        try {
            c1664b = c1658em.m17665a(str);
            if (c1664b == null) {
                return bArr;
            }
            try {
                inputStream = c1664b.m17636a(0);
                if (inputStream == null) {
                    try {
                        c1664b.close();
                    } catch (Throwable unused) {
                    }
                    return bArr;
                }
                bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                if (z) {
                    c1658em.m17658c(str);
                }
                try {
                    inputStream.close();
                } catch (Throwable unused2) {
                }
                try {
                    c1664b.close();
                } catch (Throwable unused3) {
                }
                return bArr;
            } catch (Throwable th) {
                th = th;
                try {
                    C1616do.m17866c(th, "sui", "rdS");
                    if (c1664b != null) {
                        try {
                            c1664b.close();
                        } catch (Throwable unused4) {
                        }
                    }
                    return bArr;
                } finally {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable unused5) {
                        }
                    }
                    if (c1664b != null) {
                        try {
                            c1664b.close();
                        } catch (Throwable unused6) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            c1664b = null;
        }
    }

    /* renamed from: a */
    public static String m17521a(String str, String str2, String str3, int i, String str4, String str5) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str2);
        stringBuffer.append(",\"timestamp\":\"");
        stringBuffer.append(str3);
        stringBuffer.append("\",\"et\":\"");
        stringBuffer.append(i);
        stringBuffer.append("\",\"classname\":\"");
        stringBuffer.append(str4);
        stringBuffer.append("\",");
        stringBuffer.append("\"detail\":\"");
        stringBuffer.append(str5);
        stringBuffer.append(C1394i.f22426f);
        return stringBuffer.toString();
    }

    /* renamed from: a */
    public static void m17523a(Context context, C1690fa c1690fa, String str, int i, int i2, String str2) {
        c1690fa.f23583a = C1613dm.m17881c(context, str);
        c1690fa.f23586d = i;
        c1690fa.f23584b = i2;
        c1690fa.f23585c = str2;
    }
}
