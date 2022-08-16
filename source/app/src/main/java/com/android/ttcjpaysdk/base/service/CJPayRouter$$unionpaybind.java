package com.android.ttcjpaysdk.base.service;

import com.android.ttcjpaysdk.base.service.annotation.bean.CJRouterBean;
import com.android.ttcjpaysdk.bindcard.unionpay.p148ui.UnionPayAuthActivity;
import com.android.ttcjpaysdk.bindcard.unionpay.p148ui.UnionPayBindCardActivity;
import com.android.ttcjpaysdk.bindcard.unionpay.p148ui.UnionPayTwoElementsActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class CJPayRouter$$unionpaybind {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6399);
    }

    public static Map<String, CJRouterBean> getRouterMap() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("/unionpaybind/UnionPayAuthActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, UnionPayAuthActivity.class));
        hashMap.put("/unionpaybind/UnionPayBindCardActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, UnionPayBindCardActivity.class));
        hashMap.put("/unionpaybind/UnionPayTwoElementsActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, UnionPayTwoElementsActivity.class));
        return hashMap;
    }
}
