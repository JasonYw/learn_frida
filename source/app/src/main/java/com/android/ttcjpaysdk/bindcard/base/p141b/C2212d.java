package com.android.ttcjpaysdk.bindcard.base.p141b;

import com.android.ttcjpaysdk.base.network.ICJPayCallback;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.a$b;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayRealNameBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C135543cCg;
import p003X.C135745cFw;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.b.d */
/* loaded from: classes17.dex */
public final class C2212d extends C135543cCg<C2208b, a$b> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7010);
    }

    public final void LIZ(CJPayRealNameBean cJPayRealNameBean, String str, String str2) {
        C2208b c2208b;
        if (!PatchProxy.proxy(new Object[]{cJPayRealNameBean, str, str2}, this, LIZ, false, 1).isSupported && (c2208b = (C2208b) this.mModel) != null) {
            C135745cFw c135745cFw = new C135745cFw(this);
            if (!PatchProxy.proxy(new Object[]{cJPayRealNameBean, str, str2, c135745cFw}, c2208b, C2208b.LIZJ, false, 11).isSupported) {
                JSONObject jSONObject = new JSONObject();
                if (cJPayRealNameBean != null) {
                    try {
                        jSONObject.put("sign_order_no", cJPayRealNameBean.commonBean.signOrderNo);
                        jSONObject.put("smch_id", cJPayRealNameBean.commonBean.smchId);
                        jSONObject.put("is_need_card_info", cJPayRealNameBean.is_need_card_info);
                    } catch (JSONException unused) {
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("sms", str);
                jSONObject.put("enc_params", jSONObject2);
                jSONObject.put("sms_token", str2);
                c2208b.LIZ(jSONObject, "bytepay.member_product.sign_card", (String) null, (String) null, true, (String) null, (ICJPayCallback) c135745cFw);
            }
        }
    }
}
