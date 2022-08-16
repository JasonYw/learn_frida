package com.android.ttcjpaysdk.ttcjpayapi;

import android.app.Activity;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.bytedance.covode.number.Covode;

/* loaded from: classes17.dex */
public interface IGeneralPay {

    /* loaded from: classes17.dex */
    public interface IGeneralPayCallback {
        static {
            Covode.recordClassIndex(9292);
        }

        void onResult(int i, String str);
    }

    static {
        Covode.recordClassIndex(9291);
    }

    void pay(Activity activity, String str, int i, String str2, String str3, String str4, String str5, CJPayHostInfo cJPayHostInfo, IGeneralPayCallback iGeneralPayCallback);
}
