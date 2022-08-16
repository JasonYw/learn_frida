package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NGetVideoPlayerResponseData {
    @SerializedName("failed_assets")
    public final List<NVideoStatus> failedAssets;
    @SerializedName("video_players")
    public final List<NPlayers> videoPlayers;

    static {
        Covode.recordClassIndex(3222);
    }

    public final List<NVideoStatus> getFailedAssets() {
        return this.failedAssets;
    }

    public final List<NPlayers> getVideoPlayers() {
        return this.videoPlayers;
    }

    public NGetVideoPlayerResponseData(List<NPlayers> list, List<NVideoStatus> list2) {
        C106862S5w.LIZ(list, list2);
        this.videoPlayers = list;
        this.failedAssets = list2;
    }
}
