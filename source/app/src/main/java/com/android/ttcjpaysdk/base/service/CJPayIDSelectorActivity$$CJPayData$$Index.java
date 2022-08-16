package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.bean.CJPayCardInfoBean;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity.CJPayIDSelectorActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class CJPayIDSelectorActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6390);
    }

    public static void restoreData(Object obj, Object obj2) {
        String string;
        CJPayCardInfoBean cJPayCardInfoBean;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayIDSelectorActivity cJPayIDSelectorActivity = (CJPayIDSelectorActivity) obj2;
        if (bundle.getString("param_current_id") == null) {
            string = cJPayIDSelectorActivity.LIZIZ;
        } else {
            string = bundle.getString("param_current_id");
        }
        cJPayIDSelectorActivity.LIZIZ = string;
        if (bundle.getSerializable("param_bank_card_info") == null) {
            cJPayCardInfoBean = cJPayIDSelectorActivity.LIZJ;
        } else {
            cJPayCardInfoBean = (CJPayCardInfoBean) bundle.getSerializable("param_bank_card_info");
        }
        cJPayIDSelectorActivity.LIZJ = cJPayCardInfoBean;
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayIDSelectorActivity cJPayIDSelectorActivity = (CJPayIDSelectorActivity) obj2;
        bundle.putString("param_current_id", cJPayIDSelectorActivity.LIZIZ);
        bundle.putSerializable("cardInfoBean", cJPayIDSelectorActivity.LIZJ);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        String stringExtra;
        CJPayCardInfoBean cJPayCardInfoBean;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        CJPayIDSelectorActivity cJPayIDSelectorActivity = (CJPayIDSelectorActivity) obj2;
        if (cJPayIDSelectorActivity.getIntent().getStringExtra("param_current_id") == null) {
            stringExtra = cJPayIDSelectorActivity.LIZIZ;
        } else {
            stringExtra = cJPayIDSelectorActivity.getIntent().getStringExtra("param_current_id");
        }
        cJPayIDSelectorActivity.LIZIZ = stringExtra;
        if (cJPayIDSelectorActivity.getIntent().getSerializableExtra("param_bank_card_info") == null) {
            cJPayCardInfoBean = cJPayIDSelectorActivity.LIZJ;
        } else {
            cJPayCardInfoBean = (CJPayCardInfoBean) cJPayIDSelectorActivity.getIntent().getSerializableExtra("param_bank_card_info");
        }
        cJPayIDSelectorActivity.LIZJ = cJPayCardInfoBean;
    }
}
