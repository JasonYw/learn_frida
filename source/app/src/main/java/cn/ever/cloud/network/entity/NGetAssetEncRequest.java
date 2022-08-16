package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C522446kY;

/* loaded from: classes23.dex */
public final class NGetAssetEncRequest {
    public static final C522446kY Companion = new C522446kY(null);
    @SerializedName("asset_id")
    public final long assetId;

    static {
        Covode.recordClassIndex(3213);
    }

    public final long getAssetId() {
        return this.assetId;
    }

    public NGetAssetEncRequest(long j) {
        this.assetId = j;
    }
}
