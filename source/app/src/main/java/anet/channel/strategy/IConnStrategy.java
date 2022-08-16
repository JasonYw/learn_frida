package anet.channel.strategy;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface IConnStrategy {
    static {
        Covode.recordClassIndex(2295);
    }

    int getConnectionTimeout();

    int getHeartbeat();

    String getIp();

    int getIpSource();

    int getIpType();

    int getPort();

    ConnProtocol getProtocol();

    int getReadTimeout();

    int getRetryTimes();
}
