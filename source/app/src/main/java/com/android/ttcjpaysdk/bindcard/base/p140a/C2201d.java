package com.android.ttcjpaysdk.bindcard.base.p140a;

import android.content.Context;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayRealNameBean;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPaySmsSignBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.AbstractC135545cCi;
import p003X.C106862S5w;
import p003X.C135734cFl;
import p003X.C135876cI3;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.a.d */
/* loaded from: classes17.dex */
public final class C2201d implements AbstractC135545cCi {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(6990);
    }

    public final void LIZIZ(Context context, CJPayRealNameBean cJPayRealNameBean) {
        if (PatchProxy.proxy(new Object[]{context, cJPayRealNameBean}, this, LIZ, false, 6).isSupported) {
            return;
        }
        C106862S5w.LIZ(cJPayRealNameBean);
        try {
            String LJI = C135876cI3.LJI();
            String str = "";
            if (LJI == null) {
                LJI = str;
            }
            String LJII = C135876cI3.LJII();
            if (LJII != null) {
                str = LJII;
            }
            JSONObject LIZ2 = CJPayParamsUtils.LIZ(LJI, str);
            JSONObject LIZLLL = C135734cFl.LIZLLL();
            if (context != null) {
                LIZLLL.put("bank_type", cJPayRealNameBean.LIZ(context));
            }
            LIZLLL.put("bank_name", cJPayRealNameBean.bank_name);
            LIZLLL.put("activity_info", new JSONArray(cJPayRealNameBean.activity_info));
            if (cJPayRealNameBean.isUnionPay) {
                C135734cFl.LIZ(LIZLLL);
            }
            C135734cFl.LIZ("wallet_addbcard_captcha_error_info", LIZ2, LIZLLL);
        } catch (Exception unused) {
        }
    }

    public final void LIZ(Context context, CJPayRealNameBean cJPayRealNameBean) {
        if (PatchProxy.proxy(new Object[]{context, cJPayRealNameBean}, this, LIZ, false, 5).isSupported) {
            return;
        }
        C106862S5w.LIZ(cJPayRealNameBean);
        try {
            String LJI = C135876cI3.LJI();
            String str = "";
            if (LJI == null) {
                LJI = str;
            }
            String LJII = C135876cI3.LJII();
            if (LJII != null) {
                str = LJII;
            }
            JSONObject LIZ2 = CJPayParamsUtils.LIZ(LJI, str);
            JSONObject LIZLLL = C135734cFl.LIZLLL();
            if (context != null) {
                LIZLLL.put("bank_type", cJPayRealNameBean.LIZ(context));
            }
            LIZLLL.put("bank_name", cJPayRealNameBean.bank_name);
            LIZLLL.put("activity_info", new JSONArray(cJPayRealNameBean.activity_info));
            if (cJPayRealNameBean.isUnionPay) {
                C135734cFl.LIZ(LIZLLL);
            }
            C135734cFl.LIZ("wallet_addbcard_page_toast_info", LIZ2, LIZLLL);
        } catch (Exception unused) {
        }
    }

    public final void LIZ(Context context, CJPayRealNameBean cJPayRealNameBean, String str) {
        if (PatchProxy.proxy(new Object[]{context, cJPayRealNameBean, str}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(cJPayRealNameBean, str);
        try {
            String LJI = C135876cI3.LJI();
            if (LJI == null) {
                LJI = "";
            }
            String LJII = C135876cI3.LJII();
            if (LJII == null) {
                LJII = "";
            }
            JSONObject LIZ2 = CJPayParamsUtils.LIZ(LJI, LJII);
            JSONObject LIZLLL = C135734cFl.LIZLLL();
            Intrinsics.checkNotNullExpressionValue(LIZLLL, "");
            if (context != null) {
                LIZLLL.put("bank_type", cJPayRealNameBean.LIZ(context));
            }
            LIZLLL.put("bank_name", cJPayRealNameBean.bank_name);
            LIZLLL.put("activity_info", new JSONArray(cJPayRealNameBean.activity_info));
            if (cJPayRealNameBean.isUnionPay) {
                C135734cFl.LIZ(LIZLLL);
            }
            C135734cFl.LIZ(str, LIZ2, LIZLLL);
        } catch (Exception unused) {
        }
    }

    public final void LIZ(Context context, String str, CJPayRealNameBean cJPayRealNameBean) {
        if (PatchProxy.proxy(new Object[]{context, str, cJPayRealNameBean}, this, LIZ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, cJPayRealNameBean);
        try {
            String LJI = C135876cI3.LJI();
            String str2 = "";
            if (LJI == null) {
                LJI = str2;
            }
            String LJII = C135876cI3.LJII();
            if (LJII != null) {
                str2 = LJII;
            }
            JSONObject LIZ2 = CJPayParamsUtils.LIZ(LJI, str2);
            JSONObject LIZLLL = C135734cFl.LIZLLL();
            if (context != null) {
                LIZLLL.put("bank_type", cJPayRealNameBean.LIZ(context));
            }
            LIZLLL.put("bank_name", cJPayRealNameBean.bank_name);
            LIZLLL.put("button_name", str);
            LIZLLL.put("activity_info", new JSONArray(cJPayRealNameBean.activity_info));
            if (cJPayRealNameBean.isUnionPay) {
                C135734cFl.LIZ(LIZLLL);
            }
            C135734cFl.LIZ("wallet_addbcard_captcha_click", LIZ2, LIZLLL);
        } catch (JSONException unused) {
        }
    }

    public final void LIZ(Context context, long j, CJPaySmsSignBean cJPaySmsSignBean, CJPayRealNameBean cJPayRealNameBean) {
        if (PatchProxy.proxy(new Object[]{context, new Long(j), cJPaySmsSignBean, cJPayRealNameBean}, this, LIZ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(cJPayRealNameBean);
        try {
            String LJI = C135876cI3.LJI();
            String str = "";
            if (LJI == null) {
                LJI = str;
            }
            String LJII = C135876cI3.LJII();
            if (LJII == null) {
                LJII = str;
            }
            JSONObject LIZ2 = CJPayParamsUtils.LIZ(LJI, LJII);
            JSONObject LIZLLL = C135734cFl.LIZLLL();
            LIZLLL.put("loading_time", j);
            if (cJPaySmsSignBean != null) {
                str = cJPaySmsSignBean.code;
            }
            LIZLLL.put("captcha_result", str);
            if (context != null) {
                LIZLLL.put("bank_type", cJPayRealNameBean.LIZ(context));
            }
            LIZLLL.put("bank_name", cJPayRealNameBean.bank_name);
            LIZLLL.put("activity_info", new JSONArray(cJPayRealNameBean.activity_info));
            if (cJPayRealNameBean.isUnionPay) {
                C135734cFl.LIZ(LIZLLL);
            }
            C135734cFl.LIZ("wallet_addbcard_captcha_submit_result", LIZ2, LIZLLL);
        } catch (Exception unused) {
        }
    }
}
