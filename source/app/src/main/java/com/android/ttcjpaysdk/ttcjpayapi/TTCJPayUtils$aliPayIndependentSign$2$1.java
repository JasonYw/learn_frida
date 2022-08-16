package com.android.ttcjpaysdk.ttcjpayapi;

import com.android.ttcjpaysdk.base.C2118a;
import com.android.ttcjpaysdk.base.service.ICJPayAliPaymentService;
import com.bytedance.accountseal.p191a.C2521l;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt__MapsKt;

/* loaded from: classes17.dex */
public final class TTCJPayUtils$aliPayIndependentSign$2$1 implements ICJPayAliPaymentService.OnSignResultCallback {
    public static final TTCJPayUtils$aliPayIndependentSign$2$1 INSTANCE = new TTCJPayUtils$aliPayIndependentSign$2$1();
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(9315);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayAliPaymentService.OnSignResultCallback
    public final void onResult(int i, String str) {
        C2118a LIZ;
        if (PatchProxy.proxy(new Object[]{Integer.valueOf(i), str}, this, changeQuickRedirect, false, 1).isSupported) {
            return;
        }
        try {
            C2118a LIZ2 = C2118a.LIZ().LIZ(0);
            if (LIZ2 != null && (LIZ = LIZ2.LIZ(MapsKt__MapsKt.mapOf(TuplesKt.m137to(C2521l.LJIIJ, String.valueOf(i)), TuplesKt.m137to("msg", str)))) != null) {
                LIZ.LIZIZ();
            }
        } catch (Exception unused) {
            C2118a LIZ3 = C2118a.LIZ().LIZ(112);
            if (LIZ3 != null) {
                LIZ3.LIZIZ();
            }
        }
    }
}
