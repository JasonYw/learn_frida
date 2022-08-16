package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;

/* loaded from: classes20.dex */
public final class RoomStatusResponse {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("close_title")
    public String closeTitle = "";
    @SerializedName("is_match")
    public boolean shouldShow;
    @SerializedName("room_stats")
    public RoomStatusData statusData;

    static {
        Covode.recordClassIndex(14520);
    }

    public final String getCloseTitle() {
        return this.closeTitle;
    }

    public final boolean getShouldShow() {
        return this.shouldShow;
    }

    public final RoomStatusData getStatusData() {
        return this.statusData;
    }

    public final void setShouldShow(boolean z) {
        this.shouldShow = z;
    }

    public final void setStatusData(RoomStatusData roomStatusData) {
        this.statusData = roomStatusData;
    }

    public final void setCloseTitle(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.closeTitle = str;
    }
}
