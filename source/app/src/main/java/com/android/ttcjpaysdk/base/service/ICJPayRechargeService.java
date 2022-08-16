package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayRechargeService extends ICJPayService {
    static {
        Covode.recordClassIndex(6486);
    }

    void startCJPayRechargeActivity(Context context, JSONObject jSONObject);
}
