package com.bytedance.android.live.broadcast.model;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public enum StartLiveStyle {
    CLASSICAL,
    STYLE1,
    STYLE2;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(16984);
    }

    public static StartLiveStyle valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (StartLiveStyle) (proxy.isSupported ? proxy.result : Enum.valueOf(StartLiveStyle.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static StartLiveStyle[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (StartLiveStyle[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
