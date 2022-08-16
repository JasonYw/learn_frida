package anet.channel.heartbeat;

import anet.channel.Session;
import com.bytedance.covode.number.Covode;

/* loaded from: classes20.dex */
public interface IHeartbeat {
    static {
        Covode.recordClassIndex(2216);
    }

    void reSchedule();

    void start(Session session);

    void stop();
}
