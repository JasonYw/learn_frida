package anet.channel.fulltrace;

import anet.channel.statist.RequestStatistic;
import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface IFullTraceAnalysis {
    static {
        Covode.recordClassIndex(2209);
    }

    void commitRequest(String str, RequestStatistic requestStatistic);

    String createRequest();

    C0508b getSceneInfo();
}
