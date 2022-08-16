package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayFrontCounterService extends ICJPayService {
    static {
        Covode.recordClassIndex(6445);
    }

    void preLoad();

    void startFrontETCounterActivity(Context context, String str, JSONObject jSONObject, String str2, String str3, boolean z);

    void startFrontStandardCounterActivity(Context context, String str, JSONObject jSONObject, String str2, String str3, boolean z, JSONObject jSONObject2);
}
