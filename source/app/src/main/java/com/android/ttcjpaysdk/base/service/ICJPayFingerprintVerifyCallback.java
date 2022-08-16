package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayFingerprintVerifyCallback {
    static {
        Covode.recordClassIndex(6441);
    }

    void onVerifyFailed(int i);

    void onVerifySucceeded(String str);
}
