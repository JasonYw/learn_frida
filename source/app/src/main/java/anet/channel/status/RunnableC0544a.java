package anet.channel.status;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import java.util.Iterator;

/* renamed from: anet.channel.status.a */
/* loaded from: classes2.dex */
public final class RunnableC0544a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ NetworkStatusHelper.NetworkStatus f20672a;

    static {
        Covode.recordClassIndex(2286);
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            Iterator<NetworkStatusHelper.INetworkStatusChangeListener> it = NetworkStatusHelper.listeners.iterator();
            while (it.hasNext()) {
                NetworkStatusHelper.INetworkStatusChangeListener next = it.next();
                long currentTimeMillis = System.currentTimeMillis();
                next.onNetworkStatusChanged(this.f20672a);
                if (System.currentTimeMillis() - currentTimeMillis > 500) {
                    ALog.m20786e("awcn.NetworkStatusHelper", "call back cost too much time", null, "listener", next);
                }
            }
        } catch (Exception unused) {
        }
    }

    public RunnableC0544a(NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f20672a = networkStatus;
    }
}
