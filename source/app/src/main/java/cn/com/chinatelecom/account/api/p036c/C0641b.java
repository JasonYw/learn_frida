package cn.com.chinatelecom.account.api.p036c;

import android.net.Network;
import cn.com.chinatelecom.account.api.CtAuth;
import cn.com.chinatelecom.account.api.CtSetting;
import cn.com.chinatelecom.account.api.ResultListener;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import cn.com.chinatelecom.account.api.p038e.C0671f;
import cn.com.chinatelecom.account.api.p038e.C0676k;
import com.bytedance.covode.number.Covode;

/* renamed from: cn.com.chinatelecom.account.api.c.b */
/* loaded from: classes2.dex */
public final class C0641b implements AbstractC0644e {

    /* renamed from: a */
    public /* synthetic */ int f20903a;

    /* renamed from: b */
    public /* synthetic */ String f20904b;

    /* renamed from: c */
    public /* synthetic */ CtSetting f20905c;

    /* renamed from: d */
    public /* synthetic */ ResultListener f20906d;

    /* renamed from: e */
    public /* synthetic */ String f20907e;

    /* renamed from: f */
    public /* synthetic */ String f20908f;

    /* renamed from: g */
    public /* synthetic */ int f20909g;

    /* renamed from: h */
    public /* synthetic */ C0640a f20910h;

    static {
        Covode.recordClassIndex(2692);
    }

    public C0641b(C0640a c0640a, int i, String str, CtSetting ctSetting, ResultListener resultListener, String str2, String str3, int i2) {
        this.f20910h = c0640a;
        this.f20903a = i;
        this.f20904b = str;
        this.f20905c = ctSetting;
        this.f20906d = resultListener;
        this.f20907e = str2;
        this.f20908f = str3;
        this.f20909g = i2;
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractC0644e
    /* renamed from: a */
    public final void mo20713a() {
        C0640a.m20724a(this.f20910h);
        C0640a.m20723a(this.f20910h, 80800, C0632d.m20735a(C0676k.f21041h), this.f20907e, 2500L, "", this.f20906d);
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractC0644e
    /* renamed from: a */
    public final void mo20712a(long j) {
        C0640a.m20724a(this.f20910h);
        C0640a.m20723a(this.f20910h, 80801, C0632d.m20735a(C0676k.f21042i), this.f20907e, j, "", this.f20906d);
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractC0644e
    /* renamed from: a */
    public final void mo20711a(Network network, long j) {
        long j2 = this.f20903a - j;
        if (j2 > 100) {
            this.f20910h.m20718a(this.f20904b, this.f20905c, network, this.f20906d, j2, this.f20907e, this.f20908f, this.f20909g);
        } else {
            C0640a.m20724a(this.f20910h);
            CtAuth.postResultOnMainThread(this.f20907e, C0676k.m20573c(), this.f20906d);
        }
        C0671f.m20603a(this.f20907e).m20616a(j);
    }
}
