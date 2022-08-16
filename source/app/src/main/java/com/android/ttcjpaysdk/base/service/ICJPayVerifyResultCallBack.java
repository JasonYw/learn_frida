package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayVerifyResultCallBack {
    static {
        Covode.recordClassIndex(6511);
    }

    void onFailed(JSONObject jSONObject, JSONObject jSONObject2);

    void onLoginFailed();

    void onSuccess(Map<String, String> map, JSONObject jSONObject);

    void toConfirm();
}
