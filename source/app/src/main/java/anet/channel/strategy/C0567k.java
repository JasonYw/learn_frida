package anet.channel.strategy;

import com.bytedance.covode.number.Covode;
import java.util.Comparator;
import java.util.Map;

/* renamed from: anet.channel.strategy.k */
/* loaded from: classes11.dex */
public class C0567k implements Comparator<IPConnStrategy> {

    /* renamed from: a */
    public final /* synthetic */ StrategyList f20770a;

    static {
        Covode.recordClassIndex(2335);
    }

    public C0567k(StrategyList strategyList) {
        this.f20770a = strategyList;
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(IPConnStrategy iPConnStrategy, IPConnStrategy iPConnStrategy2) {
        Map map;
        Map map2;
        int i;
        int i2;
        map = this.f20770a.f20720b;
        map2 = this.f20770a.f20720b;
        int m20875a = ((ConnHistoryItem) map.get(Integer.valueOf(iPConnStrategy.getUniqueId()))).m20875a();
        int m20875a2 = ((ConnHistoryItem) map2.get(Integer.valueOf(iPConnStrategy2.getUniqueId()))).m20875a();
        if (m20875a != m20875a2) {
            return m20875a - m20875a2;
        }
        if (iPConnStrategy.f20698a != iPConnStrategy2.f20698a) {
            i = iPConnStrategy.f20698a;
            i2 = iPConnStrategy2.f20698a;
        } else {
            i = iPConnStrategy.protocol.isHttp;
            i2 = iPConnStrategy2.protocol.isHttp;
        }
        return i - i2;
    }
}
