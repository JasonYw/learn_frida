package com.bytedance.android.live.liveinteract.videotalk.emoji.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes3.dex */
public class TalkRoomEmojiListResponse {
    @SerializedName("emoji")
    public List<C4929c> emojiList;
    @SerializedName("time_control_text")
    public String sendLimitDesc;
    @SerializedName("millisecond_level_time_control")
    public long sendLimitTime;

    static {
        Covode.recordClassIndex(30232);
    }
}
