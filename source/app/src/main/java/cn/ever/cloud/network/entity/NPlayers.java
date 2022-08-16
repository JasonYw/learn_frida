package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes23.dex */
public final class NPlayers {
    @SerializedName("asset_id")
    public final long assetId;
    @SerializedName("player_360p")
    public final NVideoPlayer player360p;
    @SerializedName("player_480p")
    public final NVideoPlayer player480p;
    @SerializedName("player_720p")
    public final NVideoPlayer player720p;

    static {
        Covode.recordClassIndex(3226);
    }

    public final long getAssetId() {
        return this.assetId;
    }

    public final NVideoPlayer getPlayer360p() {
        return this.player360p;
    }

    public final NVideoPlayer getPlayer480p() {
        return this.player480p;
    }

    public final NVideoPlayer getPlayer720p() {
        return this.player720p;
    }

    public NPlayers(long j, NVideoPlayer nVideoPlayer, NVideoPlayer nVideoPlayer2, NVideoPlayer nVideoPlayer3) {
        this.assetId = j;
        this.player360p = nVideoPlayer;
        this.player480p = nVideoPlayer2;
        this.player720p = nVideoPlayer3;
    }
}
