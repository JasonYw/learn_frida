package com.bytedance.android.live.base.model.follow;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes5.dex */
public class ScheduledLive {
    @SerializedName("list")
    public List<ScheduledLiveItem> scheduledLiveRoomList;

    static {
        Covode.recordClassIndex(14047);
    }
}
