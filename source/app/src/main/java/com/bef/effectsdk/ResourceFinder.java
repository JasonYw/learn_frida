package com.bef.effectsdk;

import com.bytedance.covode.number.Covode;

/* loaded from: classes10.dex */
public interface ResourceFinder {
    static {
        Covode.recordClassIndex(9543);
    }

    long createNativeResourceFinder(long j);

    void release(long j);
}
