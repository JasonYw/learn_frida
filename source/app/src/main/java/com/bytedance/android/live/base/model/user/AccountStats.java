package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public class AccountStats {
    @SerializedName("total_income")
    public long anchorTotalIncome;
    @SerializedName("total_consume_to_target")
    public long audienceConsumeToAnchor;
    @SerializedName("videos_count")
    public long productCount;
    @SerializedName("videos_count_enable")
    public boolean productCountEnable;

    static {
        Covode.recordClassIndex(14125);
    }
}
