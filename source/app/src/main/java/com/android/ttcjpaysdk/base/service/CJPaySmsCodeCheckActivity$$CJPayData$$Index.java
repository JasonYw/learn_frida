package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bindcard.base.bean.CJPayRealNameBean;
import com.android.ttcjpaysdk.bindcard.base.p142ui.CJPaySmsCodeCheckActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class CJPaySmsCodeCheckActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6401);
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPaySmsCodeCheckActivity cJPaySmsCodeCheckActivity = (CJPaySmsCodeCheckActivity) obj2;
        bundle.putSerializable("realNameBean", cJPaySmsCodeCheckActivity.LJFF);
        bundle.putString("param_bind_card_sms_token", cJPaySmsCodeCheckActivity.LJI);
        bundle.putBoolean("param_is_independent_bind_card", cJPaySmsCodeCheckActivity.LJII);
        bundle.putString("param_title_content", cJPaySmsCodeCheckActivity.LJIIIIZZ);
        bundle.putString("bind_card_result_lynx_scheme", cJPaySmsCodeCheckActivity.LJIIIZ);
    }

    public static void restoreData(Object obj, Object obj2) {
        CJPayRealNameBean cJPayRealNameBean;
        String string;
        String string2;
        String string3;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPaySmsCodeCheckActivity cJPaySmsCodeCheckActivity = (CJPaySmsCodeCheckActivity) obj2;
        if (bundle.getSerializable("param_bind_card_real_name") == null) {
            cJPayRealNameBean = cJPaySmsCodeCheckActivity.LJFF;
        } else {
            cJPayRealNameBean = (CJPayRealNameBean) bundle.getSerializable("param_bind_card_real_name");
        }
        cJPaySmsCodeCheckActivity.LJFF = cJPayRealNameBean;
        if (bundle.getString("param_bind_card_sms_token") == null) {
            string = cJPaySmsCodeCheckActivity.LJI;
        } else {
            string = bundle.getString("param_bind_card_sms_token");
        }
        cJPaySmsCodeCheckActivity.LJI = string;
        cJPaySmsCodeCheckActivity.LJII = bundle.getBoolean("param_is_independent_bind_card");
        if (bundle.getString("param_title_content") == null) {
            string2 = cJPaySmsCodeCheckActivity.LJIIIIZZ;
        } else {
            string2 = bundle.getString("param_title_content");
        }
        cJPaySmsCodeCheckActivity.LJIIIIZZ = string2;
        if (bundle.getString("bind_card_result_lynx_scheme") == null) {
            string3 = cJPaySmsCodeCheckActivity.LJIIIZ;
        } else {
            string3 = bundle.getString("bind_card_result_lynx_scheme");
        }
        cJPaySmsCodeCheckActivity.LJIIIZ = string3;
    }

    public static void autoWiredData(Object obj, Object obj2) {
        CJPayRealNameBean cJPayRealNameBean;
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        CJPaySmsCodeCheckActivity cJPaySmsCodeCheckActivity = (CJPaySmsCodeCheckActivity) obj2;
        if (cJPaySmsCodeCheckActivity.getIntent().getSerializableExtra("param_bind_card_real_name") == null) {
            cJPayRealNameBean = cJPaySmsCodeCheckActivity.LJFF;
        } else {
            cJPayRealNameBean = (CJPayRealNameBean) cJPaySmsCodeCheckActivity.getIntent().getSerializableExtra("param_bind_card_real_name");
        }
        cJPaySmsCodeCheckActivity.LJFF = cJPayRealNameBean;
        if (cJPaySmsCodeCheckActivity.getIntent().getStringExtra("param_bind_card_sms_token") == null) {
            stringExtra = cJPaySmsCodeCheckActivity.LJI;
        } else {
            stringExtra = cJPaySmsCodeCheckActivity.getIntent().getStringExtra("param_bind_card_sms_token");
        }
        cJPaySmsCodeCheckActivity.LJI = stringExtra;
        cJPaySmsCodeCheckActivity.LJII = cJPaySmsCodeCheckActivity.getIntent().getBooleanExtra("param_is_independent_bind_card", cJPaySmsCodeCheckActivity.LJII);
        if (cJPaySmsCodeCheckActivity.getIntent().getStringExtra("param_title_content") == null) {
            stringExtra2 = cJPaySmsCodeCheckActivity.LJIIIIZZ;
        } else {
            stringExtra2 = cJPaySmsCodeCheckActivity.getIntent().getStringExtra("param_title_content");
        }
        cJPaySmsCodeCheckActivity.LJIIIIZZ = stringExtra2;
        if (cJPaySmsCodeCheckActivity.getIntent().getStringExtra("bind_card_result_lynx_scheme") == null) {
            stringExtra3 = cJPaySmsCodeCheckActivity.LJIIIZ;
        } else {
            stringExtra3 = cJPaySmsCodeCheckActivity.getIntent().getStringExtra("bind_card_result_lynx_scheme");
        }
        cJPaySmsCodeCheckActivity.LJIIIZ = stringExtra3;
    }
}
