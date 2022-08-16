package anet.channel.detect;

import anet.channel.AwcnConfig;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import anet.channel.util.AppLifecycle;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.detect.f */
/* loaded from: classes20.dex */
public class C0483f implements AppLifecycle.AppLifecycleListener {

    /* renamed from: a */
    public final /* synthetic */ C0481d f20456a;

    static {
        Covode.recordClassIndex(2177);
    }

    @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
    public void forground() {
    }

    @Override // anet.channel.util.AppLifecycle.AppLifecycleListener
    public void background() {
        ALog.m20785i("anet.HorseRaceDetector", "background", null, new Object[0]);
        if (!AwcnConfig.isHorseRaceEnable()) {
            return;
        }
        ThreadPoolExecutorFactory.submitHRTask(new RunnableC0484g(this));
    }

    public C0483f(C0481d c0481d) {
        this.f20456a = c0481d;
    }
}
