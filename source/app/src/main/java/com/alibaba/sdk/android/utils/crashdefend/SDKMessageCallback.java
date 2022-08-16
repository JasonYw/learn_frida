package com.alibaba.sdk.android.utils.crashdefend;

import com.bytedance.covode.number.Covode;

/* loaded from: classes13.dex */
public interface SDKMessageCallback {
    static {
        Covode.recordClassIndex(4526);
    }

    void crashDefendMessage(int i, int i2);
}
