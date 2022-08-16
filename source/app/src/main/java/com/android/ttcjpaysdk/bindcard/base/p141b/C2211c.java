package com.android.ttcjpaysdk.bindcard.base.p141b;

import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.a$d;
import com.android.ttcjpaysdk.thirdparty.data.CJPaySecureRequestParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;
import p003X.C135543cCg;
import p003X.C135749cG0;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.b.c */
/* loaded from: classes17.dex */
public final class C2211c extends C135543cCg<C2208b, a$d> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7008);
    }

    public final void LIZ(String str, String str2, String str3, String str4) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4}, this, LIZ, false, 1).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("smch_id", str);
            jSONObject.put("sign_order_no", str2);
            jSONObject.put("password", str3);
            jSONObject.put("password_confirm", str4);
            CJPaySecureRequestParams cJPaySecureRequestParams = new CJPaySecureRequestParams();
            cJPaySecureRequestParams.version = 3;
            cJPaySecureRequestParams.type1 = 2;
            cJPaySecureRequestParams.type2 = 1;
            cJPaySecureRequestParams.check = 0;
            cJPaySecureRequestParams.fields.add("password");
            cJPaySecureRequestParams.fields.add("password_confirm");
            jSONObject.put("secure_request_params", cJPaySecureRequestParams.toJson());
        } catch (JSONException unused) {
        }
        C2208b c2208b = (C2208b) this.mModel;
        if (c2208b != null) {
            C135749cG0 c135749cG0 = new C135749cG0(this);
            if (!PatchProxy.proxy(new Object[]{jSONObject, c135749cG0}, c2208b, C2208b.LIZJ, false, 4).isSupported) {
                C106862S5w.LIZ(jSONObject, c135749cG0);
                c2208b.LIZ(jSONObject, "bytepay.member_product.set_password", (String) null, (String) null, false, String.valueOf(System.currentTimeMillis() / 1000), (AbstractC137673cl3) c135749cG0);
            }
        }
    }
}
