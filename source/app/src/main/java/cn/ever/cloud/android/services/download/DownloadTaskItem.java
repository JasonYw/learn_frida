package cn.ever.cloud.android.services.download;

import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DownloadTaskItem {
    public final long groupId;
    public final String groupKey;

    /* renamed from: id */
    public final long f21056id;
    public final DownloadMedia media;

    static {
        Covode.recordClassIndex(3017);
    }

    public final long getGroupId() {
        return this.groupId;
    }

    public final String getGroupKey() {
        return this.groupKey;
    }

    public final long getId() {
        return this.f21056id;
    }

    public final DownloadMedia getMedia() {
        return this.media;
    }

    public DownloadTaskItem(long j, DownloadMedia downloadMedia, long j2, String str) {
        C106862S5w.LIZ(downloadMedia, str);
        this.f21056id = j;
        this.media = downloadMedia;
        this.groupId = j2;
        this.groupKey = str;
    }
}
