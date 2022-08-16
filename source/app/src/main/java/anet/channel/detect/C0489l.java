package anet.channel.detect;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.detect.l */
/* loaded from: classes20.dex */
public class C0489l implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ C0488k f20468a;

    static {
        Covode.recordClassIndex(2183);
    }

    public C0489l(C0488k c0488k) {
        this.f20468a = c0488k;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        ThreadPoolExecutorFactory.submitDetectTask(new RunnableC0490m(this, networkStatus));
    }
}
