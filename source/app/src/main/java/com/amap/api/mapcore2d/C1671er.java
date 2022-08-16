package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.amap.api.mapcore2d.er */
/* loaded from: classes19.dex */
public class C1671er {

    /* renamed from: a */
    public static int f23538a;

    /* renamed from: b */
    public static String f23539b = "";

    /* renamed from: c */
    public static C1671er f23540c;

    /* renamed from: com.amap.api.mapcore2d.er$a */
    /* loaded from: classes19.dex */
    public interface AbstractC1672a {
        static {
            Covode.recordClassIndex(5220);
        }

        /* renamed from: a */
        URLConnection m17611a(Proxy proxy, URL url);
    }

    static {
        Covode.recordClassIndex(5219);
    }

    /* renamed from: a */
    public static C1671er m17615a() {
        if (f23540c == null) {
            f23540c = new C1671er();
        }
        return f23540c;
    }

    /* renamed from: a */
    public byte[] m17614a(AbstractC1683ew abstractC1683ew) {
        try {
            C1685ey m17613a = m17613a(abstractC1683ew, true);
            if (m17613a != null) {
                return m17613a.f23569a;
            }
            return null;
        } catch (C1572cp e) {
            throw e;
        }
    }

    /* renamed from: b */
    public byte[] mo17576b(AbstractC1683ew abstractC1683ew) {
        try {
            C1685ey m17613a = m17613a(abstractC1683ew, false);
            if (m17613a != null) {
                return m17613a.f23569a;
            }
            return null;
        } catch (C1572cp e) {
            throw e;
        } catch (Throwable th) {
            C1612dl.m17891a(th, "bm", "msp");
            throw new C1572cp("未知的错误");
        }
    }

    /* renamed from: c */
    public void m17612c(AbstractC1683ew abstractC1683ew) {
        if (abstractC1683ew != null) {
            if (abstractC1683ew.mo17320h() != null && !"".equals(abstractC1683ew.mo17320h())) {
                return;
            }
            throw new C1572cp("request url is empty");
        }
        throw new C1572cp("requeust is null");
    }

    /* renamed from: a */
    public C1685ey m17613a(AbstractC1683ew abstractC1683ew, boolean z) {
        Proxy proxy;
        try {
            m17612c(abstractC1683ew);
            if (abstractC1683ew.f23568e == null) {
                proxy = null;
            } else {
                proxy = abstractC1683ew.f23568e;
            }
            return new C1676eu(abstractC1683ew.f23566c, abstractC1683ew.f23567d, proxy, z).m17593a(abstractC1683ew.m17568l(), abstractC1683ew.m17567n(), abstractC1683ew.mo17317m(), abstractC1683ew.mo17322f(), abstractC1683ew.m17565p(), abstractC1683ew.m17566o());
        } catch (C1572cp e) {
            throw e;
        }
    }
}
