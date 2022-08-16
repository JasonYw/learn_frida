package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bindcard.unionpay.p148ui.UnionPayBindCardActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class UnionPayBindCardActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6532);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        String stringExtra;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        UnionPayBindCardActivity unionPayBindCardActivity = (UnionPayBindCardActivity) obj2;
        if (unionPayBindCardActivity.getIntent().getStringExtra("bankListBeanJson") == null) {
            stringExtra = unionPayBindCardActivity.LJIIIIZZ;
        } else {
            stringExtra = unionPayBindCardActivity.getIntent().getStringExtra("bankListBeanJson");
        }
        unionPayBindCardActivity.LJIIIIZZ = stringExtra;
    }

    public static void restoreData(Object obj, Object obj2) {
        String string;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        UnionPayBindCardActivity unionPayBindCardActivity = (UnionPayBindCardActivity) obj2;
        if (bundle.getString("bankListBeanJson") == null) {
            string = unionPayBindCardActivity.LJIIIIZZ;
        } else {
            string = bundle.getString("bankListBeanJson");
        }
        unionPayBindCardActivity.LJIIIIZZ = string;
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        ((Bundle) obj).putString("bankListBeanJson", ((UnionPayBindCardActivity) obj2).LJIIIIZZ);
    }
}
