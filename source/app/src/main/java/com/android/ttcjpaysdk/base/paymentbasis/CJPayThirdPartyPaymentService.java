package com.android.ttcjpaysdk.base.paymentbasis;

import android.content.Context;
import android.text.TextUtils;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayAliPaymentService;
import com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService;
import com.android.ttcjpaysdk.base.service.ICJPayCMBPaymentService;
import com.android.ttcjpaysdk.base.service.ICJPayThirdPartyPaymentService;
import com.android.ttcjpaysdk.base.service.ICJPayWXPaymentService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C137438chG;

/* loaded from: classes17.dex */
public final class CJPayThirdPartyPaymentService implements ICJPayThirdPartyPaymentService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(6347);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public final String getPackageName() {
        return "com.android.ttcjpaysdk.base.paymentbasis";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService
    public final void releasePaySession() {
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService
    @CJPayModuleEntryReport
    public final void executePay(Context context, String str, JSONObject jSONObject, ICJPayBasisPaymentService.OnPayResultCallback onPayResultCallback, ICJPayBasisPaymentService.OnResultCallback onResultCallback) {
        if (PatchProxy.proxy(new Object[]{context, str, jSONObject, onPayResultCallback, onResultCallback}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C137438chG LIZ2 = C137438chG.LIZ(String.valueOf(jSONObject));
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        int i = LIZ2.LJIIJ;
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    ((ICJPayBasisPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayCMBPaymentService.class)).executePay(context, str, jSONObject, onPayResultCallback, onResultCallback);
                    return;
                }
                return;
            }
            ((ICJPayBasisPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayAliPaymentService.class)).executePay(context, str, jSONObject, onPayResultCallback, onResultCallback);
            return;
        }
        ((ICJPayBasisPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayWXPaymentService.class)).executePay(context, str, jSONObject, onPayResultCallback, onResultCallback);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService
    @CJPayModuleEntryReport
    public final void pay(Context context, String str, String str2, ICJPayBasisPaymentService.OnPayResultCallback onPayResultCallback, ICJPayBasisPaymentService.OnResultCallback onResultCallback, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, onPayResultCallback, onResultCallback, jSONObject}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject);
        if (context != null && !TextUtils.isEmpty(str)) {
            C137438chG LIZ2 = C137438chG.LIZ(str);
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            try {
                String optString = new JSONObject(str).optJSONObject(C2521l.LJIIL).optString("sdk_info");
                int i = LIZ2.LJIIJ;
                if (i != 1) {
                    if (i != 2) {
                        if (i != 3) {
                            return;
                        }
                        ((ICJPayCMBPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayCMBPaymentService.class)).pay(context, optString, "", onPayResultCallback, onResultCallback, jSONObject);
                        return;
                    }
                    ((ICJPayAliPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayAliPaymentService.class)).pay(context, optString, "", onPayResultCallback, onResultCallback, jSONObject);
                    return;
                }
                ((ICJPayWXPaymentService) CJPayServiceManager.getInstance().getIService(ICJPayWXPaymentService.class)).pay(context, optString, "APP", onPayResultCallback, onResultCallback, jSONObject);
            } catch (Exception unused) {
                if (onPayResultCallback != null) {
                    onPayResultCallback.onShowErrorInfo(context, context.getResources().getString(2131561830));
                }
            }
        }
    }
}
