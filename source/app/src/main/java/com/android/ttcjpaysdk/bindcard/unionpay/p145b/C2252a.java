package com.android.ttcjpaysdk.bindcard.unionpay.p145b;

import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.bindcard.unionpay.b.a */
/* loaded from: classes17.dex */
public final class C2252a extends C2208b {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(7327);
    }

    public final <T> void LIZ(UnionPaySignInfo unionPaySignInfo, AbstractC137673cl3<T> abstractC137673cl3) {
        if (PatchProxy.proxy(new Object[]{unionPaySignInfo, abstractC137673cl3}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(unionPaySignInfo, abstractC137673cl3);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("member_biz_order_no", unionPaySignInfo.signOrderNo);
            LIZ(jSONObject, "bytepay.member_product.query_union_pay_authorization", (String) null, (String) null, true, (AbstractC137673cl3) abstractC137673cl3);
        } catch (Exception unused) {
        }
    }

    public final <T> void LIZIZ(UnionPaySignInfo unionPaySignInfo, AbstractC137673cl3<T> abstractC137673cl3) {
        if (PatchProxy.proxy(new Object[]{unionPaySignInfo, abstractC137673cl3}, this, LIZIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(unionPaySignInfo, abstractC137673cl3);
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("member_biz_order_no", unionPaySignInfo.signOrderNo);
            LIZ(jSONObject, "bytepay.member_product.get_union_pay_bank_list", (String) null, (String) null, true, (AbstractC137673cl3) abstractC137673cl3);
        } catch (Exception unused) {
        }
    }
}
