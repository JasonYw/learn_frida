package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;

/* loaded from: classes11.dex */
public class ShopHeaderIcon {
    @SerializedName("type")
    public int type;
    @SerializedName(PushConstants.WEB_URL)
    public ImageModel url;

    static {
        Covode.recordClassIndex(14184);
    }

    public int getType() {
        return this.type;
    }

    public ImageModel getUrl() {
        return this.url;
    }
}
