package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NAssetEnc {
    @SerializedName("chunks")
    public final List<NEncChunk> chunks;
    @SerializedName("key")
    public final String key;
    @SerializedName("size")
    public final long size;

    static {
        Covode.recordClassIndex(3190);
    }

    public final List<NEncChunk> getChunks() {
        return this.chunks;
    }

    public final String getKey() {
        return this.key;
    }

    public final long getSize() {
        return this.size;
    }

    public NAssetEnc(String str, long j, List<NEncChunk> list) {
        C106862S5w.LIZ(str, list);
        this.key = str;
        this.size = j;
        this.chunks = list;
    }
}
