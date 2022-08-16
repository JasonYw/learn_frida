package anet.channel.strategy;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface IStrategyFilter {
    static {
        Covode.recordClassIndex(2297);
    }

    boolean accept(IConnStrategy iConnStrategy);
}
