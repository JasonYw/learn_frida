package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayWithdrawService extends ICJPayService {
    static {
        Covode.recordClassIndex(6517);
    }

    void startCJPayWithdrawActivity(Context context, JSONObject jSONObject);
}
