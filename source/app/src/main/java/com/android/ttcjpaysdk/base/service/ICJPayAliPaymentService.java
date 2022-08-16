package com.android.ttcjpaysdk.base.service;

import android.app.Activity;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayAliPaymentService extends ICJPayBasisPaymentService {

    /* loaded from: classes17.dex */
    public interface OnSignResultCallback {
        static {
            Covode.recordClassIndex(6407);
        }

        void onResult(int i, String str);
    }

    static {
        Covode.recordClassIndex(6405);
    }

    void independentSign(Activity activity, String str, String str2, String str3, OnSignResultCallback onSignResultCallback);
}
