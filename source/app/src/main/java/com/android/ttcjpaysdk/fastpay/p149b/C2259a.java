package com.android.ttcjpaysdk.fastpay.p149b;

import com.android.ttcjpaysdk.base.network.AbstractC2162d;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.fastpay.data.p151a.C2262e;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Map;
import org.json.JSONObject;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;
import p003X.C136962cZZ;
import p003X.C136964cZb;
import p003X.C136998ca9;
import p003X.C137003caE;
import p003X.V32;

/* renamed from: com.android.ttcjpaysdk.fastpay.b.a */
/* loaded from: classes17.dex */
public final class C2259a extends C2124b {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(7455);
    }

    public final <T> void LIZ(Map<String, String> map, C2262e c2262e, AbstractC137673cl3<T> abstractC137673cl3) {
        C136998ca9 c136998ca9;
        String str;
        String str2;
        C136998ca9 c136998ca92;
        if (PatchProxy.proxy(new Object[]{map, c2262e, abstractC137673cl3}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(abstractC137673cl3);
        if (c2262e == null) {
            return;
        }
        C137003caE c137003caE = c2262e.data;
        String str3 = null;
        if (c137003caE != null && (c136998ca9 = c137003caE.trade_info) != null && c136998ca9.douyin_trade_info != null) {
            C136964cZb c136964cZb = new C136964cZb();
            try {
                C137003caE c137003caE2 = c2262e.data;
                if (c137003caE2 != null && (c136998ca92 = c137003caE2.trade_info) != null) {
                    str2 = c136998ca92.trade_no;
                } else {
                    str2 = null;
                }
                c136964cZb.LIZLLL = str2;
                JSONObject jSONObject = new JSONObject(c2262e.data.trade_info.douyin_trade_info);
                JSONObject optJSONObject = jSONObject.optJSONObject("trade_info");
                JSONObject optJSONObject2 = jSONObject.optJSONObject("process_info");
                c136964cZb.LJFF = new JSONObject();
                c136964cZb.LJFF.put("process_info", optJSONObject2);
                JSONObject jSONObject2 = c136964cZb.LJFF;
                if (optJSONObject != null) {
                    str3 = optJSONObject.optString("trade_no");
                }
                jSONObject2.put("trade_no", str3);
            } catch (Exception unused) {
            }
            String LIZ = C136962cZZ.LIZ("/gateway-cashier2/tp/cashier/trade_query");
            if (map == null || (str = map.get(Constants.APP_ID)) == null) {
                str = "";
            }
            LIZ(CJPayNetworkManager.postForm(LIZ, C136962cZZ.LIZ("tp.cashier.trade_query", c136964cZb.LIZ(), str), C136962cZZ.LIZ(LIZ, "tp.cashier.trade_query"), abstractC137673cl3));
        }
    }

    public final <T> void LIZ(Map<String, String> map, String str, AbstractC137673cl3<T> abstractC137673cl3, AbstractC2162d abstractC2162d) {
        String str2;
        if (PatchProxy.proxy(new Object[]{map, str, abstractC137673cl3, abstractC2162d}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC137673cl3);
        V32 v32 = new V32();
        v32.LIZIZ = map;
        v32.LIZJ = str;
        String LIZ = C136962cZZ.LIZ("/gateway-cashier2/tp/cashier/direct_confirm");
        if (map == null || (str2 = map.get(Constants.APP_ID)) == null) {
            str2 = "";
        }
        LIZ(CJPayNetworkManager.postForm(LIZ, C136962cZZ.LIZ("", v32.LIZ(), str2), C136962cZZ.LIZ(LIZ, "tp.cashier.confirm_onekeypay"), abstractC137673cl3, abstractC2162d));
    }
}
