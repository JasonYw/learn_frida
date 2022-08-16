package com.android.ttcjpaysdk.thirdparty.front.mybankcard.p173b;

import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.data.CJPayMyBankCardResponseBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;
import p003X.AbstractC135545cCi;
import p003X.C106862S5w;
import p003X.C135876cI3;

/* renamed from: com.android.ttcjpaysdk.thirdparty.front.mybankcard.b.a */
/* loaded from: classes17.dex */
public final class C2383a implements AbstractC135545cCi {
    public static ChangeQuickRedirect LIZ;
    public CJPayMyBankCardResponseBean LIZIZ;
    public JSONArray LIZJ;
    public boolean LIZLLL;

    /* renamed from: LJ */
    public String f25538LJ = "0";
    public int LJFF;
    public boolean LJI;

    static {
        Covode.recordClassIndex(8731);
    }

    public final void LIZIZ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 8).isSupported) {
            return;
        }
        try {
            JSONObject LIZ2 = LIZ();
            LIZ2.put("page_scenes", "my_cards");
            C2118a.LIZ().LIZ("wallet_bcard_manage_add", LIZ2);
        } catch (Exception unused) {
        }
    }

    public final void LIZJ() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 10).isSupported || this.LJI) {
            return;
        }
        try {
            C2118a.LIZ().LIZ("wallet_bcard_manage_imp", LIZ());
            this.LJI = true;
        } catch (Exception unused) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x010e A[Catch: Exception -> 0x0169, TRY_ENTER, TryCatch #0 {Exception -> 0x0169, blocks: (B:13:0x0046, B:16:0x0050, B:18:0x005f, B:20:0x0077, B:22:0x00ae, B:23:0x00b2, B:24:0x00d7, B:25:0x00b9, B:27:0x00bf, B:30:0x00ca, B:35:0x00da, B:39:0x00ec, B:40:0x0103, B:43:0x010e, B:45:0x0119, B:47:0x0125, B:49:0x0140, B:53:0x0152, B:55:0x0162, B:58:0x0166, B:59:0x0100, B:61:0x00fc), top: B:12:0x0046 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final org.json.JSONObject LIZ() {
        /*
            Method dump skipped, instructions count: 362
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.ttcjpaysdk.thirdparty.front.mybankcard.p173b.C2383a.LIZ():org.json.JSONObject");
    }

    public final void LIZ(JSONObject jSONObject) {
        int i;
        int i2;
        int i3 = 1;
        if (PatchProxy.proxy(new Object[]{jSONObject}, this, LIZ, false, 4).isSupported) {
            return;
        }
        try {
            if (this.LIZLLL && this.LJFF > 0) {
                i = 1;
            } else {
                i = 0;
            }
            jSONObject.put("show_onestep", i);
            if (this.LIZIZ != null) {
                CJPayMyBankCardResponseBean cJPayMyBankCardResponseBean = this.LIZIZ;
                Intrinsics.checkNotNull(cJPayMyBankCardResponseBean);
                if (cJPayMyBankCardResponseBean.member.is_authed) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                jSONObject.put("needidentify", i2);
                CJPayMyBankCardResponseBean cJPayMyBankCardResponseBean2 = this.LIZIZ;
                Intrinsics.checkNotNull(cJPayMyBankCardResponseBean2);
                if (!cJPayMyBankCardResponseBean2.member.is_set_pwd) {
                    i3 = 0;
                }
                jSONObject.put("haspass", i3);
            }
            jSONObject.put("source", "wallet_bcard_manage");
        } catch (Exception unused) {
        }
    }

    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZ, false, 12).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, str2);
        try {
            JSONObject LIZ2 = CJPayParamsUtils.LIZ(C135876cI3.f17973LJ.LJIIIIZZ().merchantId, C135876cI3.f17973LJ.LJIIIIZZ().appId);
            LIZ2.put("error_msg", str);
            LIZ2.put("error_code", str2);
            C2118a.LIZ().LIZ("wallet_rd_query_pay_member_failure", LIZ2);
        } catch (Exception unused) {
        }
    }

    public final void LIZ(String str, boolean z, boolean z2) {
        String str2;
        String str3;
        if (PatchProxy.proxy(new Object[]{str, Byte.valueOf(z ? (byte) 1 : (byte) 0), Byte.valueOf(z2 ? (byte) 1 : (byte) 0)}, this, LIZ, false, 9).isSupported) {
            return;
        }
        C106862S5w.LIZ(str);
        try {
            JSONObject LIZ2 = CJPayParamsUtils.LIZ(C135876cI3.f17973LJ.LJIIIIZZ().merchantId, C135876cI3.f17973LJ.LJIIIIZZ().appId);
            Intrinsics.checkNotNullExpressionValue(LIZ2, "");
            LIZ(LIZ2);
            LIZ2.put("insurance_title", str);
            if (z) {
                str2 = "wallet_bcard_manager_page_havecard";
            } else {
                str2 = "wallet_bcard_manager_page_nocard";
            }
            LIZ2.put("page_name", str2);
            C2118a LIZ3 = C2118a.LIZ();
            if (z2) {
                str3 = "wallet_addbcard_insurance_title_click";
            } else {
                str3 = "wallet_addbcard_insurance_title_imp";
            }
            LIZ3.LIZ(str3, LIZ2);
        } catch (Exception unused) {
        }
    }
}
