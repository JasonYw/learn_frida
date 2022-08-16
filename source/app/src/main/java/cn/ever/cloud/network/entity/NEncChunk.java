package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NEncChunk {
    @SerializedName("link")
    public final String link;
    @SerializedName("offset")
    public final long offset;
    @SerializedName("size")
    public final long size;

    static {
        Covode.recordClassIndex(3209);
    }

    public final String getLink() {
        return this.link;
    }

    public final long getOffset() {
        return this.offset;
    }

    public final long getSize() {
        return this.size;
    }

    public NEncChunk(long j, long j2, String str) {
        C106862S5w.LIZ(str);
        this.size = j;
        this.offset = j2;
        this.link = str;
    }
}
