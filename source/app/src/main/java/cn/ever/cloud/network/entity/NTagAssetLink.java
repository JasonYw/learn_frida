package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes23.dex */
public final class NTagAssetLink {
    @SerializedName("asset_id")
    public final long assetId;
    @SerializedName("link_id")
    public final long linkId;

    static {
        Covode.recordClassIndex(3231);
    }

    public final long getAssetId() {
        return this.assetId;
    }

    public final long getLinkId() {
        return this.linkId;
    }

    public NTagAssetLink(long j, long j2) {
        this.linkId = j;
        this.assetId = j2;
    }
}
