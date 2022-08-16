package cn.com.chinatelecom.account.api.p036c;

import android.net.ConnectivityManager;
import android.net.Network;
import com.bytedance.covode.number.Covode;

/* renamed from: cn.com.chinatelecom.account.api.c.h */
/* loaded from: classes2.dex */
public final class C0647h extends ConnectivityManager.NetworkCallback {

    /* renamed from: a */
    public /* synthetic */ AbstractC0644e f20934a;

    /* renamed from: b */
    public /* synthetic */ long f20935b;

    /* renamed from: c */
    public /* synthetic */ C0645f f20936c;

    static {
        Covode.recordClassIndex(2698);
    }

    public C0647h(C0645f c0645f, AbstractC0644e abstractC0644e, long j) {
        this.f20936c = c0645f;
        this.f20934a = abstractC0644e;
        this.f20935b = j;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        boolean m20699d;
        m20699d = this.f20936c.m20699d();
        if (m20699d || this.f20934a == null) {
            return;
        }
        this.f20936c.m20701c();
        this.f20934a.mo20711a(network, System.currentTimeMillis() - this.f20935b);
    }
}
