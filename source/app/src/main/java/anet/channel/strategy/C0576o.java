package anet.channel.strategy;

import com.bytedance.covode.number.Covode;
import java.util.Comparator;

/* renamed from: anet.channel.strategy.o */
/* loaded from: classes4.dex */
public final class C0576o implements Comparator<StrategyCollection> {
    static {
        Covode.recordClassIndex(2344);
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public final int compare(StrategyCollection strategyCollection, StrategyCollection strategyCollection2) {
        if (strategyCollection.f20703b != strategyCollection2.f20703b) {
            return (int) (strategyCollection.f20703b - strategyCollection2.f20703b);
        }
        return strategyCollection.f20702a.compareTo(strategyCollection2.f20702a);
    }
}
