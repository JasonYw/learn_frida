package com.alibaba.sdk.android.httpdns.probe;

import com.bytedance.covode.number.Covode;

/* loaded from: classes19.dex */
public interface IPProbeService {

    /* renamed from: com.alibaba.sdk.android.httpdns.probe.IPProbeService$a */
    /* loaded from: classes16.dex */
    public enum EnumC1091a {
        NO_PROBING,
        PROBING;

        static {
            Covode.recordClassIndex(4500);
        }
    }

    static {
        Covode.recordClassIndex(4499);
    }

    EnumC1091a getProbeStatus(String str);

    void launchIPProbeTask(String str, int i, String[] strArr);

    void setIPListUpdateCallback(AbstractC1093b abstractC1093b);

    boolean stopIPProbeTask(String str);
}
