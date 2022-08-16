package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public class ShopEntrance {
    @SerializedName("entrance_type")
    public int entranceType;
    @SerializedName("shop_url")
    public String shopUrl;
    @SerializedName("window_url")
    public String windowUrl;

    static {
        Covode.recordClassIndex(14183);
    }
}
