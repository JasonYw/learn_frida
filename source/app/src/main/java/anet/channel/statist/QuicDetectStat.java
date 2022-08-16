package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.IConnStrategy;
import com.bytedance.covode.number.Covode;

@Monitor(module = "networkPrefer", monitorPoint = "quic_detect")
/* loaded from: classes2.dex */
public class QuicDetectStat extends StatObject {
    @Dimension
    public String host;
    @Dimension

    /* renamed from: ip */
    public String f20663ip;
    @Dimension
    public volatile String netType;
    @Dimension
    public String protocol;
    @Dimension
    public int ret;

    static {
        Covode.recordClassIndex(2274);
    }

    public QuicDetectStat(String str, IConnStrategy iConnStrategy) {
        this.host = str;
        if (iConnStrategy != null) {
            this.f20663ip = iConnStrategy.getIp();
            this.protocol = iConnStrategy.getProtocol().protocol;
        }
        this.netType = NetworkStatusHelper.getNetworkSubType();
    }
}
