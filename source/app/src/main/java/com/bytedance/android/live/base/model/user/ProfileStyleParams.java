package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public class ProfileStyleParams {
    @SerializedName("is_set")
    public boolean isSet;
    @SerializedName("profile_head_height")
    public long profileDynamicSpaceHeight;
    @SerializedName("profile_style")
    public long profileStyle;
    @SerializedName("set_time")
    public long setTime;

    static {
        Covode.recordClassIndex(14179);
    }

    public long getProfileDynamicSpaceHeight() {
        return this.profileDynamicSpaceHeight;
    }

    public long getProfileStyle() {
        return this.profileStyle;
    }

    public long getSetTime() {
        return this.setTime;
    }

    public boolean isSet() {
        return this.isSet;
    }
}
