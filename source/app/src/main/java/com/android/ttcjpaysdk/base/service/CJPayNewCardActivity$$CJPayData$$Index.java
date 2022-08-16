package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bindcard.base.pay.CJPayNewCardActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class CJPayNewCardActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6392);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        String stringExtra;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        CJPayNewCardActivity cJPayNewCardActivity = (CJPayNewCardActivity) obj2;
        if (cJPayNewCardActivity.getIntent().getStringExtra("param_pay_new_card") == null) {
            stringExtra = cJPayNewCardActivity.LIZIZ;
        } else {
            stringExtra = cJPayNewCardActivity.getIntent().getStringExtra("param_pay_new_card");
        }
        cJPayNewCardActivity.LIZIZ = stringExtra;
    }

    public static void restoreData(Object obj, Object obj2) {
        String string;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayNewCardActivity cJPayNewCardActivity = (CJPayNewCardActivity) obj2;
        if (bundle.getString("param_pay_new_card") == null) {
            string = cJPayNewCardActivity.LIZIZ;
        } else {
            string = bundle.getString("param_pay_new_card");
        }
        cJPayNewCardActivity.LIZIZ = string;
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        ((Bundle) obj).putString("param_pay_new_card", ((CJPayNewCardActivity) obj2).LIZIZ);
    }
}
