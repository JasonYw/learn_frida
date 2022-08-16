package anet.channel.strategy;

import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.strategy.i */
/* loaded from: classes8.dex */
public class RunnableC0565i implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C0563g f20765a;

    static {
        Covode.recordClassIndex(2333);
    }

    @Override // java.lang.Runnable
    public void run() {
        boolean m20815a;
        m20815a = this.f20765a.m20815a();
        if (!m20815a) {
            this.f20765a.f20760b.m20857c();
        }
    }

    public RunnableC0565i(C0563g c0563g) {
        this.f20765a = c0563g;
    }
}
