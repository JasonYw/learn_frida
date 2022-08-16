package com.bytedance.android.live.core.activity;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes8.dex */
public enum ShortTouchDataSource {
    MESSAGE("message"),
    API("api"),
    JSB("jsb");
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public String source;

    public static ShortTouchDataSource valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 3);
        return (ShortTouchDataSource) (proxy.isSupported ? proxy.result : Enum.valueOf(ShortTouchDataSource.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ShortTouchDataSource[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 2);
        return (ShortTouchDataSource[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(23272);
    }

    ShortTouchDataSource(String str) {
        this.source = str;
    }
}
