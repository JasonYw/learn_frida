package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import com.bytedance.covode.number.Covode;

@Monitor(module = "networkPrefer", monitorPoint = "mtuDetect")
/* loaded from: classes20.dex */
public class MtuDetectStat extends StatObject {
    @Dimension
    public int errCode;
    @Dimension
    public int mtu;
    @Dimension
    public int pingSuccessCount;
    @Dimension
    public int pingTimeoutCount;
    @Dimension
    public String rtt;
    @Dimension
    public String nettype = NetworkStatusHelper.getNetworkSubType();
    @Dimension
    public String mnc = NetworkStatusHelper.getSimOp();
    @Dimension
    public String bssid = NetworkStatusHelper.getWifiBSSID();

    static {
        Covode.recordClassIndex(2271);
    }
}