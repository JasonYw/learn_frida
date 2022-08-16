package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity.CJPayCardBinActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class CJPayCardBinActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6387);
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayCardBinActivity cJPayCardBinActivity = (CJPayCardBinActivity) obj2;
        bundle.putBoolean("param_is_independent_bind_card", cJPayCardBinActivity.LIZIZ);
        bundle.putString("param_bind_card_info", cJPayCardBinActivity.LIZJ);
        bundle.putBoolean("hide_card_list", cJPayCardBinActivity.LIZLLL);
        bundle.putBoolean("force_not_show_real_name_auth", cJPayCardBinActivity.f25462LJ);
        bundle.putBoolean("is_first_bind_card_page", cJPayCardBinActivity.LJFF);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        String stringExtra;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        CJPayCardBinActivity cJPayCardBinActivity = (CJPayCardBinActivity) obj2;
        cJPayCardBinActivity.LIZIZ = cJPayCardBinActivity.getIntent().getBooleanExtra("param_is_independent_bind_card", cJPayCardBinActivity.LIZIZ);
        if (cJPayCardBinActivity.getIntent().getStringExtra("param_bind_card_info") == null) {
            stringExtra = cJPayCardBinActivity.LIZJ;
        } else {
            stringExtra = cJPayCardBinActivity.getIntent().getStringExtra("param_bind_card_info");
        }
        cJPayCardBinActivity.LIZJ = stringExtra;
        cJPayCardBinActivity.LIZLLL = cJPayCardBinActivity.getIntent().getBooleanExtra("hide_card_list", cJPayCardBinActivity.LIZLLL);
        cJPayCardBinActivity.f25462LJ = cJPayCardBinActivity.getIntent().getBooleanExtra("force_not_show_real_name_auth", cJPayCardBinActivity.f25462LJ);
        cJPayCardBinActivity.LJFF = cJPayCardBinActivity.getIntent().getBooleanExtra("is_first_bind_card_page", cJPayCardBinActivity.LJFF);
    }

    public static void restoreData(Object obj, Object obj2) {
        String string;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayCardBinActivity cJPayCardBinActivity = (CJPayCardBinActivity) obj2;
        cJPayCardBinActivity.LIZIZ = bundle.getBoolean("param_is_independent_bind_card");
        if (bundle.getString("param_bind_card_info") == null) {
            string = cJPayCardBinActivity.LIZJ;
        } else {
            string = bundle.getString("param_bind_card_info");
        }
        cJPayCardBinActivity.LIZJ = string;
        cJPayCardBinActivity.LIZLLL = bundle.getBoolean("hide_card_list");
        cJPayCardBinActivity.f25462LJ = bundle.getBoolean("force_not_show_real_name_auth");
        cJPayCardBinActivity.LJFF = bundle.getBoolean("is_first_bind_card_page");
    }
}
