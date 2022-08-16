package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayVerifyQueryParams {
    static {
        Covode.recordClassIndex(6508);
    }

    String getAppId();

    JSONObject getHttpRiskInfo(boolean z);

    String getMerchantId();

    JSONObject getProcessInfo();

    int getQueryResultTimes();

    String getTradeNo();
}
