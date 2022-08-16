package cn.com.chinatelecom.account.api.p036c;

import android.net.Network;
import cn.com.chinatelecom.account.api.CtAuth;
import cn.com.chinatelecom.account.api.CtSetting;
import cn.com.chinatelecom.account.api.ResultListener;
import cn.com.chinatelecom.account.api.p034a.C0632d;
import cn.com.chinatelecom.account.api.p038e.C0671f;
import cn.com.chinatelecom.account.api.p038e.C0676k;
import com.bytedance.covode.number.Covode;

/* renamed from: cn.com.chinatelecom.account.api.c.c */
/* loaded from: classes2.dex */
public final class C0642c implements AbstractC0644e {

    /* renamed from: a */
    public /* synthetic */ int f20911a;

    /* renamed from: b */
    public /* synthetic */ String f20912b;

    /* renamed from: c */
    public /* synthetic */ CtSetting f20913c;

    /* renamed from: d */
    public /* synthetic */ ResultListener f20914d;

    /* renamed from: e */
    public /* synthetic */ String f20915e;

    /* renamed from: f */
    public /* synthetic */ String f20916f;

    /* renamed from: g */
    public /* synthetic */ int f20917g;

    /* renamed from: h */
    public /* synthetic */ C0640a f20918h;

    static {
        Covode.recordClassIndex(2693);
    }

    public C0642c(C0640a c0640a, int i, String str, CtSetting ctSetting, ResultListener resultListener, String str2, String str3, int i2) {
        this.f20918h = c0640a;
        this.f20911a = i;
        this.f20912b = str;
        this.f20913c = ctSetting;
        this.f20914d = resultListener;
        this.f20915e = str2;
        this.f20916f = str3;
        this.f20917g = i2;
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractC0644e
    /* renamed from: a */
    public final void mo20713a() {
        C0640a.m20723a(this.f20918h, 80800, C0632d.m20735a(C0676k.f21041h), this.f20915e, 2500L, "Switching network timeout (4.x)", this.f20914d);
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractC0644e
    /* renamed from: a */
    public final void mo20712a(long j) {
        C0640a.m20723a(this.f20918h, 80801, C0632d.m20735a(C0676k.f21042i), this.f20915e, j, "Switching network failed (4.x)", this.f20914d);
    }

    @Override // cn.com.chinatelecom.account.api.p036c.AbstractC0644e
    /* renamed from: a */
    public final void mo20711a(Network network, long j) {
        long j2 = this.f20911a - j;
        if (j2 > 100) {
            this.f20918h.m20718a(this.f20912b, this.f20913c, null, this.f20914d, j2, this.f20915e, this.f20916f, this.f20917g);
        } else {
            CtAuth.postResultOnMainThread(this.f20915e, C0676k.m20573c(), this.f20914d);
        }
        C0671f.m20603a(this.f20915e).m20616a(j);
    }
}
