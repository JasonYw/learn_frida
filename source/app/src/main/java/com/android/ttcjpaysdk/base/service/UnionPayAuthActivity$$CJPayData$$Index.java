package com.android.ttcjpaysdk.base.service;

import android.os.Bundle;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPayAuthResponseBean;
import com.android.ttcjpaysdk.bindcard.unionpay.bean.UnionPaySignInfo;
import com.android.ttcjpaysdk.bindcard.unionpay.p148ui.UnionPayAuthActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes17.dex */
public class UnionPayAuthActivity$$CJPayData$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6531);
    }

    public static void restoreData(Object obj, Object obj2) {
        UnionPaySignInfo unionPaySignInfo;
        UnionPayAuthResponseBean unionPayAuthResponseBean;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        UnionPayAuthActivity unionPayAuthActivity = (UnionPayAuthActivity) obj2;
        if (bundle.getSerializable("unionPaySignInfo") == null) {
            unionPaySignInfo = unionPayAuthActivity.LJFF;
        } else {
            unionPaySignInfo = (UnionPaySignInfo) bundle.getSerializable("unionPaySignInfo");
        }
        unionPayAuthActivity.LJFF = unionPaySignInfo;
        if (bundle.getSerializable("authResponseBean") == null) {
            unionPayAuthResponseBean = unionPayAuthActivity.LJI;
        } else {
            unionPayAuthResponseBean = (UnionPayAuthResponseBean) bundle.getSerializable("authResponseBean");
        }
        unionPayAuthActivity.LJI = unionPayAuthResponseBean;
    }

    public static void saveData(Object obj, Object obj2) {
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 2).isSupported) {
            return;
        }
        Bundle bundle = (Bundle) obj;
        UnionPayAuthActivity unionPayAuthActivity = (UnionPayAuthActivity) obj2;
        bundle.putSerializable("unionPaySignInfo", unionPayAuthActivity.LJFF);
        bundle.putSerializable("authResponseBean", unionPayAuthActivity.LJI);
    }

    public static void autoWiredData(Object obj, Object obj2) {
        UnionPaySignInfo unionPaySignInfo;
        UnionPayAuthResponseBean unionPayAuthResponseBean;
        if (PatchProxy.proxy(new Object[]{obj, obj2}, null, changeQuickRedirect, true, 3).isSupported) {
            return;
        }
        UnionPayAuthActivity unionPayAuthActivity = (UnionPayAuthActivity) obj2;
        if (unionPayAuthActivity.getIntent().getSerializableExtra("unionPaySignInfo") == null) {
            unionPaySignInfo = unionPayAuthActivity.LJFF;
        } else {
            unionPaySignInfo = (UnionPaySignInfo) unionPayAuthActivity.getIntent().getSerializableExtra("unionPaySignInfo");
        }
        unionPayAuthActivity.LJFF = unionPaySignInfo;
        if (unionPayAuthActivity.getIntent().getSerializableExtra("authResponseBean") == null) {
            unionPayAuthResponseBean = unionPayAuthActivity.LJI;
        } else {
            unionPayAuthResponseBean = (UnionPayAuthResponseBean) unionPayAuthActivity.getIntent().getSerializableExtra("authResponseBean");
        }
        unionPayAuthActivity.LJI = unionPayAuthResponseBean;
    }
}
