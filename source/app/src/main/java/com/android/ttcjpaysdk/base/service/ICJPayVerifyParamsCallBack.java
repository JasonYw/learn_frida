package com.android.ttcjpaysdk.base.service;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.bytedance.covode.number.Covode;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayVerifyParamsCallBack {
    static {
        Covode.recordClassIndex(6506);
    }

    String getAppId();

    String getButtonColor();

    JSONObject getCardSignBizContentParams();

    String getCertificateType();

    JSONObject getCommonLogParams();

    View.OnClickListener getErrorDialogClickListener(int i, Dialog dialog, Activity activity, String str, String str2, String str3, View.OnClickListener onClickListener);

    JSONObject getHttpRiskInfo(boolean z);

    JSONObject getKeepDialogInfo();

    String getMerchantId();

    String getMethod();

    String getMobile();

    JSONObject getNoPwdPayInfo();

    int getNoPwdPayStyle();

    JSONObject getOneStepGuideInfoParams();

    JSONObject getPayInfo();

    String getPayUid();

    JSONObject getProcessInfo();

    int getQueryResultTimes();

    String getRealName();

    int getShowNoPwdButton();

    JSONObject getTopRightBtnInfo();

    JSONObject getTradeConfirmParams();

    String getTradeNo();

    String getTradeNoForOneStep();

    String getUid();

    boolean isBindCard();

    boolean isCardInactive();

    JSONObject parseTradeConfirmResponse(JSONObject jSONObject);

    void setRealVerifyType(int i);
}
