package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.meizu.cloud.pushsdk.constants.PushConstants;

/* loaded from: classes11.dex */
public class SubscribeInfo {
    @SerializedName("is_member")
    public boolean isMember;
    @SerializedName("member_count")
    public int memberCount;
    @SerializedName("member_count_str")
    public String memberCountStr;
    @SerializedName("member_count_substr")
    public String memberCountSubStr;
    @SerializedName(PushConstants.WEB_URL)
    public String routeUrl;

    static {
        Covode.recordClassIndex(14186);
    }
}
