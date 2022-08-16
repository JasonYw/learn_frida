package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public class EcomInfo {
    @SerializedName("ecom_type")
    public int ecomType;
    @SerializedName("shop_header_info")
    public ShopHeaderInfo shopHeaderInfo;
    @SerializedName("window_header_info")
    public WindowHeaderInfo windowHeaderInfo;

    static {
        Covode.recordClassIndex(14143);
    }

    public int getEcomType() {
        return this.ecomType;
    }

    public ShopHeaderInfo getShopHeaderInfo() {
        return this.shopHeaderInfo;
    }

    public WindowHeaderInfo getWindowHeaderInfo() {
        return this.windowHeaderInfo;
    }
}
