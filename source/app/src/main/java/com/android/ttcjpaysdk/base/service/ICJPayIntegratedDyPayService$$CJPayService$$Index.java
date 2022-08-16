package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import p003X.C116971W2r;

/* loaded from: classes10.dex */
public class ICJPayIntegratedDyPayService$$CJPayService$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6458);
    }

    public static void initService(Map<Class, ICJPayIntegratedStyleService> map) {
        if (PatchProxy.proxy(new Object[]{map}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        map.put(ICJPayIntegratedDyPayService.class, createService("com.android.ttcjpaysdk.integrated.counter.dypay.provider.CJPayIntegratedDyPayProvider"));
    }

    public static ICJPayIntegratedStyleService createService(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (ICJPayIntegratedStyleService) proxy.result;
        }
        try {
            return (ICJPayIntegratedStyleService) C116971W2r.LIZ(str).newInstance();
        } catch (Exception unused) {
            return null;
        }
    }
}
