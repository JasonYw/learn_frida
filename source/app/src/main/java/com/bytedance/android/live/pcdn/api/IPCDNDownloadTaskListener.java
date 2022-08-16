package com.bytedance.android.live.pcdn.api;

import com.bytedance.covode.number.Covode;

/* loaded from: classes5.dex */
public interface IPCDNDownloadTaskListener {
    static {
        Covode.recordClassIndex(32749);
    }

    void notifyMsg(IPCDNDownloadTask iPCDNDownloadTask, String str, String str2);

    void notifyTaskComplete(IPCDNDownloadTask iPCDNDownloadTask);

    void notifyTaskData(IPCDNDownloadTask iPCDNDownloadTask, long j, long j2);

    void notifyTaskError(IPCDNDownloadTask iPCDNDownloadTask, int i, String str);

    void notifyTaskProgress(IPCDNDownloadTask iPCDNDownloadTask, long j, long j2, long j3);
}
