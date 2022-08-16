package com.android.ttcjpaysdk.base.alipay;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.alipay.sdk.app.AuthTask;
import com.alipay.sdk.app.OpenAuthTask;
import com.android.ttcjpaysdk.base.service.ICJPayAliPaymentService;
import com.android.ttcjpaysdk.base.service.ICJPayAlipayAuthService;
import com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.ttcjpayapi.TTCJPayAlipayAuthCallback;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import org.json.JSONObject;
import p003X.C137430ch8;
import p003X.C137433chB;
import p003X.C137445chN;

/* loaded from: classes17.dex */
public class CJPayAliPaymentService implements ICJPayAliPaymentService, ICJPayAlipayAuthService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(5905);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayAlipayAuthService
    @CJPayModuleEntryReport
    public void authAlipay(final Activity activity, final String str, final boolean z, final TTCJPayAlipayAuthCallback tTCJPayAlipayAuthCallback) {
        if (PatchProxy.proxy(new Object[]{activity, str, Byte.valueOf(z ? (byte) 1 : (byte) 0), tTCJPayAlipayAuthCallback}, this, LIZ, false, 3).isSupported) {
            return;
        }
        new Thread(new Runnable(this) { // from class: com.android.ttcjpaysdk.base.alipay.CJPayAliPaymentService.1
            public static ChangeQuickRedirect LIZ;

            static {
                Covode.recordClassIndex(5906);
            }

            @Override // java.lang.Runnable
            public final void run() {
                if (PatchProxy.proxy(new Object[0], this, LIZ, false, 1).isSupported) {
                    return;
                }
                tTCJPayAlipayAuthCallback.onAuthResult(new AuthTask(activity).authV2(str, z));
            }
        }).start();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService
    @CJPayModuleEntryReport
    public void executePay(Context context, String str, JSONObject jSONObject, ICJPayBasisPaymentService.OnPayResultCallback onPayResultCallback, ICJPayBasisPaymentService.OnResultCallback onResultCallback) {
        if (PatchProxy.proxy(new Object[]{context, str, jSONObject, onPayResultCallback, onResultCallback}, this, LIZ, false, 1).isSupported) {
            return;
        }
        new C137430ch8(context, str, jSONObject, onPayResultCallback, onResultCallback).LIZ();
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return "com.android.ttcjpaysdk.base.alipay";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayAliPaymentService
    @CJPayModuleEntryReport
    public void independentSign(final Activity activity, String str, String str2, String str3, final ICJPayAliPaymentService.OnSignResultCallback onSignResultCallback) {
        if (!PatchProxy.proxy(new Object[]{activity, str, str2, str3, onSignResultCallback}, this, LIZ, false, 5).isSupported && activity != null) {
            if (TextUtils.isEmpty(str)) {
                if (onSignResultCallback == null) {
                    return;
                }
                onSignResultCallback.onResult(9, activity.getResources().getString(2131561830));
                return;
            }
            HashMap hashMap = new HashMap();
            hashMap.put("sign_params", str);
            new OpenAuthTask(activity).execute("cj_pay_alipay_sign", OpenAuthTask.BizType.Deduct, hashMap, new OpenAuthTask.Callback(this) { // from class: com.android.ttcjpaysdk.base.alipay.CJPayAliPaymentService.2
                public static ChangeQuickRedirect LIZ;

                static {
                    Covode.recordClassIndex(5907);
                }

                /* JADX WARN: Code restructure failed: missing block: B:32:0x00a0, code lost:
                    if (r0 != null) goto L33;
                 */
                /* JADX WARN: Code restructure failed: missing block: B:33:0x00a2, code lost:
                    r5 = r0.getString(2131561948);
                 */
                /* JADX WARN: Code restructure failed: missing block: B:48:0x0086, code lost:
                    if (r0 != null) goto L33;
                 */
                /* JADX WARN: Removed duplicated region for block: B:16:0x004b  */
                /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
                @Override // com.alipay.sdk.app.OpenAuthTask.Callback
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public final void onResult(int r7, java.lang.String r8, android.os.Bundle r9) {
                    /*
                        r6 = this;
                        r0 = 3
                        java.lang.Object[] r3 = new java.lang.Object[r0]
                        java.lang.Integer r0 = java.lang.Integer.valueOf(r7)
                        r2 = 0
                        r3[r2] = r0
                        r1 = 1
                        r3[r1] = r8
                        r0 = 2
                        r3[r0] = r9
                        com.bytedance.hotfix.base.ChangeQuickRedirect r0 = com.android.ttcjpaysdk.base.alipay.CJPayAliPaymentService.C21202.LIZ
                        com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r3, r6, r0, r2, r1)
                        boolean r0 = r0.isSupported
                        if (r0 == 0) goto L1b
                        return
                    L1b:
                        java.lang.String r5 = ""
                        if (r9 == 0) goto L3d
                        java.lang.String r0 = "alipay_user_agreement_page_sign_response"
                        java.lang.String r2 = r9.getString(r0)
                        boolean r0 = android.text.TextUtils.isEmpty(r2)
                        if (r0 != 0) goto L3d
                        org.json.JSONObject r1 = new org.json.JSONObject     // Catch: java.lang.Exception -> L40
                        r1.<init>(r2)     // Catch: java.lang.Exception -> L40
                        java.lang.String r0 = "code"
                        java.lang.String r4 = r1.optString(r0)     // Catch: java.lang.Exception -> L40
                        java.lang.String r0 = "msg"
                        java.lang.String r3 = r1.optString(r0)     // Catch: java.lang.Exception -> L41
                        goto L42
                    L3d:
                        r4 = r5
                        r3 = r4
                        goto L42
                    L40:
                        r4 = r5
                    L41:
                        r3 = r5
                    L42:
                        r0 = 4000(0xfa0, float:5.605E-42)
                        r1 = 2131561948(0x7f0d0ddc, float:1.874931E38)
                        r2 = 9
                        if (r7 == r0) goto L84
                        r0 = 4001(0xfa1, float:5.607E-42)
                        if (r7 == r0) goto L76
                        r0 = 5000(0x1388, float:7.006E-42)
                        if (r7 == r0) goto L68
                        r0 = 9000(0x2328, float:1.2612E-41)
                        if (r7 != r0) goto L60
                        java.lang.String r0 = "10000"
                        boolean r0 = r0.equals(r4)
                        if (r0 == 0) goto L89
                        r2 = 0
                    L60:
                        com.android.ttcjpaysdk.base.service.ICJPayAliPaymentService$OnSignResultCallback r0 = r3
                        if (r0 == 0) goto L67
                        r0.onResult(r2, r3)
                    L67:
                        return
                    L68:
                        android.app.Activity r1 = r2
                        if (r1 == 0) goto L73
                        r0 = 2131561949(0x7f0d0ddd, float:1.8749313E38)
                        java.lang.String r5 = r1.getString(r0)
                    L73:
                        r3 = r5
                        r2 = 1
                        goto L60
                    L76:
                        android.app.Activity r1 = r2
                        if (r1 == 0) goto L81
                        r0 = 2131561466(0x7f0d0bfa, float:1.8748333E38)
                        java.lang.String r5 = r1.getString(r0)
                    L81:
                        r3 = r5
                        r2 = 3
                        goto L60
                    L84:
                        android.app.Activity r0 = r2
                        if (r0 == 0) goto L9c
                        goto La2
                    L89:
                        java.lang.String r0 = "60001"
                        boolean r0 = r0.equals(r4)
                        if (r0 == 0) goto L9e
                        android.app.Activity r1 = r2
                        if (r1 == 0) goto L9c
                        r0 = 2131561947(0x7f0d0ddb, float:1.8749309E38)
                        java.lang.String r5 = r1.getString(r0)
                    L9c:
                        r3 = r5
                        goto L60
                    L9e:
                        android.app.Activity r0 = r2
                        if (r0 == 0) goto L9c
                    La2:
                        java.lang.String r5 = r0.getString(r1)
                        goto L9c
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.base.alipay.CJPayAliPaymentService.C21202.onResult(int, java.lang.String, android.os.Bundle):void");
                }
            }, true);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService
    @CJPayModuleEntryReport
    public void pay(Context context, String str, String str2, ICJPayBasisPaymentService.OnPayResultCallback onPayResultCallback, ICJPayBasisPaymentService.OnResultCallback onResultCallback, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, onPayResultCallback, onResultCallback, jSONObject}, this, LIZ, false, 4).isSupported) {
            return;
        }
        if (context == null || TextUtils.isEmpty(str)) {
            C137445chN.LIZ.LIZ("alipay", "context is null or data is empty", onPayResultCallback);
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        try {
            jSONObject2.put("sdk_info", new JSONObject(str));
            jSONObject2.put("pay_way", 2);
            jSONObject3.put(C2521l.LJIIL, jSONObject2);
            new C137430ch8(context, "", jSONObject3, onPayResultCallback, onResultCallback).LIZ();
        } catch (Exception unused) {
            String string = context.getResources().getString(2131561830);
            if (onPayResultCallback != null) {
                onPayResultCallback.onShowErrorInfo(context, string);
                C137445chN.LIZ.LIZ("alipay", string, onPayResultCallback);
            }
            C137445chN.LIZ.LIZ("alipay", string);
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayBasisPaymentService
    public void releasePaySession() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        C137433chB.LIZ().LIZIZ();
    }
}
