package com.bytedance.android.live.pcdn.api;

import com.bytedance.covode.number.Covode;

/* loaded from: classes5.dex */
public interface IPCDNDownloadTask {
    static {
        Covode.recordClassIndex(32748);
    }

    void deleteFile();

    long getProgress();

    int getSpeed();

    void setStringValue(String str, String str2);

    int start(IPCDNDownloadTaskListener iPCDNDownloadTaskListener);

    void stop();
}
