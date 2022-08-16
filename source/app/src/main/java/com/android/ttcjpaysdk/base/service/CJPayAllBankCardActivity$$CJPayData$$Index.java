package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.thirdparty.data.CJPayCard;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.activity.CJPayAllBankCardActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public class CJPayAllBankCardActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6385);
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayAllBankCardActivity cJPayAllBankCardActivity = (CJPayAllBankCardActivity) obj2;
        bundle.putSerializable("cardList", cJPayAllBankCardActivity.LIZLLL);
        bundle.putString("bottomText", cJPayAllBankCardActivity.f25535LJ);
        bundle.putString("cardAddEventParam", cJPayAllBankCardActivity.LJFF);
        bundle.putString("bind_top_page_url", cJPayAllBankCardActivity.LJI);
        bundle.putBoolean("mNeedAuthGuide", cJPayAllBankCardActivity.LJII);
    }

    public static void restoreData(Object obj, Object obj2) {
        ArrayList<CJPayCard> arrayList;
        String string;
        String string2;
        String string3;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayAllBankCardActivity cJPayAllBankCardActivity = (CJPayAllBankCardActivity) obj2;
        if (bundle.getSerializable("cardList") == null) {
            arrayList = cJPayAllBankCardActivity.LIZLLL;
        } else {
            arrayList = (ArrayList) bundle.getSerializable("cardList");
        }
        cJPayAllBankCardActivity.LIZLLL = arrayList;
        if (bundle.getString("bottomText") == null) {
            string = cJPayAllBankCardActivity.f25535LJ;
        } else {
            string = bundle.getString("bottomText");
        }
        cJPayAllBankCardActivity.f25535LJ = string;
        if (bundle.getString("cardAddEventParam") == null) {
            string2 = cJPayAllBankCardActivity.LJFF;
        } else {
            string2 = bundle.getString("cardAddEventParam");
        }
        cJPayAllBankCardActivity.LJFF = string2;
        if (bundle.getString("bind_top_page_url") == null) {
            string3 = cJPayAllBankCardActivity.LJI;
        } else {
            string3 = bundle.getString("bind_top_page_url");
        }
        cJPayAllBankCardActivity.LJI = string3;
        cJPayAllBankCardActivity.LJII = bundle.getBoolean("mNeedAuthGuide");
    }

    public static void autoWiredData(Object obj, Object obj2) {
        ArrayList<CJPayCard> arrayList;
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        CJPayAllBankCardActivity cJPayAllBankCardActivity = (CJPayAllBankCardActivity) obj2;
        if (cJPayAllBankCardActivity.getIntent().getSerializableExtra("cardList") == null) {
            arrayList = cJPayAllBankCardActivity.LIZLLL;
        } else {
            arrayList = (ArrayList) cJPayAllBankCardActivity.getIntent().getSerializableExtra("cardList");
        }
        cJPayAllBankCardActivity.LIZLLL = arrayList;
        if (cJPayAllBankCardActivity.getIntent().getStringExtra("bottomText") == null) {
            stringExtra = cJPayAllBankCardActivity.f25535LJ;
        } else {
            stringExtra = cJPayAllBankCardActivity.getIntent().getStringExtra("bottomText");
        }
        cJPayAllBankCardActivity.f25535LJ = stringExtra;
        if (cJPayAllBankCardActivity.getIntent().getStringExtra("cardAddEventParam") == null) {
            stringExtra2 = cJPayAllBankCardActivity.LJFF;
        } else {
            stringExtra2 = cJPayAllBankCardActivity.getIntent().getStringExtra("cardAddEventParam");
        }
        cJPayAllBankCardActivity.LJFF = stringExtra2;
        if (cJPayAllBankCardActivity.getIntent().getStringExtra("bind_top_page_url") == null) {
            stringExtra3 = cJPayAllBankCardActivity.LJI;
        } else {
            stringExtra3 = cJPayAllBankCardActivity.getIntent().getStringExtra("bind_top_page_url");
        }
        cJPayAllBankCardActivity.LJI = stringExtra3;
        cJPayAllBankCardActivity.LJII = cJPayAllBankCardActivity.getIntent().getBooleanExtra("mNeedAuthGuide", cJPayAllBankCardActivity.LJII);
    }
}
