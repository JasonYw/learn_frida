package com.android.ttcjpaysdk.integrated.counter.p156d;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.json.CJPayJsonParser;
import com.android.ttcjpaysdk.base.network.AbstractC2162d;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.integrated.counter.data.C2278i;
import com.android.ttcjpaysdk.integrated.counter.p154b.C2272a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;
import p003X.C137121cc9;
import p003X.C137130ccI;
import p003X.C137134ccM;
import p003X.C137136ccO;
import p003X.C137283cel;
import p003X.C137321cfN;
import p003X.C137356cfw;
import p003X.C137389cgT;
import p003X.V31;

/* renamed from: com.android.ttcjpaysdk.integrated.counter.d.a */
/* loaded from: classes17.dex */
public final class C2274a extends C2124b {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(7558);
    }

    public final <T> void LIZ(Map<String, String> map, AbstractC137673cl3<T> abstractC137673cl3) {
        C137283cel c137283cel;
        String str;
        if (PatchProxy.proxy(new Object[]{map, abstractC137673cl3}, this, LIZIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(map, abstractC137673cl3);
        if (C2272a.LIZIZ == null) {
            return;
        }
        C137121cc9 c137121cc9 = C137356cfw.LIZIZ;
        C2278i c2278i = C2272a.LIZIZ;
        String str2 = map.get("scene");
        String str3 = map.get("pay_type");
        String str4 = map.get("card_no");
        String str5 = map.get("promotion_process");
        String str6 = map.get("combine_type");
        String str7 = map.get("credit_pay_installment");
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{c2278i, str2, str3, str4, str5, str6, str7}, c137121cc9, C137121cc9.LIZ, false, 13);
        String str8 = null;
        if (proxy.isSupported) {
            c137283cel = (C137283cel) proxy.result;
        } else {
            c137283cel = new C137283cel();
            if (c2278i == null) {
                c137283cel = null;
            } else {
                C137321cfN c137321cfN = new C137321cfN();
                c137321cfN.bank_card_id = str4;
                c137321cfN.business_scene = str2;
                c137321cfN.credit_pay_installment = str7;
                c137321cfN.promotion_process = (C137389cgT) CJPayJsonParser.fromJson(str5, C137389cgT.class);
                c137283cel.trade_no = c2278i.data.trade_info.trade_no;
                c137283cel.ptcode = str3;
                if (!TextUtils.isEmpty(str6)) {
                    c137321cfN.combine_type = str6;
                }
                c137283cel.ptcode_info = CJPayJsonParser.toJsonObject(c137321cfN).toString();
            }
        }
        String LIZ = C137356cfw.LIZIZ.LIZ(true, "/gateway-cashier2/tp/cashier/trade_confirm");
        C137121cc9 c137121cc92 = C137356cfw.LIZIZ;
        if (c137283cel != null) {
            str = c137283cel.toJsonString();
        } else {
            str = null;
        }
        LIZ(CJPayNetworkManager.postForm(LIZ, C137121cc9.LIZ(c137121cc92, "tp.cashier.trade_confirm", str, null, null, 8, null), C137356cfw.LIZIZ.LIZ(LIZ, "tp.cashier.trade_confirm"), abstractC137673cl3));
        C137121cc9 c137121cc93 = C137356cfw.LIZIZ;
        String str9 = CJPayHostInfo.aid;
        String str10 = CJPayHostInfo.did;
        CJPayHostInfo cJPayHostInfo = C2272a.LIZJ;
        if (cJPayHostInfo != null) {
            str8 = cJPayHostInfo.merchantId;
        }
        c137121cc93.LIZ("聚合_confirm", "wallet_rd_confirm_interface_params_verify", str9, str10, str8);
    }

    public final <T> void LIZ(Map<String, String> map, JSONObject jSONObject, AbstractC137673cl3<T> abstractC137673cl3) {
        String str;
        String str2;
        C137134ccM c137134ccM;
        C137130ccI c137130ccI;
        if (PatchProxy.proxy(new Object[]{map, jSONObject, abstractC137673cl3}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC137673cl3);
        if (C2272a.LIZIZ == null) {
            return;
        }
        C137136ccO c137136ccO = new C137136ccO();
        C2278i c2278i = C2272a.LIZIZ;
        if (c2278i == null || (c137134ccM = c2278i.data) == null || (c137130ccI = c137134ccM.trade_info) == null || (str = c137130ccI.trade_no) == null) {
            str = "";
        }
        c137136ccO.LIZJ = str;
        c137136ccO.f18131LJ = jSONObject;
        String LIZ = C137356cfw.LIZIZ.LIZ(false, "/gateway-cashier2/tp/cashier/trade_query");
        LIZ(CJPayNetworkManager.postForm(LIZ, C137121cc9.LIZ(C137356cfw.LIZIZ, "tp.cashier.trade_query", c137136ccO.LIZ(), null, null, 8, null), C137356cfw.LIZIZ.LIZ(LIZ, "tp.cashier.trade_query"), abstractC137673cl3));
        C137121cc9 c137121cc9 = C137356cfw.LIZIZ;
        String str3 = CJPayHostInfo.aid;
        String str4 = CJPayHostInfo.did;
        CJPayHostInfo cJPayHostInfo = C2272a.LIZJ;
        if (cJPayHostInfo != null) {
            str2 = cJPayHostInfo.merchantId;
        } else {
            str2 = null;
        }
        c137121cc9.LIZ("聚合_query", "wallet_rd_query_interface_params_verify", str3, str4, str2);
    }

    public final <T> void LIZ(Map<String, String> map, AbstractC137673cl3<T> abstractC137673cl3, AbstractC2162d abstractC2162d) {
        Map<String, String> map2;
        if (PatchProxy.proxy(new Object[]{map, abstractC137673cl3, abstractC2162d}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC137673cl3);
        C2118a LIZ = C2118a.LIZ();
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ.LJIJJ = "";
        V31 v31 = new V31();
        CJPayHostInfo cJPayHostInfo = C2272a.LIZJ;
        String str = null;
        if (cJPayHostInfo != null) {
            map2 = cJPayHostInfo.payRequestParams;
        } else {
            map2 = null;
        }
        v31.LIZIZ = map2;
        if (map != null && TextUtils.isEmpty(map.get("service"))) {
            v31.LIZLLL = map.get("service");
        }
        String LIZ2 = C137356cfw.LIZIZ.LIZ(true, "/gateway-cashier2/tp/cashier/trade_create");
        LIZ(CJPayNetworkManager.postForm(LIZ2, C137121cc9.LIZ(C137356cfw.LIZIZ, "tp.cashier.trade_create", v31.LIZ(), null, null, 8, null), C137356cfw.LIZIZ.LIZ(LIZ2, "tp.cashier.trade_create"), abstractC137673cl3, abstractC2162d));
        C137121cc9 c137121cc9 = C137356cfw.LIZIZ;
        String str2 = CJPayHostInfo.aid;
        String str3 = CJPayHostInfo.did;
        CJPayHostInfo cJPayHostInfo2 = C2272a.LIZJ;
        if (cJPayHostInfo2 != null) {
            str = cJPayHostInfo2.merchantId;
        }
        c137121cc9.LIZ("聚合_create", "wallet_rd_create_interface_params_verify", str2, str3, str);
    }
}
