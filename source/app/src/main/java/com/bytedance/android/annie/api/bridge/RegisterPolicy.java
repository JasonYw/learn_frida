package com.bytedance.android.annie.api.bridge;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;
import com.p1594ss.android.ugc.aweme.experiment.ReDexClinitStringAb;

/* loaded from: classes7.dex */
public enum RegisterPolicy {
    DEFAULT,
    CACHEABLE,
    SPECIFIED;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        if (ReDexClinitStringAb.abTest >= 5) {
            clinit$r$fake();
            return;
        }
        Covode.recordClassIndex(10455);
    }

    private static void clinit$r$fake() {
        Covode.recordClassIndex(10455);
        RegisterPolicy registerPolicy = new RegisterPolicy();
        DEFAULT = registerPolicy;
        RegisterPolicy registerPolicy2 = new RegisterPolicy();
        CACHEABLE = registerPolicy2;
        RegisterPolicy registerPolicy3 = new RegisterPolicy();
        SPECIFIED = registerPolicy3;
        $VALUES = new RegisterPolicy[]{registerPolicy, registerPolicy2, registerPolicy3};
    }

    public static RegisterPolicy valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (RegisterPolicy) (proxy.isSupported ? proxy.result : Enum.valueOf(RegisterPolicy.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static RegisterPolicy[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (RegisterPolicy[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
