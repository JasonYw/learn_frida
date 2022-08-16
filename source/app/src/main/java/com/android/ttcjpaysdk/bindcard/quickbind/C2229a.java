package com.android.ttcjpaysdk.bindcard.quickbind;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.android.ttcjpaysdk.bindcard.quickbind.bean.CJPayOneKeyQueryResponseBean;
import com.android.ttcjpaysdk.bindcard.quickbind.bean.CJPayOneKeySignOrderResponseBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;
import p003X.C136035cKc;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.a */
/* loaded from: classes17.dex */
public final class C2229a extends C2208b {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(7210);
    }

    public final void LIZJ(Map<String, String> map, AbstractC137673cl3<CJPayProtocolGroupContentsBean> abstractC137673cl3) {
        if (PatchProxy.proxy(new Object[]{map, abstractC137673cl3}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(map, abstractC137673cl3);
        LIZ(new JSONObject(map), "bytepay.member_product.query_protocol_list", (String) null, (String) null, false, (AbstractC137673cl3) abstractC137673cl3);
    }

    public final void LIZLLL(Map<String, String> map, AbstractC137673cl3<CJPayOneKeyQueryResponseBean> abstractC137673cl3) {
        if (PatchProxy.proxy(new Object[]{map, abstractC137673cl3}, this, LIZIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(map, abstractC137673cl3);
        LIZ(new JSONObject(map), "bytepay.member_product.query_one_key_sign", (String) null, (String) null, true, (AbstractC137673cl3) abstractC137673cl3);
    }

    public final void LIZ(Map<String, String> map, String str, AbstractC137673cl3<CJPayOneKeySignOrderResponseBean> abstractC137673cl3) {
        if (PatchProxy.proxy(new Object[]{map, str, abstractC137673cl3}, this, LIZIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(map, str, abstractC137673cl3);
        JSONObject jSONObject = new JSONObject(map);
        jSONObject.put("ab_version", C136035cKc.m21743LJ().LIZ(true));
        if (!TextUtils.isEmpty(str)) {
            try {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("member_biz_order_no", str);
                jSONObject.put("identity_verify_info", jSONObject2);
            } catch (JSONException unused) {
            }
        }
        LIZ(jSONObject, "bytepay.member_product.create_one_key_sign_order", (String) null, (String) null, true, (AbstractC137673cl3) abstractC137673cl3);
    }
}
