package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
public class BroadcastConfig {
    @SerializedName("scheduled_days")
    public int scheduledDays;
    @SerializedName("scheduled_master_switch")
    public int scheduledMasterSwitch;
    @SerializedName("scheduled_notice_switch")
    public int scheduledNoticeSwitch;
    @SerializedName("scheduled_notice_switch_display")
    public int scheduledNoticeSwitchDisplay;
    @SerializedName("scheduled_profile_switch")
    public int scheduledProfileSwitch;
    @SerializedName("scheduled_time")
    public String scheduledTime;
    @SerializedName("scheduled_time_text")
    public String scheduledTimeText;

    static {
        Covode.recordClassIndex(14141);
    }
}
