package cn.ever.cloud.network.retrofit;

import com.bytedance.covode.number.Covode;

/* loaded from: classes8.dex */
public interface NetCall {
    static {
        Covode.recordClassIndex(3253);
    }

    void cancel();

    NetResponse execute();

    NetRequest getRequest();

    boolean setThrottleNetSpeed(long j);
}
