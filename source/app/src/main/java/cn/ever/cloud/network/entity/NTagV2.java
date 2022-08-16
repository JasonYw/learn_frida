package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes23.dex */
public final class NTagV2 {
    @SerializedName("added_at_utc")
    public final long addedAtUtc;
    @SerializedName("link_id")
    public final Long linkId;
    @SerializedName("tag_id")
    public final long tagId;

    static {
        Covode.recordClassIndex(3232);
    }

    public final long getAddedAtUtc() {
        return this.addedAtUtc;
    }

    public final Long getLinkId() {
        return this.linkId;
    }

    public final long getTagId() {
        return this.tagId;
    }

    public NTagV2(long j, Long l, long j2) {
        this.tagId = j;
        this.linkId = l;
        this.addedAtUtc = j2;
    }
}
