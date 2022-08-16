package anet.channel.p022a;

import anet.channel.GlobalAppRuntimeInfo;
import anet.channel.flow.FlowStat;
import anet.channel.flow.INetworkAnalysis;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;
import com.taobao.analysis.FlowCenter;
import p003X.C116971W2r;

/* renamed from: anet.channel.a.b */
/* loaded from: classes2.dex */
public class C0462b implements INetworkAnalysis {

    /* renamed from: a */
    public boolean f20408a;

    static {
        Covode.recordClassIndex(2151);
    }

    public C0462b() {
        try {
            C116971W2r.LIZ("com.taobao.analysis.FlowCenter");
            this.f20408a = true;
        } catch (Exception unused) {
            this.f20408a = false;
            ALog.m20786e("DefaultNetworkAnalysis", "no NWNetworkAnalysisSDK sdk", null, new Object[0]);
        }
    }

    @Override // anet.channel.flow.INetworkAnalysis
    public void commitFlow(FlowStat flowStat) {
        if (this.f20408a) {
            FlowCenter.getInstance().commitFlow(GlobalAppRuntimeInfo.getContext(), flowStat.refer, flowStat.protocoltype, flowStat.req_identifier, flowStat.upstream, flowStat.downstream);
        }
    }
}
