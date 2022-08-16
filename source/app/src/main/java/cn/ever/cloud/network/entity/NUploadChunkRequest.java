package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;
import p003X.C522266kG;

/* loaded from: classes23.dex */
public final class NUploadChunkRequest {
    public static final C522266kG Companion = new C522266kG(null);
    @SerializedName("chunk_crc")
    public final long chunkCrc;
    @SerializedName("chunk_md5")
    public final String chunkMd5;
    @SerializedName("chunk_offset")
    public final long chunkOffset;
    @SerializedName("chunk_size")
    public final long chunkSize;
    @SerializedName("file_md5")
    public final String fileMd5;

    static {
        Covode.recordClassIndex(3234);
    }

    public final long getChunkCrc() {
        return this.chunkCrc;
    }

    public final String getChunkMd5() {
        return this.chunkMd5;
    }

    public final long getChunkOffset() {
        return this.chunkOffset;
    }

    public final long getChunkSize() {
        return this.chunkSize;
    }

    public final String getFileMd5() {
        return this.fileMd5;
    }

    public NUploadChunkRequest(String str, String str2, long j, long j2, long j3) {
        C106862S5w.LIZ(str, str2);
        this.fileMd5 = str;
        this.chunkMd5 = str2;
        this.chunkCrc = j;
        this.chunkOffset = j2;
        this.chunkSize = j3;
    }
}
