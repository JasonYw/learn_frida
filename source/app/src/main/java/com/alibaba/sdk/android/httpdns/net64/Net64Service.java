package com.alibaba.sdk.android.httpdns.net64;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface Net64Service {
    static {
        Covode.recordClassIndex(4490);
    }

    void enableIPv6(boolean z);

    String getIPv6ByHostAsync(String str);
}
