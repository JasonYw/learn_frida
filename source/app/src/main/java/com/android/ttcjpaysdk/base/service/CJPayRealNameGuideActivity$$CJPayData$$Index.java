package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity.CJPayRealNameGuideActivity;
import com.android.ttcjpaysdk.bindcard.base.bean.QuickBindCardAdapterBean;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class CJPayRealNameGuideActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6393);
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayRealNameGuideActivity cJPayRealNameGuideActivity = (CJPayRealNameGuideActivity) obj2;
        bundle.putBoolean("param_is_independent_bind_card", cJPayRealNameGuideActivity.LIZIZ);
        bundle.putSerializable("quickBindCardBean", cJPayRealNameGuideActivity.LIZJ);
        bundle.putString("param_bind_card_info", cJPayRealNameGuideActivity.LIZLLL);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        QuickBindCardAdapterBean quickBindCardAdapterBean;
        String stringExtra;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        CJPayRealNameGuideActivity cJPayRealNameGuideActivity = (CJPayRealNameGuideActivity) obj2;
        cJPayRealNameGuideActivity.LIZIZ = cJPayRealNameGuideActivity.getIntent().getBooleanExtra("param_is_independent_bind_card", cJPayRealNameGuideActivity.LIZIZ);
        if (cJPayRealNameGuideActivity.getIntent().getSerializableExtra("param_bank_bean") == null) {
            quickBindCardAdapterBean = cJPayRealNameGuideActivity.LIZJ;
        } else {
            quickBindCardAdapterBean = (QuickBindCardAdapterBean) cJPayRealNameGuideActivity.getIntent().getSerializableExtra("param_bank_bean");
        }
        cJPayRealNameGuideActivity.LIZJ = quickBindCardAdapterBean;
        if (cJPayRealNameGuideActivity.getIntent().getStringExtra("param_bind_card_info") == null) {
            stringExtra = cJPayRealNameGuideActivity.LIZLLL;
        } else {
            stringExtra = cJPayRealNameGuideActivity.getIntent().getStringExtra("param_bind_card_info");
        }
        cJPayRealNameGuideActivity.LIZLLL = stringExtra;
    }

    public static void restoreData(Object obj, Object obj2) {
        QuickBindCardAdapterBean quickBindCardAdapterBean;
        String string;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayRealNameGuideActivity cJPayRealNameGuideActivity = (CJPayRealNameGuideActivity) obj2;
        cJPayRealNameGuideActivity.LIZIZ = bundle.getBoolean("param_is_independent_bind_card");
        if (bundle.getSerializable("param_bank_bean") == null) {
            quickBindCardAdapterBean = cJPayRealNameGuideActivity.LIZJ;
        } else {
            quickBindCardAdapterBean = (QuickBindCardAdapterBean) bundle.getSerializable("param_bank_bean");
        }
        cJPayRealNameGuideActivity.LIZJ = quickBindCardAdapterBean;
        if (bundle.getString("param_bind_card_info") == null) {
            string = cJPayRealNameGuideActivity.LIZLLL;
        } else {
            string = bundle.getString("param_bind_card_info");
        }
        cJPayRealNameGuideActivity.LIZLLL = string;
    }
}
