package com.android.ttcjpaysdk.base.service;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayVerifyFastPayParamsCallBack {
    static {
        Covode.recordClassIndex(6500);
    }

    String getAppId();

    String getBankName();

    String getButtonColor();

    String getCardNoMask();

    String getCertificateType();

    JSONObject getCommonLogParams();

    View.OnClickListener getErrorDialogClickListener(int i, Dialog dialog, Activity activity, String str, String str2, String str3, View.OnClickListener onClickListener);

    String getFaceScene();

    JSONObject getHttpRiskInfo(boolean z);

    String getJumpUrl();

    JSONObject getKeepDialogInfo();

    String getMerchantId();

    String getMobile();

    String getMobileMask();

    String getOutTradeNo();

    JSONObject getProcessInfo();

    String getPwdMsg();

    String getRealName();

    JSONObject getTradeConfirmParams();

    String getUid();

    String getVerifyChannel();

    boolean isCardInactive();

    JSONObject parseTradeConfirmResponse(JSONObject jSONObject);
}
