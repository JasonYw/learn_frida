package com.bytedance.android.live.linkpk;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum RandomMatchCheckSource {
    Setting,
    CheckFragment,
    AttentionFragment,
    PKUserListFragment,
    MultiPKUserListFragment;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(25058);
    }

    public static RandomMatchCheckSource valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (RandomMatchCheckSource) (proxy.isSupported ? proxy.result : Enum.valueOf(RandomMatchCheckSource.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static RandomMatchCheckSource[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (RandomMatchCheckSource[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
