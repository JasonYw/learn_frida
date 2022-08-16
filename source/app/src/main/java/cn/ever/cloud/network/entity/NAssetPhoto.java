package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NAssetPhoto {
    @SerializedName("exif")
    public final NAssetExif exif;
    @SerializedName("meta")
    public final NAssetMeta meta;
    @SerializedName("resource")
    public final NAssetResource resource;

    static {
        Covode.recordClassIndex(3194);
    }

    public final NAssetExif getExif() {
        return this.exif;
    }

    public final NAssetMeta getMeta() {
        return this.meta;
    }

    public final NAssetResource getResource() {
        return this.resource;
    }

    public NAssetPhoto(NAssetMeta nAssetMeta, NAssetResource nAssetResource, NAssetExif nAssetExif) {
        C106862S5w.LIZ(nAssetMeta, nAssetResource);
        this.meta = nAssetMeta;
        this.resource = nAssetResource;
        this.exif = nAssetExif;
    }
}
