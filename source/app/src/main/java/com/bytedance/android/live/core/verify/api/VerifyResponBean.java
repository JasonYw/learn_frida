package com.bytedance.android.live.core.verify.api;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes8.dex */
public class VerifyResponBean {
    @SerializedName("children_cert_token")
    public String childrenCertToken;
    @SerializedName("is_verified")
    public boolean isVerified;
    @SerializedName("live_status_code")
    public int liveStatusCode;
    @SerializedName("prompts_type")
    public int promptsType;
    @SerializedName("sdk_verified")
    public boolean sdkVerified;
    @SerializedName("use_manual_verify")
    public boolean useManualVerify;

    static {
        Covode.recordClassIndex(24150);
    }
}
