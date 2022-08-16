package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.bean.CJPayCardInfoBean;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity.CJPayFourElementsActivity;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayOneKeyCopyWritingInfo;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class CJPayFourElementsActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6388);
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayFourElementsActivity cJPayFourElementsActivity = (CJPayFourElementsActivity) obj2;
        bundle.putSerializable("mCardInfoBean", cJPayFourElementsActivity.LIZIZ);
        bundle.putString("params_protocol_group_names", cJPayFourElementsActivity.LIZJ);
        bundle.putSerializable("mFromIndependentBindCard", cJPayFourElementsActivity.LIZLLL);
        bundle.putSerializable("mOneKeyCopyWritingInfo", cJPayFourElementsActivity.f25463LJ);
        bundle.putString("bind_card_result_lynx_scheme", cJPayFourElementsActivity.LJFF);
    }

    public static void restoreData(Object obj, Object obj2) {
        CJPayCardInfoBean cJPayCardInfoBean;
        String string;
        Boolean bool;
        CJPayOneKeyCopyWritingInfo cJPayOneKeyCopyWritingInfo;
        String string2;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayFourElementsActivity cJPayFourElementsActivity = (CJPayFourElementsActivity) obj2;
        if (bundle.getSerializable("param_bank_card_info") == null) {
            cJPayCardInfoBean = cJPayFourElementsActivity.LIZIZ;
        } else {
            cJPayCardInfoBean = (CJPayCardInfoBean) bundle.getSerializable("param_bank_card_info");
        }
        cJPayFourElementsActivity.LIZIZ = cJPayCardInfoBean;
        if (bundle.getString("params_protocol_group_names") == null) {
            string = cJPayFourElementsActivity.LIZJ;
        } else {
            string = bundle.getString("params_protocol_group_names");
        }
        cJPayFourElementsActivity.LIZJ = string;
        if (bundle.getSerializable("param_is_independent_bind_card") == null) {
            bool = cJPayFourElementsActivity.LIZLLL;
        } else {
            bool = (Boolean) bundle.getSerializable("param_is_independent_bind_card");
        }
        cJPayFourElementsActivity.LIZLLL = bool;
        if (bundle.getSerializable("params_one_key_copy_writing_info") == null) {
            cJPayOneKeyCopyWritingInfo = cJPayFourElementsActivity.f25463LJ;
        } else {
            cJPayOneKeyCopyWritingInfo = (CJPayOneKeyCopyWritingInfo) bundle.getSerializable("params_one_key_copy_writing_info");
        }
        cJPayFourElementsActivity.f25463LJ = cJPayOneKeyCopyWritingInfo;
        if (bundle.getString("bind_card_result_lynx_scheme") == null) {
            string2 = cJPayFourElementsActivity.LJFF;
        } else {
            string2 = bundle.getString("bind_card_result_lynx_scheme");
        }
        cJPayFourElementsActivity.LJFF = string2;
    }

    public static void autoWiredData(Object obj, Object obj2) {
        CJPayCardInfoBean cJPayCardInfoBean;
        String stringExtra;
        Boolean bool;
        CJPayOneKeyCopyWritingInfo cJPayOneKeyCopyWritingInfo;
        String stringExtra2;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        CJPayFourElementsActivity cJPayFourElementsActivity = (CJPayFourElementsActivity) obj2;
        if (cJPayFourElementsActivity.getIntent().getSerializableExtra("param_bank_card_info") == null) {
            cJPayCardInfoBean = cJPayFourElementsActivity.LIZIZ;
        } else {
            cJPayCardInfoBean = (CJPayCardInfoBean) cJPayFourElementsActivity.getIntent().getSerializableExtra("param_bank_card_info");
        }
        cJPayFourElementsActivity.LIZIZ = cJPayCardInfoBean;
        if (cJPayFourElementsActivity.getIntent().getStringExtra("params_protocol_group_names") == null) {
            stringExtra = cJPayFourElementsActivity.LIZJ;
        } else {
            stringExtra = cJPayFourElementsActivity.getIntent().getStringExtra("params_protocol_group_names");
        }
        cJPayFourElementsActivity.LIZJ = stringExtra;
        if (cJPayFourElementsActivity.getIntent().getSerializableExtra("param_is_independent_bind_card") == null) {
            bool = cJPayFourElementsActivity.LIZLLL;
        } else {
            bool = (Boolean) cJPayFourElementsActivity.getIntent().getSerializableExtra("param_is_independent_bind_card");
        }
        cJPayFourElementsActivity.LIZLLL = bool;
        if (cJPayFourElementsActivity.getIntent().getSerializableExtra("params_one_key_copy_writing_info") == null) {
            cJPayOneKeyCopyWritingInfo = cJPayFourElementsActivity.f25463LJ;
        } else {
            cJPayOneKeyCopyWritingInfo = (CJPayOneKeyCopyWritingInfo) cJPayFourElementsActivity.getIntent().getSerializableExtra("params_one_key_copy_writing_info");
        }
        cJPayFourElementsActivity.f25463LJ = cJPayOneKeyCopyWritingInfo;
        if (cJPayFourElementsActivity.getIntent().getStringExtra("bind_card_result_lynx_scheme") == null) {
            stringExtra2 = cJPayFourElementsActivity.LJFF;
        } else {
            stringExtra2 = cJPayFourElementsActivity.getIntent().getStringExtra("bind_card_result_lynx_scheme");
        }
        cJPayFourElementsActivity.LJFF = stringExtra2;
    }
}
