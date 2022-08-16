package anet.channel.heartbeat;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public class HeartbeatManager {
    static {
        Covode.recordClassIndex(2215);
    }

    public static IHeartbeat getDefaultBackgroundAccsHeartbeat() {
        return new RunnableC0511a();
    }

    public static IHeartbeat getDefaultHeartbeat() {
        return new RunnableC0512b();
    }
}
