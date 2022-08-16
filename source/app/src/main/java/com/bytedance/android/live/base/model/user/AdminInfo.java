package com.bytedance.android.live.base.model.user;

import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes11.dex */
public class AdminInfo {
    @SerializedName("admin_badge")
    public ImageModel adminImage;
    @SerializedName("is_admin")
    public boolean isAdmin;

    static {
        Covode.recordClassIndex(14133);
    }
}
