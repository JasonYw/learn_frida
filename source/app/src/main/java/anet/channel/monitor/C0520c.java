package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.monitor.c */
/* loaded from: classes20.dex */
public class C0520c implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C0518b f20558a;

    static {
        Covode.recordClassIndex(2228);
    }

    public C0520c(C0518b c0518b) {
        this.f20558a = c0518b;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        C0522e c0522e;
        c0522e = this.f20558a.f20556n;
        c0522e.m20967a();
        C0518b.f20548f = 0L;
        this.f20558a.m20969d();
    }
}
