package com.byted.mgl.service.api.platform;

import com.bytedance.covode.number.Covode;

/* loaded from: classes26.dex */
public interface MglPreloadListener {
    static {
        Covode.recordClassIndex(9796);
    }

    void onFailed(String str, String str2);

    void onSucceed(String str);
}
