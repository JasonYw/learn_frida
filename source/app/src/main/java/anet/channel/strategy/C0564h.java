package anet.channel.strategy;

import anet.channel.AwcnConfig;
import anet.channel.p026e.C0493a;
import anet.channel.util.ALog;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.strategy.h */
/* loaded from: classes2.dex */
public class C0564h implements IStrategyFilter {

    /* renamed from: a */
    public final /* synthetic */ C0563g f20764a;

    static {
        Covode.recordClassIndex(2332);
    }

    public C0564h(C0563g c0563g) {
        this.f20764a = c0563g;
    }

    @Override // anet.channel.strategy.IStrategyFilter
    public boolean accept(IConnStrategy iConnStrategy) {
        String str = iConnStrategy.getProtocol().protocol;
        if (!"quic".equals(str) && !"quicplain".equals(str)) {
            boolean isHttp3Enable = AwcnConfig.isHttp3Enable();
            boolean m21007b = C0493a.m21007b();
            if ((isHttp3Enable && m21007b) || (!"http3".equals(str) && !"http3plain".equals(str))) {
                return true;
            }
            ALog.m20785i("awcn.StrategyCenter", "http3 strategy disabled", null, "strategy", iConnStrategy);
            return false;
        }
        ALog.m20785i("awcn.StrategyCenter", "gquic strategy disabled", null, "strategy", iConnStrategy);
        return false;
    }
}
