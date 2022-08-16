package anet.channel.p026e;

import anet.channel.status.NetworkStatusHelper;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.e.d */
/* loaded from: classes2.dex */
public final class C0498d implements NetworkStatusHelper.INetworkStatusChangeListener {
    static {
        Covode.recordClassIndex(2192);
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public final void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        C0493a.m21011a(networkStatus);
    }
}
