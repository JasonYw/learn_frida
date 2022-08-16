package com.bytedance.android.live.core.model.profit;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes5.dex */
public class DSLimitCalmPeriod {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("left_time_second")
    public int leftTime;
    @SerializedName("need_face_recognition")
    public boolean needFaceDetect;
    @SerializedName("popup_text")
    public String popupText;
    @SerializedName("two_elements_verified")
    public boolean verified;
    @SerializedName("verify_type")
    public int verifyType;

    static {
        Covode.recordClassIndex(23482);
    }

    public String toString() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, changeQuickRedirect, false, 1);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        return "DSLimitCalmPeriod{leftTime=" + this.leftTime + ", popupText='" + this.popupText + "', needFaceDetect=" + this.needFaceDetect + '}';
    }
}
