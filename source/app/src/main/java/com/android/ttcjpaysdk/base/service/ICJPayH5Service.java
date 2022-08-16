package com.android.ttcjpaysdk.base.service;

import android.app.Activity;
import android.content.Context;
import com.android.ttcjpaysdk.base.service.bean.H5ParamBuilder;
import com.android.ttcjpaysdk.base.service.bean.H5SchemeParamBuilder;
import com.android.ttcjpaysdk.ttcjpayapi.ICJPayXBridgeCallback;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayRealNamePasswordCallback;
import com.bytedance.covode.number.Covode;
import java.util.Map;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public interface ICJPayH5Service extends ICJPayService {
    static {
        Covode.recordClassIndex(6451);
    }

    Map<String, Class> getXBridgeMethods();

    void handleCloseCallback(Context context, JSONObject jSONObject);

    void handleXBridgeMethod(Context context, String str, JSONObject jSONObject, ICJPayXBridgeCallback iCJPayXBridgeCallback);

    boolean isWhiteUrl(String str);

    void openH5ForWXPay(Activity activity, JSONObject jSONObject, JSONObject jSONObject2);

    void openH5ForWxIndependentSign(Activity activity, String str, String str2, JSONObject jSONObject);

    void openH5SetPassword(Activity activity, String str, String str2, String str3, TTCJPayRealNamePasswordCallback tTCJPayRealNamePasswordCallback, JSONObject jSONObject);

    void registerXBridgeMethods();

    void startH5(H5ParamBuilder h5ParamBuilder);

    void startH5ByScheme(H5SchemeParamBuilder h5SchemeParamBuilder);

    void startH5CashDesk(H5ParamBuilder h5ParamBuilder);

    void startH5ModalView(H5ParamBuilder h5ParamBuilder);
}
