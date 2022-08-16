package com.bytedance.android.live.base.model.media;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import com.umeng.commonsdk.internal.C33838c;

/* loaded from: classes11.dex */
public class MediaDebugInfo {
    @SerializedName(C33838c.f42636f)
    public String info;

    static {
        Covode.recordClassIndex(14085);
    }

    public String getInfo() {
        return this.info;
    }

    public void setInfo(String str) {
        this.info = str;
    }
}
