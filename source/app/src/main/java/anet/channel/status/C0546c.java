package anet.channel.status;

import android.net.ConnectivityManager;
import android.net.LinkProperties;
import android.net.Network;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;

/* renamed from: anet.channel.status.c */
/* loaded from: classes2.dex */
public final class C0546c extends ConnectivityManager.NetworkCallback {
    static {
        Covode.recordClassIndex(2288);
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onAvailable(Network network) {
        super.onAvailable(network);
        ALog.m20785i("awcn.NetworkStatusMonitor", "network onAvailable", null, new Object[0]);
        C0545b.f20674b = true;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLost(Network network) {
        super.onLost(network);
        ALog.m20785i("awcn.NetworkStatusMonitor", "network onLost", null, new Object[0]);
        C0545b.f20674b = false;
    }

    @Override // android.net.ConnectivityManager.NetworkCallback
    public final void onLinkPropertiesChanged(Network network, LinkProperties linkProperties) {
        super.onLinkPropertiesChanged(network, linkProperties);
        C0545b.f20684l = new ArrayList(linkProperties.getDnsServers());
    }
}
