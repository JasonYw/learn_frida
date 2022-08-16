package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.thirdparty.front.cardlist.activity.CJPayFrontCardListMethodActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.ArrayList;

/* loaded from: classes17.dex */
public class CJPayFrontCardListMethodActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6389);
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayFrontCardListMethodActivity cJPayFrontCardListMethodActivity = (CJPayFrontCardListMethodActivity) obj2;
        bundle.putInt("mFromType", cJPayFrontCardListMethodActivity.LIZIZ);
        bundle.putInt("mEnterFrom", cJPayFrontCardListMethodActivity.LIZJ);
        bundle.putString("amount", cJPayFrontCardListMethodActivity.LIZLLL);
        bundle.putString("cardId", cJPayFrontCardListMethodActivity.f25526LJ);
        bundle.putString("mInsufficientTipStr", cJPayFrontCardListMethodActivity.LJFF);
        bundle.putString("processInfo", cJPayFrontCardListMethodActivity.LJI);
        bundle.putSerializable("mInsufficientCardIds", cJPayFrontCardListMethodActivity.LJII);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        String stringExtra;
        String stringExtra2;
        String stringExtra3;
        String stringExtra4;
        ArrayList<String> arrayList;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        CJPayFrontCardListMethodActivity cJPayFrontCardListMethodActivity = (CJPayFrontCardListMethodActivity) obj2;
        cJPayFrontCardListMethodActivity.LIZIZ = cJPayFrontCardListMethodActivity.getIntent().getIntExtra("mFromType", cJPayFrontCardListMethodActivity.LIZIZ);
        cJPayFrontCardListMethodActivity.LIZJ = cJPayFrontCardListMethodActivity.getIntent().getIntExtra("mEnterFrom", cJPayFrontCardListMethodActivity.LIZJ);
        if (cJPayFrontCardListMethodActivity.getIntent().getStringExtra("amount") == null) {
            stringExtra = cJPayFrontCardListMethodActivity.LIZLLL;
        } else {
            stringExtra = cJPayFrontCardListMethodActivity.getIntent().getStringExtra("amount");
        }
        cJPayFrontCardListMethodActivity.LIZLLL = stringExtra;
        if (cJPayFrontCardListMethodActivity.getIntent().getStringExtra("cardId") == null) {
            stringExtra2 = cJPayFrontCardListMethodActivity.f25526LJ;
        } else {
            stringExtra2 = cJPayFrontCardListMethodActivity.getIntent().getStringExtra("cardId");
        }
        cJPayFrontCardListMethodActivity.f25526LJ = stringExtra2;
        if (cJPayFrontCardListMethodActivity.getIntent().getStringExtra("mInsufficientTipStr") == null) {
            stringExtra3 = cJPayFrontCardListMethodActivity.LJFF;
        } else {
            stringExtra3 = cJPayFrontCardListMethodActivity.getIntent().getStringExtra("mInsufficientTipStr");
        }
        cJPayFrontCardListMethodActivity.LJFF = stringExtra3;
        if (cJPayFrontCardListMethodActivity.getIntent().getStringExtra("processInfo") == null) {
            stringExtra4 = cJPayFrontCardListMethodActivity.LJI;
        } else {
            stringExtra4 = cJPayFrontCardListMethodActivity.getIntent().getStringExtra("processInfo");
        }
        cJPayFrontCardListMethodActivity.LJI = stringExtra4;
        if (cJPayFrontCardListMethodActivity.getIntent().getSerializableExtra("mInsufficientCardIds") == null) {
            arrayList = cJPayFrontCardListMethodActivity.LJII;
        } else {
            arrayList = (ArrayList) cJPayFrontCardListMethodActivity.getIntent().getSerializableExtra("mInsufficientCardIds");
        }
        cJPayFrontCardListMethodActivity.LJII = arrayList;
    }

    public static void restoreData(Object obj, Object obj2) {
        String string;
        String string2;
        String string3;
        String string4;
        ArrayList<String> arrayList;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        CJPayFrontCardListMethodActivity cJPayFrontCardListMethodActivity = (CJPayFrontCardListMethodActivity) obj2;
        cJPayFrontCardListMethodActivity.LIZIZ = bundle.getInt("mFromType");
        cJPayFrontCardListMethodActivity.LIZJ = bundle.getInt("mEnterFrom");
        if (bundle.getString("amount") == null) {
            string = cJPayFrontCardListMethodActivity.LIZLLL;
        } else {
            string = bundle.getString("amount");
        }
        cJPayFrontCardListMethodActivity.LIZLLL = string;
        if (bundle.getString("cardId") == null) {
            string2 = cJPayFrontCardListMethodActivity.f25526LJ;
        } else {
            string2 = bundle.getString("cardId");
        }
        cJPayFrontCardListMethodActivity.f25526LJ = string2;
        if (bundle.getString("mInsufficientTipStr") == null) {
            string3 = cJPayFrontCardListMethodActivity.LJFF;
        } else {
            string3 = bundle.getString("mInsufficientTipStr");
        }
        cJPayFrontCardListMethodActivity.LJFF = string3;
        if (bundle.getString("processInfo") == null) {
            string4 = cJPayFrontCardListMethodActivity.LJI;
        } else {
            string4 = bundle.getString("processInfo");
        }
        cJPayFrontCardListMethodActivity.LJI = string4;
        if (bundle.getSerializable("mInsufficientCardIds") == null) {
            arrayList = cJPayFrontCardListMethodActivity.LJII;
        } else {
            arrayList = (ArrayList) bundle.getSerializable("mInsufficientCardIds");
        }
        cJPayFrontCardListMethodActivity.LJII = arrayList;
    }
}
