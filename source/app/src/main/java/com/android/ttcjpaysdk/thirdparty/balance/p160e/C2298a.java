package com.android.ttcjpaysdk.thirdparty.balance.p160e;

import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;
import p003X.C136246cO1;
import p003X.C136315cP8;
import p003X.C136340cPX;

/* renamed from: com.android.ttcjpaysdk.thirdparty.balance.e.a */
/* loaded from: classes17.dex */
public final class C2298a extends C2124b {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(7985);
    }

    public final <T> void LIZ(String str, AbstractC137673cl3<T> abstractC137673cl3) {
        String str2;
        Map<String, String> map;
        String str3;
        String str4;
        String str5;
        if (PatchProxy.proxy(new Object[]{str, abstractC137673cl3}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, abstractC137673cl3);
        C136315cP8 c136315cP8 = new C136315cP8();
        c136315cP8.LIZIZ = "cashdesk.sdk.pay.pre_trade";
        if (Intrinsics.areEqual("recharge", str)) {
            str2 = "prepay.balance.confirm";
        } else {
            str2 = "prewithdraw.balance.confirm";
        }
        c136315cP8.LIZJ = str2;
        c136315cP8.LJFF = C136340cPX.LIZIZ.LIZ();
        CJPayHostInfo cJPayHostInfo = C136246cO1.LIZIZ;
        HashMap<String, String> hashMap = null;
        if (cJPayHostInfo != null) {
            map = cJPayHostInfo.payRequestParams;
        } else {
            map = null;
        }
        c136315cP8.LJI = map;
        if (!Intrinsics.areEqual("recharge", str)) {
            str3 = "bytepay.cashdesk.pre_trade";
        } else {
            str3 = null;
        }
        String LIZ = CJPayParamsUtils.LIZ(str3, CJPayParamsUtils.HostAPI.BDPAY);
        String LIZ2 = c136315cP8.LIZ();
        CJPayHostInfo cJPayHostInfo2 = C136246cO1.LIZIZ;
        String str6 = "";
        if (cJPayHostInfo2 == null || (str4 = cJPayHostInfo2.appId) == null) {
            str4 = str6;
        }
        CJPayHostInfo cJPayHostInfo3 = C136246cO1.LIZIZ;
        if (cJPayHostInfo3 != null && (str5 = cJPayHostInfo3.merchantId) != null) {
            str6 = str5;
        }
        Map<String, String> LIZ3 = CJPayParamsUtils.LIZ("bytepay.cashdesk.pre_trade", LIZ2, str4, str6);
        CJPayHostInfo cJPayHostInfo4 = C136246cO1.LIZIZ;
        if (cJPayHostInfo4 != null) {
            hashMap = cJPayHostInfo4.extraHeaderMap;
        }
        LIZ(CJPayNetworkManager.postForm(LIZ, LIZ3, CJPayParamsUtils.LIZ(LIZ, "bytepay.cashdesk.pre_trade", hashMap), abstractC137673cl3));
    }
}
