package com.android.ttcjpaysdk.thirdparty.front.cardlist.p170c;

import android.text.TextUtils;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.network.ICJPayCallback;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import p003X.C106862S5w;
import p003X.C135876cI3;

/* renamed from: com.android.ttcjpaysdk.thirdparty.front.cardlist.c.a */
/* loaded from: classes17.dex */
public final class C2365a extends C2124b {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(8502);
    }

    public final void LIZ(String str, ICJPayCallback iCJPayCallback) {
        if (PatchProxy.proxy(new Object[]{str, iCJPayCallback}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, iCJPayCallback);
        if (TextUtils.isEmpty(str)) {
            return;
        }
        String LIZ = CJPayParamsUtils.LIZ("bytepay.cashdesk.pre_trade", CJPayParamsUtils.HostAPI.BDPAY);
        LIZ(CJPayNetworkManager.postForm(LIZ, CJPayParamsUtils.LIZ("bytepay.cashdesk.pre_trade", str, C135876cI3.f17973LJ.LJIIIIZZ().appId, C135876cI3.f17973LJ.LJIIIIZZ().merchantId), CJPayParamsUtils.LIZ(LIZ, "bytepay.cashdesk.pre_trade", C135876cI3.f17973LJ.LJIIIIZZ().extraHeaderMap), iCJPayCallback));
    }
}
