package com.android.ttcjpaysdk.thirdparty.counter.p167d;

import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.network.CJPayNetworkManager;
import com.android.ttcjpaysdk.base.p128d.p129b.C2124b;
import com.android.ttcjpaysdk.base.utils.CJPayParamsUtils;
import com.android.ttcjpaysdk.thirdparty.counter.activity.CJPayCheckoutCounterActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p003X.AbstractC137673cl3;
import p003X.C106862S5w;

/* renamed from: com.android.ttcjpaysdk.thirdparty.counter.d.b */
/* loaded from: classes17.dex */
public final class C2319b extends C2124b {
    public static ChangeQuickRedirect LIZIZ;

    static {
        Covode.recordClassIndex(8218);
    }

    public final <T> void LIZ(String str, JSONObject jSONObject, AbstractC137673cl3<T> abstractC137673cl3) {
        String str2;
        String str3;
        if (PatchProxy.proxy(new Object[]{str, jSONObject, abstractC137673cl3}, this, LIZIZ, false, 1).isSupported) {
            return;
        }
        C106862S5w.LIZ(str, jSONObject, abstractC137673cl3);
        String LIZ = CJPayParamsUtils.LIZ(str, CJPayParamsUtils.HostAPI.BDPAY);
        String jSONObject2 = jSONObject.toString();
        CJPayHostInfo cJPayHostInfo = CJPayCheckoutCounterActivity.LJIIJ;
        HashMap<String, String> hashMap = null;
        if (cJPayHostInfo != null) {
            str2 = cJPayHostInfo.appId;
        } else {
            str2 = null;
        }
        CJPayHostInfo cJPayHostInfo2 = CJPayCheckoutCounterActivity.LJIIJ;
        if (cJPayHostInfo2 != null) {
            str3 = cJPayHostInfo2.merchantId;
        } else {
            str3 = null;
        }
        Map<String, String> LIZ2 = CJPayParamsUtils.LIZ(str, jSONObject2, str2, str3);
        CJPayHostInfo cJPayHostInfo3 = CJPayCheckoutCounterActivity.LJIIJ;
        if (cJPayHostInfo3 != null) {
            hashMap = cJPayHostInfo3.extraHeaderMap;
        }
        LIZ(CJPayNetworkManager.postForm(LIZ, LIZ2, CJPayParamsUtils.LIZ(LIZ, str, hashMap), abstractC137673cl3));
    }
}
