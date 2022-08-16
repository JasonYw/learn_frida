package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayVerifyService extends ICJPayService {
    static {
        Covode.recordClassIndex(6512);
    }

    String getCheckList();

    void initVerifyComponents(Context context, int i, ICJPayVerifyParamsCallBack iCJPayVerifyParamsCallBack, ICJPayVerifyResultCallBack iCJPayVerifyResultCallBack, ICJPayVerifyCardSignCallBack iCJPayVerifyCardSignCallBack, ICJPayVerifyFingerprintCallBack iCJPayVerifyFingerprintCallBack, ICJPayVerifyOneStepPaymentCallBack iCJPayVerifyOneStepPaymentCallBack);

    boolean isLocalEnableFingerprint(Context context, String str, boolean z);

    boolean isRelease();

    boolean onBackPressed();

    void release();

    void setPayMethod(String str);

    void start(int i, int i2, int i3, boolean z);

    void stop();
}
