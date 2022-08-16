package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayFingerprintEnableCallback {
    static {
        Covode.recordClassIndex(6436);
    }

    void onEnableFailed(String str, String str2, JSONObject jSONObject);

    void onEnableSucceeded();
}
