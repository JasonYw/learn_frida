package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import anet.channel.strategy.C0568l;
import anet.channel.strategy.ConnProtocol;
import anet.channel.util.C0590c;
import com.bytedance.covode.number.Covode;

@Monitor(module = "networkPrefer", monitorPoint = "horseRace")
/* loaded from: classes20.dex */
public class HorseRaceStat extends StatObject {
    @Dimension
    public volatile int connErrorCode;
    @Dimension
    public volatile int connRet;
    @Measure
    public volatile long connTime;
    @Dimension
    public volatile String host;
    @Dimension

    /* renamed from: ip */
    public volatile String f20661ip;
    @Dimension
    public volatile String localIP;
    @Dimension
    public volatile String path;
    @Dimension
    public volatile int pingSuccessCount;
    @Dimension
    public volatile int pingTimeoutCount;
    @Dimension
    public volatile int port;
    @Dimension
    public volatile String protocol;
    @Dimension
    public volatile int reqErrorCode;
    @Dimension
    public volatile int reqRet;
    @Measure
    public volatile long reqTime;
    @Dimension
    public volatile String nettype = NetworkStatusHelper.getNetworkSubType();
    @Dimension
    public volatile String mnc = NetworkStatusHelper.getSimOp();
    @Dimension
    public volatile String bssid = NetworkStatusHelper.getWifiBSSID();
    @Dimension
    public volatile int ipStackType = C0590c.m20767c();

    static {
        Covode.recordClassIndex(2267);
    }

    public HorseRaceStat(String str, C0568l.C0573e c0573e) {
        this.host = str;
        this.f20661ip = c0573e.f20801a;
        this.port = c0573e.f20802b.f20771a;
        this.protocol = ConnProtocol.valueOf(c0573e.f20802b).name;
        this.path = c0573e.f20803c;
    }
}
