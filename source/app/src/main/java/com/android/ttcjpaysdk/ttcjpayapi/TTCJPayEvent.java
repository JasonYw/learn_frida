package com.android.ttcjpaysdk.ttcjpayapi;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface TTCJPayEvent {
    static {
        Covode.recordClassIndex(9301);
    }

    void onEvent(String str, JSONObject jSONObject);
}
