package com.bytedance.android.live.base.model.follow;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
public class ScheduledLiveItem {
    @SerializedName("announcement_content")
    public String announcementContent;
    @SerializedName("avatar")
    public ImageModel avatar;
    @SerializedName("user_id")
    public long userId;
    @SerializedName("under_name_text")
    public String lastFinishTime = "";
    @SerializedName("right_text")
    public String nextScheduledTime = "";
    @SerializedName("scheduled_text")
    public String scheduledText = "";
    @SerializedName("nickname")
    public String nickName = "";
    @SerializedName("sec_uid")
    public String secUid = "";

    static {
        Covode.recordClassIndex(14048);
    }
}
