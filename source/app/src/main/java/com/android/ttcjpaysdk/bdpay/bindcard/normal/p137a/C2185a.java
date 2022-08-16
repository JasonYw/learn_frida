package com.android.ttcjpaysdk.bdpay.bindcard.normal.p137a;

import android.content.Context;
import android.text.TextUtils;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.bean.CJPayCardInfoBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayBankInfoBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayCardAddBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPaySupportBankBean;
import com.android.ttcjpaysdk.thirdparty.data.CJPayIdType;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC135545cCi;
import p003X.C106862S5w;
import p003X.C135734cFl;
import p003X.C135876cI3;
import p003X.C136000cK3;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.a.a */
/* loaded from: classes17.dex */
public final class C2185a implements AbstractC135545cCi {
    public static ChangeQuickRedirect LIZ;
    public CJPaySupportBankBean LIZIZ;
    public CJPayCardInfoBean LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public Context f25461LJ;

    static {
        Covode.recordClassIndex(6753);
    }

    public C2185a() {
        this(null, 1);
    }

    public final void LIZ(String str, String str2, int i) {
        if (PatchProxy.proxy(new Object[]{str, str2, Integer.valueOf(i)}, this, LIZ, false, 8).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        JSONObject LIZLLL = LIZLLL();
        try {
            LIZLLL.put("bank_name", str);
            LIZLLL.put("bank_type", str2);
            LIZLLL.put("card_input_type", i);
            C135734cFl.LIZ("wallet_addbcard_first_page_cardbin_verif_info", LIZLLL);
        } catch (JSONException unused) {
        }
    }

    public final void LIZ(String str, String str2, String str3, int i) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, Integer.valueOf(i)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3);
        JSONObject LIZLLL = LIZLLL();
        try {
            LIZLLL.put("card_input_type", i);
            LIZLLL.put("error_code", str);
            LIZLLL.put(PushMessageHelper.ERROR_MESSAGE, str2);
            LIZLLL.put(PushMessageHelper.ERROR_TYPE, str3);
            C135734cFl.LIZ("wallet_addbcard_first_page_error_info", LIZLLL);
        } catch (JSONException unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x009a A[Catch: Exception -> 0x00a8, TryCatch #0 {Exception -> 0x00a8, blocks: (B:7:0x0018, B:9:0x001e, B:12:0x002e, B:15:0x003a, B:17:0x0048, B:19:0x004c, B:21:0x0055, B:24:0x0065, B:27:0x0073, B:29:0x0082, B:32:0x008d, B:34:0x009a, B:35:0x00a3), top: B:6:0x0018 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(org.json.JSONObject r7) {
        /*
            r6 = this;
            java.lang.String r2 = ""
            r3 = 1
            java.lang.Object[] r4 = new java.lang.Object[r3]
            r5 = 0
            r4[r5] = r7
            com.bytedance.hotfix.base.ChangeQuickRedirect r1 = com.android.ttcjpaysdk.bdpay.bindcard.normal.p137a.C2185a.LIZ
            r0 = 25
            com.bytedance.hotfix.PatchProxyResult r0 = com.bytedance.hotfix.PatchProxy.proxy(r4, r6, r1, r5, r0)
            boolean r0 = r0.isSupported
            if (r0 == 0) goto L15
            return
        L15:
            p003X.C106862S5w.LIZ(r7)
            com.android.ttcjpaysdk.bindcard.base.bean.CJPayCardAddBean r4 = p003X.C135876cI3.LIZ()     // Catch: java.lang.Exception -> La8
            if (r4 == 0) goto La8
            java.lang.String r1 = "needidentify"
            com.android.ttcjpaysdk.bindcard.base.bean.CJPayBindCardParamsBean r0 = r4.url_params     // Catch: java.lang.Exception -> La8
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)     // Catch: java.lang.Exception -> La8
            boolean r0 = r0.isAuth()     // Catch: java.lang.Exception -> La8
            if (r0 == 0) goto L2d
            r0 = 0
            goto L2e
        L2d:
            r0 = 1
        L2e:
            r7.put(r1, r0)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "haspass"
            boolean r0 = r4.goSetPwd     // Catch: java.lang.Exception -> La8
            if (r0 == 0) goto L39
            r0 = 0
            goto L3a
        L39:
            r0 = 1
        L3a:
            r7.put(r1, r0)     // Catch: java.lang.Exception -> La8
            java.lang.String r0 = "is_onestep"
            r7.put(r0, r5)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "show_onestep"
            boolean r0 = r6.LIZLLL     // Catch: java.lang.Exception -> La8
            if (r0 != 0) goto L64
            com.android.ttcjpaysdk.bindcard.base.bean.CJPaySupportBankBean r0 = r6.LIZIZ     // Catch: java.lang.Exception -> La8
            if (r0 == 0) goto L64
            com.android.ttcjpaysdk.bindcard.base.bean.CJPaySupportBankBean r0 = r6.LIZIZ     // Catch: java.lang.Exception -> La8
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Exception -> La8
            java.util.ArrayList<com.android.ttcjpaysdk.bindcard.base.bean.CJPayBankInfoBean> r0 = r0.one_key_banks     // Catch: java.lang.Exception -> La8
            if (r0 == 0) goto L64
            com.android.ttcjpaysdk.bindcard.base.bean.CJPaySupportBankBean r0 = r6.LIZIZ     // Catch: java.lang.Exception -> La8
            kotlin.jvm.internal.Intrinsics.checkNotNull(r0)     // Catch: java.lang.Exception -> La8
            java.util.ArrayList<com.android.ttcjpaysdk.bindcard.base.bean.CJPayBankInfoBean> r0 = r0.one_key_banks     // Catch: java.lang.Exception -> La8
            int r0 = r0.size()     // Catch: java.lang.Exception -> La8
            if (r0 <= 0) goto L64
            r0 = 1
            goto L65
        L64:
            r0 = 0
        L65:
            r7.put(r1, r0)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "is_auth"
            com.android.ttcjpaysdk.bindcard.base.bean.CJPayBusiAuthorizeInfo r0 = r4.busi_authorize_info     // Catch: java.lang.Exception -> La8
            boolean r0 = r0.is_need_authorize     // Catch: java.lang.Exception -> La8
            if (r0 == 0) goto L72
            r0 = 1
            goto L73
        L72:
            r0 = 0
        L73:
            r7.put(r1, r0)     // Catch: java.lang.Exception -> La8
            java.lang.String r1 = "is_showphone"
            com.android.ttcjpaysdk.bindcard.base.bean.CJPayBindCardParamsBean r0 = r4.url_params     // Catch: java.lang.Exception -> La8
            java.lang.String r0 = r0.mobile_mask     // Catch: java.lang.Exception -> La8
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> La8
            if (r0 == 0) goto L8d
            com.android.ttcjpaysdk.bindcard.base.bean.CJPayBindCardParamsBean r0 = r4.url_params     // Catch: java.lang.Exception -> La8
            java.lang.String r0 = r0.uid_mobile_mask     // Catch: java.lang.Exception -> La8
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> La8
            if (r0 == 0) goto L8d
            r3 = 0
        L8d:
            r7.put(r1, r3)     // Catch: java.lang.Exception -> La8
            java.lang.String r0 = p003X.C135734cFl.LIZ()     // Catch: java.lang.Exception -> La8
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Exception -> La8
            if (r0 != 0) goto La3
            java.lang.String r1 = "source"
            java.lang.String r0 = p003X.C135734cFl.LIZ()     // Catch: java.lang.Exception -> La8
            r7.put(r1, r0)     // Catch: java.lang.Exception -> La8
        La3:
            java.lang.String r0 = "addbcard_type"
            r7.put(r0, r2)     // Catch: java.lang.Exception -> La8
        La8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.bdpay.bindcard.normal.p137a.C2185a.LIZ(org.json.JSONObject):void");
    }

    public final void LIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        try {
            C135734cFl.LIZ("wallet_businesstopay_auth_fail_imp", LIZLLL());
        } catch (Exception unused) {
        }
    }

    public final String LIZJ() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 26);
        if (proxy.isSupported) {
            return (String) proxy.result;
        }
        CJPayCardAddBean LIZ2 = C135876cI3.LIZ();
        if (LIZ2 != null && (!TextUtils.isEmpty(LIZ2.url_params.id_type))) {
            return CJPayIdType.getIdNameFromType(this.f25461LJ, CJPayIdType.getTypeFromIdCode(LIZ2.url_params.id_type));
        }
        return "";
    }

    public final JSONObject LIZLLL() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], this, LIZ, false, 27);
        if (proxy.isSupported) {
            return (JSONObject) proxy.result;
        }
        JSONObject LIZ2 = CJPayParamsUtils.LIZ(C135876cI3.LJI(), C135876cI3.LJII());
        Intrinsics.checkNotNullExpressionValue(LIZ2, "");
        LIZ(LIZ2);
        return LIZ2;
    }

    public final void LIZIZ() {
        String str;
        CJPayBankInfoBean cJPayBankInfoBean;
        CJPayBankInfoBean cJPayBankInfoBean2;
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 13).isSupported) {
            return;
        }
        try {
            JSONObject LIZLLL = LIZLLL();
            CJPayCardInfoBean cJPayCardInfoBean = this.LIZJ;
            String str2 = null;
            if (cJPayCardInfoBean != null && (cJPayBankInfoBean2 = cJPayCardInfoBean.bank_info) != null) {
                str = cJPayBankInfoBean2.getCardTypeStr(this.f25461LJ);
            } else {
                str = null;
            }
            LIZLLL.put("bank_type", str);
            CJPayCardInfoBean cJPayCardInfoBean2 = this.LIZJ;
            if (cJPayCardInfoBean2 != null && (cJPayBankInfoBean = cJPayCardInfoBean2.bank_info) != null) {
                str2 = cJPayBankInfoBean.bank_name;
            }
            LIZLLL.put("bank_name", str2);
            C136000cK3 c136000cK3 = C136000cK3.LIZIZ;
            CJPayCardInfoBean cJPayCardInfoBean3 = this.LIZJ;
            Intrinsics.checkNotNull(cJPayCardInfoBean3);
            HashMap<String, CJPayVoucherInfo> voucherInfoMap = cJPayCardInfoBean3.bank_info.getVoucherInfoMap();
            Intrinsics.checkNotNullExpressionValue(voucherInfoMap, "");
            CJPayCardInfoBean cJPayCardInfoBean4 = this.LIZJ;
            Intrinsics.checkNotNull(cJPayCardInfoBean4);
            String str3 = cJPayCardInfoBean4.bank_info.card_type;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            LIZLLL.put("activity_info", c136000cK3.LIZ(voucherInfoMap, str3));
            C135734cFl.LIZ("wallet_addbcard_page_next_click", LIZLLL);
        } catch (Exception unused) {
        }
    }

    public C2185a(Context context) {
        this.f25461LJ = context;
    }

    public final void LIZ(long j) {
        if (PatchProxy.proxy(new Object[]{new Long(j)}, this, LIZ, false, 23).isSupported) {
            return;
        }
        JSONObject LIZLLL = LIZLLL();
        try {
            LIZLLL.put("time", j);
            C135734cFl.LIZ("wallet_rd_get_bank_list_time", LIZLLL);
        } catch (JSONException unused) {
        }
    }

    public final void LIZ(int i) {
        String str;
        CJPayBankInfoBean cJPayBankInfoBean;
        CJPayBankInfoBean cJPayBankInfoBean2;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i)}, this, LIZ, false, 16).isSupported) {
            return;
        }
        try {
            JSONObject LIZLLL = LIZLLL();
            CJPayCardInfoBean cJPayCardInfoBean = this.LIZJ;
            String str2 = null;
            if (cJPayCardInfoBean != null && (cJPayBankInfoBean2 = cJPayCardInfoBean.bank_info) != null) {
                str = cJPayBankInfoBean2.getCardTypeStr(this.f25461LJ);
            } else {
                str = null;
            }
            LIZLLL.put("bank_type", str);
            CJPayCardInfoBean cJPayCardInfoBean2 = this.LIZJ;
            if (cJPayCardInfoBean2 != null && (cJPayBankInfoBean = cJPayCardInfoBean2.bank_info) != null) {
                str2 = cJPayBankInfoBean.bank_name;
            }
            LIZLLL.put("bank_name", str2);
            LIZLLL.put("input_type", "mobile");
            LIZLLL.put("type", LIZJ());
            LIZLLL.put("is_legal", i);
            C135734cFl.LIZ("wallet_addbcard_page_input_inform_verif_info", LIZLLL);
        } catch (Exception unused) {
        }
    }

    public final void LIZIZ(String str) {
        String str2;
        CJPayBankInfoBean cJPayBankInfoBean;
        CJPayBankInfoBean cJPayBankInfoBean2;
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        try {
            JSONObject LIZLLL = LIZLLL();
            CJPayCardInfoBean cJPayCardInfoBean = this.LIZJ;
            String str3 = null;
            if (cJPayCardInfoBean != null && (cJPayBankInfoBean2 = cJPayCardInfoBean.bank_info) != null) {
                str2 = cJPayBankInfoBean2.getCardTypeStr(this.f25461LJ);
            } else {
                str2 = null;
            }
            LIZLLL.put("bank_type", str2);
            CJPayCardInfoBean cJPayCardInfoBean2 = this.LIZJ;
            if (cJPayCardInfoBean2 != null && (cJPayBankInfoBean = cJPayCardInfoBean2.bank_info) != null) {
                str3 = cJPayBankInfoBean.bank_name;
            }
            LIZLLL.put("bank_name", str3);
            LIZLLL.put("type", LIZJ());
            C135734cFl.LIZ(str, LIZLLL);
        } catch (Exception unused) {
        }
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        CJPayCardInfoBean cJPayCardInfoBean = this.LIZJ;
        if (cJPayCardInfoBean == null) {
            return;
        }
        Intrinsics.checkNotNull(cJPayCardInfoBean);
        if (cJPayCardInfoBean.isOCRCardNo) {
            try {
                JSONObject LIZLLL = LIZLLL();
                LIZLLL.put("result", str);
                C135734cFl.LIZ("wallet_addbcard_orc_accuracy_result_2", LIZLLL);
            } catch (Exception unused) {
            }
        }
    }

    public /* synthetic */ C2185a(Context context, int i) {
        this(null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:45:0x0148, code lost:
        if (r2.put("more_type", r7) != null) goto L46;
     */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0131 A[Catch: Exception -> 0x015d, TryCatch #0 {Exception -> 0x015d, blocks: (B:7:0x001d, B:10:0x0025, B:12:0x0032, B:14:0x0043, B:16:0x0058, B:18:0x0065, B:19:0x0074, B:22:0x007f, B:23:0x0084, B:25:0x008a, B:26:0x008f, B:29:0x0099, B:31:0x00a1, B:34:0x00f1, B:36:0x00f7, B:37:0x0119, B:39:0x0131, B:42:0x013e, B:44:0x0142, B:46:0x014d, B:50:0x0101, B:52:0x0105, B:54:0x0110, B:55:0x00b4, B:57:0x00b8, B:58:0x00bf, B:59:0x00c9, B:61:0x00cd, B:63:0x00d7, B:64:0x00df, B:66:0x00e3, B:67:0x00ea, B:68:0x0077, B:69:0x014a), top: B:6:0x001d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void LIZ(p003X.C135986cJp r12, android.widget.LinearLayout r13) {
        /*
            Method dump skipped, instructions count: 350
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.bdpay.bindcard.normal.p137a.C2185a.LIZ(X.cJp, android.widget.LinearLayout):void");
    }

    public final void LIZIZ(String str, String str2) {
        String str3;
        CJPayBankInfoBean cJPayBankInfoBean;
        CJPayBankInfoBean cJPayBankInfoBean2;
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        try {
            JSONObject LIZLLL = LIZLLL();
            CJPayCardInfoBean cJPayCardInfoBean = this.LIZJ;
            String str4 = null;
            if (cJPayCardInfoBean != null && (cJPayBankInfoBean2 = cJPayCardInfoBean.bank_info) != null) {
                str3 = cJPayBankInfoBean2.getCardTypeStr(this.f25461LJ);
            } else {
                str3 = null;
            }
            LIZLLL.put("bank_type", str3);
            CJPayCardInfoBean cJPayCardInfoBean2 = this.LIZJ;
            if (cJPayCardInfoBean2 != null && (cJPayBankInfoBean = cJPayCardInfoBean2.bank_info) != null) {
                str4 = cJPayBankInfoBean.bank_name;
            }
            LIZLLL.put("bank_name", str4);
            LIZLLL.put("errorcode", str);
            LIZLLL.put("errordesc", str2);
            C135734cFl.LIZ("wallet_addbcard_page_error_imp", LIZLLL);
        } catch (Exception unused) {
        }
    }

    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        try {
            JSONObject LIZLLL = LIZLLL();
            LIZLLL.put("bank_type", str);
            LIZLLL.put("bank_name", str2);
            C135734cFl.LIZ("wallet_addbcard_page_error_click", LIZLLL);
        } catch (Exception unused) {
        }
    }

    public final void LIZ(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, LIZ, false, 6).isSupported) {
            return;
        }
        try {
            JSONObject LIZLLL = LIZLLL();
            LIZLLL.put("result", i);
            LIZLLL.put(PushConstants.WEB_URL, "bytepay.member_product.send_sign_sms");
            LIZLLL.put("error_code", str);
            LIZLLL.put(PushMessageHelper.ERROR_MESSAGE, str2);
            C136000cK3 c136000cK3 = C136000cK3.LIZIZ;
            CJPayCardInfoBean cJPayCardInfoBean = this.LIZJ;
            Intrinsics.checkNotNull(cJPayCardInfoBean);
            HashMap<String, CJPayVoucherInfo> voucherInfoMap = cJPayCardInfoBean.bank_info.getVoucherInfoMap();
            Intrinsics.checkNotNullExpressionValue(voucherInfoMap, "");
            CJPayCardInfoBean cJPayCardInfoBean2 = this.LIZJ;
            Intrinsics.checkNotNull(cJPayCardInfoBean2);
            String str3 = cJPayCardInfoBean2.bank_info.card_type;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            LIZLLL.put("activity_info", c136000cK3.LIZ(voucherInfoMap, str3));
            C135734cFl.LIZ("wallet_businesstopay_auth_result", LIZLLL);
        } catch (Exception unused) {
        }
    }

    public final void LIZJ(String str, String str2, String str3, int i) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, Integer.valueOf(i)}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3);
        JSONObject LIZLLL = LIZLLL();
        try {
            LIZLLL.put("card_input_type", i);
            LIZLLL.put("error_code", str);
            LIZLLL.put(PushMessageHelper.ERROR_MESSAGE, str2);
            LIZLLL.put("button_name", str3);
            C135734cFl.LIZ("wallet_addbcard_first_page_error_pop_click", LIZLLL);
        } catch (JSONException unused) {
        }
    }

    public final void LIZIZ(String str, String str2, String str3, int i) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, Integer.valueOf(i)}, this, LIZ, false, 10).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3);
        JSONObject LIZLLL = LIZLLL();
        try {
            LIZLLL.put("card_input_type", i);
            LIZLLL.put("error_code", str);
            LIZLLL.put(PushMessageHelper.ERROR_MESSAGE, str2);
            LIZLLL.put("button_name", str3);
            C135734cFl.LIZ("wallet_addbcard_first_page_error_bubble_click", LIZLLL);
        } catch (JSONException unused) {
        }
    }
}
