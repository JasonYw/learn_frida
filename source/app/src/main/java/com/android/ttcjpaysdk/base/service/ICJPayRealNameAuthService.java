package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import androidx.core.util.Pair;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayRealNameAuthCallback;
import com.bytedance.covode.number.Covode;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayRealNameAuthService extends ICJPayService {
    static {
        Covode.recordClassIndex(6484);
    }

    void setEventExtParams(Pair<? extends String, Object>[] pairArr);

    void startCJPayRealNameAuthActivity(Context context, String str, String str2, TTCJPayRealNameAuthCallback tTCJPayRealNameAuthCallback, JSONObject jSONObject);

    void startCJPayRealNameByInfo(Context context, String str, TTCJPayRealNameAuthCallback tTCJPayRealNameAuthCallback, JSONObject jSONObject, JSONArray jSONArray);
}
