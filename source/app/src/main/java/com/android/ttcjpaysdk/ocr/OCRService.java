package com.android.ttcjpaysdk.ocr;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.ttcjpaysdk.base.CJPayHostInfo;
import com.android.ttcjpaysdk.base.service.ICJPayOCRService;
import com.android.ttcjpaysdk.base.service.ICJPayServiceRetCallBack;
import com.android.ttcjpaysdk.base.service.annotation.CJPayModuleEntryReport;
import com.android.ttcjpaysdk.ocr.activity.OCRScanActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import org.json.JSONObject;
import p003X.C116971W2r;
import p003X.C137023caY;

/* loaded from: classes17.dex */
public class OCRService implements ICJPayOCRService {
    public static ChangeQuickRedirect LIZ;
    public static CJPayHostInfo LIZIZ;

    static {
        Covode.recordClassIndex(7874);
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayService
    public String getPackageName() {
        return "com.android.ttcjpaysdk.ocr";
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayOCRService
    public void release() {
        if (PatchProxy.proxy(new Object[0], this, LIZ, false, 2).isSupported) {
            return;
        }
        C137023caY.LIZ().LIZIZ = null;
    }

    @Override // com.android.ttcjpaysdk.base.service.ICJPayOCRService
    @CJPayModuleEntryReport
    public void startOCR(Context context, String str, String str2, String str3, String str4, String str5, JSONObject jSONObject, ICJPayServiceRetCallBack iCJPayServiceRetCallBack) {
        if (PatchProxy.proxy(new Object[]{context, str, str2, str3, str4, str5, jSONObject, iCJPayServiceRetCallBack}, this, LIZ, false, 1).isSupported) {
            return;
        }
        CJPayHostInfo LIZ2 = CJPayHostInfo.LIZ(jSONObject);
        LIZIZ = LIZ2;
        LIZ2.merchantId = str;
        if (!TextUtils.isEmpty(str2)) {
            LIZIZ.appId = str2;
        }
        C137023caY.LIZ();
        if (!PatchProxy.proxy(new Object[]{context, str3, str4, str5, iCJPayServiceRetCallBack}, null, C137023caY.LIZ, true, 2).isSupported) {
            C116971W2r.LIZ(context, new Intent(context, OCRScanActivity.class));
            if (context instanceof Activity) {
                ((Activity) context).overridePendingTransition(0, 0);
            }
            C137023caY.LIZ().LIZIZ = iCJPayServiceRetCallBack;
            C137023caY.LIZ().LIZJ = str3;
            C137023caY.LIZ().LIZLLL = str4;
            C137023caY.LIZ().f18122LJ = str5;
        }
    }
}
