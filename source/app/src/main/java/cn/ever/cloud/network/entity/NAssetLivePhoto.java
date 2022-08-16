package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes23.dex */
public final class NAssetLivePhoto {
    @SerializedName("size")
    public final long size;

    static {
        Covode.recordClassIndex(3192);
    }

    public final long getSize() {
        return this.size;
    }

    public NAssetLivePhoto(long j) {
        this.size = j;
    }
}
