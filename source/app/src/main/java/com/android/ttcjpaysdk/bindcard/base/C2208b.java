package com.android.ttcjpaysdk.bindcard.base;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.network.ICJPayCallback;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.utils.CJPayEncryptUtil;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayNewCardBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayRealNameBean;
import com.android.ttcjpaysdk.thirdparty.data.CJPaySecureRequestParams;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsJVMKt;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;
import p003X.C135876cI3;
import p003X.C587069Fs;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.b */
/* loaded from: classes17.dex */
public class C2208b extends C2124b {
    public static ChangeQuickRedirect LIZJ;

    static {
        Covode.recordClassIndex(7001);
    }

    public final void LIZ(JSONObject jSONObject, String str, String str2, String str3, boolean z, String str4, ICJPayCallback iCJPayCallback) {
        if (PatchProxy.proxy(new Object[]{jSONObject, str, null, null, (byte) 1, null, iCJPayCallback}, this, LIZJ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject, str);
        C587069Fs c587069Fs = new C587069Fs();
        Map<String, String> LIZIZ = C135876cI3.f17973LJ.LJIIIIZZ().LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = null;
        }
        c587069Fs.LIZIZ = LIZIZ;
        try {
            jSONObject.put("risk_info", c587069Fs.LIZIZ());
        } catch (Exception unused) {
        }
        String LJI = TextUtils.isEmpty(null) ? C135876cI3.LJI() : null;
        String LJII = TextUtils.isEmpty(null) ? C135876cI3.LJII() : null;
        HashMap<String, String> hashMap = C135876cI3.f17973LJ.LJIIIIZZ().extraHeaderMap;
        if (hashMap == null) {
            hashMap = null;
        }
        String LIZ = CJPayParamsUtils.LIZ(str, CJPayParamsUtils.HostAPI.BDPAY);
        Map<String, String> LIZ2 = CJPayParamsUtils.LIZ(str, jSONObject.toString(), LJII, LJI);
        if (!TextUtils.isEmpty(null)) {
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            LIZ2.put("timestamp", null);
        }
        LIZ(CJPayNetworkManager.postForm(LIZ, LIZ2, CJPayParamsUtils.LIZ(LIZ, str, hashMap), iCJPayCallback));
    }

