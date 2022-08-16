package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayVerifyCardSignCallBack {
    static {
        Covode.recordClassIndex(6499);
    }

    void onCardSignFailed(String str);

    void onCardSignStart();

    void onCardSignSuccess();

    void onTradeConfirmFailed(String str);

    void onTradeConfirmStart();
}
