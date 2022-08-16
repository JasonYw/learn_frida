package com.android.ttcjpaysdk.thirdparty.front.mybankcard;

import android.app.Activity;
import android.content.Context;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.service.ICJPayFrontMyBankCardService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C106862S5w;
import p003X.C135585cDM;
import p003X.C135876cI3;
import p003X.C135996cJz;
import p003X.C136058cKz;

/* loaded from: classes17.dex */
public class CJPayFrontMyBankCardProvider implements ICJPayFrontMyBankCardService {
    public static ChangeQuickRedirect LIZ;

    static {
        Covode.recordClassIndex(8688);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return "com.android.ttcjpaysdk.thirdparty.front.mybankcard";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFrontMyBankCardService
    @CJPayModuleEntryReport
    public void startFrontMyBankCard(Context context, JSONObject jSONObject) {
        if (PatchProxy.proxy(new Object[]{context, jSONObject}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C135876cI3.f17973LJ.LIZ(CJPayHostInfo.LIZ(jSONObject));
        if (!PatchProxy.proxy(new Object[]{context}, null, C135585cDM.LIZ, true, 2).isSupported) {
            C106862S5w.LIZ(context);
            C135996cJz.LIZ().LIZ("/mybankcard/CJPayBankCardActivity").LIZ(context);
            if (context instanceof Activity) {
                C136058cKz.LIZ((Activity) context);
            }
        }
    }
}
