package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NAssetResource {
    @SerializedName("md5")
    public final String md5;
    @SerializedName("mime")
    public final String mime;
    @SerializedName("size")
    public final long size;

    static {
        Covode.recordClassIndex(3197);
    }

    public final String getMd5() {
        return this.md5;
    }

    public final String getMime() {
        return this.mime;
    }

    public final long getSize() {
        return this.size;
    }

    public NAssetResource(String str, long j, String str2) {
        C106862S5w.LIZ(str);
        this.md5 = str;
        this.size = j;
        this.mime = str2;
    }
}
