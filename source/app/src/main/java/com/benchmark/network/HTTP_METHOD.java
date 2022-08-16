package com.benchmark.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes23.dex */
public enum HTTP_METHOD {
    GET,
    POST;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static HTTP_METHOD[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        if (proxy.isSupported) {
            return (HTTP_METHOD[]) proxy.result;
        }
        return (HTTP_METHOD[]) values().clone();
    }

    static {
        Covode.recordClassIndex(9703);
    }

    public static HTTP_METHOD valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        if (proxy.isSupported) {
            return (HTTP_METHOD) proxy.result;
        }
        return (HTTP_METHOD) Enum.valueOf(HTTP_METHOD.class, str);
    }
}
