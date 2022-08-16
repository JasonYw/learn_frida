package cn.ever.cloud.network.entity;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes23.dex */
public final class NGetUpdatesResponseData {
    @SerializedName("user_data")
    public final NGetUserResourcesResponseData userData;

    static {
        Covode.recordClassIndex(3218);
    }

    public final NGetUserResourcesResponseData getUserData() {
        return this.userData;
    }

    public NGetUpdatesResponseData(NGetUserResourcesResponseData nGetUserResourcesResponseData) {
        this.userData = nGetUserResourcesResponseData;
    }
}
