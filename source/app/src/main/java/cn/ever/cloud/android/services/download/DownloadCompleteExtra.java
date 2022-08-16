package cn.ever.cloud.android.services.download;

import com.bytedance.covode.number.Covode;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class DownloadCompleteExtra {
    public final String path;

    static {
        Covode.recordClassIndex(2998);
    }

    public final String getPath() {
        return this.path;
    }

    public DownloadCompleteExtra(String str) {
        C106862S5w.LIZ(str);
        this.path = str;
    }
}
