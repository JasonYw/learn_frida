package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C116343Vqz;

/* loaded from: classes13.dex */
public final class NDownloadAssetRequest {
    public static final C116343Vqz Companion = new C116343Vqz(null);
    @SerializedName("asset_id")
    public final long assetId;
    @SerializedName("livephoto_video")
    public final Boolean livephotoVideo;

    static {
        Covode.recordClassIndex(3207);
    }

    public final long getAssetId() {
        return this.assetId;
    }

    public final Boolean getLivephotoVideo() {
        return this.livephotoVideo;
    }

    public NDownloadAssetRequest(long j, Boolean bool) {
        this.assetId = j;
        this.livephotoVideo = bool;
    }
}
