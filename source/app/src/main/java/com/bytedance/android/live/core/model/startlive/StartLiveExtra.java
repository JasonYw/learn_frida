package com.bytedance.android.live.core.model.startlive;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
public class StartLiveExtra extends Extra {
    @SerializedName("is_phone_binded")
    public boolean isPhoneBinded;
    @SerializedName("live_agreement")
    public boolean liveAgreement;
    @SerializedName("live_answer")
    public boolean liveAnswer;
    @SerializedName("realname_verify")
    public int realnameVerify;

    static {
        Covode.recordClassIndex(23484);
    }
}
