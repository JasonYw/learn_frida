package com.amap.api.mapcore2d;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.HashMap;
import java.util.Locale;
import p002O.C0002O;

/* renamed from: com.amap.api.mapcore2d.gq */
/* loaded from: classes19.dex */
public final class C1748gq {

    /* renamed from: b */
    public static C1748gq f23798b;

    /* renamed from: a */
    public C1671er f23799a;

    /* renamed from: c */
    public Context f23800c;

    /* renamed from: d */
    public int f23801d;

    /* renamed from: e */
    public int f23802e = C1752gu.f23921f;

    /* renamed from: f */
    public boolean f23803f;

    /* renamed from: g */
    public int f23804g;

    static {
        Covode.recordClassIndex(5296);
    }

    public C1748gq(Context context) {
        try {
            C1590cw.m18013a().m18012a(context);
        } catch (Throwable unused) {
        }
        this.f23800c = context;
        this.f23799a = C1671er.m17615a();
    }

    /* renamed from: a */
    public static C1748gq m17333a(Context context) {
        if (f23798b == null) {
            f23798b = new C1748gq(context);
        }
        return f23798b;
    }

    /* renamed from: a */
    public final C1685ey m17331a(C1749gr c1749gr) {
        long m17265b = C1757gy.m17265b();
        C1685ey m17613a = this.f23799a.m17613a(c1749gr, this.f23803f || C1757gy.m17250e(this.f23800c));
        this.f23801d = Long.valueOf(C1757gy.m17265b() - m17265b).intValue();
        return m17613a;
    }

    /* renamed from: a */
    public final C1749gr m17332a(Context context, byte[] bArr, String str) {
        String str2;
        try {
            HashMap hashMap = new HashMap(16);
            C1749gr c1749gr = new C1749gr(context, C1752gu.m17301b());
            try {
                hashMap.put("Content-Type", "application/octet-stream");
                hashMap.put("Accept-Encoding", "gzip");
                hashMap.put("gzipped", "1");
                hashMap.put("Connection", "Keep-Alive");
                hashMap.put("User-Agent", "AMAP_Location_SDK_Android 4.7.0");
                hashMap.put("KEY", C1573cq.m18118f(context));
                hashMap.put("enginever", "5.1");
                String m18093a = C1584ct.m18093a();
                String m18089a = C1584ct.m18089a(context, m18093a, C0002O.m25086C("key=", C1573cq.m18118f(context)));
                hashMap.put("ts", m18093a);
                hashMap.put("scode", m18089a);
                hashMap.put("encr", "1");
                c1749gr.m17326b(hashMap);
                c1749gr.m17315r();
                c1749gr.m17330a(String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s&loc_channel=%s", "4.7.0", "loc", 3));
                c1749gr.m17316q();
                c1749gr.m17327b(str);
                c1749gr.m17325b(C1757gy.m17267a(bArr));
                c1749gr.m17571a(C1595cy.m17983a(context));
                HashMap hashMap2 = new HashMap(16);
                hashMap2.put("output", "bin");
                hashMap2.put("policy", "3103");
                int i = this.f23804g;
                if (i != 0) {
                    if (i == 1) {
                        str2 = "language:cn";
                    } else if (i == 2) {
                        str2 = "language:en";
                    }
                    hashMap2.put("custom", str2);
                    c1749gr.m17329a(hashMap2);
                    c1749gr.m17572a(this.f23802e);
                    c1749gr.m17569b(this.f23802e);
                    if ((this.f23803f && !C1757gy.m17250e(context)) || !str.startsWith("http:")) {
                        return c1749gr;
                    }
                    c1749gr.m17327b(c1749gr.mo17320h().replace("https:", "https:"));
                    return c1749gr;
                }
                hashMap2.remove("custom");
                c1749gr.m17329a(hashMap2);
                c1749gr.m17572a(this.f23802e);
                c1749gr.m17569b(this.f23802e);
                if (this.f23803f) {
                }
                c1749gr.m17327b(c1749gr.mo17320h().replace("https:", "https:"));
                return c1749gr;
            } catch (Throwable unused) {
                return c1749gr;
            }
        } catch (Throwable unused2) {
            return null;
        }
    }

    /* renamed from: a */
    public final void m17334a(long j, boolean z) {
        try {
            this.f23803f = z;
            try {
                C1590cw.m18013a().m18009a(z);
            } catch (Throwable unused) {
            }
            this.f23802e = Long.valueOf(j).intValue();
            this.f23804g = 0;
        } catch (Throwable th) {
            C1752gu.m17302a(th, "LocNetManager", "setOption");
        }
    }
}
