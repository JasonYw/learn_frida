package com.bytedance.android.btm.api.depend;

import com.bytedance.covode.number.Covode;

/* loaded from: classes18.dex */
public interface ISettingDepend {
    static {
        Covode.recordClassIndex(11299);
    }

    String getSetting();

    void registerUpdateCallback(OnSettingUpdateCallback onSettingUpdateCallback);
}
