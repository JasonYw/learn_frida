package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayFrontMyBankCardService extends ICJPayService {
    static {
        Covode.recordClassIndex(6447);
    }

    void startFrontMyBankCard(Context context, JSONObject jSONObject);
}
