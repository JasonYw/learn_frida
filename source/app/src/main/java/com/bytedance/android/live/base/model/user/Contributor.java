package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public class Contributor {
    @SerializedName("contribution_count")
    public long contributionCount;
    @SerializedName("index")
    public long index;
    @SerializedName("ranking")
    public ImageModel rankImage;

    static {
        Covode.recordClassIndex(14142);
    }
}
