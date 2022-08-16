package anet.channel.detect;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.detect.m */
/* loaded from: classes20.dex */
public class RunnableC0490m implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ NetworkStatusHelper.NetworkStatus f20469a;

    /* renamed from: b */
    public final /* synthetic */ C0489l f20470b;

    static {
        Covode.recordClassIndex(2184);
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            if (this.f20469a == NetworkStatusHelper.NetworkStatus.NO || this.f20469a == NetworkStatusHelper.NetworkStatus.NONE) {
                return;
            }
            this.f20470b.f20468a.m21022a(NetworkStatusHelper.getUniqueId(this.f20469a));
        } catch (Throwable th) {
            ALog.m20787e("anet.MTUDetector", "MTU detecet fail.", null, th, new Object[0]);
        }
    }

    public RunnableC0490m(C0489l c0489l, NetworkStatusHelper.NetworkStatus networkStatus) {
        this.f20470b = c0489l;
        this.f20469a = networkStatus;
    }
}
