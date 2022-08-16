package com.android.ttcjpaysdk.base.service;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.ttcjpaysdk.base.service.bean.CJPayProcessInfoBean;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayIntegratedCounterService extends ICJPayService {
    static {
        Covode.recordClassIndex(6453);
    }

    String getIntegratedCounterAppId();

    Map<String, String> getIntegratedCounterHttpData(Map<String, String> map, String str, String str2, String str3);

    Map<String, String> getIntegratedCounterHttpHeader(String str, String str2);

    String getIntegratedCounterMerchantId();

    String getIntegratedCounterUrl(String str, String str2);

    Object getIntegratedObserver();

    CJPayProcessInfoBean getProcessInfo();

    String getPromotionSource();

    void preLoad();

    void setIntegratedObserver(Object obj);

    void startCounterActivity(Context context, String str, JSONObject jSONObject);

    void startOuterPayActivity(Activity activity, Intent intent, JSONObject jSONObject);
}
