package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NAssetAddToTagParam {
    @SerializedName("added_at_utc")
    public final long addedAtUtc;
    @SerializedName("asset_ids")
    public final List<Long> assetIds;
    @SerializedName("tag_id")
    public final long tagId;

    static {
        Covode.recordClassIndex(3188);
    }

    public final long getAddedAtUtc() {
        return this.addedAtUtc;
    }

    public final List<Long> getAssetIds() {
        return this.assetIds;
    }

    public final long getTagId() {
        return this.tagId;
    }

    public NAssetAddToTagParam(long j, List<Long> list, long j2) {
        C106862S5w.LIZ(list);
        this.tagId = j;
        this.assetIds = list;
        this.addedAtUtc = j2;
    }
}
