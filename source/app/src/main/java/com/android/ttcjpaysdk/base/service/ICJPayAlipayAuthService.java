package com.android.ttcjpaysdk.base.service;

import android.app.Activity;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayAlipayAuthCallback;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface ICJPayAlipayAuthService extends ICJPayService {
    static {
        Covode.recordClassIndex(6408);
    }

    void authAlipay(Activity activity, String str, boolean z, TTCJPayAlipayAuthCallback tTCJPayAlipayAuthCallback);
}
