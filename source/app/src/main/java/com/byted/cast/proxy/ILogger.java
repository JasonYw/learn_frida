package com.byted.cast.proxy;

import com.bytedance.covode.number.Covode;

/* loaded from: classes8.dex */
public interface ILogger {
    static {
        Covode.recordClassIndex(9772);
    }

    void onDebug(String str, String str2);

    void onError(String str, String str2);

    void onError(String str, String str2, Throwable th);

    void onInfo(String str, String str2);

    void onVerbose(String str, String str2);

    void onWarn(String str, String str2);
}
