package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayVerifyFingerprintCallBack {
    static {
        Covode.recordClassIndex(6504);
    }

    void onFingerprintCancel(String str);

    void onFingerprintStart();

    void onTradeConfirmFailed(String str, String str2);

    void onTradeConfirmStart();
}
