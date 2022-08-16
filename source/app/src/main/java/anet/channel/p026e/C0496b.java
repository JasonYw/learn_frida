package anet.channel.p026e;

import anet.channel.strategy.IConnStrategy;
import anet.channel.strategy.IStrategyFilter;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.e.b */
/* loaded from: classes2.dex */
public final class C0496b implements IStrategyFilter {
    static {
        Covode.recordClassIndex(2190);
    }

    @Override // anet.channel.strategy.IStrategyFilter
    public final boolean accept(IConnStrategy iConnStrategy) {
        String str = iConnStrategy.getProtocol().protocol;
        if (!"http3".equals(str) && !"http3plain".equals(str)) {
            return false;
        }
        return true;
    }
}
