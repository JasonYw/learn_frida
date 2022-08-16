package com.bytedance.android.live.core.tetris.layout;

import com.bytedance.covode.number.Covode;
import com.bytedance.hotfix.PatchProxy;
import com.bytedance.hotfix.PatchProxyResult;
import com.bytedance.hotfix.base.ChangeQuickRedirect;

/* loaded from: classes5.dex */
public enum ViewState {
    UN_CREATED,
    CREATING,
    CREATED,
    USING;
    
    public static ChangeQuickRedirect changeQuickRedirect;

    static {
        Covode.recordClassIndex(23747);
    }

    public static ViewState valueOf(String str) {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[]{str}, null, changeQuickRedirect, true, 2);
        return (ViewState) (proxy.isSupported ? proxy.result : Enum.valueOf(ViewState.class, str));
    }

    /* renamed from: values  reason: to resolve conflict with enum method */
    public static ViewState[] valuesCustom() {
        PatchProxyResult proxy = PatchProxy.proxy(new Object[0], null, changeQuickRedirect, true, 1);
        return (ViewState[]) (proxy.isSupported ? proxy.result : values().clone());
    }
}
