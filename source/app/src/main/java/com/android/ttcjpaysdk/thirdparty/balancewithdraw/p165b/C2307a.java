package com.android.ttcjpaysdk.thirdparty.balancewithdraw.p165b;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.thirdparty.balance.p159d.C2297a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C135465cBQ;

/* renamed from: com.android.ttcjpaysdk.thirdparty.balancewithdraw.b.a */
/* loaded from: classes17.dex */
public final class C2307a extends C2297a {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(8067);
    }

    public final void LIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZIZ, false, 5).isSupported) {
            return;
        }
        C2118a LIZ = C2118a.LIZ();
        JSONObject[] jSONObjectArr = new JSONObject[1];
        JSONObject LIZIZ2 = LIZIZ(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        C135465cBQ.LIZ(LIZIZ2, "from", str2);
        jSONObjectArr[0] = LIZ(LIZIZ2);
        LIZ.LIZ("wallet_tixian_cardselect_addbcard", jSONObjectArr);
    }

    public final void LIZIZ(String str, String str2) {
        if (PatchProxy.proxy(new Object[]{str, str2}, this, LIZIZ, false, 9).isSupported) {
            return;
        }
        C2118a LIZ = C2118a.LIZ();
        JSONObject[] jSONObjectArr = new JSONObject[1];
        JSONObject LIZIZ2 = LIZIZ(str);
        if (TextUtils.isEmpty(str2)) {
            str2 = "";
        }
        C135465cBQ.LIZ(LIZIZ2, "button_name", str2);
        jSONObjectArr[0] = LIZ(LIZIZ2);
        LIZ.LIZ("wallet_perfect_userinfo_pop_click", jSONObjectArr);
    }
}
