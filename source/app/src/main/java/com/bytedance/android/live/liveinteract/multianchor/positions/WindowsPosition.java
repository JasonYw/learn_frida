package com.bytedance.android.live.liveinteract.multianchor.positions;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes3.dex */
public enum WindowsPosition {
    SINGLE,
    TWO_LEFT,
    TWO_RIGHT,
    THREE_LEFT,
    THREE_RIGHT_TOP,
    THREE_RIGHT_BOTTOM,
    FOUR_LEFT_TOP,
    FOUR_LEFT_BOTTOM,
    FOUR_RIGHT_TOP,
    FOUR_RIGHT_BOTTOM,
    IGNORE;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(28325);
    }

    public static WindowsPosition valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (WindowsPosition) (proxy.isSupported ? proxy.result : Enum.valueOf(WindowsPosition.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static WindowsPosition[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (WindowsPosition[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
