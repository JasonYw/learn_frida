package com.alibaba.sdk.android.httpdns;

import com.alibaba.sdk.android.httpdns.net64.Net64Service;
import com.alibaba.sdk.android.httpdns.probe.IPProbeItem;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public interface HttpDnsService extends Net64Service {
    static {
        Covode.recordClassIndex(4433);
    }

    void clearSdnsGlobalParams();

    String getIpByHostAsync(String str);

    HTTPDNSResult getIpsByHostAsync(String str, Map<String, String> map, String str2);

    String[] getIpsByHostAsync(String str);

    String getSessionId();

    void setAuthCurrentTime(long j);

    void setCachedIPEnabled(boolean z);

    void setCachedIPEnabled(boolean z, boolean z2);

    void setDegradationFilter(DegradationFilter degradationFilter);

    void setExpiredIPEnabled(boolean z);

    void setHTTPSRequestEnabled(boolean z);

    void setIPProbeList(List<IPProbeItem> list);

    void setLogEnabled(boolean z);

    void setLogger(ILogger iLogger);

    void setPreResolveAfterNetworkChanged(boolean z);

    void setPreResolveHosts(ArrayList<String> arrayList);

    void setRegion(String str);

    void setSdnsGlobalParams(Map<String, String> map);

    void setTimeoutInterval(int i);
}
