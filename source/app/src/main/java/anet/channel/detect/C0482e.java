package anet.channel.detect;

import anet.channel.AwcnConfig;
import anet.channel.strategy.C0568l;
import anet.channel.strategy.IStrategyListener;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;

/* renamed from: anet.channel.detect.e */
/* loaded from: classes20.dex */
public class C0482e implements IStrategyListener {

    /* renamed from: a */
    public final /* synthetic */ C0481d f20455a;

    static {
        Covode.recordClassIndex(2176);
    }

    public C0482e(C0481d c0481d) {
        this.f20455a = c0481d;
    }

    @Override // anet.channel.strategy.IStrategyListener
    public void onStrategyUpdated(C0568l.C0572d c0572d) {
        MethodCollector.m14708i(35);
        ALog.m20785i("anet.HorseRaceDetector", "onStrategyUpdated", null, new Object[0]);
        if (!AwcnConfig.isHorseRaceEnable()) {
            MethodCollector.m14707o(35);
        } else if (c0572d.f20795c != null && c0572d.f20795c.length != 0) {
            synchronized (this.f20455a.f20453a) {
                for (int i = 0; i < c0572d.f20795c.length; i++) {
                    try {
                        C0568l.C0571c c0571c = c0572d.f20795c[i];
                        this.f20455a.f20453a.put(c0571c.f20791a, c0571c);
                    } catch (Throwable th) {
                        MethodCollector.m14707o(35);
                        throw th;
                    }
                }
            }
            MethodCollector.m14707o(35);
        } else {
            MethodCollector.m14707o(35);
        }
    }
}
