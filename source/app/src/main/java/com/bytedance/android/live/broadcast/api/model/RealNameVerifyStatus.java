package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.io.Serializable;

/* loaded from: classes5.dex */
public class RealNameVerifyStatus implements Serializable {
    @SerializedName("is_verified")
    public boolean isVerified;
    @SerializedName("verify_status")
    public int verifyStatus;

    static {
        Covode.recordClassIndex(14508);
    }
}
