package com.android.ttcjpaysdk.bdpay.bindcard.normal.p138b;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.network.ICJPayCallback;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bindcard.base.C2208b;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C135876cI3;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.b.a */
/* loaded from: classes17.dex */
public final class C2189a extends C2208b {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(6757);
    }

    public final void LIZ(ICJPayCallback iCJPayCallback) {
        if (PatchProxy.proxy(new Object[]{iCJPayCallback}, this, LIZIZ, false, 7).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("need_plain", true);
            jSONObject.put("need_encrypt", true);
        } catch (Exception unused) {
        }
        String LJI = C135876cI3.LJI();
        String LJII = C135876cI3.LJII();
        HashMap<String, String> hashMap = C135876cI3.f17973LJ.LJIIIIZZ().extraHeaderMap;
        String LIZIZ2 = CJPayParamsUtils.LIZIZ();
        LIZ(CJPayNetworkManager.postForm(LIZIZ2, CJPayParamsUtils.LIZ("tp.passport.query_mobile_by_uid", jSONObject.toString(), LJII, LJI), CJPayParamsUtils.LIZ(LIZIZ2, "tp.passport.query_mobile_by_uid", hashMap), iCJPayCallback));
    }

    public final void LIZ(ICJPayCallback iCJPayCallback, String str, String str2, String str3, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{iCJPayCallback, str, str2, str3, jSONObject}, this, LIZIZ, false, 4).isSupported) {
            return;
        }
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("biz_order_type", str);
            jSONObject2.put("source", str2);
            if (!TextUtils.isEmpty(str3)) {
                jSONObject2.put("exts", str3);
            }
            if (jSONObject != null) {
                Iterator<String> keys = jSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    jSONObject2.put(next, jSONObject.get(next));
                }
            }
        } catch (JSONException unused) {
        }
        LIZ(jSONObject2, "bytepay.member_product.create_biz_order", (String) null, (String) null, true, (String) null, iCJPayCallback);
    }
}
