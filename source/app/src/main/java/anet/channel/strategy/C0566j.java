package anet.channel.strategy;

import anet.channel.strategy.C0568l;
import anet.channel.strategy.StrategyList;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.strategy.j */
/* loaded from: classes11.dex */
public class C0566j implements StrategyList.Predicate<IPConnStrategy> {

    /* renamed from: a */
    public final /* synthetic */ C0568l.C0569a f20766a;

    /* renamed from: b */
    public final /* synthetic */ String f20767b;

    /* renamed from: c */
    public final /* synthetic */ ConnProtocol f20768c;

    /* renamed from: d */
    public final /* synthetic */ StrategyList f20769d;

    static {
        Covode.recordClassIndex(2334);
    }

    @Override // anet.channel.strategy.StrategyList.Predicate
    /* renamed from: a */
    public boolean apply(IPConnStrategy iPConnStrategy) {
        if (iPConnStrategy.getPort() == this.f20766a.f20771a && iPConnStrategy.getIp().equals(this.f20767b) && iPConnStrategy.protocol.equals(this.f20768c)) {
            return true;
        }
        return false;
    }

    public C0566j(StrategyList strategyList, C0568l.C0569a c0569a, String str, ConnProtocol connProtocol) {
        this.f20769d = strategyList;
        this.f20766a = c0569a;
        this.f20767b = str;
        this.f20768c = connProtocol;
    }
}
