package com.bytedance.android.live.liveinteract.videotalk.emoji.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes3.dex */
public class TalkRoomEmojiPermission {
    @SerializedName("has_permission")
    public boolean hasPermission;
    @SerializedName("toast_without_permission")
    public String toastWithoutPermission;

    static {
        Covode.recordClassIndex(30233);
    }
}
