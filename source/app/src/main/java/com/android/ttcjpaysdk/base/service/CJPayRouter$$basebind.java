package com.android.ttcjpaysdk.base.service;

import com.android.ttcjpaysdk.base.service.annotation.bean.CJRouterBean;
import com.android.ttcjpaysdk.bindcard.base.p142ui.CJPaySmsCodeCheckActivity;
import com.android.ttcjpaysdk.bindcard.base.p142ui.SetPwdActivity;
import com.android.ttcjpaysdk.bindcard.base.p142ui.VerifyPwdFragment;
import com.android.ttcjpaysdk.bindcard.base.pay.CJPayNewCardActivity;
import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class CJPayRouter$$basebind {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6394);
    }

    public static Map<String, CJRouterBean> getRouterMap() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (Map) proxy.result;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("/basebind/CJPaySmsCodeCheckActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, CJPaySmsCodeCheckActivity.class));
        hashMap.put("/basebind/SetPwdActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, SetPwdActivity.class));
        hashMap.put("/basebind/VerifyPwdFragment", CJRouterBean.create(CJRouterBean.Type.FRAGMENT, VerifyPwdFragment.class));
        hashMap.put("/basebind/CJPayNewCardActivity", CJRouterBean.create(CJRouterBean.Type.ACTIVITY, CJPayNewCardActivity.class));
        return hashMap;
    }
}
