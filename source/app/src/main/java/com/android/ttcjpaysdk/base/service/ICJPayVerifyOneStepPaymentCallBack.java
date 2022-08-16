package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayVerifyOneStepPaymentCallBack {
    static {
        Covode.recordClassIndex(6505);
    }

    void onTradeConfirmFailed(String str);

    void onTradeConfirmStart(int i);
}
