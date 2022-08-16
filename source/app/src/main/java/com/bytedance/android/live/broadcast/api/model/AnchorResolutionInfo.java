package com.bytedance.android.live.broadcast.api.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.google.gson.annotations.SerializedName;
import p003X.C106862S5w;

/* loaded from: classes5.dex */
public final class AnchorResolutionInfo {
    public static ChangeQuickRedirect changeQuickRedirect;
    @SerializedName("wnable_downgrade")
    public boolean isDownGrade;
    @SerializedName("sdk_params")
    public String sdkParams = "";
    @SerializedName("key")
    public String key = "";

    static {
        Covode.recordClassIndex(14479);
    }

    public final String getKey() {
        return this.key;
    }

    public final String getSdkParams() {
        return this.sdkParams;
    }

    public final boolean isDownGrade() {
        return this.isDownGrade;
    }

    public final void setDownGrade(boolean z) {
        this.isDownGrade = z;
    }

    public final void setKey(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.key = str;
    }

    public final void setSdkParams(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.sdkParams = str;
    }
}
