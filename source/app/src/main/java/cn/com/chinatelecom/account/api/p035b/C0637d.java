package cn.com.chinatelecom.account.api.p035b;

import android.content.Context;
import android.net.Network;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import cn.com.chinatelecom.account.api.p036c.AbstractC0644e;
import cn.com.chinatelecom.account.api.p038e.C0671f;
import cn.com.chinatelecom.account.api.p038e.C0676k;
import com.bytedance.covode.number.Covode;

/* renamed from: cn.com.chinatelecom.account.api.b.d */
/* loaded from: classes2.dex */
public final class C0637d implements AbstractC0644e {

    /* renamed from: a */
    public /* synthetic */ String f20882a;

    /* renamed from: b */
    public /* synthetic */ int f20883b;

    /* renamed from: c */
    public /* synthetic */ Context f20884c;

    /* renamed from: d */
    public /* synthetic */ String f20885d;

    /* renamed from: e */
    public /* synthetic */ String f20886e;

    /* renamed from: f */
    public /* synthetic */ AbstractC0634a f20887f;

    /* renamed from: g */
    public /* synthetic */ C0635b f20888g;

    static {
        Covode.recordClassIndex(2688);
    }

    public C0637d(C0635b c0635b, String str, int i, Context context, String str2, String str3, AbstractC0634a abstractC0634a) {
        this.f20888g = c0635b;
        this.f20882a = str;
        this.f20883b = i;
        this.f20884c = context;
        this.f20885d = str2;
        this.f20886e = str3;
        this.f20887f = abstractC0634a;
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractC0644e
    /* renamed from: a */
    public final void mo20713a() {
        C0635b.m20731a(this.f20888g, 80800, C0632d.m20735a(C0676k.f21041h), this.f20882a, 2500L, "Switching network timeout (4.x)", this.f20887f);
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractC0644e
    /* renamed from: a */
    public final void mo20712a(long j) {
        C0635b.m20731a(this.f20888g, 80801, C0632d.m20735a(C0676k.f21042i), this.f20882a, j, "Switching network failed (4.x)", this.f20887f);
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractC0644e
    /* renamed from: a */
    public final void mo20711a(Network network, long j) {
        C0671f.m20603a(this.f20882a).m20616a(j);
        long j2 = this.f20883b - j;
        if (j2 > 100) {
            this.f20888g.m20734a(this.f20884c, this.f20885d, this.f20886e, network, j2, this.f20882a, "preCodeByJs", this.f20887f);
        } else {
            C0635b.m20731a(this.f20888g, 80000, C0632d.m20735a(C0676k.f21034a), this.f20882a, j, "", this.f20887f);
        }
    }
}
