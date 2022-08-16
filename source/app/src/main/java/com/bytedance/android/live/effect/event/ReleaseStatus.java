package com.bytedance.android.live.effect.event;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum ReleaseStatus {
    Start,
    End;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(24507);
    }

    public static ReleaseStatus valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (ReleaseStatus) (proxy.isSupported ? proxy.result : Enum.valueOf(ReleaseStatus.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ReleaseStatus[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (ReleaseStatus[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
