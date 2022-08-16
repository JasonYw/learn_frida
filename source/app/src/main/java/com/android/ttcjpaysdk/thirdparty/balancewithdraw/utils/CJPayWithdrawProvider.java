package com.android.ttcjpaysdk.thirdparty.balancewithdraw.utils;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.service.ICJPayWithdrawService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.thirdparty.balancewithdraw.activity.CJPayWithdrawTransitionActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C116971W2r;
import p003X.C136058cKz;
import p003X.C136246cO1;

/* loaded from: classes17.dex */
public final class CJPayWithdrawProvider implements ICJPayWithdrawService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(8082);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public final String getPackageName() {
        return "com.android.ttcjpaysdk.thirdparty.balancewithdraw";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayWithdrawService
    @CJPayModuleEntryReport
    public final void startCJPayWithdrawActivity(Context context, JSONObject jSONObject) {
        if (!PatchProxy.proxy(new Object[]{context, jSONObject}, this, LIZ, false, 1).isSupported && context != null) {
            C136246cO1.LIZIZ = CJPayHostInfo.Companion.LIZ(jSONObject);
            C116971W2r.LIZ(context, new Intent(context, CJPayWithdrawTransitionActivity.class));
            if (context instanceof Activity) {
                C136058cKz.LIZIZ((Activity) context);
            }
        }
    }
}
