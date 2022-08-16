package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayCombineCallback {
    static {
        Covode.recordClassIndex(6417);
    }

    void gotoBindCard();

    void gotoMethodFragment();

    Boolean isLocalEnableFingerprint();

    void setCheckoutResponseBean(JSONObject jSONObject);

    void startPayWithoutPwd();

    void startVerifyFingerprint();

    void startVerifyForCardSign();

    void startVerifyForPwd();
}
