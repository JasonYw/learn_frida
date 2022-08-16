package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignInfo;
import com.android.ttcjpaysdk.bindcard.unionpay.p148ui.UnionPayTwoElementsActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class UnionPayTwoElementsActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6533);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        UnionPaySignInfo unionPaySignInfo;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        UnionPayTwoElementsActivity unionPayTwoElementsActivity = (UnionPayTwoElementsActivity) obj2;
        if (unionPayTwoElementsActivity.getIntent().getSerializableExtra("unionPaySignInfo") == null) {
            unionPaySignInfo = unionPayTwoElementsActivity.LIZJ;
        } else {
            unionPaySignInfo = (UnionPaySignInfo) unionPayTwoElementsActivity.getIntent().getSerializableExtra("unionPaySignInfo");
        }
        unionPayTwoElementsActivity.LIZJ = unionPaySignInfo;
    }

    public static void restoreData(Object obj, Object obj2) {
        UnionPaySignInfo unionPaySignInfo;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        UnionPayTwoElementsActivity unionPayTwoElementsActivity = (UnionPayTwoElementsActivity) obj2;
        if (bundle.getSerializable("unionPaySignInfo") == null) {
            unionPaySignInfo = unionPayTwoElementsActivity.LIZJ;
        } else {
            unionPaySignInfo = (UnionPaySignInfo) bundle.getSerializable("unionPaySignInfo");
        }
        unionPayTwoElementsActivity.LIZJ = unionPaySignInfo;
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        ((Bundle) obj).putSerializable("unionPaySignInfo", ((UnionPayTwoElementsActivity) obj2).LIZJ);
    }
}
