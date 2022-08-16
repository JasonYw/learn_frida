package com.android.ttcjpaysdk.bindcard.quickbind.p143a;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.utils.CJPayEncryptUtil;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.utils.CJPayQuickBindCardUtils;
import com.android.ttcjpaysdk.bindcard.quickbind.C2229a;
import com.android.ttcjpaysdk.bindcard.quickbind.b$d;
import com.android.ttcjpaysdk.thirdparty.data.CJPaySecureRequestParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONObject;
import p002O.C0002O;
import p003X.AbstractC135914cIf;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;
import p003X.C135876cI3;
import p003X.C135908cIZ;
import p003X.C136035cKc;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.a.d */
/* loaded from: classes17.dex */
public final class C2232d extends AbstractC135914cIf<b$d> {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f25480LJ;

    static {
        Covode.recordClassIndex(7222);
    }

    public final void LIZ(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z) {
        String bindCardSource;
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5, str6, str7, str8, Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, f25480LJ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3, str4, str5, str6, str7, str8);
        HashMap hashMap = new HashMap();
        hashMap.put("return_url", C0002O.m25086C("https://onekeysigncard/cardbind/quickbind/notify?afterQuickbind=", CJPayQuickBindCardUtils.LIZLLL(CJPayHostInfo.aid)));
        hashMap.put("bank_code", str3);
        hashMap.put("card_type", str4);
        if (TextUtils.isEmpty(C135876cI3.f17973LJ.LJIILIIL().getBindCardSource())) {
            bindCardSource = "payment_manage";
        } else {
            bindCardSource = C135876cI3.f17973LJ.LJIILIIL().getBindCardSource();
        }
        hashMap.put("source", bindCardSource);
        hashMap.put("out_trade_no", str2);
        String LIZ = LIZ(str8);
        if (!TextUtils.isEmpty(LIZ)) {
            hashMap.put("exts", LIZ);
        }
        if (z) {
            hashMap.put("trade_scene", "pay");
        } else {
            int tradeScene = C135876cI3.f17973LJ.LJIILIIL().getTradeScene();
            if (tradeScene != 1) {
                if (tradeScene == 2) {
                    hashMap.put("trade_scene", "balance_withdraw");
                }
            } else {
                hashMap.put("trade_scene", "balance_recharge");
            }
        }
        C2208b c2208b = (C2208b) this.mModel;
        if (c2208b != null) {
            C135908cIZ c135908cIZ = new C135908cIZ(this);
            if (!PatchProxy.proxy(new Object[]{hashMap, str, str5, str6, str7, c135908cIZ}, c2208b, C2229a.LIZIZ, false, 4).isSupported) {
                C106862S5w.LIZ(hashMap, str, str5, str6, str7, c135908cIZ);
                try {
                    JSONObject jSONObject = new JSONObject(hashMap);
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("member_biz_order_no", str);
                    jSONObject2.put("name", CJPayEncryptUtil.getEncryptDataSM(str5));
                    jSONObject2.put("identity_type", str6);
                    jSONObject2.put("identity_code", CJPayEncryptUtil.getEncryptDataSM(StringsKt__StringsJVMKt.replace$default(str7, " ", "", false, 4, (Object) null)));
                    jSONObject.put("identity_verify_info", jSONObject2);
                    CJPaySecureRequestParams cJPaySecureRequestParams = new CJPaySecureRequestParams();
                    cJPaySecureRequestParams.version = 3;
                    cJPaySecureRequestParams.type1 = 2;
                    cJPaySecureRequestParams.type2 = 1;
                    cJPaySecureRequestParams.check = 0;
                    cJPaySecureRequestParams.fields.add("identity_verify_info.name");
                    cJPaySecureRequestParams.fields.add("identity_verify_info.identity_code");
                    jSONObject.put("secure_request_params", cJPaySecureRequestParams.toJson());
                    jSONObject.put("ab_version", C136035cKc.m21743LJ().LIZ(true));
                    c2208b.LIZ(jSONObject, "bytepay.member_product.create_one_key_sign_order", (String) null, (String) null, true, (AbstractC137673cl3) c135908cIZ);
                } catch (Exception unused) {
                }
            }
        }
    }
}
