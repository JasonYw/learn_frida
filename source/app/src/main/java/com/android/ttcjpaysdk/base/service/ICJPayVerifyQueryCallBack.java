package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayVerifyQueryCallBack {
    static {
        Covode.recordClassIndex(6507);
    }

    void onResult(JSONObject jSONObject);
}
