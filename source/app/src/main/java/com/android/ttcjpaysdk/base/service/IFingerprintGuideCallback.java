package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface IFingerprintGuideCallback {
    static {
        Covode.recordClassIndex(6520);
    }

    void onAuthErrorEvent();

    void onAuthFailedEvent();

    void onAuthSucceededEvent();

    void onEnableFailedEvent(String str);

    void onEnableSucceededEvent();

    void onFingerprintDialogCancelClickEvent();

    void onFingerprintDialogImpEvent();

    void onHandleVerifyFingerprintErrorEvent();
}
