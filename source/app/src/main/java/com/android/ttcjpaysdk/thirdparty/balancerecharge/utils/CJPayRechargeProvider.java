package com.android.ttcjpaysdk.thirdparty.balancerecharge.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.service.ICJPayRechargeService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.thirdparty.balancerecharge.activity.CJPayRechargeTransitionActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C116971W2r;
import p003X.C136058cKz;
import p003X.C136246cO1;

/* loaded from: classes17.dex */
public final class CJPayRechargeProvider implements ICJPayRechargeService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(8047);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public final String getPackageName() {
        return "com.android.ttcjpaysdk.thirdparty.balancerecharge";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayRechargeService
    @CJPayModuleEntryReport
    public final void startCJPayRechargeActivity(Context context, JSONObject jSONObject) {
        if (!PatchProxy.proxy(new Object[]{context, jSONObject}, this, LIZ, false, 1).isSupported && context != null) {
            C136246cO1.LIZIZ = CJPayHostInfo.Companion.LIZ(jSONObject);
            C116971W2r.LIZ(context, new Intent(context, CJPayRechargeTransitionActivity.class));
            if (context instanceof Activity) {
                C136058cKz.LIZIZ((Activity) context);
            }
        }
    }
}
