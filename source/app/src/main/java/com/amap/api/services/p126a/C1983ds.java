package com.amap.api.services.p126a;

import android.content.Context;
import com.alipay.sdk.p082m.p121u.C1394i;
import com.amap.api.services.p126a.C1943cy;
import com.bytedance.covode.number.Covode;
import java.io.InputStream;
import java.lang.ref.WeakReference;

/* renamed from: com.amap.api.services.a.ds */
/* loaded from: classes19.dex */
public class C1983ds {
    static {
        Covode.recordClassIndex(5594);
    }

    /* renamed from: a */
    public static String m16419a() {
        return C1892bp.m16795a(System.currentTimeMillis());
    }

    /* renamed from: a */
    public static C1973dm m16414a(WeakReference<C1973dm> weakReference) {
        if (weakReference == null || weakReference.get() == null) {
            weakReference = new WeakReference<>(new C1973dm());
        }
        return weakReference.get();
    }

    /* renamed from: a */
    public static String m16418a(Context context, C1889bo c1889bo) {
        StringBuilder sb = new StringBuilder();
        try {
            String m16885g = C1878bj.m16885g(context);
            sb.append("\"sim\":\"");
            sb.append(m16885g);
            sb.append("\",\"sdkversion\":\"");
            sb.append(c1889bo.m16812c());
            sb.append("\",\"product\":\"");
            sb.append(c1889bo.m16818a());
            sb.append("\",\"ed\":\"");
            sb.append(c1889bo.m16811d());
            sb.append("\",\"nt\":\"");
            sb.append(C1878bj.m16887e(context));
            sb.append("\",\"np\":\"");
            sb.append(C1878bj.m16904c(context));
            sb.append("\",\"mnc\":\"");
            sb.append(C1878bj.m16889d(context));
            sb.append("\",\"ant\":\"");
            sb.append(C1878bj.m16886f(context));
            sb.append(C1394i.f22426f);
        } catch (Throwable unused) {
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static byte[] m16416a(C1943cy c1943cy, String str, boolean z) {
        C1943cy.C1949b c1949b;
        byte[] bArr = new byte[0];
        InputStream inputStream = null;
        try {
            c1949b = c1943cy.m16552a(str);
            if (c1949b == null) {
                return bArr;
            }
            try {
                inputStream = c1949b.m16524a(0);
                if (inputStream == null) {
                    try {
                        c1949b.close();
                    } catch (Throwable unused) {
                    }
                    return bArr;
                }
                bArr = new byte[inputStream.available()];
                inputStream.read(bArr);
                if (z) {
                    c1943cy.m16545c(str);
                }
                try {
                    inputStream.close();
                } catch (Throwable unused2) {
                }
                try {
                    c1949b.close();
                } catch (Throwable unused3) {
                }
                return bArr;
            } catch (Throwable th) {
                th = th;
                try {
                    C1906cb.m16716c(th, "sui", "rdS");
                    if (c1949b != null) {
                        try {
                            c1949b.close();
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
                    if (c1949b != null) {
                        try {
                            c1949b.close();
                        } catch (Throwable unused6) {
                        }
                    }
                }
            }
        } catch (Throwable th2) {
            th = th2;
            c1949b = null;
        }
    }

    /* renamed from: a */
    public static String m16415a(String str, String str2, String str3, int i, String str4, String str5) {
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
    public static void m16417a(Context context, C1973dm c1973dm, String str, int i, int i2, String str2) {
        c1973dm.f24763a = C1902bz.m16733c(context, str);
        c1973dm.f24766d = i;
        c1973dm.f24764b = i2;
        c1973dm.f24765c = str2;
    }
}
