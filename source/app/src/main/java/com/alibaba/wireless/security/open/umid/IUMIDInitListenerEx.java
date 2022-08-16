package com.alibaba.wireless.security.open.umid;

import com.bytedance.covode.number.Covode;

/* loaded from: classes2.dex */
public interface IUMIDInitListenerEx {
    static {
        Covode.recordClassIndex(4600);
    }

    void onUMIDInitFinishedEx(String str, int i);
}
