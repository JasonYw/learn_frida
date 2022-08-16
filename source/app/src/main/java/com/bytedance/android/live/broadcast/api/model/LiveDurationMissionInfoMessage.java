package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class LiveDurationMissionInfoMessage implements Serializable {
    @SerializedName("live_duration_mission_diamond")
    public Integer liveDurationMissionDiamond;
    @SerializedName("live_duration_mission_value")
    public Integer liveDurationMissionValue;

    static {
        Covode.recordClassIndex(14497);
    }
}
