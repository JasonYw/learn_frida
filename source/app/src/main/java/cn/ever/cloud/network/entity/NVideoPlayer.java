package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NVideoPlayer {
    @SerializedName("backup_url")
    public final String backupUrl;
    @SerializedName("key")
    public final String key;
    @SerializedName("main_url")
    public final String mainUrl;

    static {
        Covode.recordClassIndex(3242);
    }

    public final String getBackupUrl() {
        return this.backupUrl;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getMainUrl() {
        return this.mainUrl;
    }

    public NVideoPlayer(String str, String str2, String str3) {
        C106862S5w.LIZ(str, str2, str3);
        this.mainUrl = str;
        this.backupUrl = str2;
        this.key = str3;
    }
}
