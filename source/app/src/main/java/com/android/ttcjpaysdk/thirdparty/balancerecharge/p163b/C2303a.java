package com.android.ttcjpaysdk.thirdparty.balancerecharge.p163b;

import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.thirdparty.balance.p159d.C2297a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C135465cBQ;

/* renamed from: com.android.ttcjpaysdk.thirdparty.balancerecharge.b.a */
/* loaded from: classes17.dex */
public final class C2303a extends C2297a {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(8038);
    }

    public final void LIZ(String str, Integer num, long j) {
        if (PatchProxy.proxy(new Object[]{str, num, new Long(j)}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        C2118a LIZ = C2118a.LIZ();
        JSONObject jSONObject = new JSONObject();
        C135465cBQ.LIZ(jSONObject, "from", str);
        C135465cBQ.LIZ(jSONObject, "is_bankcard", num);
        C135465cBQ.LIZ(jSONObject, "amount", Long.valueOf(j));
        LIZ.LIZ("wallet_change_cashier_add_newcard_click", LIZ(jSONObject));
    }
}
