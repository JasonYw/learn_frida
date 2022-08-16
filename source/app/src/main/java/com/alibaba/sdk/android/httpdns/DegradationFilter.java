package com.alibaba.sdk.android.httpdns;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface DegradationFilter {
    static {
        Covode.recordClassIndex(4427);
    }

    boolean shouldDegradeHttpDNS(String str);
}
