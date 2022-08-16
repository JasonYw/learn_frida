package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes.dex */
public final class NAddAssetIosLocalIdParam {
    @SerializedName("asset_id")
    public final long assetId;
    @SerializedName("ios_local_ids")
    public final List<String> iosLocalIds;

    static {
        Covode.recordClassIndex(3185);
    }

    public final long getAssetId() {
        return this.assetId;
    }

    public final List<String> getIosLocalIds() {
        return this.iosLocalIds;
    }

    public NAddAssetIosLocalIdParam(long j, List<String> list) {
        C106862S5w.LIZ(list);
        this.assetId = j;
        this.iosLocalIds = list;
    }
}
