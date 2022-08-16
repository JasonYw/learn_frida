package com.android.ttcjpaysdk.base.service;

import com.android.ttcjpaysdk.base.service.annotation.bean.CJRouterBean;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.activity.CJPayAllBankCardActivity;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.activity.CJPayBankCardActivity;
import com.android.ttcjpaysdk.thirdparty.front.mybankcard.activity.CJPayBankCardDetailActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class CJPayRouter$$mybankcard {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6396);
    }

    public static Map<String, CJRouterBean> getRouterMap() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("/mybankcard/CJPayAllBankCardActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, CJPayAllBankCardActivity.class));
        hashMap.put("/mybankcard/CJPayBankCardActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, CJPayBankCardActivity.class));
        hashMap.put("/mybankcard/CJPayBankCardDetailActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, CJPayBankCardDetailActivity.class));
        return hashMap;
    }
}
