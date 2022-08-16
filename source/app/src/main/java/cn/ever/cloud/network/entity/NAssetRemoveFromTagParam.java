package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes22.dex */
public final class NAssetRemoveFromTagParam {
    @SerializedName("asset_ids")
    public final List<Long> assetIds;
    @SerializedName("tag_id")
    public final long tagId;

    static {
        Covode.recordClassIndex(3196);
    }

    public final List<Long> getAssetIds() {
        return this.assetIds;
    }

    public final long getTagId() {
        return this.tagId;
    }

    public NAssetRemoveFromTagParam(long j, List<Long> list) {
        C106862S5w.LIZ(list);
        this.tagId = j;
        this.assetIds = list;
    }
}
