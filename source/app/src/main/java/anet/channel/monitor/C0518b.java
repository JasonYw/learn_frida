package anet.channel.monitor;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.thread.ThreadPoolExecutorFactory;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.bytedance.frameworks.apm.trace.MethodCollector;
import com.bytedance.sdk.bridge.p1355js.delegate.JsBridgeDelegate;

/* renamed from: anet.channel.monitor.b */
/* loaded from: classes20.dex */
public class C0518b {

    /* renamed from: a */
    public static int f20543a;

    /* renamed from: b */
    public static long f20544b;

    /* renamed from: c */
    public static long f20545c;

    /* renamed from: d */
    public static long f20546d;

    /* renamed from: e */
    public static long f20547e;

    /* renamed from: f */
    public static long f20548f;

    /* renamed from: g */
    public static double f20549g;

    /* renamed from: h */
    public static double f20550h;

    /* renamed from: i */
    public static double f20551i;

    /* renamed from: j */
    public static double f20552j = 40.0d;

    /* renamed from: k */
    public static volatile boolean f20553k;

    /* renamed from: l */
    public int f20554l;

    /* renamed from: m */
    public int f20555m;

    /* renamed from: n */
    public C0522e f20556n;

    /* renamed from: e */
    public void m20968e() {
        f20553k = false;
    }

    /* renamed from: a */
    public static C0518b m20978a() {
        return C0519a.f20557a;
    }

    /* renamed from: c */
    public double m20971c() {
        return f20551i;
    }

    /* renamed from: anet.channel.monitor.b$a */
    /* loaded from: classes20.dex */
    public static class C0519a {

        /* renamed from: a */
        public static C0518b f20557a = new C0518b(null);

        static {
            Covode.recordClassIndex(2227);
        }
    }

    static {
        Covode.recordClassIndex(2226);
    }

    /* renamed from: b */
    public int m20974b() {
        if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
            return 1;
        }
        return this.f20554l;
    }

    public C0518b() {
        this.f20554l = 5;
        this.f20556n = new C0522e();
        NetworkStatusHelper.addStatusChangeListener(new C0520c(this));
    }

    /* renamed from: d */
    public synchronized void m20969d() {
        MethodCollector.m14708i(44);
        try {
            ALog.m20785i("awcn.BandWidthSampler", "[startNetworkMeter]", null, "NetworkStatus", NetworkStatusHelper.getStatus());
            if (NetworkStatusHelper.getStatus() == NetworkStatusHelper.NetworkStatus.G2) {
                f20553k = false;
                MethodCollector.m14707o(44);
                return;
            }
            f20553k = true;
            MethodCollector.m14707o(44);
        } catch (Exception e) {
            ALog.m20784w("awcn.BandWidthSampler", "startNetworkMeter fail.", null, e, new Object[0]);
            MethodCollector.m14707o(44);
        }
    }

    public /* synthetic */ C0518b(C0520c c0520c) {
        this();
    }

    /* renamed from: b */
    public static /* synthetic */ int m20973b(C0518b c0518b) {
        int i = c0518b.f20555m;
        c0518b.f20555m = i + 1;
        return i;
    }

    /* renamed from: a */
    public void m20977a(long j, long j2, long j3) {
        if (!f20553k) {
            return;
        }
        if (ALog.isPrintLog(1)) {
            ALog.m20788d("awcn.BandWidthSampler", "onDataReceived", null, "mRequestStartTime", Long.valueOf(j), "mRequestFinishedTime", Long.valueOf(j2), "mRequestDataSize", Long.valueOf(j3));
        }
        if (j3 > JsBridgeDelegate.GET_URL_OUT_TIME && j < j2) {
            ThreadPoolExecutorFactory.submitScheduledTask(new RunnableC0521d(this, j3, j2, j));
        }
    }
}
