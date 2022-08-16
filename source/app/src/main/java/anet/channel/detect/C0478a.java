package anet.channel.detect;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.detect.a */
/* loaded from: classes20.dex */
public class C0478a implements NetworkStatusHelper.INetworkStatusChangeListener {

    /* renamed from: a */
    public final /* synthetic */ ExceptionDetector f20449a;

    static {
        Covode.recordClassIndex(2172);
    }

    public C0478a(ExceptionDetector exceptionDetector) {
        this.f20449a = exceptionDetector;
    }

    @Override // anet.channel.status.NetworkStatusHelper.INetworkStatusChangeListener
    public void onNetworkStatusChanged(NetworkStatusHelper.NetworkStatus networkStatus) {
        ThreadPoolExecutorFactory.submitDetectTask(new RunnableC0479b(this));
    }
}
