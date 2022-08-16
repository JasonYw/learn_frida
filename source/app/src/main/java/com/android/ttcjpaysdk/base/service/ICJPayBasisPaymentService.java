package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayBasisPaymentService extends ICJPayService {

    /* loaded from: classes17.dex */
    public interface OnPayResultCallback {
        static {
            Covode.recordClassIndex(6414);
        }

        void onCancel(int i);

        void onDisplayCMBEnterToast(Context context, String str);

        void onEvent(String str, String str2);

        void onFailure(int i);

        void onShowErrorInfo(Context context, String str);

        void onSuccess(int i);
    }

    /* loaded from: classes17.dex */
    public interface OnResultCallback {
        static {
            Covode.recordClassIndex(6415);
        }

        void onResult(JSONObject jSONObject);
    }

    static {
        Covode.recordClassIndex(6413);
    }

    void executePay(Context context, String str, JSONObject jSONObject, OnPayResultCallback onPayResultCallback, OnResultCallback onResultCallback);

    void pay(Context context, String str, String str2, OnPayResultCallback onPayResultCallback, OnResultCallback onResultCallback, JSONObject jSONObject);

    void releasePaySession();
}
