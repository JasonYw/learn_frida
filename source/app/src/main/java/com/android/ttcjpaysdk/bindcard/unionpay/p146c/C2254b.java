package com.android.ttcjpaysdk.bindcard.unionpay.p146c;

import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.unionpay.p145b.C2252a;
import com.android.ttcjpaysdk.bindcard.unionpay.p147d.a$b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;
import p003X.C135543cCg;
import p003X.C135695cF8;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.c.b */
/* loaded from: classes17.dex */
public final class C2254b extends C135543cCg<C2252a, a$b> {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(7340);
    }

    public final void LIZ(String str) {
        C2208b c2208b;
        if (!PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported && (c2208b = (C2208b) this.mModel) != null) {
            C135695cF8 c135695cF8 = new C135695cF8(this);
            if (!PatchProxy.proxy(new Object[]{str, c135695cF8}, c2208b, C2252a.LIZIZ, false, 5).isSupported) {
                C106862S5w.LIZ(c135695cF8);
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("member_biz_order_no", str);
                    c2208b.LIZ(jSONObject, "bytepay.member_product.union_pay_sign", (String) null, (String) null, true, (AbstractC137673cl3) c135695cF8);
                } catch (Exception unused) {
                }
            }
        }
    }
}
