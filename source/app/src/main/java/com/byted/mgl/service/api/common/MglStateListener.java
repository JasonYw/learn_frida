package com.byted.mgl.service.api.common;

import com.bytedance.covode.number.Covode;
import com.bytedance.minigame.bdpbase.core.BdpError;

/* loaded from: classes26.dex */
public interface MglStateListener {
    static {
        Covode.recordClassIndex(9786);
    }

    void onFailed(BdpError bdpError);

    void onSucceed(boolean z, long j);
}
