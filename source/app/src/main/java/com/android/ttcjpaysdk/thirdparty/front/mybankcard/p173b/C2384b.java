package com.android.ttcjpaysdk.thirdparty.front.mybankcard.p173b;

import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.network.ICJPayCallback;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.thirdparty.data.CJPayRiskInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.C135876cI3;
import p003X.C64859BiX;

/* renamed from: com.android.ttcjpaysdk.thirdparty.front.mybankcard.b.b */
/* loaded from: classes17.dex */
public final class C2384b extends C2124b {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(8732);
    }

    public final void LIZ(ICJPayCallback iCJPayCallback) {
        if (PatchProxy.proxy(new Object[]{iCJPayCallback}, this, LIZIZ, false, 3).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("exts", new JSONObject());
        } catch (JSONException unused) {
        }
        Intrinsics.checkNotNull(iCJPayCallback);
        LIZ(iCJPayCallback, jSONObject, "bytepay.member_product.get_bank_list", true);
    }

    public final void LIZ(ICJPayCallback iCJPayCallback, String str) {
        if (PatchProxy.proxy(new Object[]{iCJPayCallback, str}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("title_place_no", "PP202101041000251153438201");
            jSONObject.put("bankcard_place_no", "PP202204181000251153438205");
            jSONObject.put(C64859BiX.LIZIZ, CJPayHostInfo.aid);
            jSONObject.put("did", CJPayHostInfo.did);
            if (str == null) {
                str = "";
            }
            jSONObject.put("app_version", str);
            jSONObject.put("device_system", "android");
        } catch (JSONException unused) {
        }
        new StringBuilder();
        String m25086C = C0002O.m25086C(CJPayParamsUtils.LIZ(), "/gateway-u");
        LIZ(CJPayNetworkManager.postForm(m25086C, CJPayParamsUtils.LIZ("bytepay.promotion_put.bank_card_management", jSONObject.toString(), C135876cI3.f17973LJ.LJIIIIZZ().appId, C135876cI3.f17973LJ.LJIIIIZZ().merchantId), CJPayParamsUtils.LIZ(m25086C, "bytepay.promotion_put.bank_card_management", C135876cI3.f17973LJ.LJIIIIZZ().extraHeaderMap), iCJPayCallback));
    }

    public final void LIZ(String str, ICJPayCallback iCJPayCallback) {
        if (PatchProxy.proxy(new Object[]{str, iCJPayCallback}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("smch_id", str);
            jSONObject.put("is_need_query_auth_info", true);
            jSONObject.put("is_need_query_balance", true);
            jSONObject.put("is_need_query_bankcard_list", true);
            jSONObject.put("is_need_bind_top_page_url", true);
        } catch (JSONException unused) {
        }
        Intrinsics.checkNotNull(iCJPayCallback);
        LIZ(iCJPayCallback, jSONObject, "bytepay.member_product.query_pay_member", true);
    }

    private final void LIZ(ICJPayCallback iCJPayCallback, JSONObject jSONObject, String str, boolean z) {
        if (PatchProxy.proxy(new Object[]{iCJPayCallback, jSONObject, str, (byte) 1}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        CJPayRiskInfo cJPayRiskInfo = new CJPayRiskInfo();
        CJPayRiskInfo.RiskStrInfo riskStrInfo = new CJPayRiskInfo.RiskStrInfo();
        riskStrInfo.riskInfoParamsMap = C135876cI3.f17973LJ.LJIIIIZZ().LIZIZ();
        cJPayRiskInfo.risk_str = riskStrInfo;
        try {
            jSONObject.put("risk_info", cJPayRiskInfo.toJson().toString());
        } catch (JSONException unused) {
        }
        String str2 = C135876cI3.f17973LJ.LJIIIIZZ().merchantId;
        String str3 = C135876cI3.f17973LJ.LJIIIIZZ().appId;
        HashMap<String, String> hashMap = C135876cI3.f17973LJ.LJIIIIZZ().extraHeaderMap;
        String LIZ = CJPayParamsUtils.LIZ(str, CJPayParamsUtils.HostAPI.BDPAY);
        LIZ(CJPayNetworkManager.postForm(LIZ, CJPayParamsUtils.LIZ(str, jSONObject.toString(), str3, str2), CJPayParamsUtils.LIZ(LIZ, str, hashMap), iCJPayCallback));
    }
}
