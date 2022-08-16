package anet.channel.monitor;

import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.monitor.d */
/* loaded from: classes20.dex */
public class RunnableC0521d implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ long f20559a;

    /* renamed from: b */
    public final /* synthetic */ long f20560b;

    /* renamed from: c */
    public final /* synthetic */ long f20561c;

    /* renamed from: d */
    public final /* synthetic */ C0518b f20562d;

    static {
        Covode.recordClassIndex(2229);
    }

    @Override // java.lang.Runnable
    public void run() {
        C0522e c0522e;
        int i;
        C0522e c0522e2;
        C0518b.f20543a++;
        C0518b.f20547e += this.f20559a;
        if (C0518b.f20543a == 1) {
            C0518b.f20546d = this.f20560b - this.f20561c;
        }
        if (C0518b.f20543a >= 2 && C0518b.f20543a <= 3) {
            if (this.f20561c >= C0518b.f20545c) {
                C0518b.f20546d += this.f20560b - this.f20561c;
            } else if (this.f20561c < C0518b.f20545c && this.f20560b >= C0518b.f20545c) {
                long j = C0518b.f20546d + (this.f20560b - this.f20561c);
                C0518b.f20546d = j;
                C0518b.f20546d = j - (C0518b.f20545c - this.f20561c);
            }
        }
        C0518b.f20544b = this.f20561c;
        C0518b.f20545c = this.f20560b;
        if (C0518b.f20543a != 3) {
            return;
        }
        c0522e = this.f20562d.f20556n;
        C0518b.f20551i = (long) c0522e.m20966a(C0518b.f20547e, C0518b.f20546d);
        C0518b.f20548f++;
        C0518b.m20973b(this.f20562d);
        if (C0518b.f20548f > 30) {
            c0522e2 = this.f20562d.f20556n;
            c0522e2.m20967a();
            C0518b.f20548f = 3L;
        }
        double d = (C0518b.f20551i * 0.68d) + (C0518b.f20550h * 0.27d) + (C0518b.f20549g * 0.05d);
        C0518b.f20549g = C0518b.f20550h;
        C0518b.f20550h = C0518b.f20551i;
        if (C0518b.f20551i < C0518b.f20549g * 0.65d || C0518b.f20551i > C0518b.f20549g * 2.0d) {
            C0518b.f20551i = d;
        }
        int i2 = 5;
        if (ALog.isPrintLog(1)) {
            ALog.m20788d("awcn.BandWidthSampler", "NetworkSpeed", null, "mKalmanDataSize", Long.valueOf(C0518b.f20547e), "mKalmanTimeUsed", Long.valueOf(C0518b.f20546d), "speed", Double.valueOf(C0518b.f20551i), "mSpeedKalmanCount", Long.valueOf(C0518b.f20548f));
        }
        i = this.f20562d.f20555m;
        if (i > 5 || C0518b.f20548f == 2) {
            C0517a.m20982a().m20981a(C0518b.f20551i);
            this.f20562d.f20555m = 0;
            C0518b c0518b = this.f20562d;
            if (C0518b.f20551i < C0518b.f20552j) {
                i2 = 1;
            }
            c0518b.f20554l = i2;
            ALog.m20785i("awcn.BandWidthSampler", "NetworkSpeed notification!", null, "Send Network quality notification.");
        }
        C0518b.f20546d = 0L;
        C0518b.f20547e = 0L;
        C0518b.f20543a = 0;
    }

    public RunnableC0521d(C0518b c0518b, long j, long j2, long j3) {
        this.f20562d = c0518b;
        this.f20559a = j;
        this.f20560b = j2;
        this.f20561c = j3;
    }
}
