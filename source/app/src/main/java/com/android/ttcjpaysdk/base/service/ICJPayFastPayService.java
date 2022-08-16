package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayFastPayService extends ICJPayService {
    static {
        Covode.recordClassIndex(6433);
    }

    void doSuperPay(Context context, String str, JSONObject jSONObject, String str2);

    void fastPay(Context context, Map<String, String> map, String str, int i, JSONObject jSONObject, IFastPayFailureCallback iFastPayFailureCallback);

    void fastPayHideLoading();

    void fastPayOnlySendRequest(Map<String, String> map);

    void fastPayShowLoading(Context context, Map<String, String> map, String str, int i, JSONObject jSONObject, IFastPayFailureCallback iFastPayFailureCallback);
}
