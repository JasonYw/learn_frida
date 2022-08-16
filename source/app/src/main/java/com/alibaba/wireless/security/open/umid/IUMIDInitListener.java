package com.alibaba.wireless.security.open.umid;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface IUMIDInitListener {
    static {
        Covode.recordClassIndex(4599);
    }

    void onUMIDInitFinished(boolean z);
}
