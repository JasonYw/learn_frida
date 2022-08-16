package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayOCRService extends ICJPayService {
    static {
        Covode.recordClassIndex(6477);
    }

    void release();

    void startOCR(Context context, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, ICJPayServiceRetCallBack iCJPayServiceRetCallBack);
}
