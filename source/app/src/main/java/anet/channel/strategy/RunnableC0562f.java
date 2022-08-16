package anet.channel.strategy;

import anet.channel.statist.StrategyStatObject;
import anet.channel.strategy.StrategyInfoHolder;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Map;

/* renamed from: anet.channel.strategy.f */
/* loaded from: classes8.dex */
public class RunnableC0562f implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ Map.Entry f20757a;

    /* renamed from: b */
    public final /* synthetic */ StrategyInfoHolder.LruStrategyMap f20758b;

    static {
        Covode.recordClassIndex(2330);
    }

    @Override // java.lang.Runnable
    public void run() {
        StrategyTable strategyTable = (StrategyTable) this.f20757a.getValue();
        if (strategyTable.f20727d) {
            StrategyStatObject strategyStatObject = new StrategyStatObject(1);
            strategyStatObject.writeStrategyFileId = strategyTable.f20724a;
            C0574m.m20807a((Serializable) this.f20757a.getValue(), strategyTable.f20724a, strategyStatObject);
            strategyTable.f20727d = false;
        }
    }

    public RunnableC0562f(StrategyInfoHolder.LruStrategyMap lruStrategyMap, Map.Entry entry) {
        this.f20758b = lruStrategyMap;
        this.f20757a = entry;
    }
}
