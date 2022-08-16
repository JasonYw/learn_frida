package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
public final class LatestBanRecord {
    @SerializedName("ban_status")
    public long banStatus;

    static {
        Covode.recordClassIndex(14496);
    }

    public final long getBanStatus() {
        return this.banStatus;
    }

    public final void setBanStatus(long j) {
        this.banStatus = j;
    }
}
