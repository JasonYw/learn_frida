package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import p003X.C106862S5w;

/* loaded from: classes23.dex */
public final class NGetUserResourcesResponseData {
    @SerializedName("asset_list")
    public final List<NAsset> assetList;
    @SerializedName("tag_list")
    public final List<NPackTag> tagList;
    @SerializedName("user_profile")
    public final NUserProfile userProfile;

    static {
        Covode.recordClassIndex(3219);
    }

    public final List<NAsset> getAssetList() {
        return this.assetList;
    }

    public final List<NPackTag> getTagList() {
        return this.tagList;
    }

    public final NUserProfile getUserProfile() {
        return this.userProfile;
    }

    public NGetUserResourcesResponseData(List<NAsset> list, List<NPackTag> list2, NUserProfile nUserProfile) {
        C106862S5w.LIZ(list, list2);
        this.assetList = list;
        this.tagList = list2;
        this.userProfile = nUserProfile;
    }
}
