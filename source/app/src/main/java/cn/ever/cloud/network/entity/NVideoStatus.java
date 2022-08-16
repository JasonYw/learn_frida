package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes23.dex */
public final class NVideoStatus {
    @SerializedName("asset_id")
    public final long assetId;
    @SerializedName("status")
    public final long status;

    static {
        Covode.recordClassIndex(3243);
    }

    public final long getAssetId() {
        return this.assetId;
    }

    public final long getStatus() {
        return this.status;
    }

    public NVideoStatus(long j, long j2) {
        this.assetId = j;
        this.status = j2;
    }
}
