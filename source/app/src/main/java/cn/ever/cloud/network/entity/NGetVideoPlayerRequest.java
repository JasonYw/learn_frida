package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C106862S5w;
import p003X.C522216kB;

/* loaded from: classes23.dex */
public final class NGetVideoPlayerRequest {
    public static final C522216kB Companion = new C522216kB(null);
    @SerializedName("asset_ids")
    public final List<Long> assetIds;

    static {
        Covode.recordClassIndex(3220);
    }

    public final List<Long> getAssetIds() {
        return this.assetIds;
    }

    public NGetVideoPlayerRequest(List<Long> list) {
        C106862S5w.LIZ(list);
        this.assetIds = list;
    }
}
