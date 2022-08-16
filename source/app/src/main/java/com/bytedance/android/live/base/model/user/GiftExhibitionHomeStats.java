package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public class GiftExhibitionHomeStats {
    @SerializedName("lighted_num")
    public int lightedNum;
    @SerializedName("unlighted_num")
    public int unlightedNum;
    @SerializedName("exhibition_entrance_url")
    public String url = "";

    static {
        Covode.recordClassIndex(14149);
    }
}
