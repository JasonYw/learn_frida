package com.android.ttcjpaysdk.base.service;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import java.util.Map;
import p003X.C116971W2r;

/* loaded from: classes10.dex */
public class ICJPayWXPaymentService$$CJPayService$$Index {
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(6516);
    }

    public static void initService(Map<Class, ICJPayBasisPaymentService> map) {
        if (PatchProxy.proxy(new Object[]{map}, null, changeQuickRedirect, true, 1).isSupported) {
            return;
        }
        map.put(ICJPayWXPaymentService.class, createService("com.android.ttcjpaysdk.base.wxpay.CJPayWXPaymentService"));
    }

    public static ICJPayBasisPaymentService createService(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (ICJPayBasisPaymentService) proxy.result;
        }
        try {
            return (ICJPayBasisPaymentService) C116971W2r.LIZ(str).newInstance();
        } catch (Exception unused) {
            return null;
        }
    }
}
