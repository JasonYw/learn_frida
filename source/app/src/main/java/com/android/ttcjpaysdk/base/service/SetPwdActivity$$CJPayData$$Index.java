package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPaySmsSignBean;
import com.android.ttcjpaysdk.bindcard.base.p142ui.SetPwdActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class SetPwdActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6528);
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        SetPwdActivity setPwdActivity = (SetPwdActivity) obj2;
        bundle.putSerializable("mSmsSignBean", setPwdActivity.LIZIZ);
        bundle.putBoolean("param_is_independent_bind_card", setPwdActivity.LIZJ);
        bundle.putString("bind_card_result_lynx_scheme", setPwdActivity.LIZLLL);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        CJPaySmsSignBean cJPaySmsSignBean;
        String stringExtra;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        SetPwdActivity setPwdActivity = (SetPwdActivity) obj2;
        if (setPwdActivity.getIntent().getSerializableExtra("param_sign_sms_token") == null) {
            cJPaySmsSignBean = setPwdActivity.LIZIZ;
        } else {
            cJPaySmsSignBean = (CJPaySmsSignBean) setPwdActivity.getIntent().getSerializableExtra("param_sign_sms_token");
        }
        setPwdActivity.LIZIZ = cJPaySmsSignBean;
        setPwdActivity.LIZJ = setPwdActivity.getIntent().getBooleanExtra("param_is_independent_bind_card", setPwdActivity.LIZJ);
        if (setPwdActivity.getIntent().getStringExtra("bind_card_result_lynx_scheme") == null) {
            stringExtra = setPwdActivity.LIZLLL;
        } else {
            stringExtra = setPwdActivity.getIntent().getStringExtra("bind_card_result_lynx_scheme");
        }
        setPwdActivity.LIZLLL = stringExtra;
        setPwdActivity.f25474LJ = (ICJPayNormalBindCardService) CJPayServiceManager.getInstance().getIService(ICJPayNormalBindCardService.class);
    }

    public static void restoreData(Object obj, Object obj2) {
        CJPaySmsSignBean cJPaySmsSignBean;
        String string;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        SetPwdActivity setPwdActivity = (SetPwdActivity) obj2;
        if (bundle.getSerializable("param_sign_sms_token") == null) {
            cJPaySmsSignBean = setPwdActivity.LIZIZ;
        } else {
            cJPaySmsSignBean = (CJPaySmsSignBean) bundle.getSerializable("param_sign_sms_token");
        }
        setPwdActivity.LIZIZ = cJPaySmsSignBean;
        setPwdActivity.LIZJ = bundle.getBoolean("param_is_independent_bind_card");
        if (bundle.getString("bind_card_result_lynx_scheme") == null) {
            string = setPwdActivity.LIZLLL;
        } else {
            string = bundle.getString("bind_card_result_lynx_scheme");
        }
        setPwdActivity.LIZLLL = string;
    }
}
