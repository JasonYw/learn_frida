package com.bytedance.android.live.base.model.p247ad;

import com.bytedance.android.live.base.model.C2844m;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* renamed from: com.bytedance.android.live.base.model.ad.LiveAdRawData */
/* loaded from: classes6.dex */
public final class LiveAdRawData {
    @SerializedName("action_extra")
    public String actionExtra;
    @SerializedName("ad_id")
    public Long adId;
    @SerializedName("ad_source_type")
    public Integer adSourceType;
    @SerializedName("click_track_url_list")
    public C2844m clickTrackUrlList;
    @SerializedName("creative_id")
    public Long creativeId;
    @SerializedName("enter_from_merge")
    public String enterFromMerge;
    @SerializedName("enter_method")
    public String enterMethod;
    @SerializedName("live_action_extra")
    public String liveActionExtra;
    @SerializedName("log_extra")
    public String logExtra;
    @SerializedName("system_origin")
    public Integer systemOrigin;
    @SerializedName("track_url_list")
    public C2844m trackUrlList;

    static {
        Covode.recordClassIndex(13985);
    }
}
