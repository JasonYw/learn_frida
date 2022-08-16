package com.android.ttcjpaysdk.bindcard.quickbind.applog;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayCardProtocolBean;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupBean;
import com.android.ttcjpaysdk.base.p135ui.data.CJPayProtocolGroupContentsBean;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.collections.CollectionsKt___CollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C135734cFl;
import p003X.C135876cI3;
import p003X.C135903cIU;
import p003X.C136000cK3;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.applog.e */
/* loaded from: classes17.dex */
public class C2237e extends C135903cIU {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f25483LJ;
    public CJPayHostInfo LJI;
    public JSONArray LJII;
    public final String LJIIIIZZ = "wallet_two_elements_identified_page_imp";
    public final String LJIIIZ = "wallet_two_elements_identified_page_name_input";
    public final String LJIIJ = "wallet_two_elements_identified_page_idnumber_input";
    public final String LJIIJJI = "wallet_two_elements_identified_page_agreement_click";
    public final String LJIIL = "wallet_two_elements_identified_page_next_click";
    public final String LJFF = "wallet_businesstopay_auth_input_click";
    public final String LJIILIIL = "wallet_businesstopay_auth_result";
    public String LJIILJJIL = "";

    static {
        Covode.recordClassIndex(7233);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, f25483LJ, false, 3).isSupported) {
            return;
        }
        String str = this.LJIIIIZZ;
        Pair[] pairArr = new Pair[6];
        pairArr[0] = TuplesKt.m137to("twoelements_verify_status", 0);
        pairArr[1] = TuplesKt.m137to("is_onestep", 1);
        pairArr[2] = TuplesKt.m137to("needidentify", 1);
        pairArr[3] = TuplesKt.m137to("haspass", 0);
        pairArr[4] = TuplesKt.m137to("show_onestep", 0);
        JSONArray jSONArray = this.LJII;
        if (jSONArray == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pairArr[5] = TuplesKt.m137to("activity_info", jSONArray);
        LIZ(str, MapsKt__MapsKt.hashMapOf(pairArr));
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, f25483LJ, false, 4).isSupported) {
            return;
        }
        String str = this.LJIIIZ;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.m137to("is_onestep", 1);
        pairArr[1] = TuplesKt.m137to("needidentify", 1);
        pairArr[2] = TuplesKt.m137to("haspass", 0);
        pairArr[3] = TuplesKt.m137to("show_onestep", 0);
        JSONArray jSONArray = this.LJII;
        if (jSONArray == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pairArr[4] = TuplesKt.m137to("activity_info", jSONArray);
        LIZ(str, MapsKt__MapsKt.hashMapOf(pairArr));
    }

    public final void LIZLLL() {
        if (PatchProxy.proxy(new Object[0], this, f25483LJ, false, 5).isSupported) {
            return;
        }
        String str = this.LJIIJ;
        Pair[] pairArr = new Pair[5];
        pairArr[0] = TuplesKt.m137to("is_onestep", 1);
        pairArr[1] = TuplesKt.m137to("needidentify", 1);
        pairArr[2] = TuplesKt.m137to("haspass", 0);
        pairArr[3] = TuplesKt.m137to("show_onestep", 0);
        JSONArray jSONArray = this.LJII;
        if (jSONArray == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pairArr[4] = TuplesKt.m137to("activity_info", jSONArray);
        LIZ(str, MapsKt__MapsKt.hashMapOf(pairArr));
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0032, code lost:
        if (r1 == null) goto L8;
     */
    /* renamed from: LJ */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m16057LJ() {
        /*
            r6 = this;
            r5 = 0
            java.lang.Object[] r2 = new java.lang.Object[r5]
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.android.ttcjpaysdk.bindcard.quickbind.applog.C2237e.f25483LJ
            r0 = 12
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r2, r6, r1, r5, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L10
            return
        L10:
            com.android.ttcjpaysdk.base.CJPayHostInfo r0 = r6.LJI
            java.lang.String r2 = ""
            if (r0 != 0) goto L30
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L19:
            r1 = r2
        L1a:
            com.android.ttcjpaysdk.base.CJPayHostInfo r0 = r6.LJI
            if (r0 != 0) goto L2a
            kotlin.jvm.internal.Intrinsics.throwUninitializedPropertyAccessException(r2)
        L21:
            org.json.JSONObject r4 = com.android.ttcjpaysdk.base.utils.CJPayParamsUtils.LIZ(r1, r2)
            org.json.JSONObject r3 = p003X.C135734cFl.LIZLLL()
            goto L35
        L2a:
            java.lang.String r0 = r0.appId
            if (r0 == 0) goto L21
            r2 = r0
            goto L21
        L30:
            java.lang.String r1 = r0.merchantId
            if (r1 != 0) goto L1a
            goto L19
        L35:
            java.lang.String r1 = "auth_type"
            java.lang.String r0 = "two_elements"
            r3.put(r1, r0)     // Catch: org.json.JSONException -> L49
            java.lang.String r2 = "wallet_businesstopay_auth_fail_click"
            r0 = 2
            org.json.JSONObject[] r1 = new org.json.JSONObject[r0]     // Catch: org.json.JSONException -> L49
            r1[r5] = r4     // Catch: org.json.JSONException -> L49
            r0 = 1
            r1[r0] = r3     // Catch: org.json.JSONException -> L49
            p003X.C135734cFl.LIZ(r2, r1)     // Catch: org.json.JSONException -> L49
        L49:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.bindcard.quickbind.applog.C2237e.m16057LJ():void");
    }

    public final void LIZ(int i) {
        if (PatchProxy.proxy(new Object[]{1}, this, f25483LJ, false, 7).isSupported) {
            return;
        }
        String str = this.LJIIL;
        Pair[] pairArr = new Pair[7];
        pairArr[0] = TuplesKt.m137to("result", 1);
        pairArr[1] = TuplesKt.m137to("button_name", 0);
        pairArr[2] = TuplesKt.m137to("is_onestep", 1);
        pairArr[3] = TuplesKt.m137to("needidentify", 1);
        pairArr[4] = TuplesKt.m137to("haspass", 0);
        pairArr[5] = TuplesKt.m137to("show_onestep", 0);
        JSONArray jSONArray = this.LJII;
        if (jSONArray == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pairArr[6] = TuplesKt.m137to("activity_info", jSONArray);
        LIZ(str, MapsKt__MapsKt.hashMapOf(pairArr));
    }

    public final void LIZ(CJPayProtocolGroupContentsBean cJPayProtocolGroupContentsBean, CJPayProtocolGroupBean cJPayProtocolGroupBean) {
        if (PatchProxy.proxy(new Object[]{cJPayProtocolGroupContentsBean, cJPayProtocolGroupBean}, this, f25483LJ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(cJPayProtocolGroupContentsBean, cJPayProtocolGroupBean);
        String str = this.LJIIJJI;
        Pair[] pairArr = new Pair[6];
        ArrayList<CJPayCardProtocolBean> protocolListByGroup = cJPayProtocolGroupContentsBean.getProtocolListByGroup(cJPayProtocolGroupBean.groupName);
        Intrinsics.checkNotNullExpressionValue(protocolListByGroup, "");
        pairArr[0] = TuplesKt.m137to("type", CollectionsKt___CollectionsKt.joinToString$default(protocolListByGroup, null, null, null, 0, null, TwoElementAuthLogger$agreementClick$1.INSTANCE, 31, null));
        pairArr[1] = TuplesKt.m137to("is_onestep", 1);
        pairArr[2] = TuplesKt.m137to("needidentify", 1);
        pairArr[3] = TuplesKt.m137to("haspass", 0);
        pairArr[4] = TuplesKt.m137to("show_onestep", 0);
        JSONArray jSONArray = this.LJII;
        if (jSONArray == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pairArr[5] = TuplesKt.m137to("activity_info", jSONArray);
        LIZ(str, MapsKt__MapsKt.hashMapOf(pairArr));
    }

    public final void LIZ(String str, HashMap<String, Object> hashMap) {
        String str2;
        if (PatchProxy.proxy(new Object[]{str, hashMap}, this, f25483LJ, false, 14).isSupported) {
            return;
        }
        try {
            CJPayHostInfo cJPayHostInfo = this.LJI;
            if (cJPayHostInfo == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            String str3 = null;
            if (cJPayHostInfo == null) {
                str2 = null;
            } else {
                str2 = cJPayHostInfo.merchantId;
            }
            CJPayHostInfo cJPayHostInfo2 = this.LJI;
            if (cJPayHostInfo2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            } else {
                str3 = cJPayHostInfo2.appId;
            }
            JSONObject LIZ = CJPayParamsUtils.LIZ(str2, str3);
            if (hashMap != null) {
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    LIZ.put(entry.getKey(), entry.getValue());
                }
            }
            if (!TextUtils.isEmpty(C135734cFl.LIZ())) {
                LIZ.put("source", C135876cI3.f17973LJ.LJIILIIL().getBindCardSource());
            }
            if (this.LJIILJJIL.length() > 0) {
                LIZ.put("page_type", this.LJIILJJIL);
            }
            C135734cFl.LIZ(str, LIZ);
        } catch (Exception unused) {
        }
    }

    public final void LIZ(HashMap<String, CJPayVoucherInfo> hashMap, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{hashMap, str, str2}, this, f25483LJ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(hashMap, str, str2);
        this.LJI = C135876cI3.f17973LJ.LJIIIIZZ();
        this.LJII = C136000cK3.LIZIZ.LIZ(hashMap, str);
        this.LJIILJJIL = str2;
    }

    public final void LIZ(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, f25483LJ, false, 8).isSupported) {
            return;
        }
        Pair[] pairArr = new Pair[7];
        pairArr[0] = TuplesKt.m137to("result", Integer.valueOf(i));
        pairArr[1] = TuplesKt.m137to("button_name", 1);
        pairArr[2] = TuplesKt.m137to("is_onestep", 1);
        pairArr[3] = TuplesKt.m137to("needidentify", 1);
        pairArr[4] = TuplesKt.m137to("haspass", 0);
        pairArr[5] = TuplesKt.m137to("show_onestep", 0);
        JSONArray jSONArray = this.LJII;
        if (jSONArray == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pairArr[6] = TuplesKt.m137to("activity_info", jSONArray);
        HashMap<String, Object> hashMapOf = MapsKt__MapsKt.hashMapOf(pairArr);
        if (str != null) {
            hashMapOf.put("error_code", str);
        }
        if (str2 != null) {
            hashMapOf.put("error_msg", str2);
        }
        LIZ(this.LJIIL, hashMapOf);
    }

    public final void LIZIZ(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, f25483LJ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        String str3 = this.LJIILIIL;
        Pair[] pairArr = new Pair[10];
        pairArr[0] = TuplesKt.m137to("result", Integer.valueOf(i));
        pairArr[1] = TuplesKt.m137to("error_code", str);
        pairArr[2] = TuplesKt.m137to("error_msg", str2);
        pairArr[3] = TuplesKt.m137to("is_onestep", 1);
        pairArr[4] = TuplesKt.m137to("needidentify", 1);
        pairArr[5] = TuplesKt.m137to("haspass", 0);
        pairArr[6] = TuplesKt.m137to("show_onestep", 0);
        pairArr[7] = TuplesKt.m137to(PushConstants.WEB_URL, "bytepay.member_product.verify_identity_info");
        pairArr[8] = TuplesKt.m137to("auth_type", "two_elements");
        JSONArray jSONArray = this.LJII;
        if (jSONArray == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        pairArr[9] = TuplesKt.m137to("activity_info", jSONArray);
        LIZ(str3, MapsKt__MapsKt.hashMapOf(pairArr));
    }
}
