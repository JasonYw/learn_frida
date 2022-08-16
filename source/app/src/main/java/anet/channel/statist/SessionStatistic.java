package anet.channel.statist;

import anet.channel.AwcnConfig;
import anet.channel.entity.C0502a;
import anet.channel.fulltrace.C0506a;
import anet.channel.fulltrace.C0508b;
import anet.channel.p026e.C0493a;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

@Monitor(module = "networkPrefer", monitorPoint = "session")
/* loaded from: classes2.dex */
public class SessionStatistic extends StatObject {
    public static int maxRetryTime;
    @Measure
    public long ackTime;
    @Measure(max = 15000.0d)
    public long authTime;
    @Measure
    public long cfRCount;
    @Dimension
    public String closeReason;
    @Dimension
    public int congControlKind;
    @Measure(max = 15000.0d, name = "connTime")
    public long connectionTime;
    @Dimension(name = "protocolType")
    public String conntype;
    @Dimension
    public String dcid;
    @Dimension
    public long errorCode;
    @Dimension
    public JSONObject extra;
    @Dimension
    public String host;
    @Measure
    public long inceptCount;
    @Dimension

    /* renamed from: ip */
    public String f20666ip;
    @Dimension
    public int ipRefer;
    @Dimension
    public int ipType;
    @Dimension
    public boolean isBackground;
    public boolean isCommitted;
    @Dimension
    public long isKL;
    @Dimension
    public int isProxy;
    @Dimension
    public String isTunnel;
    @Measure
    public int lastPingInterval;
    @Measure(max = 86400.0d)
    public long liveTime;
    @Measure
    public double lossRate;
    @Dimension
    public String netType;
    @Measure
    public long pRate;
    @Dimension
    public int port;
    @Measure
    public long ppkgCount;
    @Measure
    public long recvSizeCount;
    @Dimension
    public int ret;
    @Measure
    public double retransmissionRate;
    @Dimension
    public long retryTimes;
    @Measure
    public int rtoCount;
    @Dimension
    public String scid;
    @Dimension
    public int sdkv;
    @Measure
    public long sendSizeCount;
    @Measure
    public long srtt;
    @Measure(max = 15000.0d)
    public long sslCalTime;
    @Measure(max = 15000.0d)
    public long sslTime;
    @Measure
    public int tlpCount;
    @Dimension
    public int xqc0RttStatus;
    @Dimension
    public String xqcConnEnv;
    @Measure(constantValue = 1.0d)
    public long requestCount = 1;
    @Measure(constantValue = 0.0d)
    public long stdRCount = 1;

    static {
        Covode.recordClassIndex(2279);
    }

    public AlarmObject getAlarmObject() {
        boolean z;
        AlarmObject alarmObject = new AlarmObject();
        alarmObject.module = "networkPrefer";
        alarmObject.modulePoint = "connect_succ_rate";
        if (this.ret != 0) {
            z = true;
        } else {
            z = false;
        }
        alarmObject.isSuccess = z;
        if (alarmObject.isSuccess) {
            alarmObject.arg = this.closeReason;
            return alarmObject;
        }
        alarmObject.errorCode = String.valueOf(this.errorCode);
        return alarmObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r3 != (-2601)) goto L14;
     */
    @Override // anet.channel.statist.StatObject
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean beforeCommit() {
        /*
            r7 = this;
            int r0 = r7.ret
            r6 = 0
            r5 = 1
            if (r0 != 0) goto L52
            long r3 = r7.retryTimes
            int r0 = anet.channel.statist.SessionStatistic.maxRetryTime
            long r1 = (long) r0
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L1d
            long r3 = r7.errorCode
            r1 = -2613(0xfffffffffffff5cb, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L1d
            r1 = -2601(0xfffffffffffff5d7, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L52
        L1d:
            boolean r0 = anet.channel.util.ALog.isPrintLog(r5)
            if (r0 == 0) goto L51
            r4 = 0
            r0 = 5
            java.lang.Object[] r3 = new java.lang.Object[r0]
            long r0 = r7.retryTimes
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3[r6] = r0
            java.lang.String r0 = "maxRetryTime"
            r3[r5] = r0
            r1 = 2
            int r0 = anet.channel.statist.SessionStatistic.maxRetryTime
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3[r1] = r0
            r1 = 3
            java.lang.String r0 = "errorCode"
            r3[r1] = r0
            r2 = 4
            long r0 = r7.errorCode
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r3[r2] = r0
            java.lang.String r1 = "SessionStat no need commit"
            java.lang.String r0 = "retry:"
            anet.channel.util.ALog.m20788d(r1, r4, r0, r3)
        L51:
            return r6
        L52:
            boolean r0 = r7.isCommitted
            if (r0 == 0) goto L57
            return r6
        L57:
            r7.isCommitted = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: anet.channel.statist.SessionStatistic.beforeCommit():boolean");
    }

    public SessionStatistic(C0502a c0502a) {
        this.ipType = 1;
        if (c0502a == null) {
            return;
        }
        this.f20666ip = c0502a.m20995a();
        this.port = c0502a.m20994b();
        if (c0502a.f20497a != null) {
            this.ipRefer = c0502a.f20497a.getIpSource();
            this.ipType = c0502a.f20497a.getIpType();
        }
        this.pRate = c0502a.m20989g();
        this.conntype = c0502a.m20993c().toString();
        this.retryTimes = c0502a.f20498b;
        maxRetryTime = c0502a.f20499c;
        String str = null;
        C0508b sceneInfo = C0506a.m20987a().getSceneInfo();
        str = sceneInfo != null ? sceneInfo.f20519f : str;
        boolean m21007b = C0493a.m21007b();
        boolean isHttp3OrangeEnable = AwcnConfig.isHttp3OrangeEnable();
        this.xqcConnEnv = isHttp3OrangeEnable + "_" + m21007b + "_" + str;
    }
}
