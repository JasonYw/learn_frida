package com.android.ttcjpaysdk.thirdparty.front.cardlist;

import android.app.Activity;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.service.ICJPayFrontCardListCallBack;
import com.android.ttcjpaysdk.base.service.ICJPayFrontCardListService;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.thirdparty.data.C2342n;
import com.android.ttcjpaysdk.thirdparty.front.cardlist.p171d.C2366a;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;
import org.json.JSONObject;
import p003X.C135876cI3;
import p003X.C136314cP7;
import p003X.C136320cPD;

/* loaded from: classes17.dex */
public class CJPayFrontCardListProvider implements ICJPayFrontCardListService {
    public static ChangeQuickRedirect LIZ;
    public ICJPayFrontCardListCallBack LIZIZ;

    static {
        Covode.recordClassIndex(8486);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return "com.android.ttcjpaysdk.thirdparty.front.cardlist";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFrontCardListService
    public void release() {
        this.LIZIZ = null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFrontCardListService
    public ICJPayFrontCardListCallBack getFrontCardCallBack() {
        return this.LIZIZ;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayFrontCardListService
    @CJPayModuleEntryReport
    public void startCJPayFrontCardListMethodActivity(Activity activity, int i, int i2, String str, String str2, String str3, ArrayList<String> arrayList, ICJPayFrontCardListCallBack iCJPayFrontCardListCallBack, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        String str4;
        if (PatchProxy.proxy(new Object[]{activity, Integer.valueOf(i), Integer.valueOf(i2), str, str2, str3, arrayList, iCJPayFrontCardListCallBack, jSONObject, jSONObject2, jSONObject3}, this, LIZ, false, 1).isSupported) {
            return;
        }
        C135876cI3.f17973LJ.LIZ(CJPayHostInfo.LIZ(jSONObject3));
        this.LIZIZ = iCJPayFrontCardListCallBack;
        if (!PatchProxy.proxy(new Object[]{activity, Integer.valueOf(i), Integer.valueOf(i2), str, str2, str3, arrayList, jSONObject, jSONObject2, iCJPayFrontCardListCallBack}, null, C136314cP7.LIZ, true, 1).isSupported && activity != null) {
            if (jSONObject2 != null) {
                C2342n LIZIZ = C136320cPD.LIZIZ(jSONObject2);
                C2366a.LJFF = LIZIZ;
                if (LIZIZ != null && C2366a.LJFF.paytype_info.quick_pay.cards.size() > 0) {
                    if (jSONObject != null) {
                        str4 = jSONObject.toString();
                    } else {
                        str4 = "";
                    }
                    C136320cPD.LIZ(activity, i, i2, str, str2, str3, str4, arrayList);
                    C136314cP7.LIZ(activity, iCJPayFrontCardListCallBack);
                    return;
                }
                C136314cP7.LIZ(activity, i, i2, str, str2, str3, arrayList, jSONObject, iCJPayFrontCardListCallBack);
                return;
            }
            C136314cP7.LIZ(activity, i, i2, str, str2, str3, arrayList, jSONObject, iCJPayFrontCardListCallBack);
        }
    }
}
