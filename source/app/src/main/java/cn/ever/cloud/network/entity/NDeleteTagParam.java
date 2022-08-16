package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes23.dex */
public final class NDeleteTagParam {
    @SerializedName("tag_id")
    public final long tagId;

    static {
        Covode.recordClassIndex(3206);
    }

    public final long getTagId() {
        return this.tagId;
    }

    public NDeleteTagParam(long j) {
        this.tagId = j;
    }
}
