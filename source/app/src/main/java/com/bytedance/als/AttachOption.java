package com.bytedance.als;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes9.dex */
public enum AttachOption {
    IMMEDIATE,
    LAZY,
    FORCE_LAZY;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(10029);
    }

    public static AttachOption valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (AttachOption) (proxy.isSupported ? proxy.result : Enum.valueOf(AttachOption.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static AttachOption[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (AttachOption[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
