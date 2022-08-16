package com.android.ttcjpaysdk.bindcard.base.p140a;

import android.content.Context;
import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.service.CJPayServiceManager;
import com.android.ttcjpaysdk.base.service.ICJPayFaceCheckService;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.AbstractC135545cCi;
import p003X.C106862S5w;
import p003X.C135734cFl;
import p003X.C135876cI3;

/* renamed from: com.android.ttcjpaysdk.bindcard.base.a.b */
/* loaded from: classes17.dex */
public final class C2199b implements AbstractC135545cCi {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(6988);
    }

    public final void LIZ(long j, boolean z) {
        String str;
        if (PatchProxy.proxy(new Object[]{new Long(j), Byte.valueOf(z ? (byte) 1 : (byte) 0)}, this, LIZ, false, 1).isSupported) {
            return;
        }
        try {
            JSONObject LIZ2 = CJPayParamsUtils.LIZ(C135876cI3.LJI(), C135876cI3.LJII());
            if (z) {
                str = "0";
            } else {
                str = "1";
            }
            LIZ2.put("is_success", str);
            LIZ2.put("time", j);
            C135734cFl.LIZ("wallet_rd_pay_new_card_time", LIZ2);
            C2118a.LIZ().LIZ("wallet_rd_pay_new_card_time", LIZ2);
        } catch (Exception unused) {
        }
    }

    public final void LIZ(Context context, String str, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{context, str, jSONObject}, this, LIZ, false, 3).isSupported) {
            return;
        }
        C106862S5w.LIZ(context, str);
        ICJPayFaceCheckService iCJPayFaceCheckService = (ICJPayFaceCheckService) CJPayServiceManager.getInstance().getIService(ICJPayFaceCheckService.class);
        if (iCJPayFaceCheckService != null) {
            iCJPayFaceCheckService.logFaceResultEvent(context, str, jSONObject);
        }
    }
}
