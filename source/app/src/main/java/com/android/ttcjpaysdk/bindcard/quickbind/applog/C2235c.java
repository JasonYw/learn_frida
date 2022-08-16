package com.android.ttcjpaysdk.bindcard.quickbind.applog;

import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C135734cFl;
import p003X.C135876cI3;
import p003X.C135903cIU;
import p003X.C136000cK3;

/* renamed from: com.android.ttcjpaysdk.bindcard.quickbind.applog.c */
/* loaded from: classes17.dex */
public final class C2235c extends C135903cIU {

    /* renamed from: LJ */
    public static ChangeQuickRedirect f25482LJ;

    static {
        Covode.recordClassIndex(7231);
    }

    public final void LIZIZ(String str) {
        if (PatchProxy.proxy(new Object[]{str}, this, f25482LJ, false, 4).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        JSONObject LIZ = CJPayParamsUtils.LIZ(C135876cI3.LJI(), C135876cI3.LJII());
        Intrinsics.checkNotNullExpressionValue(LIZ, "");
        LIZ(LIZ, str);
        try {
            LIZ.put("campaign_info", C136000cK3.LIZIZ.LIZ(LIZ(), "campaign_info"));
            C135734cFl.LIZ("wallet_addbcard_onestepbind_banktype_page_other_click", LIZ);
        } catch (JSONException unused) {
        }
    }

    public final void LIZ(String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, f25482LJ, false, 2).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3, str4, str5);
        LIZIZ("wallet_addbcard_onestepbind_banktype_page_agreement", str, str2, str3, str4, str5);
    }

    public final void LIZIZ(String str, String str2, String str3, String str4, String str5) {
        if (PatchProxy.proxy(new Object[]{str, str2, str3, str4, str5}, this, f25482LJ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2, str3, str4, str5);
        LIZIZ("wallet_addbcard_onestepbind_banktype_page_click", str, str2, str3, str4, str5);
    }
}
