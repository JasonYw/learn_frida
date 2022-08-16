package anet.channel;

import anet.channel.heartbeat.IHeartbeat;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public class SessionInfo {
    public final IAuth auth;
    public final DataFrameCb dataFrameCb;
    public final IHeartbeat heartbeat;
    public final String host;
    public final boolean isAccs;
    public final boolean isKeepAlive;

    static {
        Covode.recordClassIndex(2142);
    }

    public static SessionInfo create(String str, boolean z, boolean z2, IAuth iAuth, IHeartbeat iHeartbeat, DataFrameCb dataFrameCb) {
        return new SessionInfo(str, z, z2, iAuth, iHeartbeat, dataFrameCb);
    }

    public SessionInfo(String str, boolean z, boolean z2, IAuth iAuth, IHeartbeat iHeartbeat, DataFrameCb dataFrameCb) {
        this.host = str;
        this.isAccs = z2;
        this.auth = iAuth;
        this.isKeepAlive = z;
        this.heartbeat = iHeartbeat;
        this.dataFrameCb = dataFrameCb;
    }
}
