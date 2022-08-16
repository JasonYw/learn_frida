package com.android.ttcjpaysdk.base.service;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface IUnionPayBindCardService extends ICJPayService {
    static {
        Covode.recordClassIndex(6524);
    }

    void createUnionPaySignOrder(Activity activity, boolean z, boolean z2, String str, String str2, ICJPayServiceCallBack iCJPayServiceCallBack);

    void handleUnionPayFaceCheck(Activity activity, JSONObject jSONObject, ICJPayServiceCallBack iCJPayServiceCallBack);

    void startUnionPayBindCard(Activity activity, ICJPayServiceCallBack iCJPayServiceCallBack);
}
