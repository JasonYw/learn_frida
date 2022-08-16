package com.bytedance.android.live.pcdn.api;

import com.bytedance.covode.number.Covode;

/* loaded from: classes5.dex */
public interface IPCDNDownloaderListener {
    static {
        Covode.recordClassIndex(32751);
    }

    void notifyAllCompleteFiles(String[] strArr);

    void notifyAllUnfinishedFiles(String[] strArr);

    void notifyMsg(String str, String str2);

    void notifyOdlLog(int i, String str);

    void notifyPointLog(int i, String str);
}
