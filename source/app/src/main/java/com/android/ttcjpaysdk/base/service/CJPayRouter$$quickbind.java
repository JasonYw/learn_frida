package com.android.ttcjpaysdk.base.service;

import com.android.ttcjpaysdk.base.service.annotation.bean.CJRouterBean;
import com.android.ttcjpaysdk.bindcard.quickbind.p144ui.SelectBankCardType2Activity;
import com.android.ttcjpaysdk.bindcard.quickbind.p144ui.SelectBankCardTypeActivity;
import com.android.ttcjpaysdk.bindcard.quickbind.p144ui.SmsFullPageActivity;
import com.android.ttcjpaysdk.bindcard.quickbind.p144ui.TwoElementAuth2Activity;
import com.android.ttcjpaysdk.bindcard.quickbind.p144ui.TwoElementAuthActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class CJPayRouter$$quickbind {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6398);
    }

    public static Map<String, CJRouterBean> getRouterMap() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("/quickbind/SelectBankCardType2Activity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, SelectBankCardType2Activity.class));
        hashMap.put("/quickbind/SelectBankCardTypeActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, SelectBankCardTypeActivity.class));
        hashMap.put("/quickbind/TwoElementAuth2Activity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, TwoElementAuth2Activity.class));
        hashMap.put("/quickbind/TwoElementAuthActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, TwoElementAuthActivity.class));
        hashMap.put("/quickbind/SmsFullPageActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, SmsFullPageActivity.class));
        return hashMap;
    }
}
