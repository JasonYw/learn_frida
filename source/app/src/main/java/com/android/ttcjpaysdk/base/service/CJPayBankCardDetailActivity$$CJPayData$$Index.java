package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.activity.CJPayBankCardDetailActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class CJPayBankCardDetailActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6386);
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayBankCardDetailActivity cJPayBankCardDetailActivity = (CJPayBankCardDetailActivity) obj2;
        bundle.putBoolean("isShowUntiedBankCard", cJPayBankCardDetailActivity.f25537LJ);
        bundle.putString("mUnbindUrl", cJPayBankCardDetailActivity.LJFF);
        bundle.putString("mPageScenes", cJPayBankCardDetailActivity.LJI);
        bundle.putString("mCardStr", cJPayBankCardDetailActivity.LJII);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        CJPayBankCardDetailActivity cJPayBankCardDetailActivity = (CJPayBankCardDetailActivity) obj2;
        cJPayBankCardDetailActivity.f25537LJ = cJPayBankCardDetailActivity.getIntent().getBooleanExtra("isShowUntiedBankCard", cJPayBankCardDetailActivity.f25537LJ);
        if (cJPayBankCardDetailActivity.getIntent().getStringExtra("mUnbindUrl") == null) {
            stringExtra = cJPayBankCardDetailActivity.LJFF;
        } else {
            stringExtra = cJPayBankCardDetailActivity.getIntent().getStringExtra("mUnbindUrl");
        }
        cJPayBankCardDetailActivity.LJFF = stringExtra;
        if (cJPayBankCardDetailActivity.getIntent().getStringExtra("mPageScenes") == null) {
            stringExtra2 = cJPayBankCardDetailActivity.LJI;
        } else {
            stringExtra2 = cJPayBankCardDetailActivity.getIntent().getStringExtra("mPageScenes");
        }
        cJPayBankCardDetailActivity.LJI = stringExtra2;
        if (cJPayBankCardDetailActivity.getIntent().getStringExtra("mCardStr") == null) {
            stringExtra3 = cJPayBankCardDetailActivity.LJII;
        } else {
            stringExtra3 = cJPayBankCardDetailActivity.getIntent().getStringExtra("mCardStr");
        }
        cJPayBankCardDetailActivity.LJII = stringExtra3;
    }

    public static void restoreData(Object obj, Object obj2) {
        String string;
        String string2;
        String string3;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayBankCardDetailActivity cJPayBankCardDetailActivity = (CJPayBankCardDetailActivity) obj2;
        cJPayBankCardDetailActivity.f25537LJ = bundle.getBoolean("isShowUntiedBankCard");
        if (bundle.getString("mUnbindUrl") == null) {
            string = cJPayBankCardDetailActivity.LJFF;
        } else {
            string = bundle.getString("mUnbindUrl");
        }
        cJPayBankCardDetailActivity.LJFF = string;
        if (bundle.getString("mPageScenes") == null) {
            string2 = cJPayBankCardDetailActivity.LJI;
        } else {
            string2 = bundle.getString("mPageScenes");
        }
        cJPayBankCardDetailActivity.LJI = string2;
        if (bundle.getString("mCardStr") == null) {
            string3 = cJPayBankCardDetailActivity.LJII;
        } else {
            string3 = bundle.getString("mCardStr");
        }
        cJPayBankCardDetailActivity.LJII = string3;
    }
}
