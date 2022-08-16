package com.bytedance.android.annie.service.network;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes7.dex */
public enum RequestMethod {
    GET,
    POST,
    PUT,
    DELETE,
    DOWNLOAD;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(11128);
    }

    public static RequestMethod valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (RequestMethod) (proxy.isSupported ? proxy.result : Enum.valueOf(RequestMethod.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static RequestMethod[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (RequestMethod[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
