package com.bytedance.android.btm.api.depend;

import com.bytedance.android.btm.api.model.EventModelV1;
import com.bytedance.android.btm.api.model.EventModelV3;
import com.bytedance.covode.number.Covode;

/* loaded from: classes18.dex */
public interface IAppLogDepend {
    static {
        Covode.recordClassIndex(11295);
    }

    void onEventV1(EventModelV1 eventModelV1);

    void onEventV3(EventModelV3 eventModelV3);
}
