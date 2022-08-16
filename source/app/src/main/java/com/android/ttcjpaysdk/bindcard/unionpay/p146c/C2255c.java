package com.android.ttcjpaysdk.bindcard.unionpay.p146c;

import com.android.ttcjpaysdk.base.utils.CJPayEncryptUtil;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayRealNameBean;
import com.android.ttcjpaysdk.bindcard.unionpay.p145b.C2252a;
import com.android.ttcjpaysdk.bindcard.unionpay.p147d.a$c;
import com.android.ttcjpaysdk.thirdparty.data.CJPaySecureRequestParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;
import p003X.C135543cCg;
import p003X.C135697cFA;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.c.c */
/* loaded from: classes17.dex */
public final class C2255c extends C135543cCg<C2252a, a$c> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7342);
    }

    public final void LIZ(CJPayRealNameBean cJPayRealNameBean) {
        C2208b c2208b;
        if (!PatchProxy.proxy(new Object[]{cJPayRealNameBean}, this, LIZ, false, 1).isSupported && (c2208b = (C2208b) this.mModel) != null) {
            C135697cFA c135697cFA = new C135697cFA(this, cJPayRealNameBean);
            if (!PatchProxy.proxy(new Object[]{cJPayRealNameBean, c135697cFA}, c2208b, C2252a.LIZIZ, false, 7).isSupported) {
                C106862S5w.LIZ(c135697cFA);
                JSONObject jSONObject = new JSONObject();
                if (cJPayRealNameBean != null) {
                    try {
                        cJPayRealNameBean.secure_request_params = new CJPaySecureRequestParams();
                        jSONObject.put("sign_order_no", cJPayRealNameBean.commonBean.signOrderNo);
                        jSONObject.put("smch_id", cJPayRealNameBean.commonBean.smchId);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put("card_no", CJPayEncryptUtil.getEncryptDataSM(cJPayRealNameBean.card_no));
                        cJPayRealNameBean.secure_request_params.version = 3;
                        cJPayRealNameBean.secure_request_params.type1 = 2;
                        cJPayRealNameBean.secure_request_params.type2 = 1;
                        cJPayRealNameBean.secure_request_params.check = 0;
                        cJPayRealNameBean.secure_request_params.fields.add("enc_params.card_no");
                        jSONObject.put("enc_params", jSONObject2);
                        jSONObject.put("secure_request_params", cJPayRealNameBean.secure_request_params.toJson());
                    } catch (JSONException unused) {
                        return;
                    }
                }
                c2208b.LIZ(jSONObject, "bytepay.member_product.send_sign_sms", (String) null, (String) null, true, (AbstractC137673cl3) c135697cFA);
            }
        }
    }
}
