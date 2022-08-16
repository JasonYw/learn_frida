package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import p003X.C116971W2r;

/* loaded from: classes26.dex */
public class ICJPayCombineService$$CJPayService$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6419);
    }

    public static void initService(Map<Class, ICJPayService> map) {
        if (PatchProxy.proxy(new Object[]{map}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        map.put(ICJPayCombineService.class, createService("com.android.ttcjpaysdk.integrated.counter.dypay.provider.CJPayCombineProvider"));
    }

    public static ICJPayService createService(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (ICJPayService) proxy.result;
        }
        try {
            return (ICJPayService) C116971W2r.LIZ(str).newInstance();
        } catch (Exception unused) {
            return null;
        }
    }
}
