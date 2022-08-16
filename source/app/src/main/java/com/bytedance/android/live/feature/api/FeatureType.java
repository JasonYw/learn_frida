package com.bytedance.android.live.feature.api;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes8.dex */
public enum FeatureType {
    STATIC(0),
    DYNAMIC(1),
    MONITOR(-1),
    DYNAMIC_MONITOR(2);
    
    public static ChangeQuickRedirect changeQuickRedirect;
    public final int value;

    public static FeatureType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (FeatureType) (proxy.isSupported ? proxy.result : Enum.valueOf(FeatureType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static FeatureType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (FeatureType[]) (proxy.isSupported ? proxy.result : values().clone());
    }

    static {
        Covode.recordClassIndex(24949);
    }

    FeatureType(int i) {
        this.value = i;
    }
}
