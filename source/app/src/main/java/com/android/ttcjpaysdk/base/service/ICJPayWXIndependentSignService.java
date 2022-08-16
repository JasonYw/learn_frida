package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayWXIndependentSignService extends ICJPayService {
    static {
        Covode.recordClassIndex(6514);
    }

    void independentSign(Context context, String str, String str2, JSONObject jSONObject);
}
