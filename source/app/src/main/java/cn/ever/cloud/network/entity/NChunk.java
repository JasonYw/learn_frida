package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes23.dex */
public final class NChunk {
    @SerializedName("offset")
    public final long offset;
    @SerializedName("size")
    public final long size;

    static {
        Covode.recordClassIndex(3199);
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getSize() {
        return this.size;
    }

    public NChunk(long j, long j2) {
        this.offset = j;
        this.size = j2;
    }
}
