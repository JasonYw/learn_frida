package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.android.livesdkapi.message.C9605p;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class CounteractInfo implements Serializable {
    @SerializedName("display_text")
    public C9605p displayText;
    @SerializedName("live_duration_mission_info")
    public LiveDurationMissionInfoMessage liveDurationMissionInfo;
    @SerializedName("popup_strategy")
    public String popupStrategy;

    static {
        Covode.recordClassIndex(14493);
    }
}
