package anet.channel.flow;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface INetworkAnalysis {
    static {
        Covode.recordClassIndex(2206);
    }

    void commitFlow(FlowStat flowStat);
}
