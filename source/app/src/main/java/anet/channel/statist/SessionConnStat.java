package anet.channel.statist;

import anet.channel.Session;
import anet.channel.status.NetworkStatusHelper;
import com.bytedance.covode.number.Covode;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONException;
import org.json.JSONObject;

@Monitor(module = "networkPrefer", monitorPoint = "conn_stat")
/* loaded from: classes2.dex */
public class SessionConnStat extends StatObject {
    @Measure(max = 60000.0d)
    public long authTime;
    @Dimension
    public String errorCode;
    @Dimension
    public String errorMsg;
    @Dimension
    public StringBuilder errorTrace;
    @Dimension
    public JSONObject extra;
    @Dimension
    public String host;
    @Dimension

    /* renamed from: ip */
    public String f20665ip;
    @Dimension
    public int ipRefer;
    public volatile boolean isCommited;
    @Dimension
    public int isProxy;
    @Dimension
    public int port;
    @Dimension
    public String protocolType;
    @Dimension
    public int ret;
    public volatile long start;
    public volatile long startConnect;
    @Measure(max = 60000.0d)
    public long totalTime;
    @Dimension
    public String unit;
    @Dimension
    public int ipType = 1;
    @Dimension
    public double lng = 90000.0d;
    @Dimension
    public double lat = 90000.0d;
    @Dimension
    public float accuracy = -1.0f;
    @Dimension
    public String netType = NetworkStatusHelper.getNetworkSubType();
    @Dimension
    public String bssid = NetworkStatusHelper.getWifiBSSID();
    @Dimension
    public int roaming = NetworkStatusHelper.isRoaming() ? 1 : 0;
    @Dimension
    public String mnc = NetworkStatusHelper.getSimOp();
    @Dimension
    public int retryTimes = -1;

    static {
        Covode.recordClassIndex(2277);
    }

    @Override // anet.channel.statist.StatObject
    public boolean beforeCommit() {
        if (this.isCommited) {
            return false;
        }
        this.isCommited = true;
        return true;
    }

    public void appendErrorTrace(int i) {
        if (this.errorTrace == null) {
            this.errorTrace = new StringBuilder();
        }
        if (this.errorTrace.length() > 0) {
            this.errorTrace.append(Constants.ACCEPT_TIME_SEPARATOR_SP);
        }
        StringBuilder sb = this.errorTrace;
        sb.append(i);
        sb.append("=");
        sb.append(System.currentTimeMillis() - this.startConnect);
    }

    public void syncValueFromSession(Session session) {
        SessionStatistic sessionStatistic = session.f20361q;
        this.f20665ip = sessionStatistic.f20666ip;
        this.port = sessionStatistic.port;
        this.ipRefer = sessionStatistic.ipRefer;
        this.ipType = sessionStatistic.ipType;
        this.protocolType = sessionStatistic.conntype;
        this.host = sessionStatistic.host;
        this.isProxy = sessionStatistic.isProxy;
        this.authTime = sessionStatistic.authTime;
        this.unit = session.getUnit();
        if (this.unit == null && this.ipRefer == 1) {
            this.unit = "LocalDNS";
        }
    }

    public void putExtra(String str, Object obj) {
        try {
            if (this.extra == null) {
                this.extra = new JSONObject();
            }
            this.extra.put(str, obj);
        } catch (JSONException unused) {
        }
    }
}
