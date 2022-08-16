package anet.channel;

import anet.channel.bytes.ByteArray;
import anet.channel.statist.RequestStatistic;
import com.bytedance.covode.number.Covode;
import java.util.List;
import java.util.Map;

/* loaded from: classes20.dex */
public interface RequestCb {
    static {
        Covode.recordClassIndex(2136);
    }

    void onDataReceive(ByteArray byteArray, boolean z);

    void onFinish(int i, String str, RequestStatistic requestStatistic);

    void onResponseCode(int i, Map<String, List<String>> map);
}
