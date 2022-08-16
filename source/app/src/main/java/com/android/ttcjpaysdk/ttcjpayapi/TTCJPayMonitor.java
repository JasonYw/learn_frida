package com.android.ttcjpaysdk.ttcjpayapi;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public interface TTCJPayMonitor {
    static {
        Covode.recordClassIndex(9302);
    }

    void monitorEvent(String str, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);
}
