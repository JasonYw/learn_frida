package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayFrontCardListCallBack extends ICJPayServiceCallBack {
    static {
        Covode.recordClassIndex(6442);
    }

    JSONObject getCommonParams();

    void onCardListResult(JSONObject jSONObject, int i);

    void onClose();
}
