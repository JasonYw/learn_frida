package anet.channel.flow;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class NetworkAnalysis {
    public static volatile INetworkAnalysis networkAnalysis = new AnalysisProxy(null);

    public static INetworkAnalysis getInstance() {
        return networkAnalysis;
    }

    static {
        Covode.recordClassIndex(2207);
    }

    /* loaded from: classes2.dex */
    public static class AnalysisProxy implements INetworkAnalysis {
        public INetworkAnalysis networkAnalysis;

        static {
            Covode.recordClassIndex(2208);
        }

        public AnalysisProxy(INetworkAnalysis iNetworkAnalysis) {
            this.networkAnalysis = iNetworkAnalysis;
        }

        @Override // anet.channel.flow.INetworkAnalysis
        public void commitFlow(FlowStat flowStat) {
            INetworkAnalysis iNetworkAnalysis = this.networkAnalysis;
            if (iNetworkAnalysis != null) {
                iNetworkAnalysis.commitFlow(flowStat);
            }
        }
    }

    public static void setInstance(INetworkAnalysis iNetworkAnalysis) {
        networkAnalysis = new AnalysisProxy(iNetworkAnalysis);
    }
}
