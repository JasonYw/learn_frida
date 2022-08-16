package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public class WindowHeaderInfo {
    @SerializedName("reputation")
    public AuthorReputation reputation;
    @SerializedName("window_name")
    public String windowName;
    @SerializedName("window_url")
    public String windowUrl;

    static {
        Covode.recordClassIndex(14194);
    }

    public AuthorReputation getReputation() {
        return this.reputation;
    }

    public String getWindowName() {
        return this.windowName;
    }

    public String getWindowUrl() {
        return this.windowUrl;
    }
}
