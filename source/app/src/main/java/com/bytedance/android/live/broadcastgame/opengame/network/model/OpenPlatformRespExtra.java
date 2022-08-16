package com.bytedance.android.live.broadcastgame.opengame.network.model;

import com.bytedance.android.live.base.model.Extra;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
public class OpenPlatformRespExtra extends Extra {
    @SerializedName("control_content_msg")
    public String controlContentMsg;
    @SerializedName("errcode")
    public int errorCode;
    @SerializedName("errmsg")
    public String errorMsg = "";
    @SerializedName("shark_code")
    public int sharkCode;

    static {
        Covode.recordClassIndex(20431);
    }
}
