package com.android.ttcjpaysdk.base.service;

import android.app.Activity;
import com.bytedance.covode.number.Covode;
import java.util.ArrayList;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayFrontCardListService extends ICJPayService {
    static {
        Covode.recordClassIndex(6443);
    }

    ICJPayFrontCardListCallBack getFrontCardCallBack();

    void release();

    void startCJPayFrontCardListMethodActivity(Activity activity, int i, int i2, String str, String str2, String str3, ArrayList<String> arrayList, ICJPayFrontCardListCallBack iCJPayFrontCardListCallBack, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3);
}
