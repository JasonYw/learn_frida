package anet.channel.strategy;

import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.strategy.e */
/* loaded from: classes8.dex */
public class RunnableC0561e implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f20755a;

    /* renamed from: b */
    public final /* synthetic */ StrategyInfoHolder f20756b;

    static {
        Covode.recordClassIndex(2329);
    }

    @Override // java.lang.Runnable
    public void run() {
        this.f20756b.m20859a(this.f20755a, true);
    }

    public RunnableC0561e(StrategyInfoHolder strategyInfoHolder, String str) {
        this.f20756b = strategyInfoHolder;
        this.f20755a = str;
    }
}
