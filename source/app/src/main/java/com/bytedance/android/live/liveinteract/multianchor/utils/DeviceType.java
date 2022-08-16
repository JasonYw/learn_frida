package com.bytedance.android.live.liveinteract.multianchor.utils;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes12.dex */
public enum DeviceType {
    NORMAL_MOBILE,
    PAD,
    FOLD_FULL;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28399);
    }

    public static DeviceType valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (DeviceType) (proxy.isSupported ? proxy.result : Enum.valueOf(DeviceType.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static DeviceType[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (DeviceType[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
