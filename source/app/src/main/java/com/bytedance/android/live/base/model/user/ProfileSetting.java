package com.bytedance.android.live.base.model.user;

import com.bytedance.covode.number.Covode;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes12.dex */
public class ProfileSetting {
    @SerializedName("show_setting")
    public long showSetting;
    @SerializedName("style_template")
    public List<ProfileStyleTemplate> styleTemplates;

    static {
        Covode.recordClassIndex(14177);
    }

    public long getShowSetting() {
        return this.showSetting;
    }

    public List<ProfileStyleTemplate> getStyleTemplates() {
        return this.styleTemplates;
    }
}
