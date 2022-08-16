package cn.everphoto.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes4.dex */
public final class MusicEditInfo implements Serializable {
    @SerializedName("duration")
    public final long duration;
    @SerializedName("music_info")
    public final MusicInfo musicInfo;
    @SerializedName("speed")
    public final double speed;
    @SerializedName("start_time")
    public final long startTime;

    static {
        Covode.recordClassIndex(3621);
    }
}
