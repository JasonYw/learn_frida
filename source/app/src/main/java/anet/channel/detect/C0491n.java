package anet.channel.detect;

import anet.channel.statist.RequestStatistic;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: anet.channel.detect.n */
/* loaded from: classes20.dex */
public class C0491n {

    /* renamed from: a */
    public static C0481d f20471a = new C0481d();

    /* renamed from: b */
    public static ExceptionDetector f20472b = new ExceptionDetector();

    /* renamed from: c */
    public static C0488k f20473c = new C0488k();

    /* renamed from: d */
    public static AtomicBoolean f20474d = new AtomicBoolean(false);

    static {
        Covode.recordClassIndex(2185);
    }

    /* renamed from: a */
    public static void m21021a() {
        try {
            if (f20474d.compareAndSet(false, true)) {
                ALog.m20785i("awcn.NetworkDetector", "registerListener", null, new Object[0]);
                f20471a.m21028b();
                f20472b.m21041a();
                f20473c.m21025a();
            }
        } catch (Exception e) {
            ALog.m20787e("awcn.NetworkDetector", "[registerListener]error", null, e, new Object[0]);
        }
    }

    /* renamed from: a */
    public static void m21020a(RequestStatistic requestStatistic) {
        if (!f20474d.get()) {
            return;
        }
        f20472b.m21039a(requestStatistic);
    }
}
