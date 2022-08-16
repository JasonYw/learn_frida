package com.android.ttcjpaysdk.base.service;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.bytedance.covode.number.Covode;
import java.io.Serializable;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayCounterService extends ICJPayService {

    /* loaded from: classes17.dex */
    public interface ICJPayCompleteCallBack {
        static {
            Covode.recordClassIndex(6426);
        }

        String getCheckList();

        void showAmountUpgradeGuide();

        void showFastPayMoreFragment(Serializable serializable);

        void showFingerprintGuide();

        void showPasswordFreeGuide();

        void showResetPwdGuide();
    }

    static {
        Covode.recordClassIndex(6424);
    }

    void bindTradeQueryData(JSONObject jSONObject);

    Fragment getAmountUpgradeGuideFragment(JSONObject jSONObject);

    Fragment getCompleteFragment(JSONObject jSONObject);

    int getCompleteRemainTime();

    int getCompleteShowStyle();

    Fragment getFastPayGuideMoreFragment(JSONObject jSONObject, Serializable serializable);

    Fragment getFingerprintGuideFragment(JSONObject jSONObject);

    Fragment getFingerprintGuideFragment(JSONObject jSONObject, String str, JSONObject jSONObject2);

    Fragment getPasswordFreeGuideFragment(JSONObject jSONObject);

    Fragment getResetPwdGuideFragment(JSONObject jSONObject);

    String getSource();

    boolean isAmountUpgradeGuideFragment(Fragment fragment);

    boolean isFingerprintGuideFragment(Fragment fragment);

    boolean isPasswordFreeGuideFragment(Fragment fragment);

    boolean isResetPwdGuideFragment(Fragment fragment);

    void notifyCheckoutCounterResult(Context context, Bundle bundle);

    void notifyUnionPassEnd(Context context);

    void release();

    void setCheckoutResponseBean(JSONObject jSONObject, JSONObject jSONObject2);

    void setCompleteCallBack(ICJPayCompleteCallBack iCJPayCompleteCallBack);

    void setSharedParams(Map<String, String> map);

    void startCJPayCheckoutCounterActivity(Context context, JSONObject jSONObject);
}
