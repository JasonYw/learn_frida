package com.android.ttcjpaysdk.base.network;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayCallback {
    static {
        Covode.recordClassIndex(6325);
    }

    void onFailure(JSONObject jSONObject);

    void onResponse(JSONObject jSONObject);
}
