package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPaySupplementarySignCallBack {
    static {
        Covode.recordClassIndex(6493);
    }

    void onFirstInputCardInfo();

    void onFragmentNextBtnClick(int i);

    void onGotoAgreementDetail(String str, String str2);

    void onUpdateCardInfoResult(JSONObject jSONObject);
}
