package com.android.ttcjpaysdk.bindcard.base.p141b;

import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.a$e;
import com.android.ttcjpaysdk.thirdparty.data.CJPaySecureRequestParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;
import p003X.C135543cCg;
import p003X.C135750cG1;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.b.e */
/* loaded from: classes17.dex */
public final class C2213e extends C135543cCg<C2208b, a$e> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7013);
    }

    public final void LIZ(String str, String str2, String str3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("smch_id", str);
            jSONObject.put("sign_order_no", str2);
            jSONObject.put("password", str3);
            CJPaySecureRequestParams cJPaySecureRequestParams = new CJPaySecureRequestParams();
            cJPaySecureRequestParams.version = 3;
            cJPaySecureRequestParams.type1 = 2;
            cJPaySecureRequestParams.type2 = 1;
            cJPaySecureRequestParams.check = 0;
            cJPaySecureRequestParams.fields.add("password");
            jSONObject.put("secure_request_params", cJPaySecureRequestParams.toJson());
        } catch (JSONException unused) {
        }
        C2208b c2208b = (C2208b) this.mModel;
        if (c2208b != null) {
            C135750cG1 c135750cG1 = new C135750cG1(this);
            if (!PatchProxy.proxy(new Object[]{jSONObject, c135750cG1}, c2208b, C2208b.LIZJ, false, 5).isSupported) {
                C106862S5w.LIZ(jSONObject, c135750cG1);
                c2208b.LIZ(jSONObject, "bytepay.member_product.verify_password", (String) null, (String) null, false, String.valueOf(System.currentTimeMillis() / 1000), (AbstractC137673cl3) c135750cG1);
            }
        }
    }
}
