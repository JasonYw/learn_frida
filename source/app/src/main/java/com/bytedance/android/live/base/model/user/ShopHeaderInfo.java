package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes11.dex */
public class ShopHeaderInfo {
    @SerializedName("brand_tag")
    public ImageModel brandTag;
    @SerializedName("shop_header_icon_list")
    public List<ShopHeaderIcon> shopHeaderIconList;
    @SerializedName("shop_name")
    public String shopName;
    @SerializedName("shop_reputation")
    public AuthorReputation shopReputation;
    @SerializedName("store_url")
    public String storeUrl;

    static {
        Covode.recordClassIndex(14185);
    }

    public ImageModel getBrandTag() {
        return this.brandTag;
    }

    public List<ShopHeaderIcon> getShopHeaderIconList() {
        return this.shopHeaderIconList;
    }

    public String getShopName() {
        return this.shopName;
    }

    public AuthorReputation getShopReputation() {
        return this.shopReputation;
    }

    public String getStoreUrl() {
        return this.storeUrl;
    }
}
