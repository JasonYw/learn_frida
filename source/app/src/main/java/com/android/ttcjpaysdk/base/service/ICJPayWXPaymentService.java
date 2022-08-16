package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayWXPaymentService extends ICJPayBasisPaymentService {
    static {
        Covode.recordClassIndex(6515);
    }

    void endSession();

    boolean isWXUnInstalled(Context context, String str);
}
