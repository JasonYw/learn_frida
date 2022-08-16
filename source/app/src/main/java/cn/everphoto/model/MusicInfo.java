package cn.everphoto.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class MusicInfo implements Serializable {
    @SerializedName("music_id")
    public final String musicId;
    @SerializedName("music_url")
    public final String musicUrl;

    static {
        Covode.recordClassIndex(3623);
    }

    public MusicInfo() {
        this(null, null, 3);
    }

    public MusicInfo(String str, String str2) {
        this.musicId = str;
        this.musicUrl = str2;
    }

    public /* synthetic */ MusicInfo(String str, String str2, int i) {
        this(null, null);
    }
}
