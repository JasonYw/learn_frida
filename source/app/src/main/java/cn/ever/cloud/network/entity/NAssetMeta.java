package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes23.dex */
public final class NAssetMeta {
    @SerializedName("duration")
    public final Double duration;
    @SerializedName("key")
    public final String key;
    @SerializedName("preview1080Url")
    public final String preview1080Url;
    @SerializedName("preview360Url")
    public final String preview360Url;
    @SerializedName("preview720Url")
    public final String preview720Url;

    static {
        Covode.recordClassIndex(3193);
    }

    public final Double getDuration() {
        return this.duration;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getPreview1080Url() {
        return this.preview1080Url;
    }

    public final String getPreview360Url() {
        return this.preview360Url;
    }

    public final String getPreview720Url() {
        return this.preview720Url;
    }

    public NAssetMeta(Double d, String str, String str2, String str3, String str4) {
        this.duration = d;
        this.preview360Url = str;
        this.preview720Url = str2;
        this.preview1080Url = str3;
        this.key = str4;
    }
}
