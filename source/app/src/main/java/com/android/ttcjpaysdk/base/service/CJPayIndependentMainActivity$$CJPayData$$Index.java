package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity.CJPayIndependentMainActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class CJPayIndependentMainActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6391);
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayIndependentMainActivity cJPayIndependentMainActivity = (CJPayIndependentMainActivity) obj2;
        bundle.putString("bindCardInfo", cJPayIndependentMainActivity.LIZIZ);
        bundle.putBoolean("needAuthGuide", cJPayIndependentMainActivity.LIZJ);
        bundle.putString("bizOrderType", cJPayIndependentMainActivity.LIZLLL);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        String stringExtra;
        String stringExtra2;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        CJPayIndependentMainActivity cJPayIndependentMainActivity = (CJPayIndependentMainActivity) obj2;
        if (cJPayIndependentMainActivity.getIntent().getStringExtra("bindCardInfo") == null) {
            stringExtra = cJPayIndependentMainActivity.LIZIZ;
        } else {
            stringExtra = cJPayIndependentMainActivity.getIntent().getStringExtra("bindCardInfo");
        }
        cJPayIndependentMainActivity.LIZIZ = stringExtra;
        cJPayIndependentMainActivity.LIZJ = cJPayIndependentMainActivity.getIntent().getBooleanExtra("needAuthGuide", cJPayIndependentMainActivity.LIZJ);
        if (cJPayIndependentMainActivity.getIntent().getStringExtra("bizOrderType") == null) {
            stringExtra2 = cJPayIndependentMainActivity.LIZLLL;
        } else {
            stringExtra2 = cJPayIndependentMainActivity.getIntent().getStringExtra("bizOrderType");
        }
        cJPayIndependentMainActivity.LIZLLL = stringExtra2;
    }

    public static void restoreData(Object obj, Object obj2) {
        String string;
        String string2;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayIndependentMainActivity cJPayIndependentMainActivity = (CJPayIndependentMainActivity) obj2;
        if (bundle.getString("bindCardInfo") == null) {
            string = cJPayIndependentMainActivity.LIZIZ;
        } else {
            string = bundle.getString("bindCardInfo");
        }
        cJPayIndependentMainActivity.LIZIZ = string;
        cJPayIndependentMainActivity.LIZJ = bundle.getBoolean("needAuthGuide");
        if (bundle.getString("bizOrderType") == null) {
            string2 = cJPayIndependentMainActivity.LIZLLL;
        } else {
            string2 = bundle.getString("bizOrderType");
        }
        cJPayIndependentMainActivity.LIZLLL = string2;
    }
}
