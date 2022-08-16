package com.bytedance.android.btm.api;

import com.bytedance.android.btm.api.model.BufferBtm;
import com.bytedance.covode.number.Covode;

/* loaded from: classes18.dex */
public interface IAcrossProcessCallback {
    static {
        Covode.recordClassIndex(11284);
    }

    void run(BufferBtm bufferBtm);
}
