package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.xiaomi.mipush.sdk.MiPushCommandMessage;

/* loaded from: classes26.dex */
public class MediaRecommendReason {
    @SerializedName("city")
    public String city;
    @SerializedName("friend_name")
    public String friendName;
    @SerializedName(MiPushCommandMessage.KEY_REASON)
    public String reason;
    @SerializedName("type")
    public int type;

    static {
        Covode.recordClassIndex(14087);
    }

    public String getCity() {
        return this.city;
    }

    public String getFriendName() {
        return this.friendName;
    }

    public String getReason() {
        return this.reason;
    }

    public int getType() {
        return this.type;
    }

    public void setCity(String str) {
        this.city = str;
    }

    public void setFriendName(String str) {
        this.friendName = str;
    }

    public void setReason(String str) {
        this.reason = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
