package com.android.ttcjpaysdk.thirdparty.front.counter.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.CJPayPageLoadTrace;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogBuilder;
import com.android.ttcjpaysdk.base.p135ui.dialog.CJPayDialogUtils;
import com.android.ttcjpaysdk.base.service.ICJPayFrontCounterService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.base.utils.CJPayBasicUtils;
import com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity;
import com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayFrontETCounterActivity;
import com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayFrontStandardCounterActivity;
import com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayH5ActivateActivity;
import com.android.ttcjpaysdk.thirdparty.front.counter.activity.CJPayIncomeLynxOpenAccountActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C116971W2r;
import p003X.C136373cQ4;
import p003X.C136423cQs;
import p003X.C136428cQx;
import p003X.DialogC137460chc;

/* loaded from: classes17.dex */
public class CJPayFrontCounterProvider implements ICJPayFrontCounterService {
    public static ChangeQuickRedirect LIZ;
    public DialogC137460chc LIZIZ;
    public Map<String, String> LIZJ = new HashMap();

    static {
        Covode.recordClassIndex(8681);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return "com.android.ttcjpaysdk.thirdparty.counter";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFrontCounterService
    public void preLoad() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 3).isSupported) {
            return;
        }
        this.LIZJ.put(CJPayFrontETCounterActivity.LJIL(), CJPayFrontETCounterActivity.LJIL());
    }

    public static boolean LIZ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, LIZ, true, 7);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (CJPayCheckoutCounterActivity.LJIIIZ == null || (!"Pre_Pay_Balance".equals(CJPayCheckoutCounterActivity.LJIIIZ.pay_info.business_scene) && !"Pre_Pay_BankCard".equals(CJPayCheckoutCounterActivity.LJIIIZ.pay_info.business_scene) && !"Pre_Pay_NewCard".equals(CJPayCheckoutCounterActivity.LJIIIZ.pay_info.business_scene))) {
            return false;
        }
        return true;
    }

    public static boolean LIZ(Context context) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, null, LIZ, true, 5);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        if (!"Pre_Pay_Credit".equals(CJPayCheckoutCounterActivity.LJIIIZ.pay_info.business_scene) || CJPayCheckoutCounterActivity.LJIIIZ.pay_info.is_credit_activate) {
            return false;
        }
        CJPayH5ActivateActivity.LIZ(context, CJPayCheckoutCounterActivity.LJIIIZ.pay_info.credit_activate_url, false);
        return true;
    }

    public static boolean LIZ(Context context, String str, JSONObject jSONObject) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context, str, jSONObject}, null, LIZ, true, 4);
        if (proxy.isSupported) {
            return ((Boolean) proxy.result).booleanValue();
        }
        CJPayCheckoutCounterActivity.LJIIJ = CJPayHostInfo.LIZ(jSONObject);
        C136373cQ4 c136373cQ4 = (C136373cQ4) CJPayJsonParser.fromJson(str, C136373cQ4.class);
        CJPayCheckoutCounterActivity.LJIIIZ = c136373cQ4;
        if (c136373cQ4 == null) {
            CJPayBasicUtils.displayToast(context, context.getString(2131561500));
            C2118a.LIZ().LIZ(102).LIZIZ();
            return false;
        } else if (TextUtils.isEmpty(CJPayCheckoutCounterActivity.LJIIIZ.trade_info.trade_no)) {
            CJPayBasicUtils.displayToast(context, context.getString(2131561500));
            C2118a.LIZ().LIZ(102).LIZIZ();
            return false;
        } else {
            if (CJPayCheckoutCounterActivity.LJIIJ != null) {
                CJPayCheckoutCounterActivity.LJIIJ.merchantId = CJPayCheckoutCounterActivity.LJIIIZ.merchant_info.merchant_id;
                CJPayCheckoutCounterActivity.LJIIJ.appId = CJPayCheckoutCounterActivity.LJIIIZ.merchant_info.app_id;
            }
            return true;
        }
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFrontCounterService
    @CJPayModuleEntryReport
    public void startFrontETCounterActivity(Context context, String str, JSONObject jSONObject, String str2, String str3, boolean z) {
        if (PatchProxy.proxy(new Object[]{context, str, jSONObject, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported || !LIZ(context, str, jSONObject)) {
            return;
        }
        C136428cQx.m21736LJ();
        if (LIZ(context)) {
            return;
        }
        if (LIZ()) {
            CJPayPageLoadTrace.LIZ().LIZ(CJPayPageLoadTrace.Page.EC_COUNTER, CJPayPageLoadTrace.Section.RENDERING);
        }
        Intent LIZ2 = CJPayFrontETCounterActivity.LIZ(context);
        LIZ2.putExtra("param_source", str2);
        LIZ2.putExtra("param_bind_card_info", str3);
        LIZ2.putExtra("param_close_webview", z);
        C116971W2r.LIZ(context, LIZ2);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFrontCounterService
    @CJPayModuleEntryReport
    public void startFrontStandardCounterActivity(final Context context, String str, JSONObject jSONObject, String str2, String str3, boolean z, JSONObject jSONObject2) {
        if (PatchProxy.proxy(new Object[]{context, str, jSONObject, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), jSONObject2}, this, LIZ, false, 2).isSupported || !LIZ(context, str, jSONObject)) {
            return;
        }
        C136428cQx.m21736LJ();
        C136428cQx.LIZIZ = "front_type_standard";
        C136428cQx.LIZJ = jSONObject2.optString("need_result_page");
        C136428cQx.LIZLLL = jSONObject2.optString("cashier_page_mode");
        C136428cQx.f18031LJ = jSONObject2.optString("has_cashier_show_retain");
        if (LIZ(context)) {
            return;
        }
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{context}, this, LIZ, false, 6);
        if (proxy.isSupported) {
            if (((Boolean) proxy.result).booleanValue()) {
                return;
            }
        } else if ("Pre_Pay_Income".equals(CJPayCheckoutCounterActivity.LJIIIZ.pay_info.business_scene) && CJPayCheckoutCounterActivity.LJIIIZ.user_info.is_new_user) {
            if ("1".equals(CJPayCheckoutCounterActivity.LJIIIZ.user_info.auth_status)) {
                if (TextUtils.isEmpty(CJPayCheckoutCounterActivity.LJIIIZ.user_info.lynx_auth_url)) {
                    return;
                }
                CJPayIncomeLynxOpenAccountActivity.LIZ(context, CJPayCheckoutCounterActivity.LJIIIZ.user_info.lynx_auth_url);
                return;
            } else if (!(context instanceof Activity)) {
                return;
            } else {
                String string = context.getString(2131561718);
                String string2 = context.getString(2131558453);
                String string3 = context.getString(2131561717);
                CJPayDialogBuilder defaultBuilder = CJPayDialogUtils.getDefaultBuilder((Activity) context);
                defaultBuilder.setTitle(string);
                defaultBuilder.setLeftBtnStr(string2);
                defaultBuilder.setRightBtnStr(string3);
                defaultBuilder.setLeftBtnListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.thirdparty.front.counter.utils.CJPayFrontCounterProvider.2
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(8683);
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        C2118a.LIZ().LIZ(104).LIZIZ();
                        C116971W2r.LIZ(CJPayFrontCounterProvider.this.LIZIZ);
                        try {
                            JSONObject jSONObject3 = new JSONObject();
                            jSONObject3.put("button_name", "取消");
                            C2118a.LIZ().LIZ("wallet_cashier_identified_pop_click", C136423cQs.LIZ(), jSONObject3);
                        } catch (JSONException unused) {
                        }
                    }
                });
                defaultBuilder.setRightBtnListener(new View.OnClickListener() { // from class: com.android.ttcjpaysdk.thirdparty.front.counter.utils.CJPayFrontCounterProvider.1
                    public static ChangeQuickRedirect LIZ;

                    static {
                        Covode.recordClassIndex(8682);
                    }

                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        if (PatchProxy.proxy(new Object[]{view}, this, LIZ, false, 1).isSupported) {
                            return;
                        }
                        C116971W2r.LIZ(CJPayFrontCounterProvider.this.LIZIZ);
                        if (!TextUtils.isEmpty(CJPayCheckoutCounterActivity.LJIIIZ.user_info.lynx_auth_url)) {
                            CJPayIncomeLynxOpenAccountActivity.LIZ(context, CJPayCheckoutCounterActivity.LJIIIZ.user_info.lynx_auth_url);
                            try {
                                JSONObject jSONObject3 = new JSONObject();
                                jSONObject3.put("button_name", "去认证");
                                C2118a.LIZ().LIZ("wallet_cashier_identified_pop_click", C136423cQs.LIZ(), jSONObject3);
                            } catch (JSONException unused) {
                            }
                        }
                    }
                });
                this.LIZIZ = CJPayDialogUtils.initDialog(defaultBuilder);
                C116971W2r.LIZJ(this.LIZIZ);
                C2118a.LIZ().LIZ("wallet_cashier_identified_pop_imp", C136423cQs.LIZ());
                return;
            }
        }
        Intent LIZ2 = CJPayFrontStandardCounterActivity.LIZ(context);
        LIZ2.putExtra("param_source", str2);
        LIZ2.putExtra("param_bind_card_info", str3);
        LIZ2.putExtra("param_close_webview", z);
        C116971W2r.LIZ(context, LIZ2);
    }
}
