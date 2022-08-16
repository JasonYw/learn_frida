package com.bytedance.android.btm.api.depend;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes18.dex */
public interface IMonitorDepend {
    static {
        Covode.recordClassIndex(11298);
    }

    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);
}
