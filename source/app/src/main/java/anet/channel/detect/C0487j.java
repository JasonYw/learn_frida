package anet.channel.detect;

import anet.channel.strategy.C0568l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.detect.j */
/* loaded from: classes20.dex */
public final class C0487j implements IConnStrategy {

    /* renamed from: a */
    public final /* synthetic */ C0568l.C0573e f20465a;

    /* renamed from: b */
    public final /* synthetic */ ConnProtocol f20466b;

    static {
        Covode.recordClassIndex(2181);
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final int getHeartbeat() {
        return 0;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final int getIpSource() {
        return 2;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final int getIpType() {
        return 1;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final int getRetryTimes() {
        return 0;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final ConnProtocol getProtocol() {
        return this.f20466b;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final int getConnectionTimeout() {
        return this.f20465a.f20802b.f20773c;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final String getIp() {
        return this.f20465a.f20801a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final int getPort() {
        return this.f20465a.f20802b.f20771a;
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final int getReadTimeout() {
        return this.f20465a.f20802b.f20774d;
    }

    public C0487j(C0568l.C0573e c0573e, ConnProtocol connProtocol) {
        this.f20465a = c0573e;
        this.f20466b = connProtocol;
    }
}
