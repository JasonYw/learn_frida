package com.android.ttcjpaysdk.base.wxpay;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService;
import com.android.ttcjpaysdk.base.service.ICJPayH5Service;
import com.android.ttcjpaysdk.base.service.ICJPayWXIndependentSignService;
import com.android.ttcjpaysdk.base.service.ICJPayWXPaymentService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.tencent.p3013mm.opensdk.openapi.IWXAPI;
import com.tencent.p3013mm.opensdk.openapi.WXAPIFactory;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONObject;
import p003X.C137431ch9;
import p003X.C137434chC;
import p003X.C137445chN;

/* loaded from: classes17.dex */
public class CJPayWXPaymentService implements ICJPayWXIndependentSignService, ICJPayWXPaymentService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(6744);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return "com.android.ttcjpaysdk.base.wxpay";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayWXPaymentService
    public void endSession() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        C137434chC.LIZ().LIZ(C137434chC.LIZ().LIZJ);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService
    public void releasePaySession() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        C137434chC.LIZ().LIZIZ();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayWXPaymentService
    @CJPayModuleEntryReport
    public boolean isWXUnInstalled(Context context, String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str}, this, LIZ, false, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        IWXAPI createWXAPI = WXAPIFactory.createWXAPI(context.getApplicationContext(), str, true);
        if (createWXAPI != null && createWXAPI.isWXAppInstalled()) {
            return false;
        }
        return true;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayWXIndependentSignService
    @CJPayModuleEntryReport
    public void independentSign(Context context, String str, String str2, JSONObject jSONObject) {
        if (!PatchProxy.proxy(new Object[]{context, str, str2, jSONObject}, this, LIZ, false, 6).isSupported && context != null && !TextUtils.isEmpty(str)) {
            if (isWXUnInstalled(context, "")) {
                CJPayBasicUtils.displayToastInternal(context, context.getResources().getString(2131562054), -1);
                return;
            }
            ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
            if (iCJPayH5Service != null) {
                iCJPayH5Service.openH5ForWxIndependentSign((Activity) context, str, str2, jSONObject);
            }
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService
    @CJPayModuleEntryReport
    public void executePay(Context context, String str, JSONObject jSONObject, ICJPayBasisPaymentService.OnPayResultCallback onPayResultCallback, ICJPayBasisPaymentService.OnResultCallback onResultCallback) {
        if (PatchProxy.proxy(new Object[]{context, str, jSONObject, onPayResultCallback, onResultCallback}, this, LIZ, false, 1).isSupported) {
            return;
        }
        new C137431ch9(context, str, jSONObject, onPayResultCallback, onResultCallback).LIZ();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService
    @CJPayModuleEntryReport
    public void pay(Context context, String str, String str2, ICJPayBasisPaymentService.OnPayResultCallback onPayResultCallback, ICJPayBasisPaymentService.OnResultCallback onResultCallback, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, onPayResultCallback, onResultCallback, jSONObject}, this, LIZ, false, 5).isSupported) {
            return;
        }
        if (context != null && !TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                if (isWXUnInstalled(context, "")) {
                    String string = context.getResources().getString(2131562054);
                    if (onPayResultCallback != null) {
                        onPayResultCallback.onShowErrorInfo(context, string);
                        C137445chN.LIZ.LIZ("wxpay", string, onPayResultCallback);
                    }
                    C137445chN.LIZ.LIZ("wxpay", string);
                    return;
                } else if ("MWEB".equals(str2)) {
                    ICJPayH5Service iCJPayH5Service = (ICJPayH5Service) CJPayServiceManager.getInstance().getIService(ICJPayH5Service.class);
                    if (iCJPayH5Service != null) {
                        iCJPayH5Service.openH5ForWXPay((Activity) context, jSONObject2, jSONObject);
                        if (onPayResultCallback != null) {
                            onPayResultCallback.onEvent("wallet_rd_wx_h5pay_call", "");
                        } else {
                            return;
                        }
                    } else if (onPayResultCallback == null) {
                        return;
                    }
                    onPayResultCallback.onSuccess(0);
                    return;
                } else {
                    JSONObject jSONObject3 = new JSONObject();
                    JSONObject jSONObject4 = new JSONObject();
                    try {
                        String optString = jSONObject2.optString(Constants.APP_ID);
                        if (TextUtils.isEmpty(optString)) {
                            optString = jSONObject2.getString("appid");
                        }
                        jSONObject3.put("sdk_info", jSONObject2);
                        jSONObject3.put("pay_way", 1);
                        jSONObject4.put(C2521l.LJIIL, jSONObject3);
                        new C137431ch9(context, optString, jSONObject4, onPayResultCallback, onResultCallback).LIZ();
                        return;
                    } catch (Exception unused) {
                        String string2 = context.getResources().getString(2131561830);
                        if (onPayResultCallback != null) {
                            onPayResultCallback.onShowErrorInfo(context, string2);
                            C137445chN.LIZ.LIZ("wxpay", string2, onPayResultCallback);
                        }
                        C137445chN.LIZ.LIZ("wxpay", string2);
                        return;
                    }
                }
            } catch (Exception unused2) {
                String string3 = context.getResources().getString(2131561830);
                if (onPayResultCallback != null) {
                    onPayResultCallback.onShowErrorInfo(context, string3);
                    C137445chN.LIZ.LIZ("wxpay", string3, onPayResultCallback);
                }
                C137445chN.LIZ.LIZ("wxpay", string3);
                return;
            }
        }
        C137445chN.LIZ.LIZ("wxpay", "context is null or data is empty", onPayResultCallback);
    }
}
