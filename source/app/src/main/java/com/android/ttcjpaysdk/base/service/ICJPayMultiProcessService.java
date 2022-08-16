package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayMultiProcessService extends ICJPayService {
    static {
        Covode.recordClassIndex(6469);
    }

    void pay(Context context, JSONObject jSONObject, String str, int i, String str2, String str3, String str4);

    void stop(Context context);
}
