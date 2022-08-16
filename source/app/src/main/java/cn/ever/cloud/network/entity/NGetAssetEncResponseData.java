package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes23.dex */
public final class NGetAssetEncResponseData {
    @SerializedName("asset_enc")
    public final NAssetEnc assetEnc;

    static {
        Covode.recordClassIndex(3215);
    }

    public final NAssetEnc getAssetEnc() {
        return this.assetEnc;
    }

    public NGetAssetEncResponseData(NAssetEnc nAssetEnc) {
        this.assetEnc = nAssetEnc;
    }
}