    public final <T> void LIZ(JSONObject jSONObject, String str, String str2, String str3, boolean z, String str4, AbstractC137673cl3<T> abstractC137673cl3) {
        if (PatchProxy.proxy(new Object[]{jSONObject, str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), str4, abstractC137673cl3}, this, LIZJ, false, 10).isSupported) {
            return;
        }
        C587069Fs c587069Fs = new C587069Fs();
        Map<String, String> LIZIZ = C135876cI3.f17973LJ.LJIIIIZZ().LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = null;
        }
        c587069Fs.LIZIZ = LIZIZ;
        try {
            jSONObject.put("risk_info", (z ? c587069Fs.LIZIZ() : c587069Fs.LIZ()).toString());
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(str2)) {
            str2 = C135876cI3.LJI();
        }
        if (TextUtils.isEmpty(str3)) {
            str3 = C135876cI3.LJII();
        }
        HashMap<String, String> hashMap = C135876cI3.f17973LJ.LJIIIIZZ().extraHeaderMap;
        if (hashMap == null) {
            hashMap = null;
        }
        String LIZ = CJPayParamsUtils.LIZ(str, CJPayParamsUtils.HostAPI.BDPAY);
        Map<String, String> LIZ2 = CJPayParamsUtils.LIZ(str, jSONObject.toString(), str3, str2);
        if (!TextUtils.isEmpty(str4)) {
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            LIZ2.put("timestamp", str4);
        }
        LIZ(CJPayNetworkManager.postForm(LIZ, LIZ2, CJPayParamsUtils.LIZ(LIZ, str, hashMap), abstractC137673cl3));
    }

    public final <T> void LIZ(Map<String, String> map, AbstractC137673cl3<T> abstractC137673cl3) {
        if (PatchProxy.proxy(new Object[]{map, abstractC137673cl3}, this, LIZJ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(map, abstractC137673cl3);
        LIZ(new JSONObject(map), "bytepay.member_product.verify_live_detection_result", (String) null, (String) null, false, (AbstractC137673cl3) abstractC137673cl3);
    }

    public final <T> void LIZIZ(Map<String, String> map, AbstractC137673cl3<T> abstractC137673cl3) {
        if (PatchProxy.proxy(new Object[]{map, abstractC137673cl3}, this, LIZJ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(map, abstractC137673cl3);
        LIZ(new JSONObject(map), "bytepay.member_product.create_biz_order", (String) null, (String) null, false, (AbstractC137673cl3) abstractC137673cl3);
    }

    public final void LIZ(JSONObject jSONObject, AbstractC137673cl3<CJPayNewCardBean> abstractC137673cl3) {
        if (PatchProxy.proxy(new Object[]{jSONObject, abstractC137673cl3}, this, LIZJ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject, abstractC137673cl3);
        LIZ(jSONObject, "bytepay.cashdesk.pay_new_card", (String) null, (String) null, String.valueOf(System.currentTimeMillis() / 1000), abstractC137673cl3);
    }

    public final void LIZ(CJPayRealNameBean cJPayRealNameBean, ICJPayCallback iCJPayCallback) {
        if (PatchProxy.proxy(new Object[]{cJPayRealNameBean, iCJPayCallback}, this, LIZJ, false, 12).isSupported) {
            return;
        }
        JSONObject jSONObject = new JSONObject();
        if (cJPayRealNameBean != null) {
            try {
                cJPayRealNameBean.secure_request_params = new CJPaySecureRequestParams();
                jSONObject.put("sign_order_no", cJPayRealNameBean.commonBean.signOrderNo);
                jSONObject.put("smch_id", cJPayRealNameBean.commonBean.smchId);
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("card_no", CJPayEncryptUtil.getEncryptDataSM(cJPayRealNameBean.card_no));
                if (TextUtils.isEmpty(cJPayRealNameBean.encryptedMobileNumber)) {
                    jSONObject2.put("mobile", CJPayEncryptUtil.getEncryptDataSM(cJPayRealNameBean.bank_mobile_no));
                } else {
                    jSONObject2.put("mobile", CJPayEncryptUtil.getEncryptDataSM(cJPayRealNameBean.encryptedMobileNumber));
                }
                if (!TextUtils.isEmpty(cJPayRealNameBean.user_name)) {
                    jSONObject2.put("name", CJPayEncryptUtil.getEncryptDataSM(cJPayRealNameBean.user_name));
                    jSONObject2.put("identity_type", cJPayRealNameBean.id_type.key);
                    jSONObject2.put("identity_code", CJPayEncryptUtil.getEncryptDataSM(cJPayRealNameBean.id_no));
                    if (!TextUtils.isEmpty(cJPayRealNameBean.country)) {
                        jSONObject2.put("country", cJPayRealNameBean.country);
                    }
                    cJPayRealNameBean.secure_request_params.fields.add("enc_params.name");
                    cJPayRealNameBean.secure_request_params.fields.add("enc_params.identity_code");
                }
                cJPayRealNameBean.secure_request_params.version = 3;
                cJPayRealNameBean.secure_request_params.type1 = 2;
                cJPayRealNameBean.secure_request_params.type2 = 1;
                cJPayRealNameBean.secure_request_params.check = 0;
                if (!cJPayRealNameBean.isUnionPay) {
                    cJPayRealNameBean.secure_request_params.fields.add("enc_params.mobile");
                    cJPayRealNameBean.secure_request_params.fields.add("enc_params.card_no");
                } else {
                    cJPayRealNameBean.secure_request_params.fields.add("enc_params.card_no");
                }
                jSONObject.put("enc_params", jSONObject2);
                jSONObject.put("secure_request_params", cJPayRealNameBean.secure_request_params.toJson());
            } catch (JSONException unused) {
            }
        }
        LIZ(jSONObject, "bytepay.member_product.send_sign_sms", (String) null, (String) null, true, (String) null, iCJPayCallback);
    }

    public final <T> void LIZ(String str, String str2, String str3, String str4, AbstractC137673cl3<T> abstractC137673cl3) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, abstractC137673cl3}, this, LIZJ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3, str4, abstractC137673cl3);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("member_biz_order_no", str);
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("name", CJPayEncryptUtil.getEncryptDataSM(str2));
            jSONObject2.put("identity_type", str3);
            jSONObject2.put("identity_code", CJPayEncryptUtil.getEncryptDataSM(StringsKt__StringsJVMKt.replace$default(str4, " ", "", false, 4, (Object) null)));
            jSONObject.put("enc_params", jSONObject2);
            CJPaySecureRequestParams cJPaySecureRequestParams = new CJPaySecureRequestParams();
            cJPaySecureRequestParams.version = 3;
            cJPaySecureRequestParams.type1 = 2;
            cJPaySecureRequestParams.type2 = 1;
            cJPaySecureRequestParams.check = 0;
            cJPaySecureRequestParams.fields.add("enc_params.name");
            cJPaySecureRequestParams.fields.add("enc_params.identity_code");
            jSONObject.put("secure_request_params", cJPaySecureRequestParams.toJson());
        } catch (Exception unused) {
        }
        LIZ(jSONObject, "bytepay.member_product.verify_identity_info", (String) null, (String) null, (String) null, abstractC137673cl3);
    }

    private final <T> void LIZ(JSONObject jSONObject, String str, String str2, String str3, String str4, AbstractC137673cl3<T> abstractC137673cl3) {
        String str5;
        String str6;
        HashMap<String, String> hashMap = null;
        if (PatchProxy.proxy(new Object[]{jSONObject, str, null, null, str4, abstractC137673cl3}, this, LIZJ, false, 9).isSupported) {
            return;
        }
        C587069Fs c587069Fs = new C587069Fs();
        Map<String, String> LIZIZ = C135876cI3.f17973LJ.LJIIIIZZ().LIZIZ();
        if (LIZIZ == null) {
            LIZIZ = null;
        }
        c587069Fs.LIZIZ = LIZIZ;
        try {
            jSONObject.put("risk_info", c587069Fs.LIZIZ());
        } catch (Exception unused) {
        }
        if (TextUtils.isEmpty(null)) {
            str5 = C135876cI3.LJI();
        } else {
            str5 = null;
        }
        if (TextUtils.isEmpty(null)) {
            str6 = C135876cI3.LJII();
        } else {
            str6 = null;
        }
        HashMap<String, String> hashMap2 = C135876cI3.f17973LJ.LJIIIIZZ().extraHeaderMap;
        if (hashMap2 != null) {
            hashMap = hashMap2;
        }
        String LIZ = CJPayParamsUtils.LIZ(str, CJPayParamsUtils.HostAPI.BDPAY);
        Map<String, String> LIZ2 = CJPayParamsUtils.LIZ(str, jSONObject.toString(), str6, str5);
        if (!TextUtils.isEmpty(str4)) {
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            LIZ2.put("timestamp", str4);
        }
        LIZ(CJPayNetworkManager.postForm(LIZ, LIZ2, CJPayParamsUtils.LIZ(LIZ, str, hashMap), abstractC137673cl3));
    }

    public final <T> void LIZ(JSONObject jSONObject, String str, String str2, String str3, boolean z, AbstractC137673cl3<T> abstractC137673cl3) {
        if (PatchProxy.proxy(new Object[]{jSONObject, str, str2, str3, Byte.valueOf(z ? (byte) 1 : (byte) 0), abstractC137673cl3}, this, LIZJ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(jSONObject, str, abstractC137673cl3);
        LIZ(jSONObject, str, str2, str3, z, (String) null, abstractC137673cl3);
    }
}
