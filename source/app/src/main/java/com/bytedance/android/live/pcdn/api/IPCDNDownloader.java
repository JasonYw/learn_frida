package com.bytedance.android.live.pcdn.api;

import com.bytedance.covode.number.Covode;
import java.util.List;

/* loaded from: classes5.dex */
public interface IPCDNDownloader {
    static {
        Covode.recordClassIndex(32750);
    }

    IPCDNDownloadTask createTask(String str, String str2, String str3);

    int deleteFile(String str);

    int deleteTask(IPCDNDownloadTask iPCDNDownloadTask);

    void destroy();

    List<String> getAllCompleteFiles();

    String getStringValue(String str);

    int init(String str, IPCDNDownloaderListener iPCDNDownloaderListener);

    List<IPCDNDownloadTask> resumeAllUnfinishedTasks();

    int setStringValue(String str, String str2);
}
