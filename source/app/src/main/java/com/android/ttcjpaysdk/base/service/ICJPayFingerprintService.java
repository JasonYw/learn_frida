package com.android.ttcjpaysdk.base.service;

import android.app.Activity;
import android.content.Context;
import com.bytedance.covode.number.Covode;
import javax.crypto.Cipher;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayFingerprintService extends ICJPayService {
    static {
        Covode.recordClassIndex(6437);
    }

    void auth(Activity activity, ICJPayFingerprintAuthCallback iCJPayFingerprintAuthCallback);

    void cancelFingerprintVerify();

    void closeFingerprint(Context context, String str, ICJPayFingerprintSwitchCallback iCJPayFingerprintSwitchCallback);

    void enableFingerprint(Cipher cipher, String str, String str2, JSONObject jSONObject, String str3, ICJPayFingerprintEnableCallback iCJPayFingerprintEnableCallback);

    void enableFingerprintWithoutPwd(Cipher cipher, JSONObject jSONObject, String str, JSONObject jSONObject2, String str2, ICJPayFingerprintEnableCallback iCJPayFingerprintEnableCallback);

    void enableFingerprintWithoutPwdInPaymentManager(Cipher cipher, String str, String str2, JSONObject jSONObject, String str3, ICJPayFingerprintEnableCallback iCJPayFingerprintEnableCallback);

    ICJPayFingerprintSwitchCallback getSwitchCallback();

    boolean isLocalEnableFingerprint(Context context, String str);

    boolean isLocalEnableFingerprint(Context context, String str, boolean z);

    boolean isSupportFingerprint(Context context);

    void openFingerprint(Context context, String str, ICJPayFingerprintSwitchCallback iCJPayFingerprintSwitchCallback, JSONObject jSONObject, String str2, String str3, JSONObject jSONObject2);

    void queryFingerprintState(Context context, String str, ICJPayFingerprintStateCallback iCJPayFingerprintStateCallback, JSONObject jSONObject);

    void release();

    void releaseFingerprintGuide();

    void showFingerprintDialogInPaymentManager(Context context, int i, boolean z, boolean z2, String str, String str2, JSONObject jSONObject, String str3, IFingerprintGuideCallback iFingerprintGuideCallback);

    void showFingerprintGuide(Context context, int i, boolean z, boolean z2, JSONObject jSONObject, String str, JSONObject jSONObject2, String str2, IFingerprintGuideCallback iFingerprintGuideCallback);

    void verifyFingerprint(String str, ICJPayFingerprintVerifyCallback iCJPayFingerprintVerifyCallback);
}
