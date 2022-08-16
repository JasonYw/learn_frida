package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;
import javax.crypto.Cipher;

/* loaded from: classes17.dex */
public interface ICJPayFingerprintAuthCallback {
    static {
        Covode.recordClassIndex(6435);
    }

    void onAuthError();

    void onAuthFailed();

    void onAuthSucceeded(Cipher cipher);
}
