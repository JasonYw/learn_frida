package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayVerifyFastPayResultCallBack {
    static {
        Covode.recordClassIndex(6501);
    }

    void onCancel();

    void onFailed(JSONObject jSONObject, boolean z);

    void onHideLoading(String str);

    void onShowLoading();

    void onSuccess(JSONObject jSONObject, boolean z);
}
