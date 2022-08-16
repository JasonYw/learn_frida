package anet.channel.monitor;

import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.monitor.f */
/* loaded from: classes2.dex */
public class C0523f {

    /* renamed from: a */
    public boolean f20574a;

    /* renamed from: b */
    public long f20575b;

    /* renamed from: c */
    public final double f20576c = 40.0d;

    /* renamed from: d */
    public boolean f20577d = true;

    static {
        Covode.recordClassIndex(2231);
    }

    /* renamed from: a */
    public int m20965a() {
        return 0;
    }

    /* renamed from: a */
    public boolean m20964a(double d) {
        return d < 40.0d;
    }

    /* renamed from: b */
    public final boolean m20963b() {
        if (!this.f20577d) {
            return false;
        }
        if (System.currentTimeMillis() - this.f20575b > m20965a() * 1000) {
            this.f20577d = false;
            return false;
        }
        return true;
    }
}
