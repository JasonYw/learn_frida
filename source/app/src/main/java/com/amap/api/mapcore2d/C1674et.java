package com.amap.api.mapcore2d;

import com.bytedance.covode.number.Covode;
import java.net.Proxy;

/* renamed from: com.amap.api.mapcore2d.et */
/* loaded from: classes19.dex */
public class C1674et {

    /* renamed from: a */
    public C1676eu f23543a;

    /* renamed from: b */
    public AbstractC1683ew f23544b;

    /* renamed from: com.amap.api.mapcore2d.et$a */
    /* loaded from: classes19.dex */
    public interface AbstractC1675a {
        static {
            Covode.recordClassIndex(5223);
        }

        /* renamed from: a */
        void mo17603a(Throwable th);

        /* renamed from: a */
        void mo17602a(byte[] bArr, long j);

        /* renamed from: b */
        void mo17601b();

        /* renamed from: c */
        void mo17600c();
    }

    static {
        Covode.recordClassIndex(5222);
    }

    public C1674et(AbstractC1683ew abstractC1683ew) {
        this(abstractC1683ew, 0L, -1L);
    }

    /* renamed from: a */
    public void m17604a(AbstractC1675a abstractC1675a) {
        this.f23543a.m17595a(this.f23544b.mo17320h(), this.f23544b.m17567n(), this.f23544b.mo17317m(), this.f23544b.mo17322f(), this.f23544b.mo17321g(), this.f23544b.mo17570a_(), abstractC1675a);
    }

    public C1674et(AbstractC1683ew abstractC1683ew, long j, long j2) {
        this(abstractC1683ew, j, j2, false);
    }

    public C1674et(AbstractC1683ew abstractC1683ew, long j, long j2, boolean z) {
        Proxy proxy;
        this.f23544b = abstractC1683ew;
        if (abstractC1683ew.f23568e == null) {
            proxy = null;
        } else {
            proxy = abstractC1683ew.f23568e;
        }
        this.f23543a = new C1676eu(this.f23544b.f23566c, this.f23544b.f23567d, proxy, z);
        this.f23543a.m17589b(j2);
        this.f23543a.m17597a(j);
    }
}
