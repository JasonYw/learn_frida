package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;
import java.net.Proxy;
import java.net.URL;
import java.net.URLConnection;

/* renamed from: com.amap.api.services.a.dd */
/* loaded from: classes19.dex */
public class C1957dd {

    /* renamed from: a */
    public static int f24726a;

    /* renamed from: b */
    public static String f24727b = "";

    /* renamed from: c */
    public static C1957dd f24728c;

    /* renamed from: com.amap.api.services.a.dd$a */
    /* loaded from: classes19.dex */
    public interface AbstractC1958a {
        static {
            Covode.recordClassIndex(5569);
        }

        /* renamed from: a */
        URLConnection m16499a(Proxy proxy, URL url);
    }

    static {
        Covode.recordClassIndex(5568);
    }

    /* renamed from: a */
    public static C1957dd m16503a() {
        if (f24728c == null) {
            f24728c = new C1957dd();
        }
        return f24728c;
    }

    /* renamed from: a */
    public byte[] m16502a(AbstractC1969di abstractC1969di) {
        try {
            C1971dk m16501a = m16501a(abstractC1969di, true);
            if (m16501a != null) {
                return m16501a.f24757a;
            }
            return null;
        } catch (C1863be e) {
            throw e;
        }
    }

    /* renamed from: b */
    public byte[] mo16457b(AbstractC1969di abstractC1969di) {
        try {
            C1971dk m16501a = m16501a(abstractC1969di, false);
            if (m16501a != null) {
                return m16501a.f24757a;
            }
            return null;
        } catch (C1863be e) {
            throw e;
        } catch (Throwable th) {
            C1901by.m16742a(th, "bm", "msp");
            throw new C1863be("未知的错误");
        }
    }

    /* renamed from: c */
    public void m16500c(AbstractC1969di abstractC1969di) {
        if (abstractC1969di != null) {
            if (abstractC1969di.mo16250i() != null && !"".equals(abstractC1969di.mo16250i())) {
                return;
            }
            throw new C1863be("request url is empty");
        }
        throw new C1863be("requeust is null");
    }

    /* renamed from: a */
    public C1971dk m16501a(AbstractC1969di abstractC1969di, boolean z) {
        Proxy proxy;
        try {
            m16500c(abstractC1969di);
            if (abstractC1969di.f24756h == null) {
                proxy = null;
            } else {
                proxy = abstractC1969di.f24756h;
            }
            return new C1962dg(abstractC1969di.f24754f, abstractC1969di.f24755g, proxy, z).m16475a(abstractC1969di.m16448m(), abstractC1969di.m16446o(), abstractC1969di.m16447n(), abstractC1969di.mo16388e(), abstractC1969di.m16444q(), abstractC1969di.m16445p());
        } catch (C1863be e) {
            throw e;
        }
    }
}
