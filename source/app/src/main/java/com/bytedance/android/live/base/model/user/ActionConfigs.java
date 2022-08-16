package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes11.dex */
public class ActionConfigs {
    @SerializedName("entrances")
    public List<ActionConfig> entrances;
    @SerializedName("flash_shopping")
    public ActionConfig flashShopping;

    static {
        Covode.recordClassIndex(14128);
    }
}
