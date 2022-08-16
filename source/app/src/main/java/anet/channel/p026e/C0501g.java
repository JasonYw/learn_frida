package anet.channel.p026e;

import anet.channel.strategy.ConnProtocol;
import anet.channel.strategy.IConnStrategy;
import com.bytedance.covode.number.Covode;

/* renamed from: anet.channel.e.g */
/* loaded from: classes2.dex */
public final class C0501g implements IConnStrategy {

    /* renamed from: a */
    public final /* synthetic */ IConnStrategy f20496a;

    static {
        Covode.recordClassIndex(2195);
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final int getConnectionTimeout() {
        return this.f20496a.getConnectionTimeout();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final int getHeartbeat() {
        return this.f20496a.getHeartbeat();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final String getIp() {
        return this.f20496a.getIp();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final int getIpSource() {
        return this.f20496a.getIpSource();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final int getIpType() {
        return this.f20496a.getIpType();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final int getPort() {
        return this.f20496a.getPort();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final int getReadTimeout() {
        return this.f20496a.getReadTimeout();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final int getRetryTimes() {
        return this.f20496a.getRetryTimes();
    }

    @Override // anet.channel.strategy.IConnStrategy
    public final ConnProtocol getProtocol() {
        this.f20496a.getProtocol();
        return ConnProtocol.valueOf("http3_1rtt", null, null);
    }

    public C0501g(IConnStrategy iConnStrategy) {
        this.f20496a = iConnStrategy;
    }
}
