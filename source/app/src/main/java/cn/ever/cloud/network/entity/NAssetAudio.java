package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NAssetAudio {
    @SerializedName("meta")
    public final NAssetMeta meta;
    @SerializedName("resource")
    public final NAssetResource resource;

    static {
        Covode.recordClassIndex(3189);
    }

    public final NAssetMeta getMeta() {
        return this.meta;
    }

    public final NAssetResource getResource() {
        return this.resource;
    }

    public NAssetAudio(NAssetMeta nAssetMeta, NAssetResource nAssetResource) {
        C106862S5w.LIZ(nAssetMeta, nAssetResource);
        this.meta = nAssetMeta;
        this.resource = nAssetResource;
    }
}
