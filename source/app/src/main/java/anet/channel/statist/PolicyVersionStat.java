package anet.channel.statist;

import anet.channel.status.NetworkStatusHelper;
import com.bytedance.covode.number.Covode;

@Monitor(module = "networkPrefer", monitorPoint = "policyVersion")
/* loaded from: classes20.dex */
public class PolicyVersionStat extends StatObject {
    @Dimension
    public String host;
    @Dimension
    public int reportType;
    @Dimension
    public int version;
    @Dimension
    public String netType = NetworkStatusHelper.getNetworkSubType();
    @Dimension
    public String mnc = NetworkStatusHelper.getSimOp();

    static {
        Covode.recordClassIndex(2273);
    }

    public PolicyVersionStat(String str, int i) {
        this.host = str;
        this.version = i;
    }
}
