package com.bytedance.android.live.network.response;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
public class RequestError {
    @SerializedName("alert")
    public String alert;
    public transient boolean blockNotice;
    @SerializedName("message")
    public String message;
    @SerializedName("prompts")
    public String prompts = "操作失败, 请稍后重试";
    public transient String url;

    static {
        Covode.recordClassIndex(32725);
    }

    public boolean isBlockNotice() {
        return this.blockNotice;
    }

    public void setBlockNotice(boolean z) {
        this.blockNotice = z;
    }
}
