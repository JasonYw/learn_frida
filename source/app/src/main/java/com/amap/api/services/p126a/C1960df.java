package com.amap.api.services.p126a;

import com.bytedance.covode.number.Covode;
import java.net.Proxy;

/* renamed from: com.amap.api.services.a.df */
/* loaded from: classes19.dex */
public class C1960df {

    /* renamed from: a */
    public C1962dg f24731a;

    /* renamed from: b */
    public AbstractC1969di f24732b;

    /* renamed from: com.amap.api.services.a.df$a */
    /* loaded from: classes19.dex */
    public interface AbstractC1961a {
        static {
            Covode.recordClassIndex(5572);
        }

        /* renamed from: a */
        void mo16485a(Throwable th);

        /* renamed from: a */
        void mo16484a(byte[] bArr, long j);

        /* renamed from: d */
        void mo16483d();

        /* renamed from: e */
        void mo16482e();
    }

    static {
        Covode.recordClassIndex(5571);
    }

    public C1960df(AbstractC1969di abstractC1969di) {
        this(abstractC1969di, 0L, -1L);
    }

    /* renamed from: a */
    public void m16486a(AbstractC1961a abstractC1961a) {
        this.f24731a.m16477a(this.f24732b.mo16250i(), this.f24732b.m16446o(), this.f24732b.m16447n(), this.f24732b.mo16388e(), this.f24732b.mo16450d(), this.f24732b.mo16449h(), abstractC1961a);
    }

    public C1960df(AbstractC1969di abstractC1969di, long j, long j2) {
        this(abstractC1969di, j, j2, false);
    }

    public C1960df(AbstractC1969di abstractC1969di, long j, long j2, boolean z) {
        Proxy proxy;
        this.f24732b = abstractC1969di;
        if (abstractC1969di.f24756h == null) {
            proxy = null;
        } else {
            proxy = abstractC1969di.f24756h;
        }
        this.f24731a = new C1962dg(this.f24732b.f24754f, this.f24732b.f24755g, proxy, z);
        this.f24731a.m16470b(j2);
        this.f24731a.m16479a(j);
    }
}
