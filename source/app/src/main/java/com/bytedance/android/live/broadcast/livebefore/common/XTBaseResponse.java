package com.bytedance.android.live.broadcast.livebefore.common;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes23.dex */
public class XTBaseResponse {
    @SerializedName("status_code")
    public int status;
    @SerializedName("status_message")
    public String statusMessage;

    static {
        Covode.recordClassIndex(16923);
    }

    public boolean isSuccess() {
        if (this.status == 0) {
            return true;
        }
        return false;
    }
}
