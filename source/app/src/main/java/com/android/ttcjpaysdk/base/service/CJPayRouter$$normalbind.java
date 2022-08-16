package com.android.ttcjpaysdk.base.service;

import com.android.ttcjpaysdk.base.service.annotation.bean.CJRouterBean;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity.CJPayCardBinActivity;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity.CJPayFourElementsActivity;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity.CJPayIDSelectorActivity;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity.CJPayIndependentMainActivity;
import com.android.ttcjpaysdk.bdpay.bindcard.normal.p139ui.activity.CJPayRealNameGuideActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class CJPayRouter$$normalbind {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6397);
    }

    public static Map<String, CJRouterBean> getRouterMap() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("/normalbind/CJPayCardBinActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, CJPayCardBinActivity.class));
        hashMap.put("/normalbind/CJPayFourElementsActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, CJPayFourElementsActivity.class));
        hashMap.put("/normalbind/CJPayIDSelectorActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, CJPayIDSelectorActivity.class));
        hashMap.put("/normalbind/CJPayIndependentMainActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, CJPayIndependentMainActivity.class));
        hashMap.put("/normalbind/CJPayRealNameGuideActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, CJPayRealNameGuideActivity.class));
        return hashMap;
    }
}
