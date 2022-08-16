package cn.com.chinatelecom.account.api.p035b;

import android.content.Context;
import android.net.Network;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import cn.com.chinatelecom.account.api.p036c.AbstractC0644e;
import cn.com.chinatelecom.account.api.p038e.C0671f;
import cn.com.chinatelecom.account.api.p038e.C0676k;
import com.bytedance.covode.number.Covode;

/* renamed from: cn.com.chinatelecom.account.api.b.c */
/* loaded from: classes2.dex */
public final class C0636c implements AbstractC0644e {

    /* renamed from: a */
    public /* synthetic */ String f20875a;

    /* renamed from: b */
    public /* synthetic */ int f20876b;

    /* renamed from: c */
    public /* synthetic */ Context f20877c;

    /* renamed from: d */
    public /* synthetic */ String f20878d;

    /* renamed from: e */
    public /* synthetic */ String f20879e;

    /* renamed from: f */
    public /* synthetic */ AbstractC0634a f20880f;

    /* renamed from: g */
    public /* synthetic */ C0635b f20881g;

    static {
        Covode.recordClassIndex(2687);
    }

    public C0636c(C0635b c0635b, String str, int i, Context context, String str2, String str3, AbstractC0634a abstractC0634a) {
        this.f20881g = c0635b;
        this.f20875a = str;
        this.f20876b = i;
        this.f20877c = context;
        this.f20878d = str2;
        this.f20879e = str3;
        this.f20880f = abstractC0634a;
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractC0644e
    /* renamed from: a */
    public final void mo20713a() {
        C0635b.m20732a(this.f20881g);
        C0635b.m20731a(this.f20881g, 80800, C0632d.m20735a(C0676k.f21041h), this.f20875a, 2500L, "", this.f20880f);
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractC0644e
    /* renamed from: a */
    public final void mo20712a(long j) {
        C0635b.m20732a(this.f20881g);
        C0635b.m20731a(this.f20881g, 80801, C0632d.m20735a(C0676k.f21042i), this.f20875a, j, "", this.f20880f);
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractC0644e
    /* renamed from: a */
    public final void mo20711a(Network network, long j) {
        C0671f.m20603a(this.f20875a).m20616a(j);
        long j2 = this.f20876b - j;
        if (j2 > 100) {
            this.f20881g.m20734a(this.f20877c, this.f20878d, this.f20879e, network, j2, this.f20875a, "preCodeByJs", this.f20880f);
            return;
        }
        C0635b.m20732a(this.f20881g);
        C0635b.m20731a(this.f20881g, 80000, C0632d.m20735a(C0676k.f21034a), this.f20875a, j, "", this.f20880f);
    }
}
