package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NUploadState {
    @SerializedName("chunks")
    public final List<NChunk> chunks;
    @SerializedName("part_size")
    public final long partSize;

    static {
        Covode.recordClassIndex(3238);
    }

    public final List<NChunk> getChunks() {
        return this.chunks;
    }

    public final long getPartSize() {
        return this.partSize;
    }

    public NUploadState(long j, List<NChunk> list) {
        C106862S5w.LIZ(list);
        this.partSize = j;
        this.chunks = list;
    }
}
