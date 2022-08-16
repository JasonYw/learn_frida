package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;
import p003X.C522276kH;

/* loaded from: classes23.dex */
public final class NUploadStateRequest {
    public static final C522276kH Companion = new C522276kH(null);
    @SerializedName("file_crc")
    public final long fileCrc;
    @SerializedName("file_md5")
    public final String fileMd5;
    @SerializedName("file_size")
    public final long fileSize;

    static {
        Covode.recordClassIndex(3239);
    }

    public final long getFileCrc() {
        return this.fileCrc;
    }

    public final String getFileMd5() {
        return this.fileMd5;
    }

    public final long getFileSize() {
        return this.fileSize;
    }

    public NUploadStateRequest(String str, long j, long j2) {
        C106862S5w.LIZ(str);
        this.fileMd5 = str;
        this.fileSize = j;
        this.fileCrc = j2;
    }
}
