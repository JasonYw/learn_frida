package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NCommandResultData {
    @SerializedName("asset_list")
    public final List<NAsset> assetList;
    @SerializedName("tag")
    public final NPackTag tag;

    static {
        Covode.recordClassIndex(3203);
    }

    public final List<NAsset> getAssetList() {
        return this.assetList;
    }

    public final NPackTag getTag() {
        return this.tag;
    }

    public NCommandResultData(NPackTag nPackTag, List<NAsset> list) {
        C106862S5w.LIZ(list);
        this.tag = nPackTag;
        this.assetList = list;
    }
}
