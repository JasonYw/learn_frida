package com.android.ttcjpaysdk.bdpay.bindcard.normal.p137a;

import android.app.Activity;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.bean.CJPayCardInfoBean;
import com.android.ttcjpaysdk.thirdparty.data.CJPayVoucherInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.meizu.cloud.pushsdk.constants.PushConstants;
import com.xiaomi.mipush.sdk.PushMessageHelper;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import p003X.AbstractC135545cCi;
import p003X.C106862S5w;
import p003X.C135734cFl;
import p003X.C135876cI3;
import p003X.C136000cK3;

/* renamed from: com.android.ttcjpaysdk.bdpay.bindcard.normal.a.b */
/* loaded from: classes17.dex */
public final class C2186b implements AbstractC135545cCi {
    public static ChangeQuickRedirect LIZ;
    public String LIZIZ;
    public CJPayCardInfoBean LIZJ;
    public Activity LIZLLL;

    static {
        Covode.recordClassIndex(6754);
    }

    public C2186b() {
        this(null, 1);
    }

    public C2186b(Activity activity) {
        this.LIZLLL = activity;
    }

    public final void LIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        this.LIZIZ = str;
    }

    public final void LIZLLL(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 20).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        CJPayCardInfoBean cJPayCardInfoBean = this.LIZJ;
        if (cJPayCardInfoBean == null) {
            Intrinsics.throwUninitializedPropertyAccessException("");
        }
        if (cJPayCardInfoBean.isOCRCardNo) {
            try {
                JSONObject LIZLLL = C135734cFl.LIZLLL();
                Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
                LIZLLL.put("result", str);
                LIZ("wallet_addbcard_orc_accuracy_result_2", LIZLLL);
            } catch (Exception unused) {
            }
        }
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 7).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        try {
            JSONObject LIZLLL = C135734cFl.LIZLLL();
            CJPayCardInfoBean cJPayCardInfoBean = this.LIZJ;
            if (cJPayCardInfoBean == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZLLL.put("bank_type", cJPayCardInfoBean.bank_info.getCardTypeStr(this.LIZLLL));
            CJPayCardInfoBean cJPayCardInfoBean2 = this.LIZJ;
            if (cJPayCardInfoBean2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZLLL.put("bank_name", cJPayCardInfoBean2.bank_info.bank_name);
            LIZLLL.put("type", str);
            LIZ("wallet_addbcard_page_info_check", LIZLLL);
        } catch (Exception unused) {
        }
    }

    public final void LIZJ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, LIZ, false, 11).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        try {
            JSONObject LIZLLL = C135734cFl.LIZLLL();
            Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
            CJPayCardInfoBean cJPayCardInfoBean = this.LIZJ;
            if (cJPayCardInfoBean == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZLLL.put("bank_type", cJPayCardInfoBean.bank_info.getCardTypeStr(this.LIZLLL));
            CJPayCardInfoBean cJPayCardInfoBean2 = this.LIZJ;
            if (cJPayCardInfoBean2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZLLL.put("bank_name", cJPayCardInfoBean2.bank_info.bank_name);
            LIZLLL.put("input_type", str);
            String str2 = this.LIZIZ;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZLLL.put("type", str2);
            LIZ("wallet_addbcard_page_input", LIZLLL);
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ C2186b(Activity activity, int i) {
        this(null);
    }

    public final void LIZ(String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{str, jSONObject}, this, LIZ, false, 22).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, jSONObject);
        C135734cFl.LIZ(str, jSONObject, CJPayParamsUtils.LIZ(C135876cI3.LJI(), C135876cI3.LJII()));
    }

    public final void LIZ(String str, int i) {
        if (PatchProxy.proxy(new Object[]{str, Integer.valueOf(i)}, this, LIZ, false, 13).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        try {
            JSONObject LIZLLL = C135734cFl.LIZLLL();
            Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
            CJPayCardInfoBean cJPayCardInfoBean = this.LIZJ;
            if (cJPayCardInfoBean == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZLLL.put("bank_type", cJPayCardInfoBean.bank_info.getCardTypeStr(this.LIZLLL));
            CJPayCardInfoBean cJPayCardInfoBean2 = this.LIZJ;
            if (cJPayCardInfoBean2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZLLL.put("bank_name", cJPayCardInfoBean2.bank_info.bank_name);
            LIZLLL.put("input_type", str);
            String str2 = this.LIZIZ;
            if (str2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZLLL.put("type", str2);
            LIZLLL.put("is_legal", i);
            LIZ("wallet_addbcard_page_input_inform_verif_info", LIZLLL);
        } catch (Exception unused) {
        }
    }

    public final void LIZ(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        try {
            JSONObject LIZLLL = C135734cFl.LIZLLL();
            CJPayCardInfoBean cJPayCardInfoBean = this.LIZJ;
            if (cJPayCardInfoBean == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZLLL.put("bank_type", cJPayCardInfoBean.bank_info.getCardTypeStr(this.LIZLLL));
            CJPayCardInfoBean cJPayCardInfoBean2 = this.LIZJ;
            if (cJPayCardInfoBean2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZLLL.put("bank_name", cJPayCardInfoBean2.bank_info.bank_name);
            LIZLLL.put("button_number", i);
            LIZLLL.put("errordesc", str2);
            LIZLLL.put("errorcode", str);
            LIZ("wallet_addbcard_page_error_imp", LIZLLL);
        } catch (Exception unused) {
        }
    }

    public final void LIZIZ(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, LIZ, false, 18).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        try {
            JSONObject LIZLLL = C135734cFl.LIZLLL();
            Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
            CJPayCardInfoBean cJPayCardInfoBean = this.LIZJ;
            if (cJPayCardInfoBean == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZLLL.put("bank_type", cJPayCardInfoBean.bank_info.getCardTypeStr(this.LIZLLL));
            CJPayCardInfoBean cJPayCardInfoBean2 = this.LIZJ;
            if (cJPayCardInfoBean2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZLLL.put("bank_name", cJPayCardInfoBean2.bank_info.bank_name);
            String str3 = this.LIZIZ;
            if (str3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            LIZLLL.put("type", str3);
            LIZLLL.put("result", i);
            LIZLLL.put("error_code", str);
            LIZLLL.put(PushMessageHelper.ERROR_MESSAGE, str2);
            LIZ("wallet_addbcard_page_phoneauth_result", LIZLLL);
        } catch (Exception unused) {
        }
    }

    public final void LIZJ(int i, String str, String str2) {
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str, str2}, this, LIZ, false, 21).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        try {
            JSONObject LIZLLL = C135734cFl.LIZLLL();
            Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
            LIZLLL.put("result", i);
            LIZLLL.put(PushConstants.WEB_URL, "bytepay.member_product.send_sign_sms");
            LIZLLL.put("error_code", str);
            LIZLLL.put(PushMessageHelper.ERROR_MESSAGE, str2);
            C136000cK3 c136000cK3 = C136000cK3.LIZIZ;
            CJPayCardInfoBean cJPayCardInfoBean = this.LIZJ;
            if (cJPayCardInfoBean == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            HashMap<String, CJPayVoucherInfo> voucherInfoMap = cJPayCardInfoBean.bank_info.getVoucherInfoMap();
            Intrinsics.checkNotNullExpressionValue(voucherInfoMap, "");
            CJPayCardInfoBean cJPayCardInfoBean2 = this.LIZJ;
            if (cJPayCardInfoBean2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("");
            }
            String str3 = cJPayCardInfoBean2.bank_info.card_type;
            Intrinsics.checkNotNullExpressionValue(str3, "");
            LIZLLL.put("activity_info", c136000cK3.LIZ(voucherInfoMap, str3));
            LIZLLL.put("auth_type", "four_elements");
            LIZ("wallet_businesstopay_auth_result", LIZLLL);
        } catch (Exception unused) {
        }
    }
}
